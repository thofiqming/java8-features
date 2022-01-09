package TreeImpl;

public class TreeImplInOrder {

    public static void main(String[] args) {
        InorderTree inorderTree = new InorderTree();
        inorderTree.add(10);
        inorderTree.add(7);
        inorderTree.add(15);
        inorderTree.add(4);
        inorderTree.add(16);
        inorderTree.display();
    }
}

class InorderTree {

    private Node rootNode;

    public void display() {

    }

    //Alogorithms.recursion
    public Node traverse(Node newNode, Node traverseRootNode) {
        if (newNode.getElement() < traverseRootNode.getElement()) {
            if (traverseRootNode.getLeft() == null) return traverseRootNode;
            return traverse(newNode, traverseRootNode.getLeft());
        } else if (newNode.getElement() > traverseRootNode.getElement()) {
            if (traverseRootNode.getRight() == null) return traverseRootNode;
            return traverse(newNode, traverseRootNode.getRight());
        }
        throw new IllegalArgumentException("Invalid Element");
    }

    public void add(int element) {
        Node node = new Node(element);
        if (this.rootNode == null) {
            this.rootNode = node;
            return;
        }
        Node traverseNode = this.traverse(node, this.rootNode);
        if (element < traverseNode.getElement()) {
            traverseNode.setLeft(node);
        } else if (element > traverseNode.getElement()) {
            traverseNode.setRight(node);
        }
    }
}

class Node {

    private int element;
    private Node left;
    private Node right;

    public Node(Integer element) {
        this.element = element;
    }

    public Integer getElement() {
        return element;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}