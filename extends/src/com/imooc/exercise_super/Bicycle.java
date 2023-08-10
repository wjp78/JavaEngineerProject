package com.imooc.exercise_super;

public class Bicycle extends NonMotor {
    // 在构造方法中调用父类多参构造，完成属性赋值
    public Bicycle() {
        super("捷安特", "黄");
    }
    // 重写运行方法，描述内容为：这是一辆**颜色的，**牌的自行车。其中**的数据由属性提供
    public String work() {
        return "这是一辆" + super.getColor() + "颜色的，" + super.getBrand() + "牌的自行车";
    }
}
