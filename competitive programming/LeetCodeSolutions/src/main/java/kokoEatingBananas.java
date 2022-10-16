package com.company;

public class kokoEatingBananas 
{
    public static void main(String[] args) 
    {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 6;
        System.out.println(minEatingSpeed(piles,h));
    }
    
    public static int minEatingSpeed(int[] piles, int h) 
    {
        //first sort the array
        bubbleSort(piles);

        int s = 1;
        int e = piles[piles.length - 1];

        int res = e;

        while (s <= e) {
            int k = s + (e - s) / 2;

            int hours = 0;
            for (int i = 0; i < piles.length; i++) {
                hours += Math.ceil((double) piles[i] / k);
            }
            if (hours <= h) {
                res = Math.min(res, k);
                e = k - 1;
            } else {
                s = k + 1;
            }

        }
        return res;
    }

    public static void bubbleSort(int[] arr) 
    {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

}





