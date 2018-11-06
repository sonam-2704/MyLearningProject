import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 */

/**
 * @author Sonam_Mittal
 *
 */
public class StreamMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String result = "";
		Map<Integer,String> fruitsMap = new HashMap<Integer,String>();
		
		fruitsMap.put(1, "Apple");
		fruitsMap.put(2, "Banana");
		fruitsMap.put(3, "Orange");
		
		System.out.println(fruitsMap.get(1));
		
		for(Map.Entry<Integer, String> entry: fruitsMap.entrySet()){
			
			if(2==entry.getKey()){
				
				result=entry.getValue();
			}
		}
		
		System.out.println("Before java 8:"+result);
		
	result=	fruitsMap.entrySet().stream().filter(entry -> 2==entry.getKey()).map(entry -> entry.getValue()).collect(Collectors.joining());
		
		System.out.println("After java 8:"+result);
	}

}
