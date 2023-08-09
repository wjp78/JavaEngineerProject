package com.imooc.exercise_extends;

public class DevelopmentWork extends Work {
    // 属性：有效编码行数、目前没有解决的Bug个数
    private int validEncodedLines;
    private int notFixBugNum;

    // 编写构造方法，并调用父类相关赋值方法，完成属性赋值
    public DevelopmentWork(int validEncodedLines, int notFixBugNum) {
        this.setValidEncodedLines(validEncodedLines);
        this.setNotFixBugNum(notFixBugNum);
        this.setName("研发工作");
    }
    // 公有的get***/set***方法完成属性封装
    public int getValidEncodedLines() {
        return validEncodedLines;
    }

    public void setValidEncodedLines(int validEncodedLines) {
        this.validEncodedLines = validEncodedLines;
    }

    public int getNotFixBugNum() {
        return notFixBugNum;
    }

    public void setNotFixBugNum(int notFixBugNum) {
        this.notFixBugNum = notFixBugNum;
    }

    // 重写运行方法，描述内容为：**的日报是：今天编写了**行代码，目前仍然有**个bug没有解决。其中**的数据由属性提供
    public String work() {
        return this.getName() + "的日报是：今天编写了" + this.getValidEncodedLines() + "行代码，目前仍然有" + this.getNotFixBugNum() + "个bug没有解决";
    }
}
