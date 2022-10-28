//This program finds the kth largest element in an unsorted array using priority queue and minimum heap concept.

import java.util.*;
class HelloWorld {
    static int kth_largest_elem(int a[], int k){
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();
        for(int i=0; i<k; i++){
            p.add(a[i]);
        }
        for(int i=k; i<a.length; i++){
            if(p.peek()<a[i]){
                p.poll();
                p.add(a[i]);
            }
        }
        return p.peek();
    }
    public static void main(String[] args) {
        int a[]={4,7,1,9,5,6,3};
        System.out.print(kth_largest_elem(a,2));
    }
}
