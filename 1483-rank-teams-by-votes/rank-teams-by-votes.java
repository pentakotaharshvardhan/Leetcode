class Solution {
    public String rankTeams(String[] votes) {
        String ans = "";
        HashMap<Character, int[]> hm = new HashMap<>();
        
        for (int i = 0; i < votes[0].length(); i++) {
            hm.put(votes[0].charAt(i), new int[votes[0].length()]);
        }

        for (String str : votes) {
            for (int i = 0; i < str.length(); i++) {
                int[] ranks = hm.get(str.charAt(i));
                ranks[i]++;
            }
        }

        PriorityQueue<Character> pr = new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                int[] rankA = hm.get(a);
                int[] rankB = hm.get(b);

                for (int i = 0; i < rankA.length; i++) {
                    if (rankA[i] != rankB[i]) {
                        return rankB[i] - rankA[i]; 
                    }
                }
                return a.compareTo(b); // If ranks are equal, sort alphabetically
            }
        });

        for (int i = 0; i < votes[0].length(); i++) {
            pr.add(votes[0].charAt(i));
        }

        while (!pr.isEmpty()) {
            ans += pr.poll();
        }

        return ans;
    }
}
