package com.timbuchalka;

public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount + smallCount == goal) {
            return true;
        } else {
            return false;
        }
    }

}
