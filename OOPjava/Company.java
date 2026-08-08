package OOPjava;

public class Company {
    public String name;
    Employee [] employees;
    int count;
    public Company(){
        name="ABC Company";
        employees=new Employee[3];
        count=0;

}
   public void addEmployee(Employee e){
    if(count<employees.length){
        employees[count]=e;
        count+=1;
        System.out.println(e.getName()+ "has joined the company");
    }
    else{
        System.out.println("No more vacancy");
    }
    }
    public void removeEmployee(Employee e){
        for(int i=0; i<count; i++){
            if(employees[i]==e){
                for(int j=i; j<count-1; j++){
                    employees[j]=employees[j+1];
                }
                employees[count-1]=null;
                count-=1;
                System.out.println(e.getName()+ "has left the company");
                return;
            }
        }
        System.out.println(e.getName()+ "is not found in the company");
    }
 public void details(){
    System.out.println("Company name: " + name);
    System.out.println("Employee count: "+ count);
    System.out.println("Fulltime employees: ");
    for(int i=0; i<count; i++){
        if(employees[i].getType().equals("Fulltime")){
System.out.println("Name: " + employees[i].getName()+ ", " + "ID: " + employees[i].getAge());
        }
    }
    System.out.println("Parttime employees: ");
    for(int i=0; i<count; i++){
        if(employees[i].getType().equals("Part-time")){
            System.out.println("Name: " + employees[i].getName()+ ", " + "ID: " + employees[i].getAge());
        }
    }
 }
   }