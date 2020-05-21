package com.peigong.patterns.chapter28_flyweight;

/**
 * @author: lilei
 * @create: 2020-05-21 16:12
 **/
public class Client {

    public static void main(String[] args) {
        Chessman black1 = ChessmanFactory.getInstance().getChessman("b");
        Chessman black2 = ChessmanFactory.getInstance().getChessman("b");
        Chessman black3 = ChessmanFactory.getInstance().getChessman("b");
        Chessman white1 = ChessmanFactory.getInstance().getChessman("w");
        Chessman white2 = ChessmanFactory.getInstance().getChessman("w");

        black1.display(new Coordinates(1,2));
        black2.display(new Coordinates(5,2));
        black3.display(new Coordinates(1,7));
        white1.display(new Coordinates(3,2));
        white2.display(new Coordinates(6,2));
        System.out.println(black1 == black2);
    }

}
