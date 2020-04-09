package hu.uni.eszterhazy;

public interface Employee {


    void add(Employee employee) throws LeafElementException;

    void remove(Employee employee) throws LeafElementException;

    Employee getChild(int i) throws LeafElementException;

    String operation();


}
