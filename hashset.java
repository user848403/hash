import java.util.*;
import java.util.Iterator;
public class hashset {
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();  //creation
        //insertion
         set.add(1);
         set.add(2);
         set.add(3);
         set.add(4);
        System.out.println(set); //print all elements
        //size
        System.out.println("size of input set is:"+set.size());

        //search:contains
         if(set.contains(4)){  //use other numbers to test for no
             System.out.println("yes the number exists");
         }else {
             System.out.println("no");
         }

         //delete
         set.remove(1);
         if(!set.contains(1)){
             System.out.println("deleted defined value"); //check if deleted
         }
         System.out.println(set); //print set with deleted number

        // size
        System.out.println("now the size of set is:"+set.size());

        //iterator
        Iterator it= set.iterator();
       // it.next(); gives next value in set
       // it.hasNext(); gives true or false based on existence of next value
         while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
/* OUTPUT:
[1, 2, 3, 4]
size of input set is:4
yes the number exists
deleted defined value
[2, 3, 4]
now the size of set is:3
2
3
4

Process finished with exit code 0

 */