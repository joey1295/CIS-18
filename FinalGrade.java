import java.util.Scanner;
 
public class FinalGrade {
    public static void main(String[] args){
       Double weight, current, required; 
       Double percentage;
       Scanner inputNumScanner = new Scanner(System.in);
   
       System.out.println("Enter the Final Exam Weight: ");       
       weight = inputNumScanner.nextDouble();
 
       System.out.println("Enter Current Grade: ");
       current = inputNumScanner.nextDouble();

       System.out.println("Enter the grade you would like to receive? : ");
       required = inputNumScanner.nextDouble();
 
       percentage = (((required*.01) - ((1.0-(weight*.01))*(current*.01)))/ (weight*.01)) ;
 
       System.out.println("The percentage required for the final is " + percentage*100 + " % " + "to receive a grade of " + required + "% in the class.");
    }
}
