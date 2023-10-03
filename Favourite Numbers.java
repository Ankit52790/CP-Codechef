import java.util.Scanner;

 class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // number of test cases
        
        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt(); // number A
            
            if (isEvenMultipleOfSeven(A)) {
                System.out.println("Alice");
            } else if (isOddMultipleOfNine(A)) {
                System.out.println("Bob");
            } else {
                System.out.println("Charlie");
            }
        }
        
        scanner.close();
    }
    
    // Check if a number is even and a multiple of 7
    private static boolean isEvenMultipleOfSeven(int num) {
        return num % 2 == 0 && num % 7 == 0;
    }
    
    // Check if a number is odd and a multiple of 9
    private static boolean isOddMultipleOfNine(int num) {
        return num % 2 != 0 && num % 9 == 0;
    }
}
