package home1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("enter your username: ");
        String user = input.nextLine();

        System.out.print("enter your password: ");
        String pass = input.nextLine();
        String correctpass = "TGIF";

        int fails = 1;
        while(fails <= 5){

            if(pass==correctpass){
                System.out.println("welcome. It took you " + fails  + " trys to log in  ");

            }else if(pass != correctpass){
                System.out.println("try again");
                input.nextLine();

            }else if(fails == 5){
                System.out.println("Contact the system admin. It took you " + fails + " tries.");
                fails++;

            }
        }

    }

}
