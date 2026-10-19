class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int num : map.keySet()) {
            int frequency = map.get(num);
            buckets[frequency].add(num);
        }

        List<Integer> resultList = new ArrayList<>(k);
        for (int i = buckets.length - 1; i >= 1 && resultList.size() < k; i--) {
            if (buckets[i].isEmpty()) {
                continue;
            }
            for (int num : buckets[i]) {
                resultList.add(num);
                if (resultList.size() == k) {
                    return resultList.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
