import java.util.Scanner;
 
 
/*
    Week 2 Lab: Weather Report Program
    Topics: Conditional statements, loops, typecasting, input validation
    Objective: Ask the user for weather info, validate input, and display a full report
*/
 
 
public class Lab1 {
    public static void main(String[] args) {
 
 
        Scanner input = new Scanner(System.in);
 
 
        /*
        STEP 1: Declare variables for weather information
        a) Today's weather conditions (String)
        b) Possibility of precipitation (String)
        c) Wind speed (String)
        d) Daily high temperature (int or double)
        e) Daily low temperature (int or double)
        f) UV index (int)
        */
 
 
        // TODO: Declare your variables here
        String weatherConditions;
        String precipitation;
        String windSpeed;
        double highTemp;
        double lowTemp;
        int uvIndex;
 
 
        /*
        STEP 2: Get input from the user using Scanner
        - Ask for each variable above
        - Validate numeric input using loops
        - Example: Ensure highTemp >= lowTemp
        */
 
 
        // TODO: Prompt user and read input
        System.out.print("Enter today's weather conditions (e.g., Sunny, Rainy): ");
        weatherConditions = input.nextLine();
        System.out.print("Enter possibility of precipitation (e.g., 20%): ");
        precipitation = input.nextLine();
        System.out.print("Enter wind speed (e.g., 15 km/h): ");
        windSpeed = input.nextLine();
        // TODO: Use loops to validate high/low temperatures and UV index
        while (true) {
            System.out.print("Enter daily high temperature: ");
            highTemp = input.nextDouble();
            System.out.print("Enter daily low temperature: ");
            lowTemp = input.nextDouble();
            if (highTemp >= lowTemp) {
                break;
            } else {
                System.out.println("High temperature must be greater than or equal to low temperature. Please re-enter.");
            }
        }

        while (true) {
            System.out.print("Enter UV index (0-11+): ");
            uvIndex = input.nextInt();
            if (uvIndex >= 0) {
                break;
            } else {
                System.out.println("UV index must be non-negative. Please re-enter.");
            }
        }
        
 
        /*
        STEP 3: Typecasting (if needed)
        - Example: if you read a double but want to display as int
        */
 
 
        // TODO: Apply typecasting where necessary
        int highTempInt = (int) highTemp;
        int lowTempInt = (int) lowTemp;
 
        /*
        STEP 4: Conditional statements
        - Example: 
          - If UV index >= 6, suggest "Use sunscreen"
          - If precipitation >= 50%, suggest "Carry an umbrella"
          - If wind speed > 40 km/h, suggest "Windy conditions"
        */
 
 
        // TODO: Write if, if-else, or nested if statements to display tips
        System.out.println("Weather Tips:");
        if (uvIndex >= 6) {
            System.out.println("- Use sunscreen");
        }
        else {
            System.out.println("- No sunscreen needed");
        }
        if (precipitation.endsWith("%")) {
            int precipValue = Integer.parseInt(precipitation.replace("%", ""));
            if (precipValue >= 50) {
                System.out.println("- Carry an umbrella");
            }
            else {
                System.out.println("- No umbrella needed");
            }
        } 
        if (windSpeed.endsWith(" km/h")) {
            int windValue = Integer.parseInt(windSpeed.replace(" km/h", ""));
            if (windValue > 40) {
                System.out.println("- Windy conditions");
            }
            else {
                System.out.println("- Calm wind conditions");
            }
        }
        if(highTemp > 30){
            System.out.println("- Stay hydrated");
        }
        else if(highTemp < 0){
            System.out.println("- Dress warmly");
        }

        if(lowTemp < 0){
            System.out.println("- Dress warmly");
        }
 
        /*
        STEP 5: Create a fullReport String
        - Combine all user inputs and tips into one formatted sentence or paragraph
        - Use String concatenation (+) or String.format()
        */
 
 
        // TODO: Construct your full weather report here
        String fullReport = String.format(
            "Today's Weather Report:\n" +
            "Conditions: %s\n" +
            "Precipitation: %s\n" +
            "Wind Speed: %s\n" +
            "High Temperature: %d°C\n" +
            "Low Temperature: %d°C\n" +
            "UV Index: %d\n",
            weatherConditions, precipitation, windSpeed, highTempInt, lowTempInt, uvIndex
        );
 
        /*
        STEP 6: Print the full weather report
        */
 
 
        // TODO: Output your report using System.out.println()
 
 
        /*
        STEP 7: Optional extra challenge
        - Use loops to ask if the user wants to enter another day's report
        - Continue until the user types "no"
        */
 
 
        // TODO: Implement loop for multiple reports
 
 
        input.close();
    }
}
 
 
 
 