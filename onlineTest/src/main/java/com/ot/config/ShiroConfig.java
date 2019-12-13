package com.ot.config;
import java.util.HashMap;
import java.util.Map;

import com.ot.realm.EnceladusShiroRealm;
import com.ot.utils.PasswordHelper;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean shirFilter(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        Map<String, String> filterChainDefinitionMap = new HashMap<String, String>();
        shiroFilterFactoryBean.setLoginUrl("/login");
        shiroFilterFactoryBean.setUnauthorizedUrl("/unauthc");
        shiroFilterFactoryBean.setSuccessUrl("/home/index");

        filterChainDefinitionMap.put("/*", "anon");
        filterChainDefinitionMap.put("/authc/index", "authc");
        filterChainDefinitionMap.put("/authc/admin", "roles[admin]");
        filterChainDefinitionMap.put("/authc/renewable", "perms[Create,Update]");
        filterChainDefinitionMap.put("/authc/removable", "perms[Delete]");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher() {
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName(PasswordHelper.ALGORITHM_NAME); // 散列算法
        hashedCredentialsMatcher.setHashIterations(PasswordHelper.HASH_ITERATIONS); // 散列次数
        return hashedCredentialsMatcher;
    }

    @Bean
    public EnceladusShiroRealm shiroRealm() {
        EnceladusShiroRealm shiroRealm = new EnceladusShiroRealm();
        shiroRealm.setCredentialsMatcher(hashedCredentialsMatcher()); // 原来在这里
        return shiroRealm;
    }

    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(shiroRealm());
        return securityManager;
    }

    @Bean
    public PasswordHelper passwordHelper() {
        return new PasswordHelper();
    }
}
