package com.module12;

public class ConvertUppercase {
    int maxLength;
    public ConvertUppercase(int maxLength) throws Exception{
        this.maxLength = maxLength;
    }
    public void printUpperCase(String s){
        if(s.length()==this.maxLength){
            String output=s.toUpperCase();
            System.out.println(output);
        } else {
            throw new IllegalArgumentException("String does not matches specified length. Length of string: "+Integer.toString(this.maxLength));
        }
    }
}
