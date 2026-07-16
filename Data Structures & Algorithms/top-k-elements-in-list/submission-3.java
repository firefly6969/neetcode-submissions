class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numsfreqmap = new HashMap<>();
        for(int i : nums){
            numsfreqmap.put(i, numsfreqmap.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer, Integer>> numsfreqlist = new ArrayList<>(numsfreqmap.entrySet());
        numsfreqlist.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());
        int[] result = new int[k];
        for(int i=0 ; i<k;i++){
            result[i] = numsfreqlist.get(i).getKey();
        }
        return result;
    }
}
