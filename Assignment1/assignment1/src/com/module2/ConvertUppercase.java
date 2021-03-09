package com.module2;

public class ConvertUppercase {
    int maxLength;
    public ConvertUppercase(int maxLength) throws Exception{
        this.maxLength = maxLength;
    }
    public void printUpperCase(String s){
        if(s.length()==this.maxLength){

        } else {
            throw new IllegalArgumentException("String does not matches specified length. Length of string: "+Integer.toString(this.maxLength));
        }
    }
}
