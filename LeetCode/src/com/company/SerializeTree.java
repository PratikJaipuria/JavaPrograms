package com.company;


/**
 * Created by Pratik on 8/5/2017.
 */
public class SerializeTree {

    public String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        serialize(root, res);
        return res.toString();
    }

    private void serialize(TreeNode cur, StringBuilder res) {
        if (cur == null) {res.append(",#"); return;}

        res.append("," + cur.val);
        serialize(cur.left, res);
        serialize(cur.right, res);
    }
}
