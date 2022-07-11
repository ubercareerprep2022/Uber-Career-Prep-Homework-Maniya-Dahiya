/**
 * Iterative
 */
public ListNode reverseLinkedList(ListNode head) {
    ListNode curr = head;
    ListNode prev = null;
    while (curr!=null){
        ListNode nxt = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nxt;
    }
    return curr;
    
}

/**
 * Stack
 */
public ListNode reverseLinkedList(ListNode head) {
    Stack<ListNode> st = new Stack();
    ListNode l = new ListNode(0);
    ListNode temp = l;
    while(head != null){
        st.push(head);
        head = head.next;
    }
    while(!st.isEmpty()){
        temp.next = st.pop();
        temp = temp.next;
    }
    temp.next = null;
    return l.next;
}


/**
 * Recursion
 */
public ListNode reverseLinkedList(ListNode head) {
    return reverse(head, null);
}

private ListNode reverse(ListNode cur, ListNode next) {
    if (cur==null) return next;
    
    ListNode tmp= cur.next;
    cur.next= next;
    return reverse(tmp, cur);
}