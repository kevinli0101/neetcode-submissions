class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();
        for(int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+") || tokens[i].equals("-") || 
                tokens[i].equals("*") || tokens[i].equals("/")) {
                int b = Integer.parseInt(s.pop());
                int a = Integer.parseInt(s.pop());
                if (tokens[i].equals("+")) {
                    s.push(Integer.toString(a + b));
                }
                if (tokens[i].equals("-")) {
                    s.push(Integer.toString(a - b));
                }
                if (tokens[i].equals("*")) {
                    s.push(Integer.toString(a * b));
                }
                if (tokens[i].equals("/")) {
                    s.push(Integer.toString(a / b));
                }
            } else {
                s.push(tokens[i]);
            }
        }
        return Integer.parseInt(s.peek());
    }
}
