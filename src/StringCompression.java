
import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        if (s.length() == 0) {
            System.out.print(s);
            return;
        }
        
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }
        
        // append last group
        compressed.append(s.charAt(s.length() - 1));
        compressed.append(count);
        
        // check length condition
        if (compressed.length() < s.length()) {
            System.out.print(compressed.toString());
        } else {
            System.out.print(s);
        }
    }
}
