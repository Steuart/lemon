package top.joylife.lemon.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import top.joylife.lemon.config.SystemConfig;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * created by wuhaiming on 2018/2/9
 */
@Component
public class AuthInterceptor implements HandlerInterceptor {


    private Logger logger = LoggerFactory.getLogger(AuthInterceptor.class);

    @Autowired
    private SystemConfig systemConfig;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("拦截器MyInterceptor------->1、请求之前调用，也就是Controller方法调用之前。");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        if(modelAndView!=null){
            modelAndView.setViewName(systemConfig.getTheme()+"/"+modelAndView.getViewName());
        }

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("拦截器MyInterceptor------->3、请求结束之后被调用，主要用于清理工作。");
    }
}
