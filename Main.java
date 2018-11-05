import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String args[]){

        final String start = "1939-09-01";
        final int endYear = 1945;
        final int endMonth = 5;
        final int endDay = 8;
        final LocalDate endLD = LocalDate.of(endYear, endMonth, (endDay+1));
        final int rok2016 = 2016;
        final int miesiac1 = 1;
        final int dzien1 = 1;
        final int liczbaDniDoDodania = 67;

        System.out.print("II wojna swiatowa trwala ");
        System.out.print(ChronoUnit.DAYS.between(
                LocalDate.parse(start), endLD));
        System.out.println(" dni");

        LocalDate dwaK16 = LocalDate.of(rok2016, miesiac1,dzien1);
        LocalDate dzien68 = dwaK16.plusDays(liczbaDniDoDodania);
        System.out.println(dzien68.getDayOfYear() + " dzien 2018 roku to " + dzien68.getDayOfMonth() + " " + dzien68.getMonth());

        Luty29 test = new Luty29("1994-06-13");
        System.out.println(test.getWynik());

    }
}
