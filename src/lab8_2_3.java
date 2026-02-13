public class lab8_2_3 {
    public static void main(String[] args) {

        Student s1;
        Student s2;

        s1 = new Student();
        s2 = new Student();

        s1.readData();
        s2.readData();

        s1.findTotal();
        s2.findTotal();

        s1.computeGrade();
        s2.computeGrade();

        s1.showReport();
        s2.showReport();
    }
}
