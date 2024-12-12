/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a phrase, sentence, or word");
		String input = sc.nextLine();
		
		String output = translate(input);
		
	}
	
	public static String translate(String input){
		String result = "";
		int start = 0;
		
		for(int i = 0; i <= input.length(); i++){
			if(i == input.length() || input.substring(i , i +1).equals(" ")){
				String word = "";
				for(int x = start; x < i; x++){
					word += input.substring(x, x+1);
				}
				
				String output = translate(word);
				for(int x = 0; x < output.length(); x++){
					result += output.substring(x, x+1);
				}
				
				if(i<input.length()){
					result += "";
				}
				
				start = i+1;
			}
		}
		
	return result;
	
}

public static String translateWord(String word){
	String vowels = "aeiou";
	boolean startVowel = false;
	for(int i = 0; i<vowels.length(); i++){
		if(word.substring(0,1).equalsIgnoreCase(vowels.substring(i,i+1))){
			startVowel=true;
			break;
		}
	}
	if(startVowel){
		return word+"way";
	}
	else{
		int index = -1;
		for(int i = 0; i < word.length(); i++){
			for(int x = 0; x < vowels.length(); x++){
				if(word.substring(i,i+1).equalsIgnoreCase(vowels.substring(x,x+1))){
					index = i;
					break;
				}
			}
			if(index != -1){
				break;
			}
		}
		if(index == -1){
			return word + "ay";
		}
		else{
			String rest = "";
			String prefix = "";
			for(int i = index; i<word.length(); i++){
				rest += word.substring(i,i+1);
			}
			for(int i = 0; i<index; i++){
				prefix += word.substring(i,i+1);
			}
			return rest + prefix + "ay";
		}
	}
	
}
}
