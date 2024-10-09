import java.util.Scanner;
public class e01 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s = x.nextLine();
        if(s.equals("Louis")) System.out.println("Are you French?");
        else System.out.println("You have a great name");
    }
}