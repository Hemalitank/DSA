public class countingsort
{
    public static void main(String[] args) {
        int[] arr = {2,6,3,5,7,8,9,5};
        int max=0;
        int[] b=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        
        int[] c=new int[max+1];
        for(int i=0;i<arr.length;i++)
        {
            c[arr[i]]=c[arr[i]]+1;
        }
        for(int i=1;i<c.length;i++)
        {
            c[i]=c[i]+c[i-1];
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            b[c[arr[i]]-1]=arr[i];
            c[arr[i]]=c[arr[i]]-1;
        }
        for (int i : b) {
            System.out.println(i);
        }
    }
        
}