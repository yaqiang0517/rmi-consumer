package com.rmi.comm;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Account
 * @Description TODO
 * @Author zhangyq
 * @Date 2019/4/3 15:25
 **/
@Data
@AllArgsConstructor
public class Account implements Serializable {
    private int id;
    private String name;
}
