package com.saatvik.course.collections;

public class FindDuplicateInGivenWindow {

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 2, 3, 4, 4};
        int k = 3;
        int i = 0, j = 1, kk = 0;
        while (j < arr.length) {
            if (arr[i] == arr[j] && (j-i)<=2) {
                System.out.println(STR."\{arr[i]}");
            }
            j++;
            kk++;

            if (kk == k || j == arr.length) {
                i += 1;
                j = i + 1;
                kk=0;
                System.out.println();
            }

            i++;
            if (i>=arr.length)
                break;
        }


    }
}
