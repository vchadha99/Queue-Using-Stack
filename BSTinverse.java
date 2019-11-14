public class BSTinverse
{
    class Node
    {
        int data;
        Node right,left;
        Node(int data)
        {
            this.data = data;
            right = left = null;
        }
    }
    Node root;
    BSTinverse()
    {
        root = null;
    }
    void insert (int data)
    {
        //System.out.println("*");
        root = insertdata(root,data);
    }
    Node insertdata( Node root,int data )
    { 
        if(root == null)
        {
            //System.out.println("*");
            root = new Node(data);
            return root;
        }
        if(data < root.data)
        {
           root.right = insertdata(root.right,data);
            //System.out.println("*");
        }
        else
        { 
            root.left = insertdata(root.left, data);
            //System.out.println("*");
        }
        return root;
    }
    void display()
    {
        System.out.println("pre order");
        printpre(root);
        System.out.println();
        System.out.println("post order");
        printpost(root);
        System.out.println();
        print();
    }
    void printpre(Node n)
    {
    if(n==null)
    return;

    System.out.print(n.data + " ");
    printpre(n.left);
    printpre(n.right);
    }
    void printpost(Node node) 
    { 
        if (node == null) 
            return; 
        printpost(node.left); 
        printpost(node.right); 
        System.out.print(node.data+ " "); 
    }
    void print()
    {
        int h = height(root);
        System.out.print(h+ " ");
        for(int i = h; i>=1 ;i-- )
        {
            printlev(root,i);
        }
    }
    int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        else
        {
            int lheight = height(root.left);
            int rheight = height(root.right);
            if(lheight>rheight)
            {
                return (lheight+1);
            }
            else
            {
                return (rheight+1);
            }
        }
    }
    void printlev(Node root , int level)
    {   
        if(root == null)
        {
            return;
        }
        if(level == 1)
        {
            System.out.print(root.data + " ");
        }
        else if(level > 1)
        {
            printlev(root.left, level-1);
            printlev(root.right, level-1);
        }
    }
    public static void main(String []args)
    {
       
        BSTinverse tree = new BSTinverse();
        tree.insert(40);
        tree.insert(70);
        tree.insert(30);
        tree.insert(50);
        tree.insert(20);
        tree.insert(35);
        tree.insert(80);
        tree.display();
    }
    
}