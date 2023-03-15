import java.util.Scanner;
class Main {
  
  public static void main(String[] args) {
    System.out.println("Wybierz operację:\n 1 - pole prostokata, 2 - pole trojkata prostokatnego"); 
    System.out.println("Dla trojkata prostokątnego pierwszy bok to podstawa, drugi wysokosc"); 
 Scanner in = new Scanner (System.in);
 int wybór = in.nextInt();
 System.out.println("Podaj pierwszy bok figury: ");
 Float a = in.nextFloat();
 System.out.println("Podaj drugi bok figury: ");
 Float b = in.nextFloat();
    
switch(wybór){
 case 1:{
 System.out.println("Pole porstokata wynosi "+(a*b));
 break; 
 }
     case 2:{
 System.out.println("Pole trojkata prostokatnego "+ (0.5*a*b));
 break; 
 }
    
  }
}}