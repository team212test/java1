public class Printprime {

	public static void main (String[] args)
	{   
		int i = 0;
		int number = 0;
		//Empty String
		String result = "";

		while(i < 101) {           
			int counter = 0;
			number = i;
			while(number > 0) {
				if(i%number==0) {
					counter = counter + 1;
				}
				number--;
			}
			if (counter==2) {
				result = result + i + " ";
			} 
			i++;
		} 
		System.out.println("The prime numbers in the range (1, 100) : \n" + result);
	}
}
