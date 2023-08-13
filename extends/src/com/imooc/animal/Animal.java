package com.imooc.animal;

/**
 * final class: 该类没有子类 public final class / final public class
 * final 方法：该方法不允许被子类重写，但是可以正常被子类继承使用
 * final 方法内局部变量：只要在具体被使用之前进行赋值即可，一旦赋值不允许被修改
 *       类中成员属性：赋值过程：1、定义直接初始化 2、构造方法 3、构造代码块
 */
public class Animal {
    /**
     * private: 只允许在本类中进行访问
     * public: 允许在任意位置访问
     * protected: 允许在当前类、同包子类/非子类、跨包子类调用；跨包非子类不允许
     * 默认: 允许在当前类、同包子类/非子类调用；跨包子类/非子类不允许调用
     */
    private String name = "妮妮"; // 昵称
    protected int month = 2; // 月份
    String species = "动物"; // 品种
    public static final int temp = 12;

    static {
         System.out.println("我是父类的静态代码块");
    }

    public static int st2 = 23;
    private static int st1 = 22;

    {
        // temp = 12;
        System.out.println("我是父类的构造代码块");
    }

    // 父类的构造不允许被继承、不允许被重写，但是会影响子类对象的实例化
    public Animal() {
        // temp = 20;
        System.out.println("我是父类的无参构造方法");
    }

    public Animal(String name, int month) {
        this.setName(name);
        this.setMonth(month);
        System.out.println("我是父类的带参构造方法");
    }

    public String getName() {
        // this.temp = 22;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // 吃东西
    public void eat() {
        System.out.println(this.getName() + "在吃东西");
    }

    public void eat(String name) {
        final int temp; // 方法内的局部变量
        // temp = 12;
        System.out.println(name + "在吃东西");
        temp = 12;
        System.out.println(temp);

        final Animal animal = new Animal("凡凡", 1);
        // animal = new Animal();
        animal.setMonth(12);
        animal.setName("豆豆");
    }

    public Animal jump() {
        System.out.println("动物跳跃是一种本能");
        return new Animal();
    }

    // 重载equals方法（改变对比方式）
    public boolean equals(Animal animal) {
        if (animal == null)
            return false;
        return this.getName().equals(animal.getName()) && (this.getMonth() == animal.getMonth());
    }

    // 重写toString方法（改变表现形式）
    public String toString() {
        return "昵称：" + this.getName() + "；年龄：" + this.getMonth();
    }

    public Animal create() {
        return new Animal();
    }

}
