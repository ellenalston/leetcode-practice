class Solution {
    public int romanToInt(String s) {

        // Mapping of Roman numerals to their values
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Go through string in reverse
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanValues.get(currentChar);

            // If the current value is less than the previous one, subtract it
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                // Otherwise, add it
                total += currentValue;
            }

            // Update previous value
            prevValue = currentValue;
        }

        return total;
    }
}