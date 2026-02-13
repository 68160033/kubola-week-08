import java.util.Scanner;

public class Student {
    int id;
    String firstname;
    String lastname;
    int mid;
    int fin;
    int hw;
    int total;
    char grade;

    // Method สำหรับรับข้อมูล
    public void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program to compute grade.");

        System.out.print("Enter student id: ");
        id = sc.nextInt();

        System.out.print("Enter firstname: ");
        firstname = sc.next();

        System.out.print("Enter lastname: ");
        lastname = sc.next();

        System.out.print("Enter midterm[30] : ");
        mid = sc.nextInt();

        System.out.print("Enter final[30] : ");
        fin = sc.nextInt();

        System.out.print("Enter homework[40] : ");
        hw = sc.nextInt();
    }

    // Method สำหรับรวมคะแนน
    public void findTotal() {
        total = mid + fin + hw;
    }

    // Method สำหรับคำนวณเกรด (ตัดเกรดอิงเกณฑ์)
    public void computeGrade() {
        if (total >= 80) {
            grade = 'A';
        } else if (total >= 70) {
            grade = 'B';
        } else if (total >= 60) {
            grade = 'C';
        } else if (total >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    // Method สำหรับแสดงผลรายงาน
    public void showReport() {
        System.out.println("---------- Grade Report ----------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + firstname + " " + lastname);
        System.out.println("Midterm : " + mid);
        System.out.println("Final : " + fin);
        System.out.println("Homework : " + hw);
        System.out.println("----------------------------------");
        System.out.println("Total : " + total);
        System.out.println("Grade : " + grade);
        System.out.println("----------------------------------");
    }
}