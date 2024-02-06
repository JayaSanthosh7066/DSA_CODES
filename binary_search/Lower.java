// Java program to Find lower bound
// Using Binary Search Iteratively

// Importing Arrays utility class
import java.util.Arrays;

// Main class
public class Lower {

    // Method 1
    // Iterative approach to find lower bound
    // using binary search technique
    static int lower_bound(int array[], int key) {
        // Initialize starting index and
        // ending index
        int low = 0, high = array.length;
        int mid;

        // Till high does not crosses low
        while (low < high) {

            // Find the index of the middle element
            mid = low + (high - low) / 2;

            // If key is less than or equal
            // to array[mid], then find in
            // left subarray
            if (key <= array[mid]) {
                high = mid;
            }

            // If key is greater than array[mid],
            // then find in right subarray
            else {

                low = mid + 1;
            }
        }

        // If key is greater than last element which is
        // array[n-1] then lower bound
        // does not exists in the array
        if (low < array.length && array[low] < key) {
            low++;
        }

        // Returning the lower_bound index
        return low;
    }

    // Method 2
    // Driver main method
    public static void main(String[] args) {

        // Custom array and key input over which lower bound
        // is computed
        int array[] = { 4, 6, 10, 12, 18, 18, 20, 20, 30, 45 };
        int key = 18;

        // Sort the array using Arrays.sort() method
        Arrays.sort(array);

        // Printing the lower bound
        System.out.println(lower_bound(array, key));
    }
}
