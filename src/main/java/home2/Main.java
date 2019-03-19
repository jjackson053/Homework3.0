package home2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lol = new Scanner(System.in);
        System.out.println("enter the first number");
        double x = lol.nextInt();
        System.out.println("enter the second number");
        double y = lol.nextInt();
        double t = 2;
         System.out.println(x + y + "\n");
        System.out.println(x - y + "\n");
        System.out.println(x * y + "\n");
        System.out.println(x / y + "\n");
        System.out.println(Math.pow(x,y)+ "\n");
        System.out.println(Math.sqrt(x)+ "\n");
        System.out.println(Math.pow(x,t)+ "\n");
        System.out.println(Math.sin(x)+ "\n");
        System.out.println(Math.cos(x)+ "\n");

    }


}
