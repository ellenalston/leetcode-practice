class Solution {
    // Define a method to merge two sorted linked lists into one sorted linked list
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to serve as the start of the merged list. This simplifies
        // handling edge cases.
        ListNode dummy = new ListNode(-1);

        // Use a 'current' pointer to keep track of the end of the merged list
        ListNode current = dummy;

        // Traverse both lists until we reach the end of one
        while (list1 != null && list2 != null) {
            // Compare the values of the current nodes of list1 and list2
            if (list1.val <= list2.val) {
                // If list1's value is smaller or equal, attach list1's node to the merged list
                current.next = list1;

                // Move to the next node in list1
                list1 = list1.next;
            } else {
                // Otherwise, attach list2's node to the merged list
                current.next = list2;

                // Move to the next node in list2
                list2 = list2.next;
            }

            // Move the 'current' pointer to the end of the merged list
            current = current.next;
        }

        // At this point, one of the lists is exhausted (list1 or list2 is null)
        // If list1 still has remaining nodes, attach them to the merged list
        if (list1 != null) {
            current.next = list1;
        } else {
            // If list2 still has remaining nodes, attach them to the merged list
            current.next = list2;
        }

        // Return the merged list, skipping the dummy node at the start
        return dummy.next;
    }
}
