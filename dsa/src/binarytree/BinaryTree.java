package binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {
	private static class Node{
		private int value;
		private Node left;
		private Node right;
		public Node(int value) {
			this.value=value;
			this.left=null;
			this.right=null;
		}
	}
	private Node root;
	
	public BinaryTree() {
		this.root=null;
	}
	
	public void add( int value) {
		root=addNode(root,value);
	}
	private Node addNode(Node root,int value) {
		if(root==null) {
			return new Node(value);
		}
		if(value<root.value) {
			root.left=addNode(root.left,value);
		}
		else if(value>root.value) {
			root.right=addNode(root.right,value);
		}
		else {
			return root;//value already exists
		}
		return root;
	}
	public void traverseInOrder() {
		traverseInOrder(root);
		System.out.println();
	}
	private void traverseInOrder(Node root) {
		if(root==null) {
			return;
		}
		traverseInOrder(root.left);
		System.out.print(root.value+" ");
		traverseInOrder(root.right);
	}
	public void traversePreOrder() {
		traversePreOrder(root);
		System.out.println();
	}
	private void traversePreOrder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.value+" ");
		traversePreOrder(root.left);
		traversePreOrder(root.right);
	}
	public void traversePostOrder() {
		traversePostOrder(root);
		System.out.println();
	}
	private void traversePostOrder(Node root) {
		if(root==null) {
			return;
		}
		traversePostOrder(root.left);
		traversePostOrder(root.right);
		System.out.print(root.value+" ");
	}
	public void delete(int value) {
		root=deleteNode(root,value);
	}
	private Node deleteNode(Node current, int value) {
		if(current==null) {
			return null;
		}
		if(value==current.value) {
			if(current.left==null&&current.right==null) {
				return null;
			}
			if(current.right==null) {
				return current.left;
			}
			if(current.left==null) {
				return current.right;
			}
			int smallestValue=findSmallestValue(current.right);
			current.value=smallestValue;
			
			current.right=deleteNode(current.right,smallestValue);
			return current;
		}
		System.out.println("> "+current.value);
		if(value<current.value) {
			current.left=deleteNode(current.left,value);
			return current;
		}
		current.right=deleteNode(current.right,value);
		return current;
	}
	private int findSmallestValue(Node root) {
		return root.left==null?root.value:findSmallestValue(root.left);
//		if(right==null) {
//			return 0;
//		}
//		int min=0;
//		while(right!=null) {
//			min=right.value;
//			right=right.left;
//		}
//		return min;
	}

	public void levelOrderTraversal() {
		levelOrderTraversal(root);
		System.out.println();
	}
	private void levelOrderTraversal(Node root) {
		if(root==null) {
			return;
		}
		Queue<Node> queue=new ArrayDeque<>();
		queue.add(root);
		Node currentNode;
		while(!queue.isEmpty()) {
			currentNode=queue.poll();
			System.out.print(currentNode.value+" ");
			if(currentNode.left!=null) {
				queue.add(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.add(currentNode.right);
			}
		}
	}
	void invert() {
		root=invert(root);
	}
	private Node invert(Node node) {
		if(node==null) {
			return node;
		}
		Node left=invert(node.left);
		Node right=invert(node.right);
		node.left=right;
		node.right=left;
		return node;
	}

	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		bt.add(60);
		bt.add(40);
		bt.add(30);
		bt.add(50);
		bt.add(80);
		bt.add(70);
		bt.add(90);
		bt.add(100);
		bt.add(85);
		System.out.print("In-order traversal ");
		bt.traverseInOrder();
		System.out.print("Pre-order traversal ");
		bt.traversePreOrder();
		System.out.print("Post-order traversal ");
		bt.traversePostOrder();
		System.out.print("Level-order traversal ");
		bt.levelOrderTraversal();
		bt.delete(80);
		bt.traverseInOrder();
		bt.invert();
		bt.traverseInOrder();
		bt.invert();
		bt.traverseInOrder();
	}
}
