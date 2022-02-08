package src.com.GFT.Teste3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;

public class Main {
  public static void main(String[] args) {
    String data1 = "Helena 28 03 1989";
    String data2 = "Romeu 21 04 1950";
    String data3 = "Raquel 14 01 2000";
    String data4 = "Enzo 25 12 2021";

    System.out.println("Helena via até hoje " + diasVividos(data1) + " dias");
    System.out.println("Romeu via até hoje " + diasVividos(data2) + " dias");
    System.out.println("Raquel via até hoje " + diasVividos(data3) + " dias");
    System.out.println("Enzo via até hoje " + diasVividos(data4) + " dias");
  }

  public static int diasVividos(String data) {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      Calendar data1 = Calendar.getInstance();
      Calendar data2 = Calendar.getInstance();
      LocalDate diaAtual = LocalDate.now();
      String dataR[];

      dataR = data.split(" ");
      
      String jTextField1 = dataR[1] + "/" + dataR[2] + "/" + dataR[3];
      String jTextField2 = diaAtual.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
      try {
      data1.setTime(sdf.parse(jTextField1));
      data2.setTime(sdf.parse(jTextField2));
      } catch (java.text.ParseException e ) {}
      Long ms = data2.getTimeInMillis() - data1.getTimeInMillis();
		  int diasDife = (int) (ms / (1000 * 60 * 60* 24));
      return diasDife;
    }
}
