package top.joylife.lemon.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import top.joylife.lemon.interceptor.AuthInterceptor;

/**
 * created by wuhaiming on 2018/2/9
 */
@Configuration
public class InterceptorConfiguration extends WebMvcConfigurerAdapter{

    @Autowired
    private AuthInterceptor authInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 添加路径
        // excludePathPatterns 排除路径
        registry.addInterceptor(authInterceptor).addPathPatterns("/**");
        //super.addInterceptors(registry);
    }
}
