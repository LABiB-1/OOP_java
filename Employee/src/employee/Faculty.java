package employee;

public class Faculty extends Employee{
    String department;
    String researchArea;
    public Faculty(String name, int age, String department, String researchArea){
        super(name, age);
        
        this.department=department;
        this.researchArea=researchArea;
    }
    
    void showDetails(){
        System.out.println("\n#########");
        super.showDetails();
        System.out.println("Department: "+department);
        System.out.println("Age: "+researchArea);
    }
    
    
}
