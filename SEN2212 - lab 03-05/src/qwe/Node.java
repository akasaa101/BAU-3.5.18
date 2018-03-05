package qwe;

public class Node {
	
	private int key;
	Node leftChild,rightChild;

public Node(int key, Node leftChild, Node rightChild){
	super();
	this.key=key;
	this.leftChild=leftChild;
	this.rightChild=rightChild;
	
}

public int getKey(){
	return key;
}

}



