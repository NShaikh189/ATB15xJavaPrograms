package DSA.Stack;




public class BinaryTreeSearch {
    Node root;
    private class Node
    {
         int value;
         Node left;
         Node right;

        public Node(int value)
        {
            this.value = value;
        }
    }

    public void insert(int value)
    {
        root = insertNode(root, value);

    }

    public  Node insertNode(Node root, int value)
    {

            if (root == null) {
                root = new Node(value);
                return root;
            }

            if(value<root.value)
            {
                root.left = insertNode(root.left,value);
            }
            else
                root.right = insertNode(root.right,value);

            return  root;
    }
    public static void main(String[] args) {
        int arr[] = {4, 6, 12, 3, 9, 7, 14, 2};
        BinaryTreeSearch bts = new BinaryTreeSearch();
        for (int i = 0; i < arr.length; i++) {
            bts.insert(arr[i]);
        }
        bts.sortedOrder();
        bts.maxElement();
    }

    public void sortedOrder()
    {
        inorderTraversal(root);
    }
    public static void inorderTraversal(Node root)
    {
        if(root!=null)
        {
            inorderTraversal(root.left);
            System.out.println(root.value);
            inorderTraversal(root.right);
        }
    }

    public void maxElement()
    {
        int maxValue = getMaxElement(root);
        System.out.println("Max Element: "+maxValue);
    }

    public int getMaxElement(Node root)
    {
        Node current = root;
        while(current.right!=null)
        {
            current = current.right;
        }

        return current.value;

    }
}
