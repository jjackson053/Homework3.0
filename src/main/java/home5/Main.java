package home5;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //*3.1 A simple java program
        System.out.println("we will not use 'hello world'");

     /* 3.2 comments
     This is a comment. The backslashes cut out the line and makes sure the system doesn't read it.
      */

     //3.3 data types and 3.4 Variables
       //3.3.1 integer types
        int a = 2147483647; // 4 bytes. a is the variable
        System.out.println(a);
      short b = 32767; // 2 bytes. b is the variable
        System.out.println(b);
       long c = 1000000000; // 8 bytes.
        System.out.println(c);
       byte d = 127; // 1 byte
        System.out.println(d);
       // 3.3.2 Float-Point types
        float e = 12.5f; // 4 bytes. e is the variable
        System.out.println(e);
        double f = 45.54; // 8 bytes. f is the variable
        System.out.println(f);

        //3.3.3 The char type
        char x = 'c'; // the variable x
        System.out.println(x);
        // 3.3.5 The boolean Type
        boolean ello = true; // boolean only has 2 values, true and false. ello is also the variable.
        System.out.println(ello);
        //3.4.2 constants
        final double lol = 7.1;// final makes the variable constants. which means no other variable can be set to double.
        double nice = 4.5;
        double bad = 10;
        System.out.println((nice * lol) + (bad * lol));

        // 3.5 Operators
        //these are the math operators +(addition), -( subtraction), *(multiplication), and /(division)
        System.out.println(23 + 40);
        System.out.println(40 - 20);
        System.out.println(50 * 3);
        System.out.println(100 / 2);
        // bitwise operator are &&(and), ||(or), ^(xor), ~(not)
        int z = 39;
        int p = 90;
        if(z == 39 && p == 90 ){
            System.out.println(129);
        }
      double g = 75;
      double h = 8;
        System.out.println(Math.sin(g));
        System.out.println(Math.cos(h));
        System.out.println(Math.exp(g));
        System.out.println(Math.log(g));
        System.out.println(Math.tan(h));
        System.out.println(Math.pow(g,h));

       // 3.6 Strings
        String greeting = "hello";
        String s = greeting.substring(0, 3);
        System.out.println(s);
        int o = greeting.length();
        System.out.println(o);
        char first = greeting.charAt(0);
        char last = greeting.charAt(4);
        System.out.println(first);
        System.out.println(last);

        //3.7 Input and Output
        Scanner yeah = new Scanner(System.in);
        System.out.println("What is your name");
        String name = yeah.nextLine();

        //3.8 control Flow
        int balance = 30;
        while (balance>= 0){
            System.out.println(balance);
            balance--;
        }
        //3.9 big number
        Scanner lit = new Scanner(System.in);
        System.out.println("how many numbers do you need to draw? ");
        int k = lit.nextInt();

        System.out.println("what is the highest number you can draw? ");
        int n = lit.nextInt();
        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for(int i = 1; i <= k; i++){
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
            System.out.println("your odds are 1 in " + lotteryOdds + ". good luck!");
          // 3.10 array
            int[] w = new int[100];
            for (int q = 0; q < 100; q++);
            w[i] = i;
        }

    }

}
