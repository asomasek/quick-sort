import java.util.*;

class Node {
    int     Val;

    Node (int   Value)
    {
        this.Val = Value;
        return;
    }
}

public class QuickSort {
    
    public static int SortFunction (ArrayList<Integer>  arr, int start, int end)
    {
        int pi;

        if (start < end)
        {
            pi = partition (arr, start, end);

            SortFunction (arr, start, pi-1);
            SortFunction (arr, pi+1, end);
        }

        return 1;
    }

    public static int partition (ArrayList<Integer> arr, int start, int end)
    {
        int i, j, pivot, temp;

        i = j = 0;
        pivot = arr.get(end);
        for (; j < end; j++)
        {
            if (arr.get(j) < pivot)
            {
                temp = arr.get(j);
                arr.set (j, arr.get(i));
                arr.set (i, temp);
                i++;
            }
        }
        arr.set (end, arr.get(i));
        arr.set (i, pivot);

        return i;    /* return pointer to partition node */
    }

    public static void main (String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add (10);
        arr.add (45);
        arr.add (9);
        arr.add (8);
        arr.add (7);
        arr.add (6);
        arr.add (5);

        System.out.println (arr);
        System.out.println (arr.size());

        SortFunction (arr, 0,  arr.size() - 1);

        System.out.println (arr);
        System.out.println (arr.size());
    }
}