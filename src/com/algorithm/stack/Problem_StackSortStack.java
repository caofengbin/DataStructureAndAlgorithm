package com.algorithm.stack;

import java.util.Stack;

/**
 * 用一个栈实现另一个栈的排序:
 * 一个栈中的元素类型为整型，现在想将该栈从顶到底按从大到小的顺序排序，只允许申请一个栈。
 * 除此之外，可以申请新的变量，但不能申请额外的数据结构。如何完成排序？
 * @author fengbincao
 */
public class Problem_StackSortStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(87);
		stack.push(6);
		stack.push(2);
		stack.push(5);
		stack.push(4);
		System.out.println(stack);
		
		SortStack sortStack = new SortStack();
		sortStack.sortStack(stack);
		System.out.println(stack);
	}
	
}
