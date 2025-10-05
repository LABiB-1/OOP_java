package employee;

public class Stuff extends Employee{
    String workZone;
    
    public Stuff(String name, int age, String workZone){
        super(name, age);
        this.workZone = workZone;
    }
    
        
    void showDetails(){
        System.out.println("\n#########");
        super.showDetails();
        System.out.println("workZone: "+workZone);    }
    
}
