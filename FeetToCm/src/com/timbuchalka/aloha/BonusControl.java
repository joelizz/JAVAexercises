package com.timbuchalka.aloha;

public class BonusControl {
    private double totalBonus = 0;

    public void register(Employee e) {
        System.out.println("Adcionando bonificação de funcionário: " + e);
        this.totalBonus +=  e.getBonus();
    }

    public double getTotalBonus() {
        return this.totalBonus;

    }
}