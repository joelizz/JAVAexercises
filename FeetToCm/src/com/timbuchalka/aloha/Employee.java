package com.timbuchalka.aloha;

public abstract class Employee {
    protected String name;
    protected String cpf;
    protected double salary;

    public Employee(String name, String cpf, double salary) {
        this.name = name;
        this.cpf = cpf;
        this.salary = salary;
    }

    public double getBonus(){
        return this.salary * 0.12;
    }

    public String getName(){
        return this.name = name;
    }

}
