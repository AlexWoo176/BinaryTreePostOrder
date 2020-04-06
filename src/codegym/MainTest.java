package codegym;

public class MainTest {
    public static void main(String[] args) {
        BinaryTreePostOrder bin = new BinaryTreePostOrder();

        BinaryTreePostOrder.TreeNode rootNode = createBinaryTree();
        System.out.println("Sử dụng phương pháp Đệ Quy: ");
        bin.postOrder(rootNode);
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Sử dụng phương pháp Vòng Lặp: ");
        bin.postorderIter(rootNode);
    }

    public static BinaryTreePostOrder.TreeNode createBinaryTree() {
        BinaryTreePostOrder.TreeNode rootNode = new BinaryTreePostOrder.TreeNode(60);
        BinaryTreePostOrder.TreeNode node55 = new BinaryTreePostOrder.TreeNode(55);
        BinaryTreePostOrder.TreeNode node45 = new BinaryTreePostOrder.TreeNode(45);
        BinaryTreePostOrder.TreeNode node57 = new BinaryTreePostOrder.TreeNode(57);
        BinaryTreePostOrder.TreeNode node100 = new BinaryTreePostOrder.TreeNode(100);
        BinaryTreePostOrder.TreeNode node67 = new BinaryTreePostOrder.TreeNode(67);
        BinaryTreePostOrder.TreeNode node107 = new BinaryTreePostOrder.TreeNode(107);
        BinaryTreePostOrder.TreeNode node59 = new BinaryTreePostOrder.TreeNode(59);
        BinaryTreePostOrder.TreeNode node101 = new BinaryTreePostOrder.TreeNode(101);

        rootNode.left = node55;
        rootNode.right = node100;

        node55.left = node45;
        node55.right = node57;

        node100.left = node67;
        node100.right = node107;

        node57.right = node59;
        node107.left = node101;

        return rootNode;
    }
}
