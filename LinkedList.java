public class LinkedList{

    public static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
} 
public static Node head;
public static Node tail;
public static int size;

//Method add()
public void addFirst(int data){ //O(1)
    //step1=create new Node
    Node newNode= new Node(data);
    size++;
    if(head==null){
        head = tail = newNode;
        return;
    }
    
    //step2=newNode next =head
    newNode.next=head; //link

    //step3 - head =newNode
     head = newNode;
}

public void addLast(int data){  //O(1)
    //step1 - create a new Node
    Node newNode = new Node(data);
    size++;
    if(head==null){
        head = tail = newNode;
        return;
    }
    //step2  
    tail.next = newNode;
    //step 3
    tail = newNode;
}

//print a  LL

public void printL(){
    if(head ==null){
        System.out.println("LL is empty");
        return;
    }
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println("null");
}

//ADD in middle 0(n)

public void addMid(int data,int idx){
    if(idx==0){
        addFirst(data);
        return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp=head;
    int i=0;
    while(i<idx-1){
        temp=temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
}

//remove First

public int removeFirst(){
    if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }else if(size==1){
        int val = head.data;
        head = tail=null;
        size=0;
        return val;
    }
    int val = head.data;
    head=head.next;
    size--;
    return val;
}

//remove Last

public int removeLast(){
    if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }else if(size==1){
        int val = head.data;
        head = tail=null;
        size=0;
        return val;
    }

    //prev : i= size-2
    Node prev = head;
    for(int i=0;i<size-2;i++){
        prev= prev.next;
    }

    int val = prev.next.data;//tail.data
    prev.next=null;
    tail=prev;
    size--;
    return val;
}

//Search(iterative)

public int itrSearch(int key){ //0(n)
    int i=0;
    Node temp=head;
    while(temp!=null){
        if(temp.data==key){
            return i;
    }
        temp=temp.next;
        i++;
        
}
    return -1;
}

// rec Approach
public int helper(Node head,int key){ // 0(n) 
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int idx=helper(head.next, key);
    if(idx==-1){
        return -1;
    }
    return idx+1;
}
public int recSearch(int key){
    return helper(head,key);
}

// reverse // iterative approach

public void itrReverse(){  //0(n)
    Node prev = null;
    Node curr= tail = head;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
}


//find and remove nth approach from end

public void deleteNthFromEnd(int n){
    //calculate size
    int size=0;
    Node temp = head;
    while(temp!=null){
        temp=temp.next;
        size++;
    }
     if(n==size){
        head = head.next; //removeFirst
        return;
     }

     //size-n

     int i=1;
     int iToFind = size-n;
     Node prev = head;
     while(i<iToFind){
        prev = prev.next;
        i++;
     }
     prev.next=prev.next.next;
     return ; 
}

//  chekc if LL is palindrome 
//1. Find mid
//SLow fast approach

public Node findMid(Node head){
    Node slow = head;
    Node fast = head;

    while(fast!=null && fast.next !=null){
        slow = slow.next; //+1
        fast = fast.next.next; //+2
    }
    return slow;
}
public boolean checkPalindrome(){
    if(head==null || head.next==null){
        return true;
    }
    //step1 - find mid
    Node midNode = findMid(head);

    //step 2 - reverse 2nd half
    Node prev =null;
    Node curr = midNode;
    Node next;
    while(curr!=null){
        next= curr.next;
        curr.next=prev;
        prev = curr;
        curr = next;
    }
    Node right = prev; // right half head
    Node left = head;

    //step 3 = check left half & right half

    while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        left = left.next;
        right = right.next;
    }
    return true;
}
    public static void main(String args[]){
        LinkedList ll= new LinkedList();

        // ll.head=new Node(1);
        // ll.head.next=new Node(2);

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMid(3,2);
        ll.printL();
        // System.out.println(ll.removeFirst());
        // System.out.println(ll.removeLast());
        //ll.printL();

        //System.out.println(ll.size);
        // System.out.println(ll.itrSearch(4));
        //System.out.println(ll.recSearch(4));

        ll.itrReverse();
        //ll.deleteNthFromEnd(3);
        ll.printL();

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.printL();
        // System.out.println(ll.checkPalindrome());
    }
}

