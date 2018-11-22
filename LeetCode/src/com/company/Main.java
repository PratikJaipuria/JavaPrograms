package com.company;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        ReverseWordsinString rs = new ReverseWordsinString();
//        rs.reverseWords();

//        HasUniqueChar isU = new HasUniqueChar();
//        if(isU.checkUnique("pratikP")){
//            System.out.println("Contains Unique");
//        }else {
//            System.out.println("Contains Duplicate");
//        }

//        int[] s1map = new int[26];
//        String s1 = "ab";
//        for (int i = 0; i < 26; i++) {
////            s1map[s1.charAt(i) - 'a']++;
//            System.out.println(s1map[i]);
//        }
//            PermutationInString check = new PermutationInString();
//        System.out.println(check.checkInclusion("ab", "eidbaooo"));
//        System.out.println(check.checkInclusion("adc", "dcda"));

//        GroupAnagrams ga = new GroupAnagrams();
//        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        System.out.println(ga.groupAnagrams(strs1));

//        ValidAnagrams va = new ValidAnagrams();
//        System.out.println(va.isAnagram("cat","aact"));
//
//        int[] test = new int[5];
//       for(int i=0 ; i < 5;i++)
//        System.out.println("test " + test[i]);

//        CountandSay countandSay = new CountandSay();
//        String s = countandSay.countAndSay(6);
//        System.out.println(s);


//        SerializeTree st = new SerializeTree();
//        TreeNode root = new TreeNode(10);
//
//        TreeNode node6 = new TreeNode(25);
//        node6.left = null;
//        node6.right = null;
//
//        TreeNode node7 = new TreeNode(30);
//        node7.left = null;
//        node7.right = null;
//
//        TreeNode node1 = new TreeNode(12);
//        node1.left = node6;
//        node1.right = node7;
//
//        TreeNode node3 = new TreeNode(36);
//        node3.left = null;
//        node3.right = null;
//
//        TreeNode node2 = new TreeNode(15);
//        node2.left = node3;
//        node2.right = null;
//
//        root.left = node1;
//        root.right = node2;

//        System.out.println(st.serialize(root));


//        ReducedString rs = new ReducedString();
//        System.out.println(rs.super_reduced_string("aaabbbcccd"));
//          CountPairwithSum cps = new CountPairwithSum();
//          int[] input = {3,1,1,1};
//        System.out.println(cps.countPairwithGivenSum(input,2));
//        ZigZag zag = new ZigZag();
//        System.out.println(zag.convert("PAYPALISHIRING",3));
//        System.out.println(zag.convert("A",3));
//        String s = "hello world";
//        String[] splited = s.split("\\s+");
//        String result = splited[splited.length - 1];
//        System.out.println(result.length());

//    CoinChange c = new CoinChange();
//    int[] arr = {2,5,10,50,100};
//    System.out.println(c.coinChangeDP(arr, 569));

//    graphDFS g = new graphDFS();
//    String[] s = new String[]{"S@@@", "++++","@@@F"};
//    System.out.println(g.findPath(s));
//        g.findPath(s);

//       formatNumber fN = new formatNumber();
//        System.out.println(fN.formattedNumber(12345000));
//        long maxV = Long.MAX_VALUE;
//        System.out.println(maxV);
//        Calculator c = new Calculator();
//        System.out.println(c.parsetoCompute());

//        Subset s = new Subset();
//        int[] arr = {2,4,6,8};
////        s.subsets(arr);
//        CombinationSumRutul cs = new CombinationSumRutul();
//        List<List<Integer>> re =  cs.combinationSum(arr, 6);
//        for (List<Integer> e : re){
//            System.out.println("Res "+ e);
//        }
//        for (ArrayList<Integer> qq : a){
//            System.out.println(qq);
//        }
//        for(List<Integer> el : s){
//            System.out.println(el);
//        }

//        ConvertBTtoCircularDLL root = new ConvertBTtoCircularDLL();
//
//        TreeNode tree = new TreeNode(10);
//        tree.left = new TreeNode(12);
//        tree.right = new TreeNode(15);
//        tree.left.left = new TreeNode(25);
//        tree.left.right = new TreeNode(30);
//        tree.right.left = new TreeNode(36);
//
//        // head refers to the head of the Link List
////        Node head = tree.ConvertBTtoCircularDLL(tree.root);
//        ConvertBTtoCircularDLL cbdll = new ConvertBTtoCircularDLL();
//        TreeNode dl = cbdll.ConvertBTtoCircularDLLUtil(tree);
//        TreeNode dp = dl;
//        do{
//            System.out.print(dp.val + " ");
//            dp = dp.right;
//        }
//        while (dp != dl);
//        TreeNode dn = dl;
//        while (dp.right != null ){
//            System.out.println(dp.getVal());
//            dp = dp.right;
//        }
//
//        while (dn != null ){
//            System.out.println(dn.getVal());
//            dn = dn.next;
//        }
//        int res = 0;
//        int count = 0;
//        int n = 5;
//        while(count != 4){
//            res <<=1;
//            System.out.println(res);
//            if((n & 1) == 1){
//                res++;
//                System.out.println("Inside if");
//                System.out.println(n);
//                System.out.println(res);
//                System.out.println(">>>>>>>>>>>>>>");
//            }
//            n >>=1;
//            count++;
//        }


