package academy.learnprogramming.stackschallenge;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    /**
     * @param string
     * @return
     */
    public static boolean checkForPalindrome(String string) {
    	LinkedList<Character> stack = new LinkedList<Character>();
    	StringBuilder stringNoPuntuation = new StringBuilder(string.length());
    	String lowerCase = string.toLowerCase();
    	
    	//string.chars().forEach(i-> System.out.println(new StringBuilder().appendCodePoint(i)));
    	lowerCase.chars().forEach(i-> { 
    		if( (char)i >='a' && (char)i <= 'z' ){
    			stringNoPuntuation.append((char)i);
    			stack.push((char)i);
    		}
    		
    	});
    	//System.out.println(stringNoPuntuation);
    	StringBuilder reverseString = new StringBuilder(stack.size());

    	while(!stack.isEmpty()) {
    		reverseString.append(stack.pop());
    	}
    	//System.out.println()
    	return reverseString.toString().equals(stringNoPuntuation.toString());
    }
}