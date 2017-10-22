package top.joylife.lemon.config;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JooqConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public DSLContext getDslContext(){

        org.jooq.Configuration configuration = new DefaultConfiguration().set(dataSource).set(SQLDialect.MYSQL);
        DSLContext context = DSL.using(configuration);
        return context;
    }


}
