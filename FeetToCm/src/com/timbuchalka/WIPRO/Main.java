package com.timbuchalka.WIPRO;

import com.timbuchalka.aloha.BonusControl;
import com.timbuchalka.aloha.Employee;
import com.timbuchalka.aloha.Manager;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static PieceList pieceList = new PieceList();

    public static void main(String[] args) {

        BonusControl cdb = new BonusControl();
        Manager employee1 = new Manager("Robscreison", "08525844450", 5000, 123456,
                20);
        cdb.register(employee1);


        System.out.println(" Total de bonus de salario "+ cdb.getTotalBonus());


//        int choice = 0;
//        boolean quit = false;
//        while (!quit) {
//            System.out.println(" Press ");
//            System.out.println("\n 0 -  add your piece ");
//            System.out.println("\n 1- To show your Piece List ");
//            System.out.println("\n 2- To calc percent ipi");
//            System.out.println("\n 3- To search item");
//            System.out.println("\n Enter your choice ");
//            choice = sc.nextInt();
//            sc.nextLine();
//            switch (choice) {
//                case 0:
//                    addItem();
//                    break;
//                case 1:
//                    showPieceList();
//                    break;
//                case 2:
//                    calcIpi();
//                    break;
//                case 3:
//                    searchForItem();
//                    break;
//                case 4:
//                    quit = true;
//                    break;
//            }
//        }
//    }
//
//
//    public static void addItem() {
//        System.out.println("Enter piece item");
//        pieceList.addItem(sc.nextLine());
//    }
//
//    public static void showPieceList() {
//
//    }
//
//    public static int calcIpi() {
//
//    }
//    public static void searchForItem(){
//
//    }
    }
}
