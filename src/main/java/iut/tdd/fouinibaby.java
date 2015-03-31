package iut.tdd;

import java.util.HashMap;
import java.util.Map;

public class fouinibaby {

	public static String[] num={"0","1","2","3","4","5","6","7","8","9"};
	public static String[] num_text={"zéro","un","deux","trois","quatre","cinq","six","sept","huit","neuf"};
	public static String[] dizaine={"10","20","30","40","50","60","70","80","90"};
	public static String[] txt_diz={"dix","vingt","trente","quarante","cinquante","soixante","soixante-dix","quatre-vingt","quantre-vingt-dix"};
	public static String[] exep={"11","12","13","14","15","16","17","18","19"};
	public static String[] txt_exep={"onze","douze","treize","quatorze","quinze","seize","dix-sept","dix-huit","dix-neuf"};
	
	
	public static void main(String args){

	
	Map<String,String> norm= new HashMap<String, String>();
	
	for(int i=0; i<dizaine.length;i++)
		for(int j=1; j<dizaine.length;j++)
	{
		norm.put(dizaine[i],num[j]);
		
	}
	
	System.out.print(norm.toString());
}
}
