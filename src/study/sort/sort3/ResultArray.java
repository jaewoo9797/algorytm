package study.sort.sort3;

import java.util.StringJoiner;

public class ResultArray {
    private static final String IMPOSSIBLE_ARRAY_LENGTH_NEGATIVE_NUMBERS = "배열의 길이는 0보다 작을 수 없습니다";

    private final int length;
    private int[] array;

    public ResultArray(int length) {
        validationIndexCountNegative(length);

        this.length = length;
        this.array = new int[length];
    }

    public int contain(int value) {
        int index = -1;
        for (int i = 0; i < length; i++)  {
            if (array[i] == value) {
                index = i;
            }
        }
        return index;
    }

    private void insertionSortAllElement(int newNumber) {
        for (int i = length -1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = newNumber;
    }

    public void insertionSort(int index, int newNumber) {
        if (index == -1) {
            insertionSortAllElement(newNumber);
            return;
        }
        for (int i = index; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = newNumber;
    }

    private void validationIndexCountNegative(int length) {
        if (length < 0) {
            throw new IllegalArgumentException(IMPOSSIBLE_ARRAY_LENGTH_NEGATIVE_NUMBERS);
        }
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(" ");
        for (int x : array) {
            sj.add(String.valueOf(x));
        }
        return sj.toString();
    }
}
