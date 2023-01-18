package login;

import java.util.Scanner;

public class ShopEntity {



    public static void letsLog(){
        Scanner sc = new Scanner(System.in);
        Register sd=new Register();
        CheckSignInfo ch=new CheckSignInfo();
        int theSelection;
        do{
            showEntry();
            theSelection= sc.nextInt();
            switch (theSelection){
                case 1:
                    sd.register();
                    break;

                case 2:
                    ch.logIn();

                    break;
                case 0:
                    System.out.println();
                    System.out.println("====  Thanks For Choice Us,  We will wait you again  ====");
                    break;
                default:
                    System.out.println("Please enter a valid number");

            }

        }while(theSelection!=0);


    }

    public static void showEntry(){
        System.out.println("===== Welcome To Our Shop =======");
        System.out.print(" 1- Sign up \n 2- Sign in\n 0- Exit \n Your Selection : ");
    }


}
