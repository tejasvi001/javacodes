package codingquestions;

import java.util.Stack;

/*
You are given a string s that consists of lower case English letters and brackets.

Reverse the strings in each pair of matching parentheses, starting from the innermost one.

Your result should not contain any brackets.

Constraints:

	1 <= s.length <= 2000
	s only contains lower case English characters and parentheses.
	It is guaranteed that all parentheses are balanced.

Example
	Input: s = "(ed(et(oc))el)"
	Output: "leetcode"
	Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.
 */
public class ReverseSubstringsBetweenPairOfParanthesis {
	
	//Iterative Approach
	public String reverseParentheses(String s) {
        StringBuilder result=new StringBuilder(s);
        int startIdx=result.lastIndexOf("(");
        int endIdx=result.indexOf(")",startIdx);
       
        while(startIdx!=-1){
            StringBuilder temp=new StringBuilder(result.substring(startIdx+1,endIdx));
            temp.reverse();
            result.replace(startIdx,endIdx+1,temp.toString());
            startIdx=result.lastIndexOf("(");
            endIdx=result.indexOf(")",startIdx);
        }
        return result.toString();
    }
	public String reverseParentheses2(String s) {
        Stack<Character> st = new Stack<>();
         for(int i=0;i<s.length();i++){
           if(s.charAt(i)==')'){
               StringBuilder sb=new StringBuilder("");
               while(st.peek()!='('){
                   sb.append(st.pop());
               }
               st.pop();
               for(int k=0;k<sb.length();k++){
                   st.push(sb.charAt(k));
               }
           }else{
               st.push(s.charAt(i));
           }
         }
       StringBuilder sb=new StringBuilder("");
       int i=st.size();
       while(i>0){
           sb.append(st.pop());
           i--;
       }
       return sb.reverse().toString();
       }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseSubstringsBetweenPairOfParanthesis obj= new ReverseSubstringsBetweenPairOfParanthesis();
		
		System.out.println(obj.reverseParentheses("(abcd)"));
		
		System.out.println(obj.reverseParentheses2("(abcd)"));

	
	}

}
