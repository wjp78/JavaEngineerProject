package com.imooc.flow1;

public class PlusDemo {
    public static void main(String[] args) {
        // 求1到5的累加和
        // 1+2+3+4+5
        int n = 1;
        int sum = 0;
        while(n <= 5) {
            sum += n;
            n++;
        }
        System.out.println("求1到5的累加和为 : " + sum);

        // 求1+3+5+7...+15
        int odd = 1;
        int oddSum = 0;
        while(odd <= 15) {
            oddSum += odd;
            odd += 2;
        }
        System.out.println("求1到15奇数的和为 : " + oddSum);
    }
}
