import java.util.Scanner;

public class lab8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] id = new int[10];
        String[] firstname = new String[10];
        String[] lastname = new String[10];
        int[] score1 = new int[10];
        int[] score2 = new int[10];
        int[] score3 = new int[10];
        int[] total = new int[10];
        char[] grade = new char[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("\n===== Student " + (i + 1) + " =====");

            System.out.print("Enter student id: ");
            id[i] = sc.nextInt();

            System.out.print("Enter firstname: ");
            firstname[i] = sc.next();

            System.out.print("Enter lastname: ");
            lastname[i] = sc.next();

            System.out.print("Enter score 1: ");
            score1[i] = sc.nextInt();

            System.out.print("Enter score 2: ");
            score2[i] = sc.nextInt();

            System.out.print("Enter score 3: ");
            score3[i] = sc.nextInt();

            total[i] = score1[i] + score2[i] + score3[i];

            if (total[i] >= 80)
                grade[i] = 'A';
            else if (total[i] >= 70)
                grade[i] = 'B';
            else if (total[i] >= 60)
                grade[i] = 'C';
            else if (total[i] >= 50)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        System.out.println("\n=========== Grade Report ===========");
        for (int i = 0; i < 10; i++) {
            System.out.println("ID: " + id[i]);
            System.out.println("Name: " + firstname[i] + " " + lastname[i]);
            System.out.println("Score 1: " + score1[i]);
            System.out.println("Score 2: " + score2[i]);
            System.out.println("Score 3: " + score3[i]);
            System.out.println("Total: " + total[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println("------------------------------------");
        }

        sc.close();
    }
}
