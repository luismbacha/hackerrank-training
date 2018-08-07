// https://www.hackerrank.com/challenges/java-anagrams/problem

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        Map<String, Integer> aMap = new HashMap<String, Integer>();
        Map<String, Integer> bMap = new HashMap<String, Integer>();
        for(int i = 0; i < a.length(); i++) {
            String key = a.substring(i, i+1).toUpperCase();
            if(aMap.containsKey(key)) aMap.put(key, aMap.get(key) + 1);
            else aMap.put(key, 1);
        }
        for(int i = 0; i < b.length(); i++) {
            String key = b.substring(i, i+1).toUpperCase();
            if(bMap.containsKey(key)) bMap.put(key, bMap.get(key) + 1);
            else bMap.put(key, 1);
        }
        for(String key : aMap.keySet()) {
            if(!bMap.containsKey(key)) return false;
            if(aMap.get(key) != bMap.get(key)) return false;
        }
        return true;
    }