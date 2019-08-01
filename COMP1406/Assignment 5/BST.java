package comp1406a5;
import java.util.*;

public class BST extends BinaryTree{

	// You MUST have a zero argument constructor that
	// creates an empty binary search tree
	// You can can add code to this if you want (or leave it alone).
  // We will create all BSTs for testing using this constructor
  public BST(){}

  @Override
  public boolean contains(String s){

    //start, condition, increment
    for(Node tmp = root; tmp != null;
        tmp = s.compareTo(tmp.getData()) < 0 ? tmp.getLeft() : tmp.getRight()){
      if(s.equals(tmp.getData())){ return true; }
    }

    return false;
  }

  @Override
  public void add(String s){
    boolean in = this.contains(s);
    if(!in){
      root = insert(root, s);
      size++;
    }

/*
    boolean flag = true;
      Node newNode = new Node(s);
      Node curNode = root;
      while(flag){

        //means we need to add in right side
        if(s.compareTo(curNode.getData()) > 0){
          if(curNode.getRight() != null){
            curNode = curNode.getRight();
          }else{
            curNode.setRight(newNode);
            size++;
            flag = false;
          }
        }

        //means we need to add in left side
        else if(s.compareTo(curNode.getData()) < 0){
          if(s.compareTo(curNode.getData()) < 0){
            curNode = curNode.getLeft();
          }else{
            curNode.setLeft(newNode);
            size++;
            flag = false;
          }
        }

        //otherwise the node is already in the tree
        flag = false;
      }
    */

  }

  Node insert(Node tmp, String s){
    if(tmp == null){
      root = new Node(s);
      return root;
    }

    int compare = s.compareTo(tmp.getData());
    if(compare < 0){
      tmp.setLeft(insert(tmp.getLeft(), s));
    }

    else if(compare > 0){
      tmp.setRight(insert(tmp.getRight(), s));
    }

    return tmp;
  }

  @SuppressWarnings("unchecked")
  public boolean isValidBST(){
    String[] array = new String[this.size];
    insertArray(root,array,0);
    for (int i=0;i<array.length-1;i++){
      if(array[i].compareTo(array[i+1])>0){
        return false;
      }
    }
    return true;
  }

  @SuppressWarnings("unchecked")
  public BST makeBalanced(){
    //precondition is that this is a valid tree
    String[] array = new String[this.size];
    insertArray(root,array,0);
    BST balanced = new BST();
    balanced.root = nextNode(array,0,this.size);
    balanced.size = this.size;
    return balanced;
  }

  private int insertArray(Node n,String[] array, int i){
    //Like the earlier inorderTraversal
    if (n==null){return i;}
    i = insertArray(n.left,array,i);
    array[i] = n.data;
    i++;
    i=insertArray(n.right,array,i);
    return i;
  }

  private Node nextNode(String[] array, int low, int high){
    if(low == high){return null;}
    int median = (low+high)/2;
    Node n = new Node(array[median]);
    n.left = nextNode(array,low,median);
    n.right = nextNode(array,median+1,high);
    return n;
  }


}
