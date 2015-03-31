package iut.tdd;

import java.util.HashMap;
import java.util.Map;


public class Convert {
	
	public static String[] num={"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19"};
	public static String[] num_text={"zéro","un","deux","trois","quatre","cinq","six","sept","huit","neuf","dix","onze","douze","treize","quatorze","quinze","seize","dix-sept","dix-huit","dix-neuf"};
	public static String[] dizaine={"20","30","40","50","60","70","80","90"};
	public static String[] txt_diz={"vingt","trente","quarante","cinquante","soixante","soixante-dix","quatre-vingt","quantre-vingt-dix"};


	private static int indexOf(String[] arr,String item){
		for(int i = 0; i < arr.length; i++)
			if (arr[i].equals(item))
				return i;
		return -1;
	}
	
	public static String num2text(String input) {
	for(int i=0;i<num.length;i++)
		if (input.equals(num[i])){
		return num_text[Integer.valueOf(input)];
		}

		return null;

		
	}
		
	
	public static String text2num(String input) {
		int input_index = indexOf(num_text, input);
		 if(input_index!= -1) return num[input_index];
		return null;
	}
	
	

}
