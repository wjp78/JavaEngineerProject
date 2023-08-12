package com.imooc.animal;

public class Animal {
    public static int st2 = 23;
    private static int st1 = 22;

    static {
        System.out.println("我是父类的静态代码块");
    }

    public int temp = 15;
    protected int month = 2; // 月份
    String species = "动物"; // 品种
    /**
     * private: 只允许在本类中进行访问
     * public: 允许在任意位置访问
     * protected: 允许在当前类、同包子类/非子类、跨包子类调用；跨包非子类不允许
     * 默认: 允许在当前类、同包子类/非子类调用；跨包子类/非子类不允许调用
     */
    private String name = "妮妮"; // 昵称

    {
        System.out.println("我是父类的构造代码块");
    }

    // 父类的构造不允许被继承、不允许被重写，但是会影响子类对象的实例化
    public Animal() {
        System.out.println("我是父类的无参构造方法");
    }

    public Animal(String name, int month) {
        this.setName(name);
        this.setMonth(month);
        System.out.println("我是父类的带参构造方法");
    }

    public String getName() {
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
        System.out.println(name + "在吃东西");
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
}
