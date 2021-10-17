/**
 * @Author - Sagiv Reich
 *
 * Description - The task is to write a general class of a duplicate list
 * in units with an iteration, and a general
 * class of a duplicate listing in a unit with an iteration that you inherited
 * from a class of your only generic double list
 */

package doublelinkedlist;

import java.util.Iterator;

public class SortedDoubleLinkedList<T> extends BasicDoubleLinkedList<T>
{
    @Override
    public void addToFront(T data)
  {
       throw new UnsupportedOperationException();

  }
    
    @Override
    public void addToEnd(T data)
  {
       throw new UnsupportedOperationException();
  }
    
    @Override
    public T remove(T targetData, ComparatorImplementation comparator){
        return super.remove(targetData, comparator);
    }
    
    @Override
      public Iterator<T> iterator()
    {
              return super.iterator();
    }
     public void add(T data1,ComparatorImplementation comparator)
  {
       
        Node temp=head;
        if(size!=0)
        {
                while(temp.next!=null)
             {
                
                  if (comparator.compare(temp.data, data1) < 0) 
                   {
                       break;
                   }
                  else
                  {
                      temp=temp.next;
                  }
             }  
        }
       
                if (temp == head) 
                {
                    Node newNode=new Node();
                    newNode.data=data1;
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
                else if(temp == tail)
                {
                    if(size!=0)
                    {
                          if (comparator.compare(temp.data, data1) < 0) 
                          {
                                Node newNode=new Node();
                                newNode.data=data1;
                                newNode.next=temp;
                                newNode.prev=temp.prev;
                                temp.prev.next=newNode;
                                temp.prev=newNode;
                                size++;
                          }
                          else
                          {
                                Node newNode=new Node();
                                newNode.data=data1;
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
                    }
                    else
                    {
                    Node newNode=new Node();
                    newNode.data=data1;
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
                   
                }
                else
                {
                    Node newNode=new Node();
                    newNode.data=data1;
                    newNode.next=temp;
                    newNode.prev=temp.prev;
                    temp.prev.next=newNode;
                    temp.prev=newNode;
                    size++;
                   
                }
  }
    
}
