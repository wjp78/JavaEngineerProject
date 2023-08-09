package com.imooc.exercise_extends;

public class TestWork extends Work {
    //属性：编写的测试用例个数、发现的Bug数量
    private int testNum;
    private int bugCount;
    // 编写构造方法，并调用父类相关赋值方法，完成属性赋值
    public TestWork(int testNum, int bugCount) {
        this.setTestNum(testNum);
        this.setBugCount(bugCount);
        this.setName("测试工作");
    }
    // 公有的get***/set***方法完成属性封装
    public int getTestNum() {
        return testNum;
    }

    public void setTestNum(int testNum) {
        this.testNum = testNum;
    }

    public int getBugCount() {
        return bugCount;
    }

    public void setBugCount(int bugCount) {
        this.bugCount = bugCount;
    }

    // 重写运行方法，描述内容为：**的日报是：今天编写了**个测试用例，发现了**bug。其中**的数据由属性提供
    public String work() {
        return this.getName() + "的日报是：今天编写了" + this.getTestNum() + "个测试用例，发现了" + this.getBugCount() + "个bug";
    }
}
