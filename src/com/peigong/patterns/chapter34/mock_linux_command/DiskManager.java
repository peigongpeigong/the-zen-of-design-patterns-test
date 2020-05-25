package com.peigong.patterns.chapter34.mock_linux_command;

/**
 * @author: lilei
 * @create: 2020-05-25 13:44
 **/
public class DiskManager {

    public static String df(){
        return "/\t123345\n/usr\t123781263\nhome\t345345345\n";
    }

    public static String df_k(){
        return "/\t10240\n/usr\t10240\n/home\t10240";
    }

    public static String df_g(){
        return "/\t10\n/usr\t100\n/home\t10000\n";
    }

}
