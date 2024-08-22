import java.util.Scanner;
public class quicksort {
    public static void quicksortDemo(int k[],int LB,int UB){
        boolean flag=true;
        if(LB<UB){
            int i=LB;
            int j=UB+1;
            int key=k[LB];
                while(flag==true){
                    i++;
                        while(i<k.length && k[i]<key){
                            i++;
                        }
                        j--;
                        while(j>=0 && k[j]>key){
                            j--;
                        }
                    if(i<j){
                        int temp=k[i];
                        k[i]=k[j];
                        k[j]=temp;
                    }
                    else{
                        flag=false;
                    }
                }
                int temp=k[LB];
                k[LB]=k[j];
                k[j]=temp;

                quicksortDemo(k, LB, j-1);
                quicksortDemo(k,j+1,UB);
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a size of array");
        int n=sc.nextInt();
        int k[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter a elementes"+i);
            k[i]=sc.nextInt();
        }
        quicksort q=new quicksort();
        q.quicksortDemo(k,0,k.length-1);
        System.out.println("sorted array");
        for(int i=0;i<n;i++){
            System.out.print(k[i]+" ");
        }
    }
    
}
