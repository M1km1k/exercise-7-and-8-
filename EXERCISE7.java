import java.util.Scanner;

public class EXERCISE7 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    int quad; 
    int prep; 
    int beginwork; 

    System.out.print("Enter minutes going to the NSA quadrangle: "); 
    quad = input.nextInt(); 

    System.out.print("Enter minutes preparing for work: "); 
    prep = input.nextInt(); 

    System.out.print("Enter time to begin to work: "); 
    beginwork = input.nextInt(); 

    EXERCISE7_1 j1 = new EXERCISE7_1(quad, prep, beginwork); 
    j1.display();
   } 
}
