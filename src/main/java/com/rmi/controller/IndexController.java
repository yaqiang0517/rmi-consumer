package com.rmi.controller;

import com.alibaba.fastjson.JSON;
import com.rmi.comm.Account;
import com.rmi.comm.IRmiManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.rmi.RemoteException;

/**
 * @ClassName IndexController
 * @Description TODO
 * @Author zhangyq
 * @Date 2019/4/3 8:56
 **/
@RestController
public class IndexController {

    @Autowired
    IRmiManager rmiManager;

    @GetMapping(value = "/index")
    @ResponseBody
    public Object index() throws RemoteException {
        Account account = rmiManager.getAccount();
        System.out.println(JSON.toJSONString("account : \n" + account));
        return account;
    }


    @PostMapping(value = "/transientTest1")
    @ResponseBody
    public static Object transientTest1(@RequestBody String dto){
        System.out.println("dto : " + JSON.toJSONString(dto));
        return dto;
    }

}
