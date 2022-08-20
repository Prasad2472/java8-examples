package com.core.programs;

import java.util.HashSet;
import java.util.Set;

public class ShorttestVacation {
  /**
  ** Optum
  **/
    public static void main(String[] args) {
        int[] c = new int[]{2, 1, 1, 3, 2, 1, 1, 3};
        System.out.println("Short tour[2,1,1,3,2,1,1,3]:" + solution(c));
        c = new int[]{7, 5, 2, 7, 2, 7, 4, 7};
        System.out.println("Short tour[7,5,2,7,2,7,4,7]:" + solution(c));
        c = new int[]{7, 3, 7, 3, 1, 3, 4, 1};
        System.out.println("Short tour[7, 3,7,3,1,3,4,1]:" + solution(c));
        c = new int[]{7, 3, 7, 3, 1, 3, 4, 1};
         System.out.println("Short tour[null]:" + solution(null));
        c = new int[]{7};
         System.out.println("Short tour[null]:" + solution(c));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        if (A == null) {
            return 0;
        }
        if (A.length == 1) {
            return 1;
        }
        Set<Integer> visitPlaces = new HashSet<>();
        for (int place : A) {
            visitPlaces.add(place);
        }
        int visited = 0;
        Set<Integer> visitedPlaces = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                visitedPlaces.add(A[j]);
                if (visitedPlaces.size() == visitPlaces.size()) {
                    if (i == 0) {
                        visited = Math.abs(j - i) + 1;
                    } else {
                        visited = Math.min(Math.abs(j - i) + 1, visited);
                    }
                    break;
                }
            }
            visitedPlaces.clear();
        }
        visitPlaces = null;
        visitedPlaces = null;
        return visited;
    }
}
