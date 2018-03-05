package qwe;

public class Tree {

	private Node root;
	
	private Tree(){
		root=null;
		
	}
	
	
	public void insert (int key){
		root = insert (key,root);
		
	}
	
	public Node insert (int key, Node t)
	{
		if (t == null)
			t= new Node (key,null,null);//liste boşsa eleman ekledik
		
		
		else if ( key < t.getKey())
			t.leftChild = insert(key,t.leftChild);
		
		
		else if (key>t.getKey())
			t.rightChild=insert (key,t.rightChild);
		
		else
			;
		
		
		return t;
	}
	
	public Node search (int key, Node t){
		if (t==null)
			return null;
		else if (key < t.getKey())
			return search(key,t.leftChild);
		else if (key> t.getKey())
			return search(key,t.rightChild);
		else
			return t;
	}
	
	
	public void remove(int key){
		root=remove (key,root);
		
	}
	
	public Node remove(int key, Node t){
		
		if(t==null)
			return t;
		if(key<t.getKey())
			t.leftChild = remove(key,t.leftChild);
		else if(key>t.getKey())
			t.leftChild = remove (key,t.rightChild);
		else 
			if (t.leftChild != null && t.rightChild != null){
			//		t.getKey(findMax(t.leftChild).getKey());
					t.leftChild=remove(t.getKey(),t.leftChild);
		}
		
			else if(t.leftChild != null)
				t=t.leftChild;
			else 
				t=t.rightChild;
		return t;
	}
	
	
	public Node findMax(){
		if(root==null)
			return null;
		return findMax(root);
	}
	
	public Node findMax (Node t){
		
		if(t.rightChild==null)
			return t;
		return findMax(t.rightChild);
		
	}
	
	public Node findMin(){
		Node t=root;
		if(t != null)
			while(t.leftChild != null)
				t = t.leftChild;
		return t;
	}
	

	
	public void preorder(Node t){
		if (t != null){
			System.out.println(t.getKey()+ " ");
			preorder(t.leftChild);
			preorder(t.rightChild); }
		}
		
		public void inorder (Node t){
			if (t != null){
				
				inorder(t.leftChild);
				System.out.println(t.getKey()+ " ");
				inorder(t.rightChild);}
			}
			
			public void postorder (Node t){
				if (t != null){
					
					postorder(t.leftChild);
					postorder(t.rightChild);
					System.out.println(t.getKey()+ " ");
				}
				
	}
			
			
			public static void main (String [] args){
				Node a = new Node (3,null,null);
				Node b = new Node (3,null,null);
				Node c = new Node (3,null,null);
				Node d = new Node (3,null,null);
				Node e = new Node (3,null,null);
				Node f = new Node (3,null,null);
			}
	//preorder - root left right 6 3 2 0 1 5 4 16 8 20 
	
	//inorder left toor right  0 1 2 3 5 4 6 8 16 20
	
	//postorder left right root 1 0 2 4 5 3 8 20 16 6  
}
