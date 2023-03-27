package com.codedifferently.lab.partA;

public class Chickens02 {

        //Put your code here

        public static void main(String[] args) {

            int eggsCollected = 100;

            //Monday
            System.out.println("On Monday Eggs Collected are " + eggsCollected);
            //Tuesday
            eggsCollected = eggsCollected + 121;
            System.out.println("On Tuesday Eggs Collected are " + eggsCollected);
            //Wednesday
            eggsCollected = eggsCollected + 117;
            System.out.println("On Wednesday Eggs Collected are " + eggsCollected);
            //calculate daily average
            double dailyAverage = eggsCollected / 3.0;
            //Calculate 30 day average
            System.out.println("The 3 day average is " + dailyAverage);
            double monthlyAverage = dailyAverage * 30;
            System.out.println("The Monthly Average is " + monthlyAverage);
            //Calculate Total Profit
            double profitPerEgg = 0.18;
            double monthlyProfit = monthlyAverage * profitPerEgg;
            System.out.println("Estimated Total Profit is " + monthlyProfit);
        }
    }
