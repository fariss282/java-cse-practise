package OOPjava;

public class Employee {
    private String name;
    private int age;
    private String type;
    public Employee(){
        System.out.println("Default constructor has been created");

    }
    public Employee(String name, int age, String type){
        this.name=name;
        this.age=age;
        this.type=type;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getType(){
        return type;
    }

    
}


