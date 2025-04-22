class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int result = 0;
        Arrays.sort(arr2); 

        for(int num : arr1){
            int low = num + d;
            int high = num - d;

            int pos = lowerBound(arr1, low);

            if(pos < arr2.length && arr2[pos] <= high){
                continue;
            }

            result++;
        }

        return result;

        
    }

    public int lowerBound(int[] arr, int low){
        int min = 0, max = arr.length;
        while(l < r){
            int mid = (l+r)/2;
            if(arr[mid] < low){
                min = mid + 1;
            } else{
                max = mid;
            }
        }

        return min;
    }
}