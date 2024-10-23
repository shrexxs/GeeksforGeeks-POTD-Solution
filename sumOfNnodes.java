

class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}


class Solution {


    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        
        Node mainPtr = head;  
        Node refPtr = head;  

         
        for (int i = 0; i < n; i++) {  
            if (refPtr == null) {  
                return 0; // If n is greater than the number of nodes  
            }  
            refPtr = refPtr.next;  
        }  

         
        while (refPtr != null) {  
            mainPtr = mainPtr.next;  
            refPtr = refPtr.next;  
        }  

        int sum = 0;  
        while (mainPtr != null) {  
            sum += mainPtr.data;  
            mainPtr = mainPtr.next;  
        }  

        return sum;
    }
}
