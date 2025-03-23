class Solution {
    public boolean isPalindrome(String s) {
        
        //change all letters to lowercase
        s = s.toLowerCase();
        //create a variable to 
        String palindrome = "";
        
        // loop through the string and only at characters to 
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                palindrome += s.charAt(i);
            }
        }
        //loop through palindrome and reverse it
        String reversed = "";
        for (int i = palindrome.length() - 1; i >= 0; i--){
            reversed += palindrome.charAt(i);
        }
        
        return palindrome.equals(reversed);
        
    }
}