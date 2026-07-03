class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> stack = new Stack<>();
        for (String s : operations){
            switch (s) {
                case "+":
                    int a = stack.pop();
                    int b = stack.pop();
                    int sum = a + b;
                    stack.push(b);stack.push(a);stack.push(sum);
                    break;
                case "D":
                    int c = stack.pop();
                    stack.push(c);stack.push(2*c);
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