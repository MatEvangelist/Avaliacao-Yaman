package br.com.evangelista.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtils {

    public static Date obterDataComDiferencaDias(int dias) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, dias);
        return calendar.getTime();
    }

    public static String obterDataFormatada(Date data) {
        DateFormat formatada = new SimpleDateFormat("dd/MM/yyyy");
        return formatada.format(data);
    }
}
