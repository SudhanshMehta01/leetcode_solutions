class Solution {
    public boolean isAnagram(String s, String goal) {

        char[] arr1 = s.toCharArray();
        char[] arr2 = goal.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length!=arr2.length) return false;
        for(int i=0;i<s.length();i++)
        {
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}