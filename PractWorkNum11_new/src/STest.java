import java.util.ArrayList;
import java.util.Random;

public class STest {

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Student> students = new ArrayList<Student>();
        for (int i = 0; i < 100; i++) {
            students.add(new Student(rand.nextInt(0, 10000), rand.nextInt(0, 10000)));
        }
        printStudentList(students);
        students.sort(new SortingStudentsByGPA());
        printStudentList(students);
    }

    public static void printStudentList(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println("ID: " + student.iDNumber + ", Имя: " + student.name + ", endScore: " + student.endScore);
        }
        System.out.println();
    }
}