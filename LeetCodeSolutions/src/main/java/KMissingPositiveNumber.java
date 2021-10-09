public class KMissingPositiveNumber {
    public static void main(String[] args) {
        //Leetcode default code....
    }

        public int findKthPositive(int[] arr, int k) {

            int missing = 0;
            int j = 1;
            int i = 0;
            while(i<arr.length)
            {
                if(arr[i]==j)
                {
                    i++;
                }
                else
                { missing++;
                    if(missing==k)
                    {
                        return j;
                    }
                }
                j++;
            }
            return arr[arr.length-1]+(k-missing);

        }
    }

