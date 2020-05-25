package com.peigong.patterns.chapter33.wrapping.adapter;

/**
 * @author: lilei
 * @create: 2020-05-25 09:54
 **/
public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        Superstar superstar = new FilmStar();
        client.record(superstar);
        Superstar standin = new FighterAdapter(new Standin());
        client.record(standin);
    }

    public void record(Superstar superstar) {
        superstar.act();
    }

}
