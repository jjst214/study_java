package day09.exam07;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int a = Integer.parseInt(in.nextLine());
        int b = Integer.parseInt(in.nextLine());
        
        int val1 = (b % 10) * a;
        int val2 = (b % 100 / 10) * a;
        int val3 = (b / 100) * a;
        
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(a*b);
    }
}