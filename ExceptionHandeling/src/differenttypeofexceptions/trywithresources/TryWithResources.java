package differenttypeofexceptions.trywithresources;

import java.io.FileNotFoundException;
import java.util.Scanner;

class FileReader{
    String file="student.txt";
    public void someMethods(String s){
        try{
            if(s.equalsIgnoreCase(file)){
                System.out.println("File opened succesfully");
                System.out.println("Reading");
                System.out.println("Java");
                System.out.println("Spring Boot");
                System.out.println("Microservices");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class BufferedReader{
    String file="studen.txt";
    public void manyMethods(String x){
        try{
            if(x.equalsIgnoreCase(file)){
                System.out.println();
                System.out.println("File opened successfully");
                System.out.println("Reading");
                System.out.println("Java");
                System.out.println("Spring Boot");
                System.out.println("Microservices");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
public class TryWithResources {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the filename: ");
        String fileName=scan.nextLine();
        FileReader f=new FileReader();
        BufferedReader b=new BufferedReader();
        f.someMethods(fileName);
        b.manyMethods(fileName);
        scan.close();
    }
}
