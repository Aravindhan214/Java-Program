//Find Middle Element in Java LinkedList
class Main{
    class Node{
        int v;
        Node n;
       Node(int v) {
        this.v=v;
       }
        Node(int v,Node n){
            this.v=v;
            this.n=n;
        }

       }
       Node head;
       public void first(int v){
        head=new Node(v,head);
       } 
       Node tail;
       public void last(int v,Node n){
        tail=new Node(v,n);
        if(head==null){
            head=tail;
        }
        Node temp=head;
        while(temp.n!=null){
            temp=temp.n;
        }
        temp.n=tail;
       }
       void dis(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.v+" ");
       temp=temp.n; 
    }
       System.out.println("ended");
    }
    void middle(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node slow=head;
        Node fast=head;
        while(fast !=null && fast.n!=null){
            slow=slow.n;
            fast=fast.n.n;

        }
        System.out.println("The middle element : "+slow.v);
    }
    public static void main(String[] args) {
        help add=new help();
        add.first(10);
        add.first(20);
        add.first(30);
        add.first(40);
        add.first(50);
               
        add.dis();
        add.middle();
    }
    }
