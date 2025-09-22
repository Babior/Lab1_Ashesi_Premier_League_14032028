import java.util.Scanner;
public class FootballPlayer {
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
        if (eligibility){
            System.out.println("Eligible to play");}
        else {
            System.out.println("Not Eligible");}
        if ((age < 18) || (weightKg >= 90)){
            System.out.println("Player has a problem either too young or too heavy");}
        if (!eligibility) {
            System.out.println("Not Eligible");}

        if (age< 20){
            category = "Rising Star";
            System.out.println("Player category - " + category);}
        else  if ( 30 >= age && age >= 20){
            category = "Prime Player";
            System.out.println(" Player category - " + category);}
        else {
            category = "Veteran";
            System.out.println("Player category - " + category);}
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
        System.out.println("Position - " + position);
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
        System.out.println("Category: " + category);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Lineup Decision: " + lineupDecision);

        String finalDecision = eligibility ? "Play" : "Rest";
        System.out.println("Final Decision: " + finalDecision);

        System.out.println("Player: " + name);
        System.out.println("Age: " + age + " (" + category + ")");
        System.out.println("Height: " + heightCmInt + " cm");
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("Jersey: " + jerseyNumber);
        System.out.println("Position: " + position);
        System.out.println("Eligibility: " + (eligibility ? "Eligible" : "Not Eligible"));
        System.out.println("Lineup Decision: " + lineupDecision);
        System.out.println("Final Decision: " + finalDecision);
    }
}