package com.company.utils;
public class MathHelper{
    public static double PI=3.14;
    public static int square(int n){
        return n*n;
    }
}
package com.company;
import com.company.utils.MathHelper.java;
public class Main{
    System.out.println("The value of PI is:"+MathHelper.PI);
    System.out.println("the value of square with length is: "+MathHelper.square(5));
} 