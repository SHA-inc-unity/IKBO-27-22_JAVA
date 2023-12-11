public class MVCEmployeeDemo {
    public static void main(String[] args) {
        // Создаем объекты модели, представления и контроллера
        Employee model = new Employee("Иванов", 15.0, 40);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        // Выводим информацию о сотруднике
        controller.updateView();

        // Обновляем данные сотрудника через контроллер
        controller.setEmployeeName("Петров");
        controller.setHourlyRate(20.0);
        controller.setHoursWorked(45);

        // Снова выводим информацию о сотруднике
        controller.updateView();
    }
}
