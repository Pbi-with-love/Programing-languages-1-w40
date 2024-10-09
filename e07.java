import java.net.http.HttpResponse.PushPromiseHandler;
import java.util.Scanner;
public class e07 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String s = x.nextLine();
        boolean checkDigit = false;
        boolean checkUppercase = false;
        boolean checkLowercase = false;
        boolean checkLength = false;
        if(s.length() > 8) checkLength = true; 
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))) checkUppercase = true;
            if(Character.isLowerCase(s.charAt(i))) checkLowercase = true;
            if(Character.isDigit(s.charAt(i))) checkDigit = true;
        }
        if(checkDigit && checkLength && checkLowercase && checkUppercase) System.out.println("Password is valid");
        else System.out.println("Password is invalid. Needs to be at least 8 characters long and include at least one uppercase letter.");
    }
}
