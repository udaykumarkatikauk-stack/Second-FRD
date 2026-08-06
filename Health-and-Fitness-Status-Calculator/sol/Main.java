public class Main {
    public static void main(String[] args) {
        String name;
        double height;
        double weight;
        int age;
        int activityHours;
        double waterIntake;
        int sleepHours;
        int profile = 1;

        while (profile <= 2) {

            System.out.println("Current Profile: " + profile);

            if (profile == 1) {
                name = "Yashwanth";
                height = 1.83;
                weight = 86.4;
                age = 22;
                activityHours = 3;
                waterIntake = 5.5;
                sleepHours = 8;
            } else {
                name = "Sreenivas";
                height = 1.80;
                weight = 96.4;
                age = 23;
                activityHours = 4;
                waterIntake = 2.5;
                sleepHours = 7;
            }
            double bmi = weight / (height * height);
            int bmiRounded = (int) bmi;

            // Declaring BMI's Category
            String bmiCategory;
            if (bmi < 18.5) {
                bmiCategory = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                bmiCategory = "Normal";
            } else if (bmi >= 25 && bmi < 30) {
                bmiCategory = "Overweight";
            } else {
                bmiCategory = "Obese";
            }

            // Health Rules declaration
            String activityStatus = (activityHours >= 1) ? "Good" : "Improve Activity";

            String WaterIntakeStatus;
            if (waterIntake >= 2) {
                WaterIntakeStatus = "Good";
            } else {
                WaterIntakeStatus = "Take more water";
            }

            String sleepStatus;
            if (sleepHours >= 7 && sleepHours <= 9) {
                sleepStatus = "Healthy";
            } else if (sleepHours < 7) {
                sleepStatus = "Improve sleep Hours";
            } else {
                sleepStatus = "Over Sleeping";
            }

            String fitnessStatus;
            String message;
            if (activityHours >= 1 && waterIntake >= 2 && sleepHours >= 7 && sleepHours <= 9 && bmi >= 18.5
                    && bmi < 25) {
                fitnessStatus = "Healthy";
                message = "Continue maintaining the same routine.";
            } else {
                fitnessStatus = "Needs improvement";
                message = "Improve your daily habits.";
            }

            // Displaying Health and Fitness
            System.out.println("HEALTH AND FITNESS REPORT");
            System.out.println();
            System.out.println("Name: " + name);
            System.out.println("BMI: " + bmiRounded);
            System.out.println("BMI Category: " + bmiCategory);
            System.out.println();
            System.out.println("Activity Status: " + activityStatus);
            System.out.println("Water Intake Status: " + WaterIntakeStatus);
            System.out.println("Sleep Status: " + sleepStatus);
            System.out.println();
            System.out.println("Overall Fitness Status: " + fitnessStatus);
            System.out.println("Message: " + message);
            profile++;
        }
    }
}
