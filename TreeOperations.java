class Node{
  int data;
  Node left;
  Node right;
  public Node(int data)
  {
      this.data=data;
      left=NULL;
      right=NULL;
  }
}

class BST{
  Node root;
  public BST(){
    this.root=null;
  }
}


public void insert(int ele){
  Node newNode= new Node(ele);

  if(root==NULL) 
  {
      root=newNode;
      return;
  }
  Node parent=NULL;
  Node current = root;
  while(true)
  {
        parent=current;
        if(ele>current.data)  
        {
          current=current.right;
          if(current==NULL)
          {
            parent.right=newNode;
            return;
          }
        }
        else 
        {
          current=current.left;
          if(current==NULL)
          {
            parent.left=newNode;
            return;
          }
        }
  }

    
  
  public boolean searchNode(int ele)
  {
    if(root==NULL) return false;
    Node current = root;
    while(current!=NULL)
    {      
      if(ele>current.data)
        current=current.right;
      else if(ele<current.data)
        current=current.left;
      else if(ele==current.data) return true;
    }
     return false;
  }
