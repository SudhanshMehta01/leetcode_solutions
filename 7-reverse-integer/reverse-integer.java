class Solution {
    public int reverse(int x) {

        StringBuilder ans = new StringBuilder();

        if(x == 0) return 0;

        if(x < 0)
            ans.insert(0, '-');

        long n = Math.abs((long)x);

        while(n > 0) {
            ans.append(n % 10);
            n = n / 10;
        }

        long ok = Long.parseLong(ans.toString());

        if(ok > Integer.MAX_VALUE || ok < Integer.MIN_VALUE)
            return 0;

        return (int)ok;
    }
}