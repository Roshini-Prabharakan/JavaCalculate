package Program1;

import java.util.Scanner;

public class year {
      public static void main(String args[]){
    	  double minutesInYear = 60 * 24 * 365;
    	  Scanner in = new Scanner(System.in);
    	  System.out.println("Enter number of minutes:");
    	  double min = in.nextDouble();
    	  long years = (long) (min / minutesInYear);
    	  int days = (int) (min / 60 / 24) % 365;
    	  System.out.println((int) min + " Minutes is approximately " + years + " years and " + days + " days ");
      }
}
