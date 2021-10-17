/**
 * @Author - Sagiv Reich
 *
 * Description - The task is to write a general class of a duplicate list
 * in units with an iteration, and a general
 * class of a duplicate listing in a unit with an iteration that you inherited
 * from a class of your only generic double list
 */

package doublelinkedlist;

import java.util.Comparator;

public class ComparatorImplementation<T extends Comparable<T>> implements Comparator<T>{

        @Override
        public int compare(T o1, T o2) {
          
        
              return o1.compareTo(o2);
           
        }
      
  };
