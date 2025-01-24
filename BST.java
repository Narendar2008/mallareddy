    boolean checkBST(Node root) {
        return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
 boolean checkBST(Node root, int minValue, int maxValue){
       if(root == null) return true;
       if(root.data >= maxValue || root.data <= minValue) return false;
       return checkBST(root.left, minValue,root.data) && checkBST(root.right,root.data,maxValue); 
    }
