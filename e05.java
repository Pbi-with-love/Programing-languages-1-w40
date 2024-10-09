import java.util.Scanner;
public class e05 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String s = x.nextLine();
        String result = "";
        while(!s.equals("Quit")){
        System.out.println(result+=s);
        x = new Scanner(System.in);
        System.out.println("Enter a name: ");
        s = x.nextLine();
        }
    }
}
