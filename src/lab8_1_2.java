import java.util.Scanner;

public class lab8_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student2 s1;

        s1 = new Student2();

        System.out.println("This program to compute grade.");
        System.out.print("Enter student id: ");
        s1.id = sc.nextInt();

        System.out.print("Enter firstname: ");
        s1.firstname = sc.next();

        System.out.print("Enter lastname: ");
        s1.lastname = sc.next();

        System.out.print("Enter midterm[30] : ");
        s1.mid = sc.nextInt();

        System.out.print("Enter final[30] : ");
        s1.fin = sc.nextInt();

        System.out.print("Enter homework[40] : ");
        s1.hw = sc.nextInt();

        s1.total = s1.mid + s1.fin + s1.hw;

        if (s1.total >= 80)
            s1.grade = 'A';
        else if (s1.total >= 70)
            s1.grade = 'B';
        else if (s1.total >= 60)
            s1.grade = 'C';
        else if (s1.total >= 50)
            s1.grade = 'D';
        else
            s1.grade = 'F';

        System.out.println("-------------- Grade Report -------------");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.firstname + " " + s1.lastname);
        System.out.println("Midterm : " + s1.mid);
        System.out.println("Final : " + s1.fin);
        System.out.println("Homework : " + s1.hw);
        System.out.println("-----------------------------------------");
        System.out.println("Total : " + s1.total);
        System.out.println("Grade : " + s1.grade);
        System.out.println("-----------------------------------------");
    }
}