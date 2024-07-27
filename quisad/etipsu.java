public class JavaStudy01 {
    // Define the static array
    public static int[] standardForCalc = {12000000, 34000000, 42000000, 62000000, 150000000, 200000000, 500000000, 0};

    public static void main(String[] args) {
        // Calculate the sum of all elements
        int totalSum = 0;
        for (int num : standardForCalc) {
            totalSum += num;
        }
        
        // Find the maximum value in the array
        int maxValue = Integer.MIN_VALUE;
        for (int num : standardForCalc) {
            if (num > maxValue) {
                maxValue = num;
            }
        }

        // Output the results
        System.out.println("Total Sum: " + totalSum);
        System.out.println("Maximum Value: " + maxValue);
    }
}
