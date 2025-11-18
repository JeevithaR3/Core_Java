package collections;
/*reate an array list , add nos from 1 to 10 and remove those numbers which
are greater than 7 */

import java.util.ArrayList;

public class arraylist {
    public static void main(String args[])
    {

    ArrayList<Integer> list=new ArrayList<Integer>();
    for(int i=1;i<=10;i++)
    {
        list.add(i);
    }
    if(list.removeIf(num->num>7))
    {
        System.out.println("Numbers greater than 7 are removed");
    }

    System.out.println("ArrayList after removal: "+list);
}
}

/*to remove elements*/
/*
 * for(int i=0;i<list.size();i++)
    {
        if(list.get(i)>7)
        {
            list.remove(i);
            i--;
        }
    }  //output is 1,2,3,4,5,6,7,9
      why ?
      because when u remove an element the size of the arraylist decreases
      and the elements are shifted to left  (meaning the element which is deleted and in that place ,the next elements will be placed in that index
      as it is dynamic collections)
 */