//        List<String> input = new ArrayList<>();
//        input.add("a1 Pratik Jaipuria");
//        input.add("A1 Pratik Jaipuria");
//        input.add("A6 123 456");
//        input.add("B2 abc xyz");
//        input.add("C5 Abc xyz");

//        for(String s : input){
//            System.out.println(s);
//        }

//        sortLogFile sLf = new sortLogFile();
//        sLf.sortLogs(input);

//        mostCommonWord mCW = new mostCommonWord();
//        String res= mCW.mostCommonWordApi("Bob hit a ball, the hit BALL flew flew flew far far after it WAS after it was hit.",
//                new String[]{"hit"});
//        System.out.println(res) ;


        //KnighL on ChessBoard HacherRank
//        KnightLChessBoard k = new KnightLChessBoard();
//        int[][] res = k.knightlOnAChessboard(6);
//
//        for(int i=0 ; i < res.length ; i++){
//            for(int j=0 ; j < res[i].length ; j++){
//                System.out.print(res[i][j] + " ");
//            }
//            System.out.println();
//        }

//        LoadBalancer lb = new LoadBalancer();
//        lb.add(1);
//        lb.add(2);
//        lb.add(3);
//        lb.pick();
//        lb.pick();
//        lb.pick();
//        lb.pick();
//        lb.remove(1);
//        lb.pick();
//        lb.pick();
//        lb.pick();

//        SteadyGene steadyGene = new SteadyGene();
//        System.out.println(steadyGene.steadyGene("TATATAGCTTGTCTCCCTAATGTTAGTTCATGCTCGTAAGAGAACTTAGCCTACTAGGACGAGAGAACCGCACGGCGTCGTGAGGTATTTTTCGTAGGACACGCCAGATAGACGGTGGCAATGCCCGTTCAATATGACGCGATGTACGGCTAATGGGAACACTGCCCGACGCGTCTTTAGGACTGTGAGTTGCGGGTTACAGCTATGGTCTTATTGGTATCCGGCCCCTTTCGAGTCGCGATGCGCCTGCCACCACGATATTCGCCCGAAACGCGATTTGTGGGCGAGGTAGTCGTGTTCAACCCTGTAAATTTCCCTAGGTATAATCGTTCTAAGGTTCGCACATACACATCCACACCTACCTTTACACAGTTCGAGGTTCTATACGTCCTCTGAGTGCGTGTTAACACGCCCGTAAATGGGCATTTGGAGTCAGACCAGTACTTTGCGATAAACTTTACTTCCGCGAGACCTGTCCCTGGAACCCTGTTGTAAGGGTTAGGGTTTAATAGCTCCATGTCGTGTGCCTATAAGAAAAGGACGAATGGTGACAGTCCGGCTTAGCCAGGACAATGCGTGGCTGACGACGTCCAGGGTAAATTGAGTTGAATTCGCCTAATTTTAGGGTGTCTTGGTTCAATGAGGTGTCGACTTAACAAAAGGCGACATCAGTTGTCATCTTGCCTTGATAAAGTAAAACACGTGAATAGCCTATCCGGTCTGACCCCCGGGCCATGTGCTTCACCCAGGGAGCATCGCCGCTCTAGAGACGGTGTTCGTAGTCTCGATAACATGTGGGGTAATATAGAATATCCAAGACCGGTAGGAGGGGCGGTTCCGCGTCATAAGAAGTCCCAACGTGGCCTGCCACGTTCAAACAGGATACGCTATAACAGCTTCGTGGGTAATTGATGGATACGCCCGCAGGCTACCCATGCTCTTGCGATTTTGCAACCCTCGGAACCGTCACTCGTACACCCAGACATCATCTCATACAATTGCCTCACCTTCATGCCGGTACATAGGTGCCATCTCCGCTTAAGAATCCTCGCAGCAATTAATGTGACAGCACGCTAGTCCACTAGCGTATGATTACGCCACCGGGCCACCATGGACAAAAACGTTGAATTCCGACTAATAGACGAGTGTCCGATCGGGTCAACCGATCTCGGATGTTGCGTACCAGGACTACTGGGCTCGGGCCGAATCAGACACACGTATGCAACAGATACCGATAGGCGTCTTCCTAAGTAACAGCCGTAATCAATGGTGCCACAGATCTACTAATTACGGTGAAGATCATGGCCCACGACGCTGTACGGGTTTATAGCTGCCACAAACTTTAGGAAGTTTCAGCAATCGACGCGTAGTATGTGTGCTCAGACGGGTCGAGCATGCACTTGTGTATTAAGTTACTTGGCTGAACAACCTGTTGATAGATCTTGAGAGGACCGAGAAATTGCCCTCCGGTTATGAAACAGGTCCTGCGTACCAATCCTT"));
//
//          InterleavingString interleavingString = new InterleavingString();
//        System.out.println(interleavingString.isInterleave("aabcc","dbbca","aadbbcbcac"));


//        LongestAbsoluteFilePath longestAbsoluteFilePath = new LongestAbsoluteFilePath();
//        System.out.println(longestAbsoluteFilePath.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
//        LongestChainofDoubles longestChainofDoubles = new LongestChainofDoubles();
//        System.out.println(longestChainofDoubles.longestChainofDoubles(new int[]{20,7,10,40,5}));
        RaceCar raceCar = new RaceCar();
        System.out.println(raceCar.racecar(6));
    }



}
