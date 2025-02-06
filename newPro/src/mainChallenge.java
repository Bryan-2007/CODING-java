public class mainChallenge {
    public static void main(String[] args) {
        String[][] arr = {{"one", "two"}, {"five", "four"}};
        for (String[] i : arr){
            for (String j : i){
                System.out.println(j);
            }
        }
    }
}