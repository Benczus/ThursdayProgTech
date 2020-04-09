package hu.uni.eszterhazy;

public class Accountant implements Employee{

    String name;

    public Accountant(String name) {
        this.name = name;
    }



    @Override
    public void add(Employee employee) throws LeafElementException {
        throw new LeafElementException();
    }

    @Override
    public void remove(Employee employee) throws LeafElementException {
        throw new LeafElementException();
    }

    @Override
    public Employee getChild(int i) throws LeafElementException {
        throw new LeafElementException();
    }

    @Override
    public String operation() {
        return "I am "+name+", an accountant, ";
    }
}
