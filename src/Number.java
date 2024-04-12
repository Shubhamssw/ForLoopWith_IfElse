public class Number {
    public static void main(String[] args) {
        int evenCount = 0;
        int oddCount = 0;
        int specialCount = 0;

        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                specialCount++;
            } else if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print results
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
        System.out.println("Total special numbers (multiples of 10): " + specialCount);
    }
}
