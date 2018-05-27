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
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {
        if(modelAndView!=null){
            String uri = request.getRequestURI();
            if(uri.startsWith("/admin")){
                modelAndView.setViewName("admin/"+modelAndView.getViewName());
                modelAndView.addObject("theme","admin");
            }else{
                modelAndView.setViewName(systemConfig.getTheme()+"/"+modelAndView.getViewName());
                modelAndView.addObject("theme",systemConfig.getTheme());
            }
        }

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}
