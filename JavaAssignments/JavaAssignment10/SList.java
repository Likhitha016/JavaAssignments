package JavaAssignment10;
//this class acts similar to single linked list
 class SList {
    Link head=null;
    //creates SListIterator instance
    public SListIterator iterator(){
        return new SListIterator(this);
    }
    //prints the linked list
    public String toString(SListIterator s){
        Link temp=s.head;
        StringBuilder sb=new StringBuilder();
        while(temp!=null){
            sb.append(temp.data);
            sb.append("->");
            temp=temp.next;
        }
        return sb.toString();
    }
}
