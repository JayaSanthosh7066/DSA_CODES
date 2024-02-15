import java.util.*;

public class max_number {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[n - 1]);
        sc.close();
    }
}
