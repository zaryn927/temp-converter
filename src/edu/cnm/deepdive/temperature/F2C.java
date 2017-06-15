package edu.cnm.deepdive.temperature;

public class F2C {
  
  public static final String USAGE_MESSAGE = "Usage: java %s tempFahrenheit%n%n"
      + "where tempFahrenheit is temperature in Fahrenheit degrees";
  
  public static final String OUTPUT_MESSAGE = "%8.3f \u00B0 Fahrenheit = %8.3f\u00B0 Celsius";

  public static void main(String[] args) {
    
    if (args.length > 0) {
      try{
        double f = Double.parseDouble(args[0]);
        double c = (f - 32) * 5 / 9;
        System.out.printf(OUTPUT_MESSAGE, f, c);
      }// end try clause
      catch (NumberFormatException ex) {
        ex.printStackTrace();
        System.out.printf(USAGE_MESSAGE, F2C.class.getName());
      }// end catch clause  
    }// end if
    else {
      System.out.printf(USAGE_MESSAGE, F2C.class.getName());
    }// end else

  }// end main

}// end F2C
