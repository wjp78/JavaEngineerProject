package com.imooc.exercise_extends;

public class Test {
    public static void main(String[] args) {
        Work work = new Work();
        System.out.println("父类信息测试：" + work.work());
        TestWork testWork = new TestWork(10, 5);
        System.out.println("测试工作类信息测试：" + testWork.work());
        DevelopmentWork developmentWork = new DevelopmentWork(+1000, 10);
        System.out.println("研发工作类信息测试：" + developmentWork.work());
    }
}
