package hu.uni.eszterhazy;

public class CEODecorator extends EmployeeDecorator {
    public CEODecorator(Employee employee) {
        super(employee);
    }

    @Override
    public String operation() {
        return null;
    }
}
