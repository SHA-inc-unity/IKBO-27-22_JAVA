import java.util.Comparator;

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Сравниваем студентов по их endScore
        return Integer.compare(student2.endScore, student1.endScore);
    }

    @Override
    public Comparator<Student> reversed() {
        return Comparator.super.reversed();
    }
}