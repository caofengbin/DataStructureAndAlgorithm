package com.algorithm.stack;

import java.util.Stack;
/**
 * 可以用来实现对栈进行排序的核心类--SortStack
 * 将要排序的栈记为stack，申请的辅助栈记为help。在原来的栈上执行pop操作，弹出的元素记为cur
 * (1) 如果cur小于等于help的栈顶元素，直接将cur压入help栈当中;
 * (2) 如果cur大于help的栈顶元素，则将help的元素逐个弹出，逐一压入stack，直到cur小于等于help栈顶元素，再将cur压入help;
 * @author fengbincao
 */
public class SortStack {

	public void sortStack(Stack<Integer> originStack) {
		// helpStack用来辅助对栈中的元素进行排序
		Stack<Integer> helpStack = new Stack<Integer>();
		
		while(!originStack.isEmpty()) {
			// 获取待排序栈的栈顶元素
			int topElement = originStack.pop();
			
			while(!helpStack.isEmpty() && helpStack.peek() > topElement) {
				// 注意这里非常的关键，push到原来的栈之中
				originStack.push(helpStack.pop());
			}
			
			helpStack.push(topElement);
		}
		
		while(!helpStack.isEmpty()) {
			originStack.push(helpStack.pop());
		}
	}
}
