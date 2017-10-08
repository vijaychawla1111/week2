public class Anagram {
	public static void isAnagram(String str1,String str2) {

		char temp;
		char anagString1[] = str1.toCharArray();
		char anagString2[] = str2.toCharArray();

		int length1 = anagString1.length-1;
		int length2 = anagString2.length-1;

		int count = 0;
		
        if(length1 == length2) {

        //sorting String 2
		for(int i = 0;i<anagString1.length;i++) {
			for(int j = i+1;j<anagString1.length-1;j++) {
				if(anagString1[i]>anagString1[j]) {
					temp = anagString1[i];
					anagString1[i]=anagString1[j];
					anagString1[j]=temp;
				}
			}
		}
		//sorting string 2
		for(int i = 0;i<anagString2.length;i++) {
			for(int j = i+1;j<anagString2.length-1;j++) {
				if(anagString1[i]>anagString2[j]) {
					temp = anagString2[i];
					anagString2[i]=anagString2[j];
					anagString2[j]=temp;
				}
			}
		}

		//checking if anagram
		for(int i =0;i<length1;i++) {
			if(anagString1[i]==anagString2[i]) {
				count = 1;
			}
			else {
				count = 0;
				break;
			}
		}
	}
	    if(count == 1)
	      System.out.println("It is anagram");
        else
          System.out.println("It is not a anagram");

}
    public static void main(String args[]) {
       isAnagram(args[0],args[1]);
    }
}
