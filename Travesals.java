   if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

   if(root==null){
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
System.out.print(root.data+" ");


   if(root==null){
            return;
        }
        
        inOrder(root.left);
System.out.print(root.data+" ");
        inOrder(root.right);
