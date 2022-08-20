package com.core.programs;

public class DeleteAdjecent {

    public static void main(String[] args) {
      /**
      ** Optum
      **/
        System.out.println("");
        String s = "abccbd";
        int[] c = new int[]{0, 1, 2, 3, 4, 5};
        System.out.println("Total Cost[abccbd]:" + solution(s, c));
        s = "aabbcc";
        c = new int[]{1, 2, 1, 2, 1, 2};
        System.out.println("Total Cost[aabbcc]:" + solution(s, c));
        s = "aaaa";
        c = new int[]{3, 4, 5, 6};
        System.out.println("Total Cost[aaaa]:" + solution(s, c));
        s = "ababa";
        c = new int[]{10, 5, 10, 5, 10};
        System.out.println("Total Cost[ababa]:" + solution(s, c));

    }

    public static int solution(String S, int[] C) {
        // write your code in Java SE 8
        if (S == null || S.isEmpty() || S.length() == 1)
            return 0;
        int result = 0;
        char[] arr = S.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                result += C[i] > C[i + 1] ? C[i + 1] : C[i];
            }
        }
        return result;
    }
}
