package exercise_wrap;

public class HelloWorld {
    public static void main(String[] args) {
        // 定义int类型变量，值为100
        int score = 100;
        // 创建Integer包装类对象，表示变量score1的值
        Integer score1 = score;
        System.out.println("score对应的Integer类型结果为：" + score1);
        // 将Integer包装类转换为double类型
        System.out.println("score对应的double类型结果为：" + score1.doubleValue());
        // 将Integer包装类转换为long类型
        System.out.println("score对应的long类型结果为：" + score1.longValue());
        // 将Integer包装类转换为int类型
        System.out.println("重新由Integer转换为int类型的结果为：" + score1.intValue());
        //打印输出
    }
}
