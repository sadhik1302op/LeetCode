class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int keys:map.keySet()){
            if(map.get(keys)>nums.length/3){
                list.add(keys);
            }
        }
        return list;
    }
}