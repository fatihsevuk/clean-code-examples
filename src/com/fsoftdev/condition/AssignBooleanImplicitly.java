package com.fsoftdev.condition;

public class AssignBooleanImplicitly {

    public static void main(String[] args) {

        /**
         * // Dirty Codes
         *         boolean goingToHolidayInSummer;
         *         int moneyInBank=10000;
         *
         *         if(moneyInBank>6000) {
         *            goingToHolidayInSummer = true;
         *         }else {
         *             goingToHolidayInSummer = false;
         *         }
         * // Dirty Codes
         */


        // Clean Codes
        int moneyInBank = 1000;
        boolean goingToHolidayInSummer = moneyInBank>6000;

        System.out.println(goingToHolidayInSummer);



    }
}
