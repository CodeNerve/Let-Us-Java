package sorting;

public class QuickSort  {  
    /* Considering last element as pivot, this function 
place the pivot at its exact position, and place  
smaller elements to left of pivot and greater  
elements to right of pivot.  */  
int partition (int a[], int start, int end)  
{  
    int pivot = a[end]; // pivot  
    int i = (start - 1);  
  
    for (int j = start; j <= end - 1; j++)  
    {  
        // current element is smaller than the pivot  
        if (a[j] < pivot)  
        {  
            i++; // increment index of smaller element  
            int t = a[i];  
            a[i] = a[j];  
            a[j] = t;  
        }  
    }  
    int t = a[i+1];  
    a[i+1] = a[end];  
    a[end] = t;  
    return (i + 1);  
}  
  
/* quick sort */  
void quick(int a[], int start, int end) /* a[] = array to be sorted, start = starting index, end = ending index */  
{  
    if (start < end)  
    {  
        int p = partition(a, start, end);  // p = partitioning index  
        quick(a, start, p - 1);  
        quick(a, p + 1, end);  
    }  
}  
  
/* function to print an array */  
void printArr(int a[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        System.out.print(a[i] + " ");  
}  
    public static void main(String[] args) {  
    int a[] = { 13, 18, 27, 2, 19, 25 };  
    int n = a.length;  
    System.out.println("\nBefore sorting array elements are - ");  
    QuickSort q1 = new QuickSort();  
    q1.printArr(a, n);  
    q1.quick(a, 0, n - 1);  
    System.out.println("\nAfter sorting array elements are - ");  
    q1.printArr(a, n);  
    System.out.println();  
    }  
}  