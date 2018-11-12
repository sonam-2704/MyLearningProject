import java.util.Iterator;
import java.util.NoSuchElementException;
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
	
	 /*  Function to remove top element from the stack */
    public int pop()
    {
        if (q.size() == 0)
            throw new NoSuchElementException("Underflow Exception");        
        return q.remove();
    }    
    /*  Function to check the top element of the stack */
    public int peek()
    {
        if (q.size() == 0)
            throw new NoSuchElementException("Underflow Exception");            
        return q.peek();
    }        
    /*  Function to check if stack is empty */
    public boolean isEmpty()
    {
        return q.size() == 0 ;
    }
    
    /*  Function to get the size of the stack */
    public int getSize()
    {
        return q.size();
    }    
    
    /*  Function to display the status of the stack */
    public void display()
    {
        System.out.print("\nStack = ");
        int l = getSize();
        if (l == 0)
            System.out.print("Empty\n");
        else
        {
            Iterator it = q.iterator();
            while (it.hasNext())
                System.out.print(it.next()+" ");
            System.out.println();
        }
    }
}
	

