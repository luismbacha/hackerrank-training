// https://www.hackerrank.com/challenges/java-hashset/problem

        HashSet<String> pairs = new HashSet<String>();
        for(int i = 0; i < t; i++) {
            pairs.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(pairs.size());
        }