package org.example.two;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main2 {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Main2.class.getName());


        int totalPoint=100;
        int versuch=5;
        final Random random = new Random();

        int randVorhersage = random.nextInt(51);

        final Scanner keyboard = new Scanner(System.in);
        Methods.printMyMessages(Status.STARTER, logger);

        try {
            while (versuch>0){


                int meinVersuch = keyboard.nextInt();

                if (meinVersuch<randVorhersage)
                {
                    versuch--;
                    Methods.decreaseTotalPoint(totalPoint, logger);
                    Methods.printMyMessages(Status.INCREASE, logger);
                    Methods.printMyMessages(Status.REMAIN_TRYING,logger, versuch);

                }
                else if (meinVersuch>randVorhersage){
                    versuch--;
                    Methods.decreaseTotalPoint(totalPoint, logger);
                    Methods.printMyMessages(Status.DECREASE, logger);
                    Methods.printMyMessages(Status.REMAIN_TRYING,logger, versuch);

                }
                else {
                    Methods.printMyMessages(Status.CONGRATULATIONS, logger);
                    Methods.printMyMessages(Status.REMAIN_TRYING,logger, versuch);
                    Methods.printMyMessages(Status.TOTAL_POINTS, logger, totalPoint);
                    keyboard.close();

                }

            }



        }
        catch (Exception e){
            logger.log(Level.WARNING, e.getMessage());
        } finally {
            keyboard.close();
        }



    }

}