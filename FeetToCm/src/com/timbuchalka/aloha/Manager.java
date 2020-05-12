package com.timbuchalka.aloha;

public class Manager extends Employee {
    private int senha;
    private int numberOfEmployeesManaged;


    @Override
    public double getBonus() {
        return this.salary * 0.15;
    }

    public boolean authenticates(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso negado");
            return false;

        }
    }

    public Manager(String name, String cpf, double salary, int senha, int numberOfEmployeesManaged) {
        super(name, cpf, salary);
        this.senha = senha;
        this.numberOfEmployeesManaged = numberOfEmployeesManaged;
    }


}



