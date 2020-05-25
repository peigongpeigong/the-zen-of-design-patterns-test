package com.peigong.patterns.chapter34.mock_linux_command.command;

import java.util.ArrayList;
import java.util.List;

public enum CommandEnum {
    ls("com.peigong.patterns.chapter34.mock_linux_command.command.ls.LSCommand"),
    df("com.peigong.patterns.chapter34.mock_linux_command.command.df.DFCommand")
    ;

    CommandEnum(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }

    public static List<String> getNames(){
        CommandEnum[] values = CommandEnum.values();
        List<String> names = new ArrayList<>();
        for (CommandEnum value : values) {
            names.add(value.name());
        }
        return names;
    }

}
