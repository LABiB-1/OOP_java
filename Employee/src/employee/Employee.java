package employee;

public class Employee {
    String name;
    int age;
    public Employee(String name, int age){
        this.name=name;
        this.age=age;
    }

    void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        Faculty faculty1= new Faculty("Romzan Alam", 27, "CSE", "ML");
        faculty1.showDetails();
        
        
        Stuff stuff = new Stuff("Robin", 35, "Building K");
        stuff.showDetails();
    }
    
}
