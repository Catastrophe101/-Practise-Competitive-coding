package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Solutions {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public TreeNode invertTree(TreeNode root) {
        LinkedList<TreeNode> q=new LinkedList<TreeNode>();
        TreeNode head=root;
        if(root!=null){
            q.add(root);
        }
        while(q.size()!=0){
            head=q.remove();
            if(head.left !=null){
                q.add(head.left);
            }
            if(head.right!=null){
                q.add(head.right);
            }
            TreeNode temp=new TreeNode();
            temp=head.right;
            head.right=head.left;
            head.left=temp;
        }
        return root;
    }
}
