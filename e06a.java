import java.net.http.HttpResponse.PushPromiseHandler;
import java.util.Scanner;
public class e06a {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String s = x.nextLine();
        int start = 0;
        int end = s.length() - 1;
        while(start < end && s.charAt(start) == s.charAt(end)){
            start++;
            end--;
        }
        if(start >= end) System.out.println(s + " is a palindrome");
        else System.out.println(s + " is not a palindrome");
    }
}
