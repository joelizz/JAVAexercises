package com.timbuchalka.WIPRO;

import java.util.ArrayList;

public class PieceList {

    private ArrayList<Object> pieceList = new ArrayList<Object>();

    public void addItem(String item) {
        pieceList.add(item);
    }

    public void printPieceList() {
        System.out.println("You have " + pieceList.size() + "Your piece List");
        for (int i = 0; i < pieceList.size(); i++) {
            System.out.println((i + 1) + " . " + pieceList.get(i));
        }
    }
//    public static int calcIpi(){
//    //create a method to findItem and then searchItem and then calc the ipi//
//
//    }

}
