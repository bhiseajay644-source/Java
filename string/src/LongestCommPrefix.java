import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] str={"flower","flow","flight"};
        String pre=str[0];

        for(int i=0;i<str.length;i++){
            if(!str[0].startsWith(pre)){
                pre=pre.substring(0.pre.length()-1);
                if(pre.isEmpty()){
                    System.out.println("No Common prefix");
                    return;
                }
            }
        }
        System.out.println("Longest Common prefix: "+pre);
        scan.close();
    }
}
