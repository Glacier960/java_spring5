package com.alibaba.elemesearch.qa.pojo;

public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    //核心代码，注入对象的方法，不能省略，省略就报错
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
