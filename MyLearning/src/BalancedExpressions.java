import java.util.Stack;

public class BalancedExpressions {
	Stack<Character> brackets = new Stack<Character>();
	public String isBalancedExpression;
	public int matchCount=0;
	public boolean checkEmptyStackWhilePoppingElements=true;
	public void findBalancedExpression(String inputString) {
		char[] letters = inputString.toCharArray();
		for(char c:letters) {
			if(c=='{' || c=='[' || c=='(' || c=='<') {
				brackets.push(c);
			}
			else if(c=='}') {
				popUpElementsFromStack('{');
			}
			else if(c==']') {
				popUpElementsFromStack('[');
			}
			else if(c==')') {
				popUpElementsFromStack('(');
			}
			else if(c=='>') {
				popUpElementsFromStack('<');
			}
		}
		isBalancedExpression=(brackets.isEmpty() && checkEmptyStackWhilePoppingElements)?"YES":"NO";
	}
	
	public void popUpElementsFromStack(Character expectedCharacter) {
		if(brackets.isEmpty()) {
			checkEmptyStackWhilePoppingElements=false;
		}
		else {
			containsElement(expectedCharacter);
		}
	}
	
	public void containsElement(Character expectedCharacter) {
		if(brackets.contains(expectedCharacter)) { 
			brackets.remove(expectedCharacter);
			matchCount+=1;
		}
		else {
			checkEmptyStackWhilePoppingElements=false;
		}
	}
}
