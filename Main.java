/*
Lab 4
Partners: Lauren Horton and Michael Muenchen
Date: (9/22/20)
*/

import java.util.Random;


class Main {
  public static void main(String[] args) {
     

  Random r = new Random();
  int randomNum = r.nextInt(50)+1;
  System.out.println("The Random number is: " + randomNum);

    
    if (randomNum<25){
      while (randomNum >= 0) {
        System.out.println(randomNum);
        randomNum--;}
      System.out.println("Ahoy mateys!");}
      
    else if (randomNum>25 && randomNum<42){
      while (randomNum >= 0) {
        System.out.println(randomNum);
        randomNum--;}
      System.out.println("Cannonball!");}
    
    else {
      while (randomNum >= 0) {
         System.out.println(randomNum);
         randomNum--;}
      System.out.println("Blast Off!");}
       
  }
}