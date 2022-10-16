public class Algorithm_Day1_FirstBadVersion {
    public int firstBadVersion(int n) {
        int L = 1;
        int R = n;
        int M;

        while(L<R) {
            M = (L+R)/2;
            /*if(isBadVersion(M)) {
                if(!isBadVersion(M-1)) {
                    return M;
                }
                else {
                    R = M-1;
                }
            }
            else {
                L = M+1;
            }*/
        }
        return L;
    }
}
