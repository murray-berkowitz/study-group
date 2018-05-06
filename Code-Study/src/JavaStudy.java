import java.util.*;

public class JavaStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortTheInnerContent("Mr. Stark I don't feel so good");

	}
	
	/**
	 * Sort the inner content of each word in a string input!
	**/
	
	public static String sortTheInnerContent(String words)
	  {
	    String[] wordsArr = words.split("\\s+"); //multiple spaces
	    for (int i = 0; i < wordsArr.length; i++) {
	      wordsArr[i] = wordsArr[i].replaceAll("[^\\w]","");
	      //replace the characters apart from letters and numbers
	  
	    }
	    StringBuilder strB = new StringBuilder();
	    for (int i = 0; i < wordsArr.length; i++) {
	      String word = wordsArr[i].toString();
	      char[] tempArr  = new char[word.length() - 2];

	      strB.append(word.charAt(0));
	      
	      for (int j = word.length() - 2; j > 0;  j--) {
	        tempArr[j] = word.charAt(j);
	        //Collections.sort(tempArr); I'LL FIX THIS LATER
	        strB.append(tempArr);
	      }
	      int l = word.length() - 1;
	      strB.append(word.charAt(l));
	      strB.append(" ");
	    }
	    return strB.toString();
	  }

}
