import java.util.Random;
import java.util.Scanner;

public class Main {
  public  static String passwordgenerator(int size) {

        String randomdigits = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()_+-/.,<>?;':\"[]{}\\|`~";
        String password = "";
        Random rnd = new Random();
        while (password.length() < size) {
            int index = (int) (rnd.nextFloat() * randomdigits.length());
            password += randomdigits.charAt(index);
        }
        return password;
    }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of password: ");
        int size = sc.nextInt();
        sc.close();
        String password = passwordgenerator(size);
        System.out.println("Your generated password:");
        System.out.println(password);
        
        

    }
}


