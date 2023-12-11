public class MVCPatternDemo {
    public static void main(String[] args) {
        // Создаем модель, представление и контроллер
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        // Обновляем и отображаем данные студента
        controller.updateView();

        // Обновляем имя студента через контроллер и снова отображаем данные
        controller.setStudentName("Не Виталик");
        controller.updateView();
    }

    public static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Виталик");
        student.setRollNo("Филадельфия?");
        return student;
    }
}
