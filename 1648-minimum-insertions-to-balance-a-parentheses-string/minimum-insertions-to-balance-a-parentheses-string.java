    class Solution {
        public int minInsertions(String s) {
            int open =0;
            int close =0;
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch== '(') open++;
                else{
                    if(i+1 < s.length() && s.charAt(i+1)==')'){
                        i++;
                    }
                    else close++;
                    if(open > 0)open--;
                    else close++;
                }

            }
            close += open *2;
            return close;
        }
    }