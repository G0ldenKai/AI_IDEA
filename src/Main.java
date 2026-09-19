import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("       AI IDEA VALIDATOR");
        System.out.println("=================================");
        System.out.println();

        System.out.println("Describe your hackathon idea:");
        String idea = scanner.nextLine();

        if (idea.isBlank()) {
            System.out.println("Idea cannot be empty.");
            return;
        }

        int length = idea.length();

        int innovation = 60 + (length % 41);
        int feasibility = 55 + ((length * 2) % 46);
        int impact = 50 + ((length * 3) % 51);
        int technical = 60 + ((length * 4) % 41);

        int total = (innovation + feasibility + impact + technical) / 4;

        System.out.println();
        System.out.println("========== ANALYSIS ==========");
        System.out.println();

        System.out.println("Innovation:          " + innovation + "%");
        System.out.println("Feasibility:         " + feasibility + "%");
        System.out.println("Social Impact:       " + impact + "%");
        System.out.println("Technical Potential: " + technical + "%");

        System.out.println();
        System.out.println("Overall Score: " + total + "/100");
        System.out.println();

        if (total >= 80) {
            System.out.println("Result: Strong hackathon potential!");
        } else if (total >= 65) {
            System.out.println("Result: Promising idea. Improve the problem definition.");
        } else {
            System.out.println("Result: The idea needs further development.");
        }

        System.out.println();
        System.out.println("Thank you for using AI Idea Validator!");
    }
}