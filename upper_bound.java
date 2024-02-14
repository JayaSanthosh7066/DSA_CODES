import java.util.Scanner;

public class upper_bound {
    public static void main(String[] args) {
        int n, mid = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = 0;
        int low = 0, high = n - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] > k) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
        sc.close(); // best practise
    }
}