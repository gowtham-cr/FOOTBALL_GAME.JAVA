import java.util.Random;
import java.util.Scanner;

public static void main() {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int totalGoals = 0;
    int totalAttempts = 5;  // Player has 5 attempts

    System.out.println("Welcome to the Football Penalty Game!");
    System.out.println(STR."You have \{totalAttempts} attempts to score a goal.");

    for (int i = 1; i <= totalAttempts; i++) {
        System.out.println(STR."""

Attempt \{i}:""");
        System.out.print("Choose a direction to shoot (1: Left, 2: Center, 3: Right): ");
        int playerShot = scanner.nextInt();

        // Simulating the goalkeeper's save action (randomly choose a direction)
        int goalkeeperSave = random.nextInt(3) + 1; // Random number between 1 and 3

        System.out.println("Goalkeeper dives to direction: " + goalkeeperSave);

        if (playerShot == goalkeeperSave) {
            System.out.println("The goalkeeper saved your shot!");
        } else {
            System.out.println("Goal! You scored a penalty!");
            totalGoals++;
        }
    }

    System.out.println("\nGame Over! You scored " + totalGoals + " goals out of " + totalAttempts + " attempts.");

    if (totalGoals > 2) {
        System.out.println("Congratulations! You win!");
    } else {
        System.out.println("Better luck next time!");
    }

    scanner.close();
}

