package DSA.Stack;


import org.w3c.dom.ls.LSOutput;

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
        bts.getHeight();
        bts.search(7);
    }


    public void search(int value)
    {
        System.out.println(searchB(root,value)? value+" Found": value+" Not Found");
    }

    public void sortedOrder()
    {
        inorderTraversal(root);
    }

    public boolean searchB(Node root, int val)
    {
        if(root.value == val)
            return true;

        if(root == null)
            return false;

        if(val<root.value)
         return searchB(root.left,val);
        else
           return  searchB(root.right,val);

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
        if(root.right==null)
            return root.value;

        return getMaxElement(root.right);

    }

    public void getHeight()
    {
        System.out.println("Root Height"+height(root));
    }

    public int height(Node root)
    {
        if(root==null)
            return -1;

        return 1+Math.max(height(root.left),height(root.right));
    }
}
