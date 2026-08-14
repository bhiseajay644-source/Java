package encapsulation.permissionsystem;

import java.util.Scanner;

class User{
    private int userId;
    private int permissions;
    static int activeUsers=0;

    public static final int read  =1;
    public static final int write=2;
    public static final int delete=4;
    public static final int execute=8;

    User(int userId, int permissions){
        this.userId=userId;
        this.permissions=permissions;
        activeUsers++;
    }


    void addpermission(int permission){
    permissions=permissions | permission;
        System.out.println("After Adding: "+permissions);
    }
    void removepermission(int rpermission){
    permissions=permissions & ~rpermission;
        System.out.println("After Removing: "+permissions);
    }
    boolean haspermission(int permission){
    return(permissions & permission)!=0;
    }
    void dispalypermission(){
        System.out.println("User Id: "+userId);
        System.out.println("Initial permissions: "+permissions);
        System.out.println("READ permission: "+haspermission(read));
        System.out.println("Write permission: "+haspermission(write));
        System.out.println("Delete permission: "+haspermission(delete));
        System.out.println("Execute permission: "+haspermission(execute));
    }
}
public class PermissionSystem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the used id:");
        int userId=scan.nextInt();
        System.out.println("Enter the Initial permission:");
        int permissions=scan.nextInt();
        System.out.println("Enter the Add permission: ");
        int permission=scan.nextInt();
        System.out.println("Enter the remove permission:");
        int rpermission=scan.nextInt();

        User u=new User(userId,permissions);
        u.addpermission(permission);
        u.removepermission(rpermission);
        u.dispalypermission();
    }
}
