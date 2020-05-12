package date;


import javax.swing.text.DateFormatter;
import java.text.*;
import java.util.Date;

public class AppDate {
    public static void main(String[] args) {
        Date data = new Date();
        int ano = data.getYear() + 1900;
        int diames = data.getDate();
        int dia = data.getDay();
        int mes = data.getMonth() + 1;
        String mestexto = null;
        String numero = null;

        String dp = null;

        switch (dia){
            case 0 : dp = "Domingo";break;
            case 1 : dp = "Segunda";break;
            case 2 : dp = "Terça";break;
        }

        switch (mes){
            case 0 : mestexto = "Domingo";break;
            case 1 : mestexto = "Segunda";break;
            case 5 : mestexto = "Maio";break;
        }

        if(mes <=9 ){
          numero = "0" + mes;
        }
        System.out.println("Entrega" + diames + "/"+numero+"/"+ano);
        System.out.println("Devolução" + (diames+8) + "/"+numero+"/"+ano);

        System.out.println("12/05/2020");





        //SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");

        //String hj = df.format(data);
        //System.out.println(hj);
    }
}
