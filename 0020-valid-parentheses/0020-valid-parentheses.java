class Solution {
    public boolean isValid(String s) {
      char[] parentheses = new char[s.length()];

      int first = -1;

      for(char c : s.toCharArray()){
        if (c == '(' || c == '[' || c == '{'){
            parentheses[++first] = c;
        } else {
        
        if (first == -1){
            return false;
        }
        char last = parentheses[first];
        if ((c == ')' && last != '(') ||
            (c == '}' && last != '{') ||
            (c == ']' && last != '[')){
                return false;
              }
              first--;
        }
      }

        return first == -1;
      
    }
}