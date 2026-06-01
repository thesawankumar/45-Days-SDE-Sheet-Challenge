import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        // using recursion

        // base case
        if (numRows == 0) {
            return new ArrayList<>();
        }

        if (numRows == 1) {
            // return only [[1]]
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(1));
            return result;

        }

        // recursive
        List<List<Integer>> prevs = generate(numRows - 1);

        // curr row

        List<Integer> curr = new ArrayList<>();

        // fill the all row with 1

        for (int i = 0; i < numRows; i++) {
            curr.add(1);

        }

        List<Integer> prev = prevs.get(numRows - 2);

        // calcualte middle
        for (int i = 1; i < numRows - 1; i++) {
            int value = prev.get(i - 1) + prev.get(i);
            curr.set(i, value);
        }

        prevs.add(curr);
        return prevs;
    }
}