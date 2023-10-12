
public class BinarySearch {

    Node root;
    public void insert(Node node){
        root=insertHelper(root,node);
    }

    private Node insertHelper(Node root,Node node) {
        int data=node.data;
        if(root==null){
            root=node;
            return root;
        }else if(data<root.data){
            root.left=insertHelper(root.left,node);
        }else{
            root.right=insertHelper(root.right,node);
        }
        return root;
    }
    public void display(){
        displayHelper(root);
    }
    private void displayHelper(Node root){
       if(root!=null){
           displayHelper(root.left);
           System.out.println(root.data);
           displayHelper(root.right);
       }
    }
     public boolean search(int data){
        return searchHelper(root,data);
    }

    private boolean searchHelper(Node root, int data) {
        if(root==null){
            return false;
        }else if(root.data==data) {
            return true;
        }else if(data<root.data){
            return searchHelper(root.left,data);
        }else{
            return searchHelper(root.right,data);
        }
    }

    public static void main(String args[]){
        BinarySearch binarySearch=new BinarySearch();
        binarySearch.insert(new Node(2));
        binarySearch.insert(new Node(34));
        binarySearch.insert(new Node(12));
        binarySearch.insert(new Node(4));
        binarySearch.insert(new Node(62));
        binarySearch.insert(new Node(24));
        binarySearch.display();
         System.out.println(binarySearch.search(34));
    }
}
class Node{
    int data;
    Node left=null;
    Node right=null;

    public Node(int data) {
        this.data = data;

    }
}

