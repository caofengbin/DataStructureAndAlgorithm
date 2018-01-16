package com.algorithm.linkedlist;

import com.algorithm.linkedlist.common.LinkedListUtil;
import com.algorithm.linkedlist.common.LinkedNode;

/**
 * 用环形单链表结构来模拟实现“约瑟夫环问题”
 * 
 * @author fengbincao
 */
public class Problem_JosephusProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		LinkedNode headLinkedNode = LinkedListUtil.initCircleLinkedList(array);
		LinkedNode headLinkedNode2 = JosephusProblem.simulationJosephus(headLinkedNode, 3);
		System.out.println(headLinkedNode2.data);
	}

}
