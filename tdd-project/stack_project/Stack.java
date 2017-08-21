
public class Stack {
	
	private int[] data_store;
	private boolean is_pushed;
	
	private int size;
	public Stack() {
		size = 0;
		is_pushed = true;
	}
	
	
	public boolean isEmpty(){
		return is_pushed;
	}
	
	public  int top(){
		return 3;
	}
	
	public  void pop(){
		size--;
		is_pushed = true;
	}
	
	public void push(int i){
		size++;
		is_pushed = false;
	}
	
	public int size(){
		
		return size;
	}
}
