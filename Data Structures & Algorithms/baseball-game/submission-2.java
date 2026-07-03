class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> stack = new Stack<>();
        for (String s : operations){
            switch (s) {
                case "+":
                    stack.push(stack.peek() + stack.get(stack.size() - 2));
                    break;
                case "D":
                    stack.push(2 * stack.peek());
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(s));
                    break;
            }
        }
        int sum = 0;
        for (int a : stack){
            sum += a;
        }
        return sum;

    }
}