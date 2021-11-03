import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        int[] array1 = {-4,-1,0,3,10};
        int[] array2 = {-7,-3,2,3,11};

        System.out.println(Arrays.toString(solution.sortedSquares(array1)));
        System.out.println(Arrays.toString(solution.sortedSquares(array2)));
    }
}
