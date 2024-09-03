import java.util.Scanner;
public class heapsort {
    public static void heapsort(int arr[]){
        bulidmaxheap(arr);
        for(int i = arr.length - 1; i > 0; i--){
            
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }
       public static void bulidmaxheap(int arr[]){
        int n=arr.length;
            for(int i=n/2-1;i>=0;i--){
                heapify(arr,n,i);
            }
        }
              public static void heapify(int arr[],int n,int i){
                    int maxIndex=i;
                    int leftChild = 2*i+1;
                    int rightChild = 2*i+2;
                    if(leftChild<n && arr[leftChild]>arr[maxIndex]){
                        maxIndex = leftChild;
                    }
                    if(rightChild<n && arr[rightChild]>arr[maxIndex]){
                        maxIndex = rightChild;
                    }
                    if(i!=maxIndex){
                        int temp=arr[i];
                        arr[i]=arr[maxIndex];
                        arr[maxIndex]=temp;
                        heapify(arr,n,maxIndex);
                    }
                }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            }
            heapsort(arr);
            System.out.println("sorted array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
