
public class MergeSort {

    public static void main(String[] args) {
        String str = "gendalf gray";
        String[] toSort = strToStrArray(str);
        sort(toSort);
        System.out.println(collectToStr(toSort));
    }

    private static String[] strToStrArray(String str) {
        String[] array = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = String.valueOf(str.charAt(i));
        }
        return array;
    }

    private static String collectToStr(String[] array) {
        StringBuilder newStr = new StringBuilder();
        for (String s : array) {
            newStr.append(s);
        }
        return newStr.toString();
    }

    public static void sort(String[] array) {
        int length = array.length;
        if (length == 1) {
            return;
        }
        int middle = array.length / 2;
        String[] leftArray = new String[middle];
        String[] rightArray = new String[length - middle];
        for (int i = 0; i < middle; i++) {
            leftArray[i] = array[i];
        }
        for (int i = middle; i < length; i++) {
            rightArray[i - middle] = array[i];
        }
        sort(leftArray);
        sort(rightArray);
        merge(array, leftArray, rightArray);
    }

    private static void merge(String[] array, String[] leftArray, String[] rightArray) {
        int leftArrayLength = leftArray.length;
        int rightArrayLength = rightArray.length;

        int leftIndex = 0;
        int rightIndex = 0;

        int arrayIndex = 0;

        while (leftIndex < leftArrayLength && rightIndex < rightArrayLength) {
            if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) < 0) {
                array[arrayIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[arrayIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            arrayIndex++;
        }
        while (leftIndex < leftArrayLength) {
            array[arrayIndex++] = leftArray[leftIndex++];
        }
        while (rightIndex < rightArrayLength) {
            array[arrayIndex++] = rightArray[rightIndex++];
        }
    }
}
