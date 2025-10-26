class Solution {
    public String lexSmallest(String s) {
        String minString = s;
        int n = s.length();

        for (int k = 1; k <= n; k++) {
            // Reverse first k
            String firstRev = new StringBuilder(s.substring(0, k)).reverse().toString() + s.substring(k);
            if (firstRev.compareTo(minString) < 0)
                minString = firstRev;

            // Reverse last k
            String lastRev = s.substring(0, n - k) + new StringBuilder(s.substring(n - k)).reverse().toString();
            if (lastRev.compareTo(minString) < 0)
                minString = lastRev;
        }

        return minString;
    }
}