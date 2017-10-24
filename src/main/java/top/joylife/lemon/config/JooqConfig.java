package top.joylife.lemon.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.jooq.SQLDialect;
import org.jooq.impl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import top.joylife.lemon.listener.JOOQToSpringExceptionTransformer;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class JooqConfig {


    private Logger logger = LoggerFactory.getLogger(JooqConfig.class);

    @Bean
    @Primary
    public DataSource druidDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        try {
            Properties pro= PropertiesLoaderUtils.loadAllProperties("druid.properties");
            dataSource.setDriverClassName(pro.getProperty("driver-class-name"));
            dataSource.setUrl(pro.getProperty("url"));
            dataSource.setPassword(pro.getProperty("password"));
            dataSource.setUsername(pro.getProperty("username"));
            dataSource.setMaxActive(Integer.valueOf(pro.getProperty("maxActive")));
            dataSource.setFilters(pro.getProperty("filters"));
            dataSource.setInitialSize(Integer.valueOf(pro.getProperty("initialSize")));
            dataSource.setMaxWait(Long.valueOf(pro.getProperty("maxWait")));
            dataSource.setMinIdle(Integer.valueOf(pro.getProperty("minIdle")));
            dataSource.setTimeBetweenEvictionRunsMillis(Integer.valueOf(pro.getProperty("timeBetweenEvictionRunsMillis")));
            dataSource.setMinEvictableIdleTimeMillis(Integer.valueOf(pro.getProperty("minEvictableIdleTimeMillis")));
            dataSource.setValidationQuery(pro.getProperty("validationQuery"));
            dataSource.setTestWhileIdle(Boolean.valueOf(pro.getProperty("testWhileIdle")));
            dataSource.setPoolPreparedStatements(true);
            dataSource.setMaxOpenPreparedStatements(Integer.valueOf(pro.getProperty("maxOpenPreparedStatements")));
        } catch (Exception e) {
            logger.error("读取数据库配置文件出错");
        }
        return dataSource;
    }

    @Bean
    public LazyConnectionDataSourceProxy lazyConnectionDataSource() {
        return new LazyConnectionDataSourceProxy(druidDataSource());
    }

    @Bean
    public TransactionAwareDataSourceProxy transactionAwareDataSource() {
        return new TransactionAwareDataSourceProxy(lazyConnectionDataSource());
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(lazyConnectionDataSource());
    }

    @Bean
    public DataSourceConnectionProvider connectionProvider() {
        return new DataSourceConnectionProvider(transactionAwareDataSource());
    }

    @Bean
    public JOOQToSpringExceptionTransformer jooqToSpringExceptionTransformer() {
        return new JOOQToSpringExceptionTransformer();
    }

    @Bean
    public DefaultConfiguration configuration() {
        DefaultConfiguration jooqConfiguration = new DefaultConfiguration();

        jooqConfiguration.set(connectionProvider());
        jooqConfiguration.set(new DefaultExecuteListenerProvider(
                jooqToSpringExceptionTransformer()
        ));
        jooqConfiguration.set(SQLDialect.MYSQL);

        return jooqConfiguration;
    }

    @Bean
    public DefaultDSLContext dsl() {
        return new DefaultDSLContext(configuration());
    }


}
