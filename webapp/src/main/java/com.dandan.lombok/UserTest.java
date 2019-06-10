package com.dandan.lombok;

import sun.nio.cs.ext.GBK;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/5/9
 * @Desciption :
 */
public class UserTest {


    public static void main(String[] args) throws Exception {

        User user = new User();
        user.setUserName("丹");

        String userName = user.getUserName();
        System.out.println(userName.length());//1
        System.out.println(userName.getBytes().length);//3
        System.out.println(userName.getBytes("GBK").length);//2
        System.out.println(userName.getBytes("UTF-8").length);//3

    }

}
