package com.codedifferently.lab.partA;

public class Chickens01 {
    //Put your code here

    public static void main(String[] args) {

        int chickenCount = 8;
        int eggsPerChicken = 4;
        int totalEggs;

        //Monday
        System.out.println("On Monday Chicken Count is " + chickenCount);
        //Tuesday
        chickenCount = chickenCount + 1;
        System.out.println("On Tuesday Chicken Count is " + chickenCount);
        //Wednesday
        chickenCount = chickenCount / 2;
        System.out.println("On Wednesday Chicken Count is " + chickenCount);
        totalEggs = chickenCount * eggsPerChicken;
        System.out.println("Total Eggs Are " + totalEggs);
    }
}
