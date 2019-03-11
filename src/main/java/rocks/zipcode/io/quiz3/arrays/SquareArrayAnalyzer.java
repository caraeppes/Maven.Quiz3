package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        List<Integer> inputSquared = new ArrayList<>();
        for (Integer integer : input) {
            inputSquared.add(integer * integer);
        }
        for (Integer integer : squaredValues) {
            if (!inputSquared.contains(integer)) {
                return false;
            }
        }
        return true;
    }
}
