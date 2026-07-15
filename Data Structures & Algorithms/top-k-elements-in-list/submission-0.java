class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numfreqmap = new HashMap<> ();
        for(int i : nums){
            numfreqmap.put(i, numfreqmap.getOrDefault(i,0) + 1);
        }
        List<Map.Entry<Integer, Integer>> numfreqlist = new ArrayList<>(numfreqmap.entrySet());
        numfreqlist.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());
        int[] result = new int[k];
        for(int i = 0; i<k;i++){
            result[i] = numfreqlist.get(i).getKey();
        }
    return result;
    }
}
