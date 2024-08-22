class Tree{
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    Node root=null;
    
   
    public void construct(int[] arr){
        int count=0;
        Node parent=root;
        int i=0;
       
        while(i<arr.length){
            Node temp1=new Node(arr[i++]);
            if(root==null){
                root=temp1;
            }else{
                parent=root;
            }
           
            if(count%2==0){
                parent.left=temp1;
            }else{
                parent.right=temp1;
            }


        }
    }
}
public class Construct{
    public static void main(String[] args) {

    }
}