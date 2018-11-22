package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by Pratik on 11/14/2017.
 */


public class ConvertBTtoCircularDLL {

    TreeNode root;
    Set<ArrayList<Integer>> result = new HashSet<>();
    
    public ConvertBTtoCircularDLL()
    {
        root = null;
    }

    public TreeNode ConvertBTtoCircularDLLUtil(TreeNode root) {

        if(root == null){
            return null;
        }
        TreeNode pre = ConvertBTtoCircularDLLUtil(root.left);
        TreeNode nex = ConvertBTtoCircularDLLUtil(root.right);
        root.left = root.right = root;
        return concatenate(concatenate(pre,root),nex);

    }

    public TreeNode concatenate(TreeNode leftList, TreeNode rightList){
        if(leftList == null){
            return rightList;
        }
        if(rightList == null){
            return leftList;
        }
        TreeNode lastL = leftList.left;
        lastL.right = rightList;
        TreeNode lastR = rightList.left;
        lastR.left = leftList;
        rightList.left = leftList.right;
        leftList.right = rightList.right;

        return leftList;
    }
}
