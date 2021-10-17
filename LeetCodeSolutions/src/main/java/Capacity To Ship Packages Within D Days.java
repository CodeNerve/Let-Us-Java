package com.company;

public class solution {
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days=5;
        System.out.println(shipWithinDays(weights,days));

    }
    static int shipWithinDays(int[] weights, int days) {

        int s=0;
        int e=0;


        for(int i=0;i<weights.length;i++){
            s=Math.max(weights[i],s);
            e+=weights[i];
        }

        int res=e;
        while(s<=e){
            int mid=s+(e-s)/2;

            int daysCount=1;
            int current=0;
            for(int i=0;i<weights.length;i++){
                if(current+weights[i]>mid){
                    daysCount++;
                    current=0;
                }

                current+=weights[i];
            }

            if(daysCount<=days){
                res=Math.min(res,mid);
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return res;
    }
}
