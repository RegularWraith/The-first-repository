package com.company;

public class Task_1 {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Task_1");
        System.out.println("----------------------------------------");
        System.out.println("Variable a="+a);
        System.out.println("Variable b="+b);
        System.out.println("----------------------------------------");
        int sum, difference, multiplication, division;
        sum = a+b;
        difference=a-b;
        multiplication=a*b;
        division=a/b;
        System.out.println("Sum a+b"+sum);
        System.out.println("Difference a-b"+difference);
        System.out.println("multiplication a*b"+multiplication);
        System.out.println("division a/b"+division);
        System.out.println("----------------------------------------");
        System.out.println("Task_2");
        System.out.println("----------------------------------------");
        String answer;
        answer="fine";
        System.out.println("How are you");
        System.out.println("Ansver is - "+ answer);
        System.out.println("You are "+answer);
        System.out.println("----------------------------------------");
        System.out.println("Task_3");
        int m,n;
        m=5;
        System.out.println("m="+m);
        if (m>0)
        {
            n=1;
            System.out.println("n="+n);
        }
        else if (m==0){
                n=0;
            System.out.println("n="+n);
            }
            else if (m<0){
                n=-1;
            System.out.println("n="+n);
            }
        System.out.println("----------------------------------------");
        System.out.println("Task_4");
        int sum1=0;
        for (int i = 0; i < 10; i++) {
            sum1=sum1+i;
        }
        System.out.println("Sum = " + sum1);
        System.out.println("----------------------------------------");
    }
}
