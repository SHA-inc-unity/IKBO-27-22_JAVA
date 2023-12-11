public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.getHourlyRate(), model.getHoursWorked(), model.calculateSalary());
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public void setHourlyRate(double hourlyRate) {
        model.setHourlyRate(hourlyRate);
    }

    public void setHoursWorked(int hoursWorked) {
        model.setHoursWorked(hoursWorked);
    }
}
