package practise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class TossHeadTail {

/*public static String Toss() {
	
	Random rd= new Random();
	
	int  num=rd.nextInt(2);
	
	if(num==1) {
		
		return "Head";
	}else {
	return "Tail";}
	
	
}*/
	
	
	public static void main(String[] args) {
		
		//TossHeadTail obj= new TossHeadTail();
		//System.out.println(TossHeadTail.Toss());
		
		String str= "HelloHello";
		
		//output=Helo
		
		Map<Character,Integer> map=new HashMap<Character,Integer> ();
		
		int count=1;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(!map.containsKey(ch)) {
				
				map.put(ch, count);
			}
//			else {
//				
//				map.put(ch, map.get(ch)+1);
//			}
			
		}
		
		for(Character values:map.keySet()) {
			
			
				System.out.print(values);
				
		
		}
	}

}
