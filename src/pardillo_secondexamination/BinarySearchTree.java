
package pardillo_secondexamination;

class BinarySearchTree {
    private Node root;

    public void insert(String word) {
        root = insertRec(root, word);
    }

    private Node insertRec(Node root, String word) {
        if (root == null) {
            return new Node(word);
        }

        int cmp = word.compareToIgnoreCase(root.word);
        if (cmp < 0)
            root.left = insertRec(root.left, word);
        else if (cmp > 0)
            root.right = insertRec(root.right, word);
        return root;
    }

    public void preorder() {
        preorderRec(root);
    }

    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.word + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.word + " ");
            inorderRec(root.right);
        }
    }

    public void postorder() {
        postorderRec(root);
    }

    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.word + " ");
        }
    }
}
