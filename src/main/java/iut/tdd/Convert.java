package iut.tdd;

import java.util.HashMap;
import java.util.Map;


public class Convert {
	
	public static String[] num={"0","1","2","3","4","5","6","7","8","9"};
	public static String[] num_text={"zéro","un","deux","trois","quatre","cinq","six","sept","huit","neuf"};
	public static String[] dizaine={"10","20","30","40","50","60","70","80","90"};
	public static String[] txt_diz={"dix","vingt","trente","quarante","cinquante","soixante","soixante-dix","quatre-vingt","quantre-vingt-dix"};
	public static String[] exep={"11","12","13","14","15","16","17","18","19"};
	public static String[] txt_exep={"onze","douze","treize","quatorze","quinze","seize","dix-sept","dix-huit","dix-neuf"};

	private static int indexOf(String[] arr,String item){
		for(int i = 0; i < arr.length; i++)
			if (arr[i].equals(item))
				return i;
		return -1;
	}
	
	public static String num2text(String input) {



		
		return num_text[Integer.valueOf(input)];
		
	}
		
	
	public static String text2num(String input) {
		int input_index = indexOf(num_text, input);
		 if(input_index!= -1) return num[input_index];
		return null;
	}
	
	

}
