package myLibrary.DataStructures.Tree;

/**
 * Aemen Mohsin
 * ENSF 694
 * Project
 * BST.java
 *
 * Class Name: BST
 * 
 * Creation of a binary search tree.
 * 
 */
public class BST 
{

	// Create node
	public Node createNode(int data) //create a new node
	{
		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;
		return node;
	}
	
	// Insert new node in BST - you can use recursive or iterative method
	public Node insert(int data, Node root) 
	{
		if(root == null)
		{
			return createNode(data); //this is the first node
		}
		if(data <= root.data) //go to left subtree
		{
			root.left = insert(data, root.left);
		}
		else if (data > root.data) //go to right subtree
		{
			root.right = insert(data, root.right);
		}
		return root;
	}
	
	// Inorder traversal - recursive OR iterative
	public void inOrder(Node node) 
	{
		if (node == null)
		{
			return;
		}
		
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}

	// Preorder traversal - recursive OR iterative
	public void preOrder(Node node) 
	{
		if (node == null)
		{
			return;
		}
		
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	// Postorder traversal - recursive OR iterative
	public void postOrder(Node node) 
	{
		if (node == null)
		{
			return;
		}
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}
	
	// Breadth first traversal - recrsive OR iterative
	public void breadthFirstTraversal(Node root) 
	{
		int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
        {
            currentLevel(root, i);
        }
	}
	
	int height(Node root) 
	{
		if (root == null)
		{
			return 0;
		}
		else
		{
			int left = height(root.left);
			int right = height(root.right);
			
			if (left > right)
			{
				return (left + 1);
			}
			else
			{
				return (right + 1);
			}
		}
	}
	
	public void currentLevel(Node root, int l) 
	{
		if (root == null)
		{
			return;
		}
		if (l == 1)
		{
			System.out.print(root.data + " ");
		}
		else if (l > 1)
		{
			currentLevel(root.left, l - 1);
			currentLevel(root.right, l - 1);
		}
	}
	
	// Search in BST
	public Node searchBinarySearchTree(Node node, int key)
	{
		while (node != null)
		{
			if (key == node.data)
			{
				return node; // found
			}
			else if (key < node.data)
			{
				node = node.left;
			}
			else
			{
				node = node.right;
			}
		}
		return null; // not found
	}
	
	// Delete from BST
	public Node deleteNode(Node root, int key) 
	{
		if (root == null)
		{
			return root;
		}
		if (root.data > key)
		{
			root.left = deleteNode(root.left, key);
			return root;
		}
		else if (root.data < key)
		{
			root.right = deleteNode(root.right, key);
			return root;
		}
		
		// If node to be deleted has 1 child
		if (root.left == null)
		{
			Node temp = root.right;
			return temp;
		}
		else if (root.right == null)
		{
			Node temp = root.left;
			return temp;
		}
		// If node to be deleted has 2 children
		else
		{
			Node parent = root;
			Node successor = root.right;
			while (successor.left != null)
			{
				parent = successor;
				successor = successor.left;
			}
			// Successor is left child
			if (parent != root)
			{
				parent.left = successor.right;
			}
			// If no successor
			else
			{
				parent.right = successor.right;
			}
			
			// Successor becomes root
			root.data = successor.data;
			
			// Successor deleted and root returned
			return root;
		}
	}
	
	// Add any other parts needed

}
