import java.util.Scanner;
public class e04 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String s = x.nextLine();
        System.out.println("You entered: " + s);
        for(int i=s.length() - 1;i>=0;i-=2){
            System.out.println(s.charAt(i));
        }
    }
}
