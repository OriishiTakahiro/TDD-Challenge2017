import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void testIsEmptyTrue() {
		Stack stack = new Stack();
		assertEquals(stack.isEmpty(),true);
	}

	@Test
	public void testIsEmptyFalse() {
		Stack stack = new Stack();
		stack.push(3);
		assertEquals(stack.isEmpty(),false);
	}
	
	@Test
	public void testPushAndTop(){
		Stack stack = new Stack();
		stack.push(3);
		int i = stack.top();
		assertEquals(3,i);
	}
	
	@Test
	public void testPopAndisEmpty(){
		Stack stack = new Stack();
		stack.push(3);
		stack.pop();
		assertEquals(true,stack.isEmpty());
	}
	
	@Test
	//スタックに積まれた数を返す
	public void testGetSize(){
		Stack stack = new Stack();
		int emptysize = stack.size();
		assertEquals(0,emptysize);
	}
	
	@Test
	public void testPushAndSize(){
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(3,stack.size());
	}
	
	@Test
	public void testPushAndPopSize(){
		Stack stack = new Stack();
		stack.push(1);
		stack.pop();
		stack.push(1);
		assertEquals(1,stack.size());
	}
	
	@Test
	public void testPushedSize(){
		Stack stack = new Stack();
		int anyNum = 3;
		stack.push(anyNum);
		assertEquals(1,stack.size());
	}

}
