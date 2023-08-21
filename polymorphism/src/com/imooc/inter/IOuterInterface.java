package com.imooc.inter;

/**
 * 接口中的内部类应用
 * @author hugh
 */
// 接口 IOuterInterface
public interface IOuterInterface {
    int TEMP = 100; // 常量

    public static void stMethod() {
        System.out.println("接口中静态方法");
    }

    void abMethod(); // 抽象方法

    public default void deMethod() {
        System.out.println("接口中默认方法");
    }

    // 普通内部类
    public class InnerClass {
        public void show() {
            System.out.println("接口中可定义普通成员内部类");
        }
    }

    // 抽象内部类
    public abstract class AbInnerClass {
        public abstract void abInfo();

        public void info() {
            System.out.println("接口中可定义抽象成员内部类");
        }
    }
}
