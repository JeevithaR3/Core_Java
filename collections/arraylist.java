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
