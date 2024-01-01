package com.imooc.exercise_collection;

import java.util.HashSet;

public class UniqueSetSample {
    public static void main(String[] args) {
        /*
            思考：set 集合如何确保数据的唯一性？
            解答：Set 集合在新增数据时先判断数据的hashCode() 是否已存在，
            若hashCode()在Set集合存在再调用equals()进行值比较;
            hashCode()与equals()都存在的情况下，Set集合才认为数据已存在，不予新增。

            思考：为什么要用对象的hashCode()直接用equals()判断不行吗？
            解答：出于执行效率考虑。
            hashCode()返回的整数结果决定了Set集合中的存放位置，hashCode()计算速度很快，但可能出现哈希碰撞；
            equals()则对值进行比较，处理速度相对较慢。
        */

        String a = "a";
        String b = "b";
        System.out.println(a.hashCode() + ":" + b.hashCode());


        HashSet<Goods> goodsSet = new HashSet<>();
        goodsSet.add(new Goods("11111","IPHONE"));
        goodsSet.add(new Goods("11111","IPHONE"));
        goodsSet.add(new Goods("22222","荣耀"));
        goodsSet.add(new Goods("33333","IPHONE"));
        System.out.println(goodsSet);
    }
}
