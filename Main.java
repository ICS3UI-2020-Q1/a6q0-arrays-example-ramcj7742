import java.util.Scanner;
/**
 * array example
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    // create array to store grades
    double[] grades = new double[5];

    //use looop to get all grades
    for(int i = 0; i < 5; i++){
      //asks user for grades
      System.out.println("Enter mark " + (i + 1));
      //fill the array with a value
      grades[i] = input.nextDouble();
    }

    //variable to store total
    double total = 0;

    //loop to add each value to total
    for(int i = 0; i < grades.length; i++){
      //add each grade into total
      total = total + grades[i];
    }
    
    //Calculates average
    double average = total/grades.length;

    //let user know
    System.out.println("your average mark is " + average);

  }
}
