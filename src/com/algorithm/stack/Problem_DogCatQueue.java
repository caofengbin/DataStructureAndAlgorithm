package com.algorithm.stack;

/**
 * 猫狗队列问题
 * 
 * 题目描述:
 * 实现一个猫狗队列的结构，要求如下:
 * (1) 用户可以调用add方法添加cat或者dog;
 * (2) 用户可以调用pollAll方法,将队列中的实例按照进队列的先后顺序依次弹出;
 * (3) 用户可以调用pollDog方法,将队列中的dog类的实例按照进队列的先后顺序依次弹出;
 * (4) 用户可以调用pollCat方法,将队列中的cat类的实例按照进队列的先后顺序依次弹出;
 * (5) 用户可以调用isEmpty()方法;
 * (6) 用户可以调用isCatEmpty()方法;
 * (7) 用户可以调用isDogEmpty()方法;
 * @author fengbincao
 */
public class Problem_DogCatQueue {

	/**
	 * 重新构建的数据结构，增加上一个时间戳字段信息
	 * @author fengbincao
	 */
	public static class PetEnterQueue {
		private Pet pet;
		private long count;

		public PetEnterQueue(Pet pet, long count) {
			this.pet = pet;
			this.count = count;
		}

		public Pet getPet() {
			return pet;
		}

		public long getCount() {
			return count;
		}
		
		public String getPetType() {
			return this.pet.getPetType();
		}
	}
	
	/**
	 * 基本宠物类型的基类
	 * 
	 * @author fengbincao
	 */
	public static class Pet {
		private String type;

		public Pet(String type) {
			this.type = type;
		}

		public String getPetType() {
			return this.type;
		}
	}

	/**
	 *  基本动物类型--狗
	 * @author fengbincao
	 */
	public static class Dog extends Pet {
		public Dog() {
			super("dog");
		}
	}

	/**
	 * 基本动物类型--猫
	 * @author fengbincao
	 */
	public static class Cat extends Pet {
		public Cat() {
			super("cat");
		}
	}
}
