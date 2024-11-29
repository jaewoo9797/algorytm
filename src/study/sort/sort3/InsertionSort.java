package study.sort.sort3;

public class InsertionSort {
    private static final int[] INPUT_ARRAY = {1, 2, 3, 2, 6, 2, 3, 5, 7};
    private static final int CACHE_LENGTH = 5;


    public static void main(String[] args) {
        ResultArray resultArray = new ResultArray(CACHE_LENGTH);
        for (int target : INPUT_ARRAY) {
            var index = resultArray.contain(target);
            resultArray.insertionSort(index,target);
        }
        System.out.println(resultArray);
    }
}
