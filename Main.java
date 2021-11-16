package com.company;

public class Main {


    public static void main(String[] args) {
        int[] villageResources = {200, 100, 300};
        int[] stolenRecources = ConditionalComputerGameRightVersion.numberOfResources(villageResources, 120);
        for (int r : stolenRecources) {
            System.out.println(r);
        }
    }
}
