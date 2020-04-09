package hu.uni.eszterhazy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeImpl implements Employee {

    private String name;
    private List<Employee> employees;

    public EmployeeImpl(String name, Employee... employees) {
        this.name = name;
        this.employees= new ArrayList<>();
        this.employees.addAll(Arrays.asList(employees));
    }

    public EmployeeImpl(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
       return employees.get(i);
    }

    @Override
    public String operation() {
        return "I am "+name+", an employee, " + executeOperationOnChildren();
    }

    private String executeOperationOnChildren() {
        StringBuilder StringSum;
        if (employees.isEmpty()){
            return "";
        }
        else{
            StringSum= new StringBuilder("my employees are : ");
            for (Employee employee : employees) {
               StringSum.append(employee.operation());
            }
        }
        return StringSum.toString();
    }
}
