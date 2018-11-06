import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> q;
	Queue<Integer> tmp;

	
	public void push(int data){
		
		if(q.size() == 0){
			
			q.add(data);
		}
		else{
			
			int l = q.size();
			
			for(int i=0;i<l;i++){
				
				System.out.println(q.remove());
				tmp.add(q.remove());
			}
			
			q.add(data);
			for(int i=0;i<l;i++){
				
				System.out.println(tmp.remove());
				q.add(tmp.remove());
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		
	}

}
