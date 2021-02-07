package datastructures;
public class Link {
    
    static class Node{
        int Data;
        Node next;

    }
    static Node head;
    static void insert(int data){
        Node n= new Node();
        n.Data=data;
        n.next=null;
        if(head==null){
            head=n;
        }
        else{
            Node n1= head;
            while(n1.next!=null){
                n1=n1.next;
            }
            n1.next= n;
        }
    }
    static void delete(){
     //   Node n1= new Node();
        if(head==null){
            System.out.println("No elements left to remove");
            return;
        }
        else{
            Node n1= head;
            while((n1.next).next!=null){
                n1=n1.next;
            }
            System.out.println("This is the element deleted "+(n1.next).Data);
            n1.next= null;

        }
    }
    static void show(){
        Node n2=head;
            do{
                System.out.println(n2.Data);
                n2=n2.next;
            }while(n2.next!=null);
            System.out.println(n2.Data);
    }
    public static void main(String[] args){
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        show();
        delete();
        show();
    }
}
