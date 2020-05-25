package com.peigong.patterns.chapter34.mock_linux_command.command;

import java.util.*;

/**
 * @author: lilei
 * @create: 2020-05-25 10:56
 **/
public class CommandVO {
    public final static String DIVIDE_FLAG = " ";

    public final static String PREFIX = "-";

    private String commandName;

    private Set<String> paramsSet = new HashSet<>();

    private List<String> dataList = new ArrayList<>();

    public CommandVO(String commandStr) {
        if (commandStr != null && commandStr.length() > 0) {
            String[] str = commandStr.split(DIVIDE_FLAG);
            this.commandName = str[0];
            if (str.length > 1) {
                for (int i = 1; i < str.length; i++) {
                    String p = str[i];
                    if (p.indexOf(PREFIX) == 0) {
                        p = p.replace(PREFIX, "");
                        paramsSet.addAll(Arrays.asList(p.split("")));
                    }else{
                        dataList.add(p.trim());
                    }
                }
            }
        }else{
            System.out.println("无效指令");
        }
    }

    public String getCommandName() {
        return commandName;
    }

    public List<String> getParams(){
        return new ArrayList<>(paramsSet);
    }

    public List<String> getData(){
        return dataList;
    }

    public String formatData(){
        String data = "";
        if (dataList.size() > 0) {
            data = dataList.get(0);
        }
        return data;
    }
}
