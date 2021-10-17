/**
 * @Author - Sagiv Reich
 *
 * Description - The task is to write a general class of a duplicate list
 * in units with an iteration, and a general
 * class of a duplicate listing in a unit with an iteration that you inherited
 * from a class of your only generic double list
 */

package doublelinkedlist;

import java.util.ArrayList;

import java.util.Iterator;

public class BasicDoubleLinkedList<T> implements  Iterable<T>   {
  public class Node{
      T data;
      Node next;
      Node prev;
     
  }
  protected int size;
  protected Node head;
  protected Node tail;
  protected T value;
 
  public void addToFront(T data)
  {
      Node newNode=new Node();
      newNode.data=data;
      newNode.next=head;
      newNode.prev=null;
      
      if(head!=null)
      {
          head.prev=newNode;
      }
      head=newNode;
      if(tail==null)
      {
          tail=newNode;
      }
      size++;
  }
  
   public void addToEnd(T data)
  {
      Node newNode=new Node();
      newNode.data=data;
      newNode.next=null;
      newNode.prev=tail;
      
      if(tail!=null)
      {
          tail.next=newNode;
      }
      tail=newNode;
      if(head==null)
      {
          head=newNode;
      }
      size++;
  }
  
  public T getFirst()
  {
     
      if(size!=0)
      {
      return head.data;
      }
      else
      {
          return null;
      }
  }
  
  public T getLast()
  {
      if(size!=0)
      {
      return tail.data;
      }
      else
      {
          return null;
      }
  }
  
  public int getSize()
  {
      return size;
  }
  
  
  public T retrieveFirstElement()
  {
      
      if(size==0){
          return null;
      }
      else{
      Node temp=head;
      head=head.next;
      head.prev=null;
      size--;
      return temp.data;
      }
  }
  
  public T retrieveLastElement()
  {
    if(size==0)
      {
          return null;
      }
      else
      {
        Node temp=tail;
        tail=tail.prev;
        tail.next=null;
        size--;
        return temp.data;
      }
  }
  public ArrayList<T> toArrayList()
  {
     ArrayList<T> arraylist=new ArrayList<>();
     Node temp=head;
     if(temp!=null){
         while(temp.next!=null){
         arraylist.add(temp.data);
         temp=temp.next;
     }
     return arraylist;
     }
     else{
         return null;
     }
     
  }
  public T remove(T targetData, ComparatorImplementation comparator)
  {
        Node temp=head;
        while(temp.next!=null)
        {
         if (comparator.compare(temp.data, targetData) == 0) 
         {
            
                if (temp == head) 
                {
                    Node temp1=head;
                    head=head.next;
                    head.prev=null;
                    size--;
                    return temp1.data;
                }
                else if(temp == tail)
                {
                   
                    Node temp1=tail;
                    tail=tail.prev;
                    tail.next=null;
                    size--;
                    return temp1.data;


                }
                else
                {
                    Node temp1=temp;
                    temp.prev.next=temp.next;
                    temp.next.prev=temp.prev;
                    size--;
                    return temp1.data;
                }
       
         } 
         else
         {
              temp=temp.next;
         }  
            
       }
        return null;
    
  }
  
  @Override
    public Iterator<T> iterator()
    {
         return new ListIterator(head,tail);
    }
 public class ListIterator implements Iterator<T> {
      Node head1,tail1;
      
      public ListIterator(Node head,Node tail){
               head1=head;
               tail1=tail;
      }
      
      @Override
    public boolean hasNext() {
        return head1 !=null;
    }
      
   
      @Override
    public T next() {
        Node temp=head1;
        head1=head1.next;
        return temp.data;
    }
    
     public boolean hasPrevious() {
        return tail1 !=null;
    }
      
   
    public T Previous() {
        Node temp=tail1;
        tail1=tail1.next;
        return temp.data;
    }
     public void remove()
    {
        throw new UnsupportedOperationException();
    }
};

};
  
