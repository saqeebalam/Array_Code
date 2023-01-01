package Collection;

import java.util.ArrayList;
import java.util.List;

//Implementation Of Queue

public class Queue {
	static List<Integer> arr=new ArrayList<>();
	int i=0;
	public static void main(String[] args) {
		Queue que=new Queue();
		que.enque(10);
		que.enque(20);
		que.enque(30);
		que.enque(40);
		//que.deque();
		System.out.println("Size of Queue="+que.sizeOfQueue());
		System.out.println("Queue Data are="+arr);
		System.out.println("Head="+que.head());
		System.out.println("Rear="+que.rear());
		que.deque();
		System.out.println("Size of Queue after deleteing="+que.sizeOfQueue());
	}

	public  void enque(Integer n)
	{
		arr.add(n);
		
	}
	
	public Integer deque()
	{
		Integer integer = arr.get(i);
		arr.remove(i);
		return integer;
	}
	
	public Integer head()
	{
		return arr.get(i);
	}
	
	public Integer rear()
	{
		return arr.get(arr.size()-1);
	}
	
	public Integer sizeOfQueue()
	{
		return arr.size();
	}
}
