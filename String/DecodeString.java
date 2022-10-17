class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        
        
        for(char c : s.toCharArray()) {
            // if it is not an ending bracket, then push it in the stack
            if(c != ']') {
                st.push(c);
                continue;
            }
            StringBuilder sb = new StringBuilder();
            //get all the character untill is reaches in the starting brcaket
            while(st.peek() != '[') sb.append(st.pop());
            st.pop();//poping '['
            
            String temp = sb.reverse().toString(); // reversing to get the actual subString
            sb = new StringBuilder();
            //fing the the occurence number through string
            while(!st.isEmpty()) {
                if(!Character.isDigit(st.peek())) break;
                sb.insert(0, st.pop());
            }
            //store the occurence to be applied in the substring at k
            int k = Integer.valueOf(sb.toString());
            // pushing the substirng character wise in the stack for k times
            while(k-->0) {
                for(char ch : temp.toCharArray()) st.push(ch);
            }
        }
        //at the end of traversal , we get the actual string inside the stack.
        StringBuilder rev = new StringBuilder();
        while(!st.isEmpty()) rev.append(st.pop());
        
        return rev.reverse().toString();
    }
}
