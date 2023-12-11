import java.util.ArrayList;
import java.util.Random;

public class TTest {

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Student> students = new ArrayList<Student>();
        for (int i = 0; i < 10; i++) {
            students.add(new Student(rand.nextInt(0, 10000), rand.nextInt(0, 10000)));
        }
        for (int i = 0; i < 10; i++) {
            students.add(new Student(rand.nextInt(0, 10000), rand.nextInt(0, 10000)));
        }
        printStudentList(students);
        mergeSort(students,  0, students.size() - 1);
        printStudentList(students);
    }

    public static void mergeSort(ArrayList<Student> list, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(list, left, middle);
            mergeSort(list, middle + 1, right);
            merge(list, left, middle, right);
        }
    }

    public static void merge(ArrayList<Student> list, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        ArrayList<Student> leftList = new ArrayList<>(n1);
        ArrayList<Student> rightList = new ArrayList<>(n2);

        for (int i = 0; i < n1; i++) {
            leftList.add(list.get(left + i));
        }

        for (int j = 0; j < n2; j++) {
            rightList.add(list.get(middle + 1 + j));
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftList.get(i).endScore <= rightList.get(j).endScore) {
                list.set(k, leftList.get(i));
                i++;
            } else {
                list.set(k, rightList.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            list.set(k, leftList.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            list.set(k, rightList.get(j));
            j++;
            k++;
        }
    }

    public static void printStudentList(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println("ID: " + student.iDNumber + ", Имя: " + student.name + ", endScore: " + student.endScore);
        }
        System.out.println();
    }
}