public class Task4 {
    public static void main(String[] args) {
        String str = "abcdefgh";
        System.out.println(findIndex(str, 'e'));
        System.out.println(findIndex(str, 'a'));
        System.out.println(findIndex(str, 'h'));
        System.out.println(findIndex(str, 'k'));

    }

    //find index of symbol in string(without repeats)
    public static int findIndex(String str, char symbol){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == symbol){
                return i;
            }
        }
        return -1;
    }
}
