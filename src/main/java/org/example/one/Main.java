package org.example.one;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int totalPoint=100;
        int versuch=5;
        Random random = new Random();

        int randVorhersage = random.nextInt(51);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Zahl ein, die Sie vermutet haben : ");

        while (versuch>0){


            int meinVersuch = keyboard.nextInt();

            if (meinVersuch<randVorhersage)
            {
                versuch--;
                totalPoint=totalPoint-20;
                System.out.println("Plus");
                System.out.println("Ihr Restanspruch : " + versuch );
                System.out.println("Ihr Total point : " + totalPoint );
            }
            else if (meinVersuch>randVorhersage){
                versuch--;
                totalPoint=totalPoint-20;
                System.out.println("Minus");
                System.out.println("Ihr Restanspruch : " + versuch);
                System.out.println("Ihr Total point : " + totalPoint );
            }
            else {
                System.out.println("Glückwunsch");
                System.out.println("Ihr Restanspruch : " + versuch);
            }

        }


    }
}