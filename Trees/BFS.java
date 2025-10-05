import java.util.List.*;
import java.util.ArrayList.*;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Node{
int data;
Node left;
Node right;
public Node(int data){
    this.data=data;
    left=null;
    right=null;
}
}
class Traversal{

    public void inorderTr(Node node){

        if(node==null){
            return;
        }
        inorderTr(node.left);
        System.out.println(node.data);
        inorderTr(node.right);

    }
     public void preorderTr(Node node){

        if(node==null){
            return;
        }
        System.out.println(node.data);
        preorderTr(node.left);
        preorderTr(node.right);

    }
     public void postorderTr(Node node){

        if(node==null){
            return;
        }
        postorderTr(node.left);
        postorderTr(node.right);
        System.out.println(node.data);

    }
    public List<List<Integer>> breadthFS(Node node){
        
        Queue<Node> que=new LinkedList<Node>();
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if(node==null) return ans;
       
        que.offer(node);
        while(!que.isEmpty()){
            List<Integer> subList=new ArrayList<Integer>();
             int level=que.size();
            for(int i=0;i<level;i++){
               Node current=que.poll();
               if (current.left!=null) que.offer(current.left);
               if(current.right!=null) que.offer(current.right);
            
            subList.add(current.data);
        }
        ans.add(subList);
        }
        return ans;
        

    }
}



public class BFS {
public static void main(String[] args){
Node nd=new Node(5);
nd.left=new Node(6);
nd.left.left=new Node(7);
nd.left.right=new Node(8);
nd.left.left.left=new Node(10);
nd.right=new Node(12);;
nd.right.left=new Node(15);
nd.right.right=new Node(20);

Traversal tr=new Traversal();
// tr.inorderTr(nd);
//  System.out.println();
// tr.postorderTr(nd);
//  System.out.println();
// tr.preorderTr(nd);
System.out.println(tr.breadthFS(nd));

}
}
