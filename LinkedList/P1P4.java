package MPushkar.LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class P1P4 {
    private Node head ;
    public void add(int data){
        Node newNode= new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public Node  addFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head=newNode;
        return head;
    }
    public Node remove(int val){
        Node curr= head;
        //delete Front node
        if(curr.data == val) {
            head=head.next;
            return head;
        }

        while(curr.next.data!=val){
            curr=curr.next;
        }

        Node tmp=curr.next;
        curr.next=tmp.next;
        return head;
    }

    public void iterateNode(){

        Node curr= head;
        while(curr!=null){
            System.out.print(curr.data +"->");
            curr=curr.next;
        }
        System.out.print("null");
        System.out.println(" ");


    }
    public Node list(){
        return head;
    }
    public static boolean P4(Node l1,Node l2){
        boolean res= false;

        if(l1==null||l2==null)
            return res;

        while(l1!=null && l2!=null){
            if(l1.data!=l2.data)
                return res;
            l1=l1.next;
            l2=l2.next;

        }
        return l1==null && l2==null;
    }


    public static void main(String[] args) {
        P1P4 linkedList1= new P1P4();
        linkedList1.add(5);
        linkedList1.add(6);
        linkedList1.add(7);
        linkedList1.add(10);
        linkedList1.iterateNode();
     //   linkedList1.remove(5);
      //  linkedList1.iterateNode();
          linkedList1.list();

        P1P4 linkedList2= new P1P4();
        linkedList2.add(5);
        linkedList2.add(6);
        linkedList2.add(7);
        linkedList2.add(8);
        linkedList2.iterateNode();
        System.out.println( "Two list are same return true or return false"+  P4( linkedList1.list(), linkedList2.list()));



    }



}
