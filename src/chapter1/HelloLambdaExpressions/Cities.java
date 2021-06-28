package chapter1.HelloLambdaExpressions;

public class Cities {
    public static void main(String[] args) {
        boolean found = false;
        String[] cities ={"Chicago"};

        for (String city : cities) {
            if (city.equals("Chicago")) {
                found = true;
                break;
            }
        }
        System.out.println("Found chicago?:" + found);
    }
}
