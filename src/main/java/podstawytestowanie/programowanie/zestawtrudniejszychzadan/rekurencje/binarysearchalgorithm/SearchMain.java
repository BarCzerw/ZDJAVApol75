package podstawytestowanie.programowanie.zestawtrudniejszychzadan.rekurencje.binarysearchalgorithm;

public class SearchMain {

    public static void main(String[] args) {

        int[] array = new int[]{1, 5, 9, 15, 48, 59, 69, 123, 158, 255};

        System.out.println(binarySearchIncrementally(array, 9));
        System.out.println(binarySearchIncrementally(array, 158));
        System.out.println(binarySearchIncrementally(array, 159));

        System.out.println(binarySearchRecursive(array, 9));
        System.out.println(binarySearchRecursive(array, 158));
        System.out.println(binarySearchRecursive(array, 159));

    }

    private static int binarySearchIncrementally(int[] array, int searchedNumber) {
        int leftBound = 0;
        int rightBound = array.length - 1;

        int currentSearchedIndex;

        while (leftBound <= rightBound) {
            currentSearchedIndex = (rightBound + leftBound) / 2;
            if (searchedNumber < array[currentSearchedIndex]) {
                rightBound = currentSearchedIndex - 1;
            } else if (searchedNumber > array[currentSearchedIndex]) {
                leftBound = currentSearchedIndex + 1;
            } else {
                return currentSearchedIndex;
            }
        }

        return -1;
    }

    private static int binarySearchRecursive(int[] array, int searchedNumber) {
        return binarySearchRecursiveWithBound(array, searchedNumber, 0, array.length - 1);
    }

    private static int binarySearchRecursiveWithBound(int[] array, int searchedNumber, int leftBound, int rightBound) {
        if (leftBound > rightBound) {
            return -1;
        }

        int currentSearchedIndex = (leftBound + rightBound) / 2;

        if (searchedNumber < array[currentSearchedIndex]) {
            return binarySearchRecursiveWithBound(array, searchedNumber, leftBound, currentSearchedIndex - 1);
        } else if (searchedNumber > array[currentSearchedIndex]) {
            return binarySearchRecursiveWithBound(array, searchedNumber, currentSearchedIndex + 1, rightBound);
        } else {
            return currentSearchedIndex;
        }
    }

}
