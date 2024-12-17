class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry, return early
            }
            // Set current digit to 0 and continue for carry
            digits[i] = 0;
        }

        // If we exit the loop, all digits were 9, e.g., 999 -> 1000
        int[] result = new int[n + 1];
        result[0] = 1; // The new leading 1
        return result;
    }
}
