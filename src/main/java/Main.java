// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    double weight = 200 ;// weight in pounds
    double height_in_feet = 5;// height in feet
    double height = 70 ;// height in inches
    
    double bmi = weight / (height * height) * 703;
    System.out.println("Enter weight in pounds: " + weight);
    System.out.println("Enter height in feet: " + height_in_feet);
    System.out.println("Enter inches: " + height);
    System.out.println("BMI: " + bmi);
    if (bmi < 18.5)
    

      
      System.out.println("Underweight");
    else if (bmi < 25)
      System.out.println("Normal");
    else if (bmi < 30)
      System.out.println("Overweight");
    else
      System.out.println("Obese");
      
    
    
    System.out.println("");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}