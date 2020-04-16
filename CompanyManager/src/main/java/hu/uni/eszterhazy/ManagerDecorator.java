package hu.uni.eszterhazy;

public class ManagerDecorator extends EmployeeDecorator {

    public ManagerDecorator(Employee employee) {
        super(employee);

    }

    @Override
    public String operation() {
        String temp = employee.operation();
        String[] result = temp.split(",");
        StringBuilder builder = new StringBuilder();
        boolean bTemp = true;
        for (String s : result) {
            builder.append(s + ",");
            if (s.equals(" an employee") && bTemp) {
                builder.append(" and a manager");
                bTemp = false;
            }
        }
        return builder.toString().replaceAll(" $", "");
    }
}
