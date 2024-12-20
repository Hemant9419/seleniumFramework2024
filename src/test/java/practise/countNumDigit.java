package practise;

public class countNumDigit {

	
	public static void main(String[] args) {
		int num=9809;
		
		int count=0;
		
		int sum=0;
		
		for(int i=0;i<=num;i++) {
			count++;
			
			int s=num%10;
			sum=sum+s;
			
			num=num/10;
		}
		System.out.println(sum);
	}
}
