package differenttypeofexceptions.classcast;

import differenttypeofexceptions.numberformatexception.NumberFormatExcep;

public class Test {
    public static void ageConverter(String age){
        try{
            int a=Integer.parseInt(age);
            System.out.println("Age successfully converted to integer :"+a);
        }catch (NumberFormatException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
