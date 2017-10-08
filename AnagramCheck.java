import java.util.ArrayList;
public class AnagramCheck
{
  public static void main(String args[])
  {
      String phrase1 = "theclassroom";
      phrase1 = (phrase1.toLowerCase()).trim();
      char[] phrase1Arr = phrase1.toCharArray();

      String phrase2 = "schoolmaster";
      phrase2 = (phrase2.toLowerCase()).trim();
      ArrayList<Character> phrase2ArrList = convertStringToArraylist(phrase2);

      if (phrase1.length() != phrase2.length()) 
      {
          System.out.print("There is no anagram present.");
      } 
      else 
      {
          boolean isFound = true;
          for (int i=0; i<phrase1Arr.length; i++)
          {  
              for(int j = 0; j < phrase2ArrList.size(); j++) 
              {
                  if(phrase1Arr[i] == phrase2ArrList.get(j))
                  {
                      System.out.print("There is a common element.\n");
                    
                      phrase2ArrList.remove(j);
                  }
              }
              if(isFound == false)
              {
                  System.out.print("There are no anagrams present.");
                  return;
              } 
          }
          System.out.printf("%s is an anagram of %s", phrase1, phrase2);
      }
  }

  public static ArrayList<Character> convertStringToArraylist(String str) {
      ArrayList<Character> charList = new ArrayList<Character>(); 
      for(int i = 0; i<str.length();i++){
          charList.add(str.charAt(i));
      }
      return charList;
  }
}
