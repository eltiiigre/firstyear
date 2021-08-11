class Stack {

	int[] stack;
	int size = 10; 
	int current_position;
	
	Stack() {

		this.stack = new int[this.size];
		this.current_position = 0;
	}
	
	//adds an element to the stack
	//return true if push is successful, false otherwise
	
	public boolean push(int value) {
		if (this.is_full()) {
			return false;
		} else {
			this.stack[this.current_position] = value;
			this.current_position++;
			return true;
		}	
	}
	
	//retrieves an element from the stack
	
	public int pop() {
		if (this.isEmpty()) {
			System.out.println("Stack is empty, cannot retrieve anything.");
			return 0;
		} else {
			int temp;
			temp = this.stack[this.current_position - 1]; 
			this.current_position--;
			this.stack[this.current_position] = 0;
			return temp;
		}	
	}
	
	//checks whether the stack is empty or not
	//return boolean true if stack is empty, otherwise false

	public boolean isEmpty() {
		if (this.current_position == 0)
			return true;
		else 
			return false;
	}
	
	//checks whether the stack is full
	//return boolean true if stack is full, otherwise false
	
	public boolean is_full() {
		if (this.current_position == this.size)
			return true;
		else
			return false;
	}
	
	public void clear() {
        // make sure you release reference of all
        // element to avoid memory leak in Java
        for (int i = 0; i < size; i++) {
            stack[i] = 0;
        }
        size = 0;
    }
	
}