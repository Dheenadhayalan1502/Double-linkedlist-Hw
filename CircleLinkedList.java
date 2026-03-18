
package circlelinkedlist;


public class CircleLinkedList 
{

   
    public static void main(String[] args) 
    {
          CircleList cll = new CircleList();

       
        cll.insertAtBeginning(20);
        cll.insertAtBeginning(10);
        cll.insertAtEnd(30);
        cll.insertAtEnd(40);

        
        System.out.println("Circular Linked List:");
        cll.display();

       
        cll.deleteFromBeginning();
        System.out.println("\nAfter Deleting from Beginning:");
        cll.display();

        
        cll.deleteFromEnd();
        System.out.println("\nAfter Deleting from End:");
        cll.display();
           
}
}
    

