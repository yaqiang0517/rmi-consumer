package com.rmi.conf;

import com.rmi.comm.IRmiManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * @ClassName RmiConfig
 * @Description TODO
 * @Author zhangyq
 * @Date 2019/4/3 15:29
 **/
@Configuration
public class RmiConfig {

    @Bean
    public RmiProxyFactoryBean factoryBean(){
//        System.setSecurityManager(new java.rmi.RMISecurityManager());
        RmiProxyFactoryBean factoryBean = new RmiProxyFactoryBean();
        factoryBean.setServiceInterface(IRmiManager.class);
        factoryBean.setServiceUrl("rmi://localhost:4567/rmiManagerName");
        return factoryBean;
    }
}
