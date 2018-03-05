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
					t.setKey(findMax(t.leftChild).getKey());
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
}
