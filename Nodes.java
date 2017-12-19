package FirstProgram;

public class Nodes {

    private int element;
    private Nodes right;
    private Nodes left;

    public Nodes(int element, Nodes right, Nodes left) {
        this.element = element;
        this.right = right;
        this.left = left;
    }

    public int getElement() {
        return element;
    }

    public Nodes getLeft() {
        return left;
    }

    public Nodes getRight() {
        return right;
    }

    public void setElement(int newElement) {
        element = newElement;
    }

    public void setRight(Nodes newRight) {
        right = newRight;
    }

    public void setLeft(Nodes newLeft) {
        left = newLeft;
    }

    public boolean hasLeft() {
        return (left != null);
    }

    public boolean hasRight() {
        return (right != null);
    }

}
