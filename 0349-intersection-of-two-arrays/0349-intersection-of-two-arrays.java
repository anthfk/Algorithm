class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> reSet = new HashSet<>();

        for(int i : nums1) {
            set.add(i);
        }

        for(int j : nums2){
            if(set.contains(j)){
                reSet.add(j);
            }
        }

        //Collections.sort(reSet);

        int[] result = new int[reSet.size()];
        int i = 0;
        for(int num : reSet){
            result[i++] = num;
        }

        return result;
    }
}