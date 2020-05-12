package com.timbuchalka.aloha;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class challenge {
    public static void main(String[] args) {


    }

    class Casa {
        boolean porta1;
        boolean porta2;
        boolean porta3;

        public void paint(String s) {

        }

        public boolean abrirPorta(String abrir, boolean porta){
            porta1 = porta;
            porta2 = porta;
            porta3 = porta;
            if(abrir == "abrir"){
                porta = true;
            }
            return porta;
        }

//        public boolean portasAbertas(boolean porta1, boolean porta2, boolean porta3){
//
//        }

    }


}
