package comp1406m3;

public class BST{

  /*class contianing left and right child of
  current node and key value*/
  class Node{
    int key;
    Node left, right;

    public Node(int item){
      key = item;
      left = right = null;
    }
  }

  //A utility function to search a given key in BST
  public Node search(Node root, int key){
    //Base cases: root is null or key is pretent at root
    if(root == null || root.key == key){
      return root;
    }

    //val is greater than root's key
    if(root.key > key){
      return search(root.left, key);
    }

    //val is less than root's key
    return search(root.right, key);
  }

  //root of BST
  Node root;

  //Constructor
  BST(){
    root = null;
  }

  //this method mainly calls insertRec()
  void insert(int key){
    root = insertRec(root, key);
  }

  //recursive fcn to insert new key in BST
  Node insertRec(Node root, int key){
    //if tree is empty return new node
    if(root == null){
      root = new Node(key);
      return root;
    }

    //otherwise, recur down the tree
    if(key < root.key){
      root.left = insertRec(root.left, key);
    }else if(key > root.key){
      root.right = insertRec(root.right, key);
    }

    //return the (unchanged) node pointer
    return root;
  }

  //this method mainly calls inorderRec()
  void inorder(){
    inorderRec(root);
  }

  //a utility fcn to do inorder traversal of BST
  void inorderRec(Node root){
    if(root != null){
      inorderRec(root.left);
      System.out.println(root.key);
      inorderRec(root.right);
    }
  }

  //Driver Program to test above functions
  public static void main(String[] args){
    BST tree = new BST();

    /* let us create following BST
          50
        /    \
      30      70
     /  \    /  \
    20  40  60  80 */

    tree.insert(50);
    tree.insert(30);
    tree.insert(20);
    tree.insert(40);
    tree.insert(70);
    tree.insert(60);
    tree.insert(80);

    //print inorder traversal of BST
    tree.inorder();
  }
}
