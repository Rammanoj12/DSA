import java.util.HashMap;

public class ExpressionEvaluationusingHashmap {
    public static int countWaysToTrue(String expression) {
        HashMap<String, Integer> memo = new HashMap<>();
        return countWays(expression, true, memo);
    }

    public static int countWays(String expression, boolean isTrue, HashMap<String, Integer> memo) {
        String key = expression + "|" + isTrue;

        if (memo.containsKey(key)) {
            return memo.get(key);
        }else{
             int ways = 0;

        if (expression.length() == 1) {
            if (expression.equals("T") && isTrue) {
                ways = 1;
            } else if (expression.equals("F") && !isTrue) {
                ways = 1;
            }
        } else {
            for (int i = 1; i < expression.length(); i += 2) {
                char operator = expression.charAt(i);

                String leftExpr = expression.substring(0, i);
                String rightExpr = expression.substring(i + 1);

                int leftTrue = countWays(leftExpr, true, memo);
                int leftFalse = countWays(leftExpr, false, memo);
                int rightTrue = countWays(rightExpr, true, memo);
                int rightFalse = countWays(rightExpr, false, memo);

                if (operator == '&') {
                    if (isTrue) {
                        ways += leftTrue * rightTrue;
                    } else {
                        ways += leftFalse * rightTrue + leftTrue * rightFalse + leftFalse * rightFalse;
                    }
                } else if (operator == '|') {
                    if (isTrue) {
                        ways += leftTrue * rightTrue + leftTrue * rightFalse + leftFalse * rightTrue;
                    } else {
                        ways += leftFalse * rightFalse;
                    }
                } else if (operator == '^') {
                    if (isTrue) {
                        ways += leftTrue * rightFalse + leftFalse * rightTrue;
                    } else {
                        ways += leftTrue * rightTrue + leftFalse * rightFalse;
                    }
                }
            }
        }
    

        memo.put(key, ways);
        return ways;
    }
}

    public static void main(String[] args) {
        String expression = "T|F&T^F";
        int result = countWaysToTrue(expression);
        System.out.println("Number of ways to evaluate the expression to be true: " + result);
    }
}
