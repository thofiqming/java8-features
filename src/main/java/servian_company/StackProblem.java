package servian_company;

import java.util.Stack;

public class StackProblem {

    public static void main(String[] args) {
        StackProblem stackProblem = new StackProblem();
        int solution = stackProblem.solution("1048575 DUP +");
        System.out.println(solution);
    }

    public int solution(String S) {

        String[] pattern = S.split("\\s");

        Stack<Integer> stack = new Stack<>();

        try {
            for (String s : pattern) {
                Integer num;
                switch (s) {
                    case "+":
                        if (stack.size() < 1) return -1;
                        num = 0;
                        num += stack.pop();
                        num += stack.pop();
                        if(num > 1048575) return -1;
                        stack.push(num);
                        break;
                    case "-":
                        if (stack.size() < 1) return -1;
                        num = stack.pop();
                        num -= stack.pop();
                        if(num < 0) return -1;
                        stack.push(num);
                        break;
                    case "DUP":
                        if (stack.isEmpty()) return -1;
                        stack.push(stack.peek());
                        break;
                    case "POP":
                        if (stack.isEmpty()) return -1;
                        stack.pop();
                        break;
                    default:
                        stack.push(Integer.parseInt(s));
                        break;
                }
            }

            if (stack.size() < 1) return -1;
            else return stack.pop();
        }catch (Exception ex){
            return -1;
        }
    }
}
