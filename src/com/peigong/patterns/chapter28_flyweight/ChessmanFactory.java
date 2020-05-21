package com.peigong.patterns.chapter28_flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: lilei
 * @create: 2020-05-21 16:09
 **/
public class ChessmanFactory {

    private final static ChessmanFactory instance = new ChessmanFactory();

    private final Map<String, Chessman> map = new HashMap<>();

    public static ChessmanFactory getInstance() {
        return instance;
    }

    private ChessmanFactory(){
        map.put("b", new BlackChessman());
        map.put("w", new WhiteChessman());
    }

    public Chessman getChessman(String color) {
        return map.get(color);
    }
}
