package Module02.DSA.Geekster;

import java.util.Scanner;

public class HW_Alice_AND_Bob {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int arr[] = new int[N];
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int capacityA = sc.nextInt();
//        int capacityB = sc.nextInt();
//
//        int refills = countRefills(arr, capacityA, capacityB);
//        System.out.println(refills);

        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++)  arr[i] = scn.nextInt();
        int capA = scn.nextInt(), capB = scn.nextInt();

        int refill1 = capA, refill2 = capB;
        int noOfRifills = 0;
        int l = 0, r = N-1;
        while(l < r){
            if(arr[l] > refill1){
                refill1 = capA;
                noOfRifills++;
            }
            if(arr[r] > refill2){
                refill2 = capB;
                noOfRifills++;
            }
            refill1 -= arr[l];
            refill2 -= arr[r];
            l++; r--;
        }
        System.out.println(noOfRifills);
    }

//    private static int countRefills(int[] arr, int capacityA, int capacityB) {
//        int refills = 0;
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left <= right) {
//            if (capacityA < arr[left]) {
//                capacityA = capacityA + capacityB;
//                refills++;
//            }
//
//            if (capacityB < arr[right]) {
//                capacityB = capacityA + capacityB;
//                refills++;
//            }
//
//            capacityA = capacityA - arr[left];
//            capacityB = capacityB - arr[right];
//
//            left++;
//            right--;
//        }
//
//        return refills;
//    }
}
