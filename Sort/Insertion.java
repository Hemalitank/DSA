import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            System.out.println("Enter arr[" + j + "]");
            arr[j] = sc.nextInt();
        }
        int i=1;
        while(i<n){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            i++;
        }
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);           
        }
    }
}
