 class Node {
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class MyLinkedList {
    Node head;
    public MyLinkedList() {
    }
    
    public int get(int index) {
        Node temp=this.head;
     if(temp==null){
        return -1;
     } 
     for(int i=0;i<index;i++){
        if(temp!=null&&temp.next!=null){
            temp=temp.next;
        }else{
            return -1;
        }
     } 
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node temp=new Node(val);
        temp.next=this.head;
        this.head=temp;
    }
    
    public void addAtTail(int val) {
        Node curr = new Node(val);
        if(this.head==null){
        this.head=curr;
        return;
        }
        Node temp=this.head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=curr;
            }
    
    public void addAtIndex(int index, int val) {
        if (index <= 0) {
        addAtHead(val);
        return;
    }
        Node temp=this.head;
        for(int i=0;i<index-1;i++){
            if(temp==null){
               return;
            }else{
                temp=temp.next;
            }
        }
        if(temp==null)return;
            Node curr=new Node(val);
            curr.next=temp.next;
            temp.next=curr;
    }
    
    public void deleteAtIndex(int index) {
          if (index < 0 || this.head == null) return;
          if(index==0){
            this.head=this.head.next;
            return;
          }
          Node temp=this.head;
        for(int i=1;i<index;i++){
            if(temp==null)return;
            temp=temp.next;
        }
           if (temp == null || temp.next == null) return;
           temp.next = temp.next.next;
            }
         
}



/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */