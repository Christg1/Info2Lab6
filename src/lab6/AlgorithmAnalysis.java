package lab6;

public class AlgorithmAnalysis {

    public static void main(String[] args) {
        int n = 1000; // Change the value of n as needed
        
        // Fragment #1
        System.out.println("Fragment #1:");
        fragment1(n);
        
        // Fragment #2
        System.out.println("\nFragment #2:");
        fragment2(n);
        
        // Fragment #3
        System.out.println("\nFragment #3:");
        fragment3(n);
        
        // Fragment #4
        System.out.println("\nFragment #4:");
        fragment4(n);
        
        // Fragment #5
        System.out.println("\nFragment #5:");
        fragment5(n);
        
        // Fragment #6
        System.out.println("\nFragment #6:");
        fragment6(n);
        
        // Fragment #7
        System.out.println("\nFragment #7:");
        fragment7(n);
        
        // Fragment #8
        System.out.println("\nFragment #8:");
        fragment8(n);
    }

    // Fragment #1
    public static void fragment1(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum++;
        System.out.println("Sum: " + sum);
    }

    // Fragment #2
    public static void fragment2(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                sum++;
        System.out.println("Sum: " + sum);
    }

    // Fragment #3
    public static void fragment3(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                sum++;
        System.out.println("Sum: " + sum);
    }

    // Fragment #4
    public static void fragment4(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum++;
        for (int j = 0; j < n; j++)
            sum++;
        System.out.println("Sum: " + sum);
    }

    // Fragment #5
    public static void fragment5(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n * n; j++)
                sum++;
        System.out.println("Sum: " + sum);
    }

    // Fragment #6
    public static void fragment6(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < i; j++)
                sum++;
        System.out.println("Sum: " + sum);
    }

    // Fragment #7
    public static void fragment7(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++)
            for (int j = 0; j < n * n; j++)
                if (j % i == 0)
                    for (int k = 0; k < j; k++)
                        sum++;
        System.out.println("Sum: " + sum);
    }

    // Fragment #8
    public static void fragment8(int n) {
        int sum = 0;
        int i = n;
        while (i > 1) {
            i = i / 2;
            sum++;
        }
        System.out.println("Sum: " + sum);
    }
}
