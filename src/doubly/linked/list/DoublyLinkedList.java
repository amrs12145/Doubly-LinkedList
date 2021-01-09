



package doubly.linked.list;



class Node
{
    public int data;
    public Node next,prev;
    
    Node( int data , Node next , Node prev )
    {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

}


public class DoublyLinkedList
{
    Node Head = null;
    Node Tail = null;
    public int length=0;
    //DoublyLinkedList() { Head = Tail = null; }
    
    public void insertFirst( int data )
    {
        if( isEmpty() )
        {
            Node n = new Node( data , null , null );
            Head = Tail = n;
            length++;
            //n.next = n.prev = null;
        }
        else
        {
            Node n = new Node(data, Head , null);
            Head.prev = n;
            Head = n;
            length++;
        }
    }
    
    public void insertLast( int data )
    {
        if( isEmpty() )
        {
            Node n = new Node( data , null , null );
            Head = Tail = n;
            length++;
        }
        else
        {
            Node n = new Node( data, null , Tail );
            Tail.next = n;
            Tail = n;
            length++;
        }
    }
    
    public void insertAt( int pos , int data )
    {
        if( pos < 0 || pos > length )
        {
            System.out.println("Cannot inerst => Failed Location");
        }
        else if ( pos == 0 )
        {
            insertFirst(data);
        }
        else if ( pos == length  )
        {
            insertLast(data);
        }
        else
        {
            Node ptr = Head;
            for (int i = 0; i < pos-1; i++)
            {
                ptr = ptr.next;
            }
            
            Node n = new Node( data, ptr.next , ptr );
            n.next.prev =n;
            n.prev.next = n;
            
            length++;
            
        }
    }

    
    
    public void removeFirst()
    {
        Head = Head.next;
        Head.prev= null;
        length--;
    }
    public void removeLast()
    {
        Tail = Tail.prev;
        Tail.next = null;
        length--;
    }
    public void removeAt( int pos )
    {
        if( pos < 0 || pos >= length )
        {
            System.out.println("Cannot Remove => Failed Location");
        }
        else if ( pos == 0 )
        {
            removeFirst();
        }
        else if ( pos == length-1  )   /** Be Careful Removing pos cannot be =length , while Adding can *******/ 
        {
            removeLast();
        }
        else
        {
            Node ptr = Head;
            for (int i = 0; i < pos-1 ; i++)
            {
                ptr = ptr.next;
            }

            ptr.next = ptr.next.next;
            ptr.next.prev = ptr;
            
            length--;
        }

    }
    
    
    

    public void print()
    {
        Node ptr = Head;
        while ( ptr!=null )
        {
            System.out.print( ptr.data + " => ");
            ptr = ptr.next;
        }
        
    }
    public void printReverse()
    {
        Node ptr = Tail;
        while ( ptr!=null )
        {
            System.out.print( ptr.data + " => ");
            ptr = ptr.prev;
        }
    }
    
    
    
    
    public boolean isEmpty()
    {
        return Head==null && Tail == null;
    }
    public boolean checkEmpty()
    {
        return length==0 && Head==null && Tail == null;
    }
    
}
