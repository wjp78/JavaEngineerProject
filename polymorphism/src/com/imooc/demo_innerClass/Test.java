package com.imooc.demo_innerClass;

//测试类
public class Test {

    public static void main(String[] args) {
        //完成成员内部类内部测试
        BallTest test = new BallTest();
        BallTest.Inner_m innerM = test.new Inner_m();
        test.playBall(innerM);
        //完成方法内部类测试
        test.playBall(test.info());
        //完成匿名内部类测试
        test.playBall(new Ball() {
            @Override
            public void play() {
                System.out.println("**********");
                System.out.println("匿名内部类：");
                System.out.println("打排球");
            }
        });
    }
}