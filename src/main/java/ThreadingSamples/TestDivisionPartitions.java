package ThreadingSamples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmetatalay on 18/08/16.
 */
public class TestDivisionPartitions {
//    public static final int MAX_NUMBER = 2000000000;
    public static final int MAX_NUMBER = 10;
    public static List<Integer> divisionList = new ArrayList<>();
    public static int amount = 0;
    public static void main(String[] args) {

        int partition = 5;
        int first = 0;
        final int constant_last = MAX_NUMBER/partition;
        int last =MAX_NUMBER/partition;

        for (int k = 0; k<partition; k++){
            System.out.println("k:"+k+".first1: "+first+ " last1: "+ last);
            for (int i = first ; i<last; i++){
//                System.out.println("i:"+i+".first2: "+first+ " last2: "+ last);
                getDivisionList(first,last);
            }
            first = last+1;
            last += constant_last;
//            System.out.println(divisionList);
        }
        System.out.println(amount);

    }
    public static void getDivisionList(int first, int last){
        divisionList = new ArrayList<>();
        for (int i = first; i <= last; i++) {
            if (i % 3 == 0) {
                divisionList.add(i);
                amount++;
            }
        }
    }
}
