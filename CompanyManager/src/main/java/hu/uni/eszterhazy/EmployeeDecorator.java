package hu.uni.eszterhazy;

public abstract class EmployeeDecorator implements Employee {
    protected Employee employee;

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void add(Employee employee) throws LeafElementException {
        this.employee.add(employee);
    }

    @Override
    public void remove(Employee employee) throws LeafElementException {
        employee.remove(employee);
    }

    @Override
    public Employee getChild(int i) throws LeafElementException {
        return employee.getChild(i);
    }

    @Override
    public abstract  String operation();
}
