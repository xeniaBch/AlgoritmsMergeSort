import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
    String[] stringsArr = {"1,2-4", "3-6", "2,5,7-11", "5"};
    ArrayList<Integer> resArray = stringsToNums(stringsArr);
    System.out.println(resArray.toString());
}
// transfer string array to the integer array
    private static ArrayList<Integer> stringsToNums(String[] stringsArr) {
        ArrayList<Integer> resArray = new ArrayList<>();
        for (String i : stringsArr) {
            String[] items = i.split(",");
            for (String j : items) {
                try {
                    resArray.add(Integer.parseInt(j));
                }
                catch(NumberFormatException e) {
                    addStringsToArr(j, resArray);
                }
            }
        }
        return resArray;
    }

    static void addStringsToArr (String str, ArrayList<Integer> arrToAdd) {
        String[] strArr = str.split("-");
        int begin = Integer.parseInt(strArr[0]);
        int end = Integer.parseInt(strArr[1]);

        for (int i = begin; i <= end; i++) {
            arrToAdd.add(i);
        }
    }
}
