import java.util.Scanner;
public class Login {
    public static boolean checkLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your user name : ");
        String userName = scanner.nextLine();
        System.out.print("Enter your password : ");
        String  passWord = scanner.nextLine();

        if ("Ashwin".equals(userName) && "123".equals(passWord)){
            return true;
        }
        return false;

    }
}
