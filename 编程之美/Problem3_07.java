package Beautiful;

import java.util.ArrayList;

/**
 * 队列中取最大值操作问题
 * @author wangpeng
 * 自定义一个栈
 * 
 */
//自定义一个栈
class stack{
	private int[] stackItem = new int[100];
	private int stackTop;
	private int[] NextMaxIndex = new int[100];
	private int maxStackItemIndex;
	public stack(){
		maxStackItemIndex = -1;
		stackTop = -1;
	}
	public void Push(int data){
		stackTop++;
		if(stackTop >100){
			return;
		}
		else{
			stackItem[stackTop] = data;
			if(data > Max()){
				NextMaxIndex[stackTop] = maxStackItemIndex;
				maxStackItemIndex = stackTop;
			}else{
				NextMaxIndex[stackTop] = -1;
			}
		}
	}
	
	public int Pop(){
		int data = stackItem[stackTop];
		
		if(stackTop == maxStackItemIndex){
			maxStackItemIndex = NextMaxIndex[stackTop];
		}
		stackTop--;
		
		return data;
	}
	public int Max() {
		// TODO Auto-generated method stub
		if(maxStackItemIndex != -1)
			return stackItem[maxStackItemIndex];
		else
			return Integer.MIN_VALUE;
	}
	
	public boolean isEmpty(){
		if(stackTop < 0)
			return true;
		else
			return false;
	}
}

class Queue{
	private stack s1;
	private stack s2;
	
	public Queue(){
		s1 = new stack();
		s2 = new stack();
	}
	
	public void EnQueue(int v){
		s1.Push(v);
	}
	
	public int DeQueue(){
		if(s2.isEmpty()){
			s2.Push(s1.Pop());
		}
		int data = s2.Pop();
		return data;
	}
	
	public int MaxElement(){
		return Math.max(s1.Max(), s2.Max());
	}
}
public class Problem3_07 { 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
