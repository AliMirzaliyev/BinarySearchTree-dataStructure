package FirstProgram;

public class Tree {

    private Nodes root;

    public Tree() {
        root = null;
    }

    public Tree(Nodes newNode) {
        root = newNode;
    }

    public boolean isEmpty() {
        return root == null;
    }
    public boolean search ( int value){
        Nodes newRoot = root;
        while(newRoot != null){
        if(newRoot.getElement() == value )
            return true;
        else if(newRoot.getElement() > value)
        newRoot = newRoot.getLeft();
        else{
        newRoot = newRoot.getRight();
        }
       
        }
         return false;
            
    }

    public void add(int newValue) 
    {
        Nodes node = new Nodes(newValue,null,null);
        
        if(isEmpty())
            root = node;
        else
        {
            Nodes oldNode = root;
            
            while(true)
            {
                if(newValue < oldNode.getElement())
                {
                    if(oldNode.getLeft() == null)
                    {
                        oldNode.setLeft(node);
                        break;
                    }	
                    else
                        oldNode = oldNode.getLeft();
                }
                else
                {
                    if(oldNode.getRight() == null)
                    {
                        oldNode.setRight(node);
                        break;
                    }	
                    else
                        oldNode = oldNode.getRight();
                }
            }	
        }
    }

}
