package org.example;

import java.util.Scanner;

public class ElectionStatistics {
    public static void main(String[] args) {

        Scanner Labour, Conservative, LibDems;
        final String P1 = "Labour";
        final String P2 = "Conservative";
        final String P3 = "LibDems";
        int LabourVotes, ConservativeVotes, LibDemVotes, totalVotes;
        int LabourPercentage, ConservativePercentage, LibDemsPercentage;
        String Winner;

        Labour = new Scanner(System.in);
        System.out.println("you many votes did " + P1 + " receive?");
        LabourVotes = Labour.nextInt();
        System.out.println(P1 + " received " + LabourVotes + " votes");

        Conservative = new Scanner(System.in);
        System.out.println("you many votes did " + P2 + " receive?");
        ConservativeVotes = Conservative.nextInt();
        System.out.println(P2 + " received " + ConservativeVotes + " votes");

        LibDems = new Scanner(System.in);
        System.out.println("you many votes did " + P3 + " receive?");
        LibDemVotes = LibDems.nextInt();
        System.out.println(P3 + " received " + LibDemVotes + " votes");

        totalVotes = LabourVotes + ConservativeVotes + LibDemVotes;
        System.out.println("The total votes received is: " + totalVotes + " votes");

        LabourPercentage = (LabourVotes * 100) / totalVotes;
        System.out.println(P1 + " received %" + LabourPercentage + " of the overall vote");

        ConservativePercentage = (ConservativeVotes * 100) / totalVotes;
        System.out.println(P2 + " received %" + ConservativePercentage + " of the overall vote");

        LibDemsPercentage = (LibDemVotes * 100) / totalVotes;
        System.out.println(P3 + " received %" + LibDemsPercentage + " of the overall vote");

           if (LabourPercentage > ConservativePercentage && LabourPercentage > LibDemsPercentage){
               Winner = P1;
           } else if (ConservativePercentage > LabourPercentage  && ConservativePercentage > LibDemsPercentage){
               Winner = P2;
           } else {
               Winner = P3;
           }
           System.out.println("The Winner of the 2022 General election is: " + Winner);
    }
}