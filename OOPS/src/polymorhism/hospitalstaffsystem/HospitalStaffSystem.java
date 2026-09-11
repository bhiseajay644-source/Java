package polymorhism.hospitalstaffsystem;

class HospiatlStaff{
    int staffId;
    String staffName;
    double salary;

    HospiatlStaff(int staffId,String staffName,double salary){
        this.staffId=staffId;
        this.staffName=staffName;
        this.salary=salary;
    }
    void displayDetails(){
        System.out.println("Staff Id: "+staffId);
        System.out.println("Staff Name: "+staffName);
        System.out.println("Salary: "+salary);
    }
}
class Doctor extends HospiatlStaff{
    String specialization;
    int consultationfee;
    Doctor(int staffId,String staffName,double salary,String specialization,int consultationfee){
        super(staffId, staffName, salary);
        this.specialization=specialization;
        this.consultationfee=consultationfee;
    }
}
public class HospitalStaffSystem {
}
