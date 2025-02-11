public class mainChallenge {
    static String addValue(int x, int y){
        return "The sum of " + x + " and " + y + " is " + (x+y);
    }
    static String addValue(double x, double y){
        return "The sum of " + x + " and " + y + " is " + (x+y);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        double c = 2.00d;
        double d = 3.00d;
        // Task is to print the name and age using a function with parameters
        System.out.println(addValue(a, b));
        System.out.println(addValue(c, d));

    }
}