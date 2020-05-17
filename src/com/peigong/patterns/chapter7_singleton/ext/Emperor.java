package com.peigong.patterns.chapter7_singleton.ext;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 扩展，仅生成n各对象
 * @author: lilei
 * @create: 2020-05-17 14:26
 **/
public class Emperor {

    private static int maxNumOfEmperor = 2;

    private static List<String> names = new ArrayList<>();

    private static Emperor[] emperors = new Emperor[maxNumOfEmperor];

    private static int countNumOfEmperor = 0;

    static{
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperors[i] = new Emperor("Emperor" + i);
        }
    }

    private Emperor(String name) {
        names.add(name);
    }

    public static Emperor getInstance() {
        Random random = new Random();

        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperors[countNumOfEmperor];
    }

    public void whoAmI(){
        System.out.println(this);
    }

}
