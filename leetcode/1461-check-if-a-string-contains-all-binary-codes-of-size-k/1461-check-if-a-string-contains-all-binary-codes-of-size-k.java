class Solution {
    public boolean hasAllCodes(String s, int k) {
        int need = 1 << k;
        boolean[] seen = new boolean[need];
        int allOnes = need - 1;
        int hash = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            // 왼쪽으로 밀고, 새 비트를 더함
            hash = ((hash << 1) & allOnes) | (s.charAt(i) - '0');
            
            // k길이 이상부터 체크
            if (i >= k - 1 && !seen[hash]) {
                seen[hash] = true;
                count++;
                if (count == need) return true;
            }
        }

        return false;
    }
}
