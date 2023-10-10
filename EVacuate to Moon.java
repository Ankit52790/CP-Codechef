import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long t = scanner.nextLong();
        
        while (t-- > 0) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();
            long h = scanner.nextLong();
            
            long[] c = new long[(int) n];
            long[] o = new long[(int) m];
            
            for (int i = 0; i < n; i++)
                c[i] = scanner.nextLong();
            
            for (int i = 0; i < m; i++)
                o[i] = scanner.nextLong();
            
            Arrays.sort(c);
            Arrays.sort(o);
            
            long cEnd = n - 1;
            long oEnd = m - 1;
            long answer1 = 0;
            
            while (cEnd >= 0 && oEnd >= 0) {
                long capacity = c[(int) cEnd];
                long outlerCap = o[(int) oEnd];
                answer1 += Math.min(capacity, h * outlerCap);
                cEnd--;
                oEnd--;
            }
            
            cEnd = 0;
            oEnd = 0;
            long answer2 = 0;
            
            while (cEnd < n && oEnd < m) {
                long capacity = c[(int) cEnd];
                long outlerCap = o[(int) oEnd];
                answer2 += Math.min(capacity, h * outlerCap);
                cEnd++;
                oEnd++;
            }
            
            System.out.println(Math.max(answer1, answer2));
        }
        
        scanner.close();
    }
}
