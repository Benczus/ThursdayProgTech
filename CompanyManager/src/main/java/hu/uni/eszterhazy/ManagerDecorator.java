package hu.uni.eszterhazy;

public class ManagerDecorator extends EmployeeDecorator {
    public ManagerDecorator(Employee employee) {
        super(employee);
    }

    @Override
    public String operation() {

    }
}
