package com.timbuchalka.aloha;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class Data {
    int dia;
    int mes;
    int ano;

    private Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public static int getIdade(Date data) {
        Calendar cData = Calendar.getInstance();
        Calendar cHoje= Calendar.getInstance();
        cData.setTime(data);
        cData.set(Calendar.YEAR, cHoje.get(Calendar.YEAR));
        int idade = cData.after(cHoje) ? -1 : 0;
        cData.setTime(data);
        idade += cHoje.get(Calendar.YEAR) - cData.get(Calendar.YEAR);
        return idade;
    }
}
