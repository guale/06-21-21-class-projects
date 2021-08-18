package baeldungtree;

public class BinaryTree {

	Node root;

	private Node addRecursive(Node current, int value){
		if (current == null){
			return new Node(value);
		}

		if (value <current.key){
			current.left = addRecursive(current.left, value);
		} else if (value >current.key){
			current.right = addRecursive(current.right,value);
		} else {
			return current;
		}

		return current;
	}

	public void add(int value){
		root = addRecursive(root,value);
	}

	private BinaryTree createBinaryTree(){
		BinaryTree bt = new BinaryTree();

		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);

		return bt;
	}

	private boolean containsNodeRecursive(Node current, int value){
		if(current == null){
			return false;
		}

		if(value == current.key){
			return true;
		}

		return value < current.key
				? containsNodeRecursive(current.left, value)
				: containsNodeRecursive(current.right, value);
	}

	private boolean containsNode(int value){
		return containsNodeRecursive(root, value);
	}

	

}
