package com.imooc.jdk12;

import java.util.Random;

// 新版swith语法
public class Sample06 {
    public static void main(String[] args) {
        new Sample06().newSwitch();
    }

    public void oldSwitch() {
        int day = new Random().nextInt(7);
        int result = 0;
        switch (day) {
            case 0:
            case 1:
            case 2:
                result = 88;
                break;
            case 3:
                result = 99;
                break;
            case 4:
            case 5:
                result = 101;
                break;
            case 6:
                result = 120;
                break;
            default:
                result = -1;
        }
        System.out.println(result);
    }

    public void newSwitch() {
        int day = new Random().nextInt(7);
        int result = switch (day) {
            case 0, 1, 2 -> 88;
            case 3 -> 99;
            case 4, 5 -> 101;
            case 6 -> 120;
            default -> -1;
        };
        System.out.println(result);
    }
}
