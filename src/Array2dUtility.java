
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.

    public static void print(int[][]arr){
        for (int i = 0; i <arr.length; i = i + 1){
            for (int x = 0; x <arr[i].length; x = x + 1)
                System.out.print(arr[i][x]);
            System.out.println();
        }
    }
    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][]arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i = i + 1) {
            for (int x = 0; x < arr[i].length; x = x + 1)
                sum = sum + arr[i][x];
        }
        return sum;
    }
    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][]arr){
        int number = 0;
        for (int i = 0; i < arr.length; i = i + 1) {
            for (int x = 0; x < arr[i].length; x = x + 1)
                number = number + 1;
        }
        double sum = sum(arr);
        return (sum / number);

    }
    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][]arr){
        int number = 100;
        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[i].length; x++) {
                if (number > arr[i][x]){
                    number = arr[i][x];
                }
            }
        }
        return number;
    }
    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][]arr){
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[i].length; x++) {
                if (number < arr[i][x]){
                    number = arr[i][x];
                }
            }
        }
        return number;
    }
    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][]arr){
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[i].length; x++) {
                if (arr[i][x]% 2 == 0){
                    number = number + 1;
                }
            }
        }
        return number;
    }
    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][]arr){
        int number = 0;
        for( int i[]: arr){
            for (int x: i) {
                if (x % 2 == 0){
                    number = number + 1;
                }
            }
        }
        return number;
    }
    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][]arr){
        boolean positive = true;
        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[i].length; x++) {
                if (arr[i][x] < 0){
                    positive = false;
                }
            }
        }
        return positive;
    }
    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][]arr){
        int[] number = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[i].length; x++) {
                number[i] = number[i] + arr[i][x];
            }
        }
        return number;
    }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][]arr){
        int[] number = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[i].length; x++) {
                number[x] = number[x] + arr[i][x];
            }
        }
        return number;
    }
}
