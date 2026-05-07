public class Employee{
    private String name;
    private int id;
    //default constructor
    public Employee(){
        this.name="ABC";
        this.id=1;
    }
    //parameterized constructor
    public Employee(String name, int idno){
        this.name=name;
        this.id=idno;
    }
    //copy contructor
    public Employee(Employee other){
        this.name=other.name;
        this.id=other.id;
    }
    //constructor chaining(with parameterized constructor)
    public Employee(String name){
        other(name,0);
    }
}