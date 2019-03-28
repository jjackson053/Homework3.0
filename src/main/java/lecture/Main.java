package lecture;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println(calculatediscount(100,40));
        //System.out.println(pie(40));
       /* String shell= "She sells seashells by the seashore." + "\n"+
                "The shells she sells are surely seashells." + "\n"+
                "So if she sells shells on the seashore," + "\n"+
                "I'm sure she sells seashore shells";
        String[] shellArray = shell.split(" ");
        int up = 0;
        for(int x= 0; x < shellArray.length; x++){
            if(shellArray[x].equals("shells")){
                up++;
                continue;
            }
        }
        System.out.println("shells pops up " + up + " times");*/
      // int cool = (int)(Math.random() * 6 + 1);

       int[][] lol =
               {
                       {5,4,8,2},
                       {90,56,3,11},
                       {107,46,28,17},
                       {206,27,89,70}

               };
        for (int x = 0; x < lol.length; x++){
            for(int y = 0; y < lol[x].length; y++){
            System.out.println( "row " + x + " column " + y + " = " + lol[x][y]);
            }
        }
        long o = 1999999999;
        }

        // for(int x= 0; x < nice.length; x++ ){
          //  System.out.println(nice[x]);
        }




    /*public static String calculatediscount(double price, double discount){
        String lol = "";
        double r = (discount / 100 );
        double t = price * r ;
        double z =  price - t;
        lol+=  "The final price is " + z + " after a " + discount + "% discount";
        return lol;
    }
    public static double pie(double radius){

       double d = Math.PI * (radius* radius);
        return d;

    }*/



