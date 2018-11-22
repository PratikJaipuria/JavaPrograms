package com.company;

import java.util.ArrayList;

public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();

            if(root == null){
            return true;
        }
        checkValid(root, arr);
        // System.out.println(arr);
        int temp = arr.get(0);
        // System.out.println(temp);
            for(int i= 1 ; i< arr.size() ; i++){
            if(temp < arr.get(i)){
                temp = arr.get(i);
                // System.out.println(temp);
            }else{
                return false;
            }
        }
            return true;
}


    private  void checkValid(TreeNode head, ArrayList arr){

        if(head == null){
            return;
        }
        if(head.left != null){
            checkValid(head.left, arr);
        }

        arr.add(head.val);

        if(head.right != null){
            checkValid(head.right, arr);
        }


    }

}