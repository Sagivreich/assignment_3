/**
 * @Author - Sagiv Reich
 *
 * Description - The task is to write a general class of a duplicate list
 * in units with an iteration, and a general
 * class of a duplicate listing in a unit with an iteration that you inherited
 * from a class of your only generic double list
 */


package doublelinkedlist;


public class BasicDoubleLinkedListDriver{

    public static void main(String[] args)
    {
        BasicDoubleLinkedList<String> myList = new BasicDoubleLinkedList<>();
        
         myList.addToEnd("abc");
         myList.addToEnd("mno");
         myList.addToEnd("pqr");
         myList.addToEnd("xyz");
         
         myList.addToFront("ABCD");
        for (String string : myList)
            { 
                System.out.println(string);
            }
       
        String a=myList.getFirst();
        System.out.println(a+ " is the first Element ");
        
        String b=myList.getLast();
        System.out.println(b+ " is the last Element ");
        
        System.out.println(myList.getSize()+ " is the size of list ");
        
        ComparatorImplementation<Integer> obj=new ComparatorImplementation<>();
       
        
//       String first = myList.retrieveFirstElement();
//        System.out.println(first+ " is the being deleted ");
//         
//           for (String string : myList)
//            { 
//                System.out.println(string);
//            }
//           
//            String last = myList.retrieveLastElement();
//         System.out.println(last+ " is the being deleted ");
//         
//           for (String string : myList)
//            { 
//                System.out.println(string);
//            }
//           
//           System.out.println(myList.getSize()+ " is the size of list ");
            
             String removed = myList.remove("pqr", obj);
         
           for (String string : myList)
            { 
                System.out.println(string);
            }
            System.out.println(removed+" has been removed from  the list" );
           System.out.println(myList.getSize()+ " is the size of list ");
           
    }
}
