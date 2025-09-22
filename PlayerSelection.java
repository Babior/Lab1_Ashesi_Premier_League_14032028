import java.util.Scanner;
public class PlayerSelection {
  public static void main(String[] args){
    Scanner inputs = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = inputs.nextLine();
    System.out.println("Enter your age");
    int age = inputs.nextInt();
    System.out.println("Enter your height in meters: ");
    double height = inputs.nextDouble();
    System.out.println("Enter your weight in pounds: ");
    double weight = inputs.nextDouble();
    System.out.println("Enter your jersey number: ");
    int jerseyNumber = inputs.nextInt();

    final double pound = 0.45359237;
    final int meter = 100;
    double weightKg = weight * pound;
    double heightCm = height * meter;

    weightKg = (int) weightKg;

    age++;
    jerseyNumber--;
   
    String category;
    boolean eligibility = (age >= 18 && age <= 35 && weightKg < 90);
    
    if (age< 20){
        category = "Rising Star";}
    else  if ( 30 >= age && age >= 20){
        category = "Prime Player";}
    else {
       category = "Veteran";}

    String position;
    switch (jerseyNumber) {
        case 1:
        position = "Goalkeeper";
        break;
        case 2:
        case 3:
        case 4:
        case 5:
        position= "Defender";
        break;
        case 6:
        case 8:
        case 10:
        position = "Midfielder";
        break;
        case 7:
        case 9:
        case 11:
        position = "Attacker";
        break;
    default:
        position = "Player position not known";
        break;
        }

    String lineupDecision;
    if (category.equals("Prime Player")) {
        if (weightKg < 80) {
            lineupDecision = "Starting lineup";
        }
        else {
        lineupDecision = "Bench";
        }
       } else {
       lineupDecision = "Bench";
       }
       
       
       String finalDecision = eligibility ? "Play" : "Rest";
  
    
        System.out.println("Player: " + name);
        System.out.println("Age: " + age + " (" + category + ")");
        System.out.println("Height: " + heightCm + " cm");
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("Jersey: " + jerseyNumber);
        System.out.println("Position: " + position);
        System.out.println("Eligibility: " + (eligibility ? "Eligible" : "Not Eligible"));
        System.out.println("Lineup Decision: " + lineupDecision);
        System.out.println("Final Decision: " + finalDecision);
}
}