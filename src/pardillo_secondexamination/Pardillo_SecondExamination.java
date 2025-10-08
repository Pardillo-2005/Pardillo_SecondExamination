
package pardillo_secondexamination;

import java.util.Scanner;

class Node {
    String word;
    Node left, right;

    public Node(String word) {
        this.word = word;
        left = right = null;
    }
}



public class Pardillo_SecondExamination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        System.out.println("Enter a passage:");
        String passage = sc.nextLine();

        passage = passage.replaceAll("[.,!?]", "");
        String[] words = passage.split("\\s+");

        for (String word : words) {
            bst.insert(word);
        }

        System.out.println("\nPreOrder Traversal: ");
        bst.preorder();

            System.out.println("\n\nInOrder Traversal: ");
                bst.inorder();

                 System.out.println("\n\nPostOrder Traversal: ");
             bst.postorder();

    }
}
