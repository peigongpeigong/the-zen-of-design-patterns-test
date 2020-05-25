package com.peigong.patterns.chapter34.mock_linux_command;

/**
 * @author: lilei
 * @create: 2020-05-25 11:08
 **/
public class FileManager {

    public static String ls(String path) {
        //具体实现要调用jni，并且判断是否是指定目录，否则为当前目录
        return "file1\nfile2\nfile3\nfile4";
    }

    public static String ls_l(String path) {
        String ret = "drw-rw-rw root admin 1024 xxxxx file1\n";
        ret = ret + "drw-rw-rw root admin 1024 xxxxx file2\n";
        ret = ret + "drw-rw-rw root admin 1024 xxxxx file3\n";
        ret = ret + "drw-rw-rw root admin 1024 xxxxx file4\n";
        return ret;
    }

    public static String ls_a(String path) {
        return ".\n..\nfine1\nfile2\nfile3\nfile4\n";
    }

}
