
import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLine()) return;
        String s = sc.nextLine().trim();
        
        if (s.length() == 0) {
            System.out.print("");
            return;
        }
        
        StringBuilder result = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        
        // last character
        result.append(s.charAt(s.length() - 1)).append(count);
        
        if (result.length() < s.length()) {
            System.out.print(result.toString());
        } else {
            System.out.print(s);
        }
    }
}
