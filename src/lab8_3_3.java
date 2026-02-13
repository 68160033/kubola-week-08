public class lab8_3_3 {
    public static void main(String[] args) {

        Student s[];


        s = new Student[10];

        for (int i = 0; i < 10; i++) {
            s[i] = new Student();
            s[i].readData();
            s[i].findTotal();
            s[i].computeGrade();
        }
        
        for (int i = 0; i < 10; i++) {
            s[i].showReport();
        }
    }
}
