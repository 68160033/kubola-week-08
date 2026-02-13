import java.util.Scanner;

public class lab8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {

            int id;
            String firstname;
            String lastname;
            int score1, score2, score3;
            int total;
            char grade;

            System.out.println("\n===== Student " + i + " =====");

            System.out.print("Enter student id: ");
            id = sc.nextInt();

            System.out.print("Enter firstname: ");
            firstname = sc.next();

            System.out.print("Enter lastname: ");
            lastname = sc.next();

            System.out.print("Enter score 1: ");
            score1 = sc.nextInt();

            System.out.print("Enter score 2: ");
            score2 = sc.nextInt();

            System.out.print("Enter score 3: ");
            score3 = sc.nextInt();

            total = score1 + score2 + score3;

            if (total >= 80)
                grade = 'A';
            else if (total >= 70)
                grade = 'B';
            else if (total >= 60)
                grade = 'C';
            else if (total >= 50)
                grade = 'D';
            else
                grade = 'F';

            System.out.println("----------- Grade Report -----------");
            System.out.println("ID: " + id);
            System.out.println("Name: " + firstname + " " + lastname);
            System.out.println("Score 1: " + score1);
            System.out.println("Score 2: " + score2);
            System.out.println("Score 3: " + score3);
            System.out.println("------------------------------------");
            System.out.println("Total: " + total);
            System.out.println("Grade: " + grade);
            System.out.println("------------------------------------");
        }

        sc.close();
    }
}

