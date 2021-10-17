/**
 * @Author - Sagiv Reich
 *
 * Description - The task is to write a general class of a duplicate list
 * in units with an iteration, and a general
 * class of a duplicate listing in a unit with an iteration that you inherited
 * from a class of your only generic double list
 */


package doublelinkedlist;
public class SortedDoubleLinkedListDriver {
     public static void main(String[] args)
    {
        SortedDoubleLinkedList<Integer> myList = new SortedDoubleLinkedList<>();
      ComparatorImplementation<Integer> comparator=new ComparatorImplementation<>();
         myList.add(1,comparator);
         myList.add(3,comparator);
         myList.add(10,comparator);
         myList.add(2,comparator);
         myList.add(4,comparator);
         myList.add(6,comparator);
         myList.add(9,comparator);
         myList.add(7,comparator);
         myList.add(12,comparator);
         myList.add(11,comparator);
       
        for (Integer string : myList)
            { 
                System.out.println(string);
            }
       
//           myList.addToEnd(5);
//           myList.addToFront(6);
             System.out.println();
             System.out.println(myList.remove(7, comparator)+" has been removed from  the list");
               System.out.println();
                      System.out.println("Updated List is \n");
           for (Integer string : myList)
            { 
                System.out.println(string);
            }
        System.out.println(myList.getSize()+ " is the size of list ");
    }
    
}
