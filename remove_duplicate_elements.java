class Solution {
    int remove_duplicate(int A[],int N){
        int[] res = new int[N];
        res[0] = A[0];
        int k = 1;
        for(int i =1; i < N; i++) {
            if(A[i] - A[i-1] != 0) {
                res[k++] = A[i];
            }
        }
        for(int i = 0; i < k; i++) {
            A[i] = res[i];
        }
        return k;
    }
}
