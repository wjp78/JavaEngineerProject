package com.imooc.exercise_super;

public class Test {
    public static void main(String[] args) {
        NonMotor nonMotor = new NonMotor("天宇", "红", 4, 2);
        System.out.print("父类信息测试：" + nonMotor.work() + "\n");
        Bicycle bicycle = new Bicycle();
        System.out.print("自行车类信息测试：" + bicycle.work() + "\n");
        ElectricVehicle electricVehicle = new ElectricVehicle();
        electricVehicle.setBatteryBrand("飞鸽");
        System.out.print("电动车类信息测试：" + electricVehicle.work() + "\n");
        Tricycle tricycle = new Tricycle();
        System.out.print("三轮车类信息测试：" + tricycle.work() + "\n");
    }
}
