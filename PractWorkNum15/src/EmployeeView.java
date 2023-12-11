public class EmployeeView {
    public void printEmployeeDetails(String name, double hourlyRate, int hoursWorked, double salary) {
        System.out.println("Имя сотрудника: " + name);
        System.out.println("Почасовая ставка: $" + hourlyRate);
        System.out.println("Отработанные часы: " + hoursWorked);
        System.out.println("Заработная плата: $" + salary);
    }
}
