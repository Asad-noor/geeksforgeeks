class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Arrays.sort(arr);
        int took = -1;
        for(int i = 1; i < n; i++) {
            if(arr[i] - arr[i-1] == 0){
                took = arr[i];
            } else if(took > -1) {
                res.add(took); 
                took = -1;
            }
        }
        if(took > -1) {
            res.add(took); 
        }
        if(!res.isEmpty()) {
            //Collections.sort(res);
            return res;
        }
        else
            res.add(-1);
        return res;
    }
}
