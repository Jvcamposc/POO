/*Crie uma classe Date com as seguintes capacidades:
a) Gerar saída da data em múltiplos formatos, como
MM/DD/YYYY
June 14, 1992
DDD YYYY
b) Utilizar construtores sobrecarregados para criar objetos Date inicializados com datas dos
formatos na parte (a). No primeiro caso, o construtor deve receber três valores inteiros. No
segundo caso, deve receber uma String e dois valores inteiros. No terceiro caso, deve
receber dois valores inteiros, o primeiro representando o número de dias no ano. */
package Aula07.Atividade04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateClass {
    private Calendar calendar;

    // Construtor que recebe três inteiros (MM, DD, YYYY)
    public DateClass(int month, int day, int year) {
        calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Mês em Calendar é zero-indexado
    }

    // Construtor que recebe uma String e dois inteiros (Nome do mês, DD, YYYY)
    public DateClass(String monthName, int day, int year) {
        calendar = Calendar.getInstance();
        int month = getMonthNumber(monthName);
        calendar.set(year, month, day);
    }

    // Construtor que recebe dois inteiros (dia do ano e ano)
    public DateClass(int dayOfYear, int year) {
        calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_YEAR, dayOfYear);
    }

    // Método para converter nome do mês em número
    private int getMonthNumber(String monthName) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MMMM", Locale.ENGLISH);
            Date date = sdf.parse(monthName);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            return cal.get(Calendar.MONTH); // Retorna o mês em zero-index
        } catch (Exception e) {
            throw new IllegalArgumentException("Mês inválido: " + monthName);
        }
    }

    // Método para obter a data no formato MM/DD/YYYY
    public String formatMMDDYYYY() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        return sdf.format(calendar.getTime());
    }

    // Método para obter a data no formato "June 14, 1992"
    public String formatFullDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy");
        return sdf.format(calendar.getTime());
    }

    // Método para obter a data no formato "DDD YYYY"
    public String formatDDDYYYY() {
        SimpleDateFormat sdf = new SimpleDateFormat("D yyyy");
        return sdf.format(calendar.getTime());
    }

    public static void main(String[] args) {
        DateClass date1 = new DateClass(6, 14, 1992);
        DateClass date2 = new DateClass("June", 14, 1992);
        DateClass date3 = new DateClass(165, 1992); // 165º dia do ano

        System.out.println(date1.formatMMDDYYYY()); // Exibe: 06/14/1992
        System.out.println(date2.formatFullDate());  // Exibe: June 14, 1992
        System.out.println(date3.formatDDDYYYY());   // Exibe: 165 1992
    }
}

