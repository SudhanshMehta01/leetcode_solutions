class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            //value dedo taki agge sirf a or b likh sake
            char a = s.charAt(i);
            char b = t.charAt(i);


            if (map.containsKey(a)) {
                //sirf unequal h to hi false return karo
                if (map.get(a) != b) {
                    return false;
                }
            } 
            else {
                if (map.containsValue(b)) {
                    return false;
                }

                // is condition ka testcase - s= "badc" , t = " baba"
                //dekh lo dusre wala to nhi ja rha map m kisi or se judne
                map.put(a, b);
            }
        }
        return true;
    }
}