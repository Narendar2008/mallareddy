	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	if(root == null)
            return -1;

        return 1 + Math.max(height(root.left), height(root.right));
    }
