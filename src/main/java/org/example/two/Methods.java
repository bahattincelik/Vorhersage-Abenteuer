package org.example.two;

import java.util.logging.Logger;

public class Methods {
    private static int point;

    public static void printMyMessages (Status status, Logger logger) {
        if (status.equals(Status.STARTER)) {
            logger.info("Bitte geben Sie die Zahl ein, die Sie vermutet haben : ");
        }
        else if (status.equals(Status.INCREASE)){
            logger.info("Plus");
        } else if (status.equals(Status.DECREASE)) {
            logger.info("Minus");
        }
        else if(status.equals(Status.CONGRATULATIONS)){
            logger.info("Glückwunsch");


        }

    }

    public static void printMyMessages(Status status, Logger logger, int delta ){
        if (status.equals(Status.REMAIN_TRYING)){
            logger.info("Ihr Restanspruch : " + delta);
        } else if (status.equals(Status.TOTAL_POINTS)) {

            logger.info("Ihr Total point : " + delta);
        }
    }

    public static int decreaseTotalPoint(int point, Logger logger){

        point = point - 20;

        logger.info("Total point :" + point);

        return point;
    }
}
