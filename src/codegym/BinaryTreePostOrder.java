package codegym;

import java.util.Stack;

public class BinaryTreePostOrder {
    public static class TreeNode {
        protected int data;
        protected TreeNode left;
        protected TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }
//      Giải pháp Đệ quy
    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.printf("%d ", root.data);
        }
    }

    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.printf("%d ", root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.printf("%d ", root.data);
            inOrder(root.right);
        }
    }
//      Giải pháp Vòng lặp
    public void postorderIter(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;

        while (true) {
            if (current != null) {
                if (current.right != null) {
                    stack.push(current.right);
                }
                stack.push(current);
                current = current.left;
                continue;
            }
            if (stack.isEmpty())
                return;
            current = stack.pop();

            if (current.right != null && ! stack.isEmpty() && current.right == stack.peek()) {
                stack.pop();
                stack.push(current);
                current = current.right;
            } else {
                System.out.print(current.data + " ");
                current = null;
            }
        }
    }
}
