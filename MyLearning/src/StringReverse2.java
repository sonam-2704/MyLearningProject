
public class StringReverse2 {

	public static void main(String[] args) {

		
		String input1 = "Hello";
		String reverse= "";
		

		StringBuilder sb = new StringBuilder();
		sb.append(input1);
		
		sb.reverse();
		
		System.out.println(sb);

	}

}
