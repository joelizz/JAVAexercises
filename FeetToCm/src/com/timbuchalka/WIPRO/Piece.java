package com.timbuchalka.WIPRO;

public class Piece {
    private int cod;
    private String name;
    private double value;
    private int amount;


    public Piece(int cod, String name, double value, int amount) {
        this.cod = cod;
        this.name = name;
        this.value = value;
        this.amount = amount;
    }

    public double getValue() {
        return value;
    }

    public double getAmount() {
        return amount;
    }

    public int getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }
}
