
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            String freqString = frequencyBuilder(s);

            if (map.containsKey(freqString)) {
                map.get(freqString).add(s);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(s);
                map.put(freqString, strList);
            }
        }

        return new ArrayList<>(map.values());
    }

    public String frequencyBuilder(String str) {
        int[] freq = new int[26];

        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder freqString = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            freqString.append((char) ('a' + i));
            freqString.append(freq[i]);
        }

        return freqString.toString();
    }
}