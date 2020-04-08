package JavaAssignment10;

public class SListIterator {
    SList sList;
    Link head;
    public SListIterator(SList sList) {
        this.sList = sList;
    }
    //inserts elements front of list
    public void insert(int val){
        if(head==null){
            head=new Link(val);
        }
        else{
            Link temp=new Link(val);
            temp.next=head;
            head=temp;
        }
    }
    //removes element at the position with given value
    public void remove(int val){
        Link temp=head;
        Link prev=null;
        //if value is present at head node
        if(temp!=null && temp.data==val){
            head=temp.next;
            return;
        }
        while (temp!=null && temp.data!=val){
            prev=temp;
            temp=temp.next;
        }
        //if value is not present
        if(temp==null) return;
        //removing node by making previous element to point to next of element to be removed
        prev.next=temp.next;
    }
}
