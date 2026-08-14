package inheritance.singleinheritance;

class Employee{
    int eid;
    String name;
    double salary;

    void setEmployeeDetails(int eid,String name,double salary){
        this.eid=eid;
        this.name=name;
        this.salary=salary;
    }

    void displayDetails(){
        System.out.println();
        System.out.println("Employee Id: "+eid);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee salary: "+salary);
    }
}

class Developer extends Employee{
    String programmingLanguage;

    void setDeveloperDetails(String programmingLanguage){
        this.programmingLanguage=programmingLanguage;
    }
    void displayDeveloperDetails(){
        displayDetails();
        System.out.println("Programming Language: "+programmingLanguage);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Developer d=new Developer();
        d.setEmployeeDetails(101,"Ravi",60000);
        d.setDeveloperDetails("Full Stack Java ");
        d.displayDeveloperDetails();
    }
}
