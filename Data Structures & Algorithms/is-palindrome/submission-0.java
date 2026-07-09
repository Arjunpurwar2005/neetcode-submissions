class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();

        if (s.length()==0||s.length()==1){
            return true;
        }
        else{
            s=s.toLowerCase();
            s = s.replaceAll("[^a-zA-Z0-9]", "");
            
            int i =0;

            int j= s.length()-1;
            while(i<=j){
                if(s.charAt(i)==s.charAt(j)){
                    i++;
                    j--;

                }
                else{
                    return false;
                }
                
            }
            return true;

        }
    }
}