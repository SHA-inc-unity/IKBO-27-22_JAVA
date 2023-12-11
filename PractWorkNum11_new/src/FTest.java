import java.util.ArrayList;
import java.util.Random;

public class FTest {

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Student> students = new ArrayList<Student>();
        for (int i = 0; i < 100; i++) {
            students.add(new Student(rand.nextInt(0, 10000), rand.nextInt(0, 10000)));
        }
        printStudentList(students);
        students = insertionSort(students);
        printStudentList(students);
    }

    public static ArrayList<Student> insertionSort(ArrayList<Student> unsortedList) {
        ArrayList<Student> sortedList = new ArrayList<>();
        int n = unsortedList.size();

        for (int i = 0; i < n; i++) {
            Student current = unsortedList.get(i);

            int insertIndex = binarySearch(sortedList, current);

            sortedList.add(insertIndex, current);
        }

        return sortedList;
    }

    public static int binarySearch(ArrayList<Student> list, Student target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midID = list.get(mid).iDNumber;

            if (midID < target.iDNumber) {
                left = mid + 1;
            } else if (midID > target.iDNumber) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return left;
    }

    public static void printStudentList(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println("ID: " + student.iDNumber + ", Имя: " + student.name + ", endScore: " + student.endScore);
        }
        System.out.println();
    }
}