package com.imooc.animal;

public class Dog extends Animal {
    private String sex; // 性别

    public Dog() {

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    // 睡觉的方法
    public void  sleep() {
        System.out.println(this.getName() + "现在" + this.getMonth() + "个月大，它在睡觉～～");
    }

    /**
     * 方法重载：
     * 1、同一个类中
     * 2、方法名相同，参数列表不同（参数顺序、个数、类型）
     * 3、方法返回值、访问修饰服任意
     * 4、与方法的参数名无关
     *
     * 方法重写：
     * 1、有继承关系的子类中
     * 2、方法名相同，参数列表相同（参数顺序、个数、类型）
     * 3、访问修饰服？
     * 4、与方法的参数名无关
     * 5、方法返回值？
     */
    public void eat() {
        System.out.println(this.getName() + "最近没有食欲~");
    }
    // private String sleep(String name) {
    //     return "";
    // }
    // public void sleep(String name, int month) {
    //
    // }
    // public void sleep(int month, String Name) {
    //
    // }
    // public void sleep (int name, String month) {
    //
    // }
}
