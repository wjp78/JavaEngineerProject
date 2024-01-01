package com.imooc.exercise_collection;

import java.util.Objects;

public class Goods {
    private String sn;
    private String title;

    public Goods(String sn, String title) {
        this.setSn(sn);
        this.setTitle(title);
    }

    @Override
    public String toString() {
        return this.hashCode() + "=Goods{" +
                "sn='" + sn + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof Goods) {
           Goods goods = (Goods) obj;
           if(this.sn.equals(((Goods) obj).getSn())) {
               return true;
           } else {
               return false;
           }
       } else {
           return false;
       }
    }

    @Override
    public int hashCode() {
        return this.sn.hashCode();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
