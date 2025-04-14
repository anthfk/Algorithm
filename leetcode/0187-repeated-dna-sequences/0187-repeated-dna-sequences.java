class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for(int i=0; i<=s.length()-10; i++){
            String DNA = s.substring(i, i+10);
            map.put(DNA, map.getOrDefault(DNA, 0) + 1);
        }

        for(String key : map.keySet()){
            int value = map.get(key);
            if(value >= 2) list.add(key);
        }

        return list;
    }
}
