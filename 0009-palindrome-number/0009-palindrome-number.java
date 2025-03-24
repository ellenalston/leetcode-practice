class Solution {
    public boolean isPalindrome(int x) {
        String palindrome = Integer.toString(x);
        String reversed = "";

        for (int i = palindrome.length() - 1; i >= 0; i--){
            reversed += palindrome.charAt(i);
        }

        return palindrome.equals(reversed);

    }
}