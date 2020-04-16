package hu.uni.eszterhazy;

import com.sun.deploy.util.StringUtils;

import java.util.List;

public class CEODecorator extends EmployeeDecorator {

    public CEODecorator(Employee employee) {
        super(employee);

    }

    @Override
    public String operation() {

        String temp=employee.operation();
        String[] result= temp.split(",");
        StringBuilder builder= new StringBuilder();
        boolean bTemp=true;
        for (String s : result) {
            builder.append(s+ ",");
            if (s.equals(" an employee") && bTemp){
                builder.append(" and a CEO,");
                bTemp=false;
            }
        }
        return builder.toString().replaceAll(", ,$", "" );
    }
}
