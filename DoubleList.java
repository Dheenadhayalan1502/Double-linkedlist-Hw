
package doublelist;


public class DoubleList 
{

    
    public static void main(String[] args) 
    {
        
{
    
        DoubleLinked dll = new DoubleLinked();

        
        dll.insertAtBeginning(20);
        dll.insertAtBeginning(10);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);

          System.out.println("Forward Display:");
        dll.displayForward();

        System.out.println("\nBackward Display:");
        dll.displayBackward();

        
        dll.deleteFromBeginning();
        System.out.println("\nAfter Deleting from Beginning:");
        dll.displayForward();

        
        dll.deleteFromEnd();
        System.out.println("\nAfter Deleting from End:");
        dll.displayForward();
    }
    
}

        
    }
    

