package practise;



import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapInterface {

	public static void main(String[] args) {
		
		String str1="The india is a butiful country but India the is great";
		
	String str=	str1.toLowerCase();
		int count=1;
	String[]splitarry=	str.split(" ");
	
	Map<String,Integer>map= new HashMap<String,Integer>();
	
	for(String Arrayvalues:splitarry) {
		
		
		if(!map.containsKey(Arrayvalues)) {
			
			map.put(Arrayvalues, count);
		}
		else {
			
			map.put(Arrayvalues, map.get(Arrayvalues)+1);
		}
	}
	
	for(String x:map.keySet()) {
		
		if(map.get(x)>1) {
			
			System.out.println(x+" count="+map.get(x));
		}
		
		
	}
	

	}

}
