/*Question.1)
write a java program for findining MaximumuniquesubString and its length 
in the given String.you have to take on method that will find in a String 
cointains only unique character or not.mathod like public static boolean 
isUniqueString(String s); after that in main method take one String value 
and call this isUniqueString(String s) method in the logical way for finding
maximum length and maximum subString and print that.
Note:if you know another way like through collection or other things you 
can do.
Example: String s="abcbabab"
Output: Maximum Unique SubString ="abc";
        length=3;*/
package com.nt;

public class MaxSubString {
    public static boolean isUniqueString(String s) {
    	for(int i=0;i<s.length();i++) {
    		for(int j=i+1;j<s.length();j++) {
    			if(s.charAt(i)==s.charAt(j)) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
    public static void main(String[] args) {
    	String s="abcbabab";
    	String res="";
    	int max=0;
    	System.out.println("Unique String or not: "+isUniqueString(s));
    	for(int i=0;i<s.length();i++) {
    		for(int j=i+1;j<s.length();j++) {
    			if(isUniqueString(s.substring(i,j))) {
    				if(s.substring(i,j).length()>max) {
    					max=s.substring(i,j).length();
    					res=s.substring(i,j);
    				}
    			}
    		}
    	}
    	System.out.println("UniqueSubString: "+res);
    	System.out.println("Length: "+max);
	}
}
