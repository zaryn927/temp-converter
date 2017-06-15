package edu.cnm.deepdive.temperature;

public class C2F {
  
  public static final String USAGE_MESSAGE = "Usage: java %s tempCelsius%n%n"
      + "where tempCelsius is temperature in Celsius degrees";
  
  public static final String OUTPUT_MESSAGE = "%8.3f \u00B0 Celsius = %8.3f\u00B0 Fahrenheit";

  public static void main(String[] args) {
    
    if (args.length > 0) {
      try{
        double c = Double.parseDouble(args[0]);
        double f = 32 + 9d / 5 * c;
        System.out.printf(OUTPUT_MESSAGE, c, f);
      }// end try clause
      catch (NumberFormatException ex) {
        ex.printStackTrace();
        System.out.printf(USAGE_MESSAGE, C2F.class.getName());
      }// end catch clause  
    }// end if
    else {
      System.out.printf(USAGE_MESSAGE, C2F.class.getName());
    }// end else

  }// end main

}// end C2F
