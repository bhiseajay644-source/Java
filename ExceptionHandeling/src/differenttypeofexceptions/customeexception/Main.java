package differenttypeofexceptions.customeexception;

import java.util.Scanner;

class InvalidAgeException extends RuntimeException{
    String s;
    public InvalidAgeException(String s){
        super(s);
    }
}

class Test{
    public void ageValidator(int a){
      if(a<18){
          throw new InvalidAgeException("Age must be 18 or above");
      }else{
          System.out.println("Eligible for voting");
      }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the age of the person");
        int age=scan.nextInt();
        Test t=new Test();
       try{
           t.ageValidator(age);
       }catch(InvalidAgeException e){
           System.err.println(e);
       }
        scan.close();
    }
}
