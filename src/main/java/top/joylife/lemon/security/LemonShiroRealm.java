package top.joylife.lemon.security;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import top.joylife.lemon.common.consts.ReCode;
import top.joylife.lemon.exception.Warning;
import top.joylife.lemon.entity.Account;
import top.joylife.lemon.service.AccountService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class LemonShiroRealm extends AuthorizingRealm{
    
    @Autowired
    private AccountService accountService;
    
    private static final Logger logger = LoggerFactory.getLogger(LemonShiroRealm.class);

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        logger.info("授权认证：" + principal.getRealmNames());
        String identifier = (String)super.getAvailablePrincipal(principal);
        Account account=accountService.getAccountByIdentifier(identifier);
        if(account!=null){
            int userId = account.getId();
            //权限信息对象info,用来存放查出的用户的所有的角色（role）及资源
            SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
            //用户的角色集合
            List<String> roleNames = accountService.getRoleNameByUserId(userId);
            Set<String> rolesNameSet = new HashSet<String>(roleNames);
            info.setRoles(rolesNameSet);
            //用户的角色对应的所有权限
            List<String> resources = accountService.getResourceByUserId(userId);
            info.addStringPermissions(resources);
            return info;
        }
        return null;
    }

    /**
     * 登录认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authenticationToken) throws AuthenticationException {
        //UsernamePasswordToken对象用来存放提交的登录信息
        UsernamePasswordToken token=(UsernamePasswordToken) authenticationToken;
        logger.info("验证当前Subject时获取到token为：" + ReflectionToStringBuilder.toString(token, ToStringStyle.MULTI_LINE_STYLE));
        //查出是否有此用户
        Account account=(Account) accountService.getAccountByIdentifier(token.getUsername());
        if(account == null){
            throw new Warning(ReCode.USER_NOT_FOUND);
        }
        //若存在，将此用户存放到登录认证info中，无需自己做密码对比，Shiro会为我们进行密码对比校验
        return new SimpleAuthenticationInfo(account.getIdentifier(), account.getCredential(), getName());
    }
}
