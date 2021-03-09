package com.module1;

public class ThisExample {
    String a;
    String b;

    public void setAB(String a, String b) {
        this.a = a;
        this.b = b;
    }
    public String getA() {
        return a;
    }
    public String getB() {
        return b;
    }

    public ThisExample returnThis(){
        return this;
    }
}
