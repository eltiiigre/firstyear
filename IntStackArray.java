public class IntStackArray{
	private int[] stack;
	private int size;
	private static final int INITIAL_SIZE = 100;
	
	public IntSample{
		int[] stack = new int[INITIAL_SIZE];
		size = 0;
	}
	
	public void push(int value){
		stack[size] = value;
		size++;
	}
	
	public int pop(){
		result = stack[size-1];
		stack [size-1] = 0;
		size--;
		return result;
	}
	
	public int peek(){
		result = stack[size-1];
		return result;
	}
	
	public void clear(){
		for (int i=0;i<stack.length;i++){
			stack[i] = 0;
		}
		size = 0;
	}
	
	public void printall(){
		for (int i=0;i<stack.length;i++){
			System.out.println(stack[i]);
		}
	}
	
	public static void main (String[] args){
		Sample MyStack = new Sample();
		
		MyStack.push(5);
		System.out.println(MyStack.printall());
	}
}