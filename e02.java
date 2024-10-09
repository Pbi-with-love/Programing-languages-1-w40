import java.util.Scanner;
public class e02 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String s = x.nextLine();
        System.out.println("You entered: " + s);
        for(int i=0; i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}
