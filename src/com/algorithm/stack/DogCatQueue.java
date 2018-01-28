package com.algorithm.stack;

import java.util.LinkedList;
import java.util.Queue;

import com.algorithm.stack.Problem_DogCatQueue.Cat;
import com.algorithm.stack.Problem_DogCatQueue.Dog;
import com.algorithm.stack.Problem_DogCatQueue.Pet;
import com.algorithm.stack.Problem_DogCatQueue.PetEnterQueue;

/**
 * 猫狗队列的具体实现信息
 * @author fengbincao
 */
public class DogCatQueue {
	private Queue<PetEnterQueue> dogQueue;				// 狗队列
	private Queue<PetEnterQueue> catQueue;			    // 猫队列
	private long count = 0;
	
	public DogCatQueue() {
		this.dogQueue = new LinkedList<PetEnterQueue>();
		this.catQueue = new LinkedList<PetEnterQueue>();
		this.count = 0;
	}
	
	public void add(Pet pet) {
		if (pet.getPetType().equals("dog")) {
			this.dogQueue.add(new PetEnterQueue(pet, this.count++));
		} else if (pet.getPetType().equals("cat")) {
			this.catQueue.add(new PetEnterQueue(pet, this.count++));
		} else {
			throw new RuntimeException("err, not dog or cat");
		}
	}
	
	/**
	 * 将队列中的所有实例按照先进先出的顺序弹出来
	 * @return
	 */
	public Pet pollAll() {
		if (!this.dogQueue.isEmpty() && !this.catQueue.isEmpty()) {
			// 按照时间戳来进行比较
			if (this.dogQueue.peek().getCount() < this.catQueue.peek()
					.getCount()) {
				return this.dogQueue.poll().getPet();
			} else {
				return this.catQueue.poll().getPet();
			}
		} else if (!this.dogQueue.isEmpty()) {
			return this.dogQueue.poll().getPet();
		} else if (!this.catQueue.isEmpty()) {
			return this.catQueue.poll().getPet();
		} else {
			throw new RuntimeException("err, queue is empty!");
		}
	}
	
	public Dog pollDog() {
		if (!this.isDogQueueEmpty()) {
			return (Dog) this.dogQueue.poll().getPet();
		} else {
			throw new RuntimeException("Dog queue is empty!");
		}
	}

	public Cat pollCat() {
		if (!this.isCatQueueEmpty()) {
			return (Cat) this.catQueue.poll().getPet();
		} else
			throw new RuntimeException("Cat queue is empty!");
	}

	public boolean isEmpty() {
		return this.dogQueue.isEmpty() && this.catQueue.isEmpty();
	}

	public boolean isDogQueueEmpty() {
		return this.dogQueue.isEmpty();
	}

	public boolean isCatQueueEmpty() {
		return this.catQueue.isEmpty();
	}
}	
