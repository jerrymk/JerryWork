package com;

import java.util.ArrayList;
import java.util.Date;

public class Test {

	/**
	
	容器：装很多数据的类,容器中只能放类类型变量(非基本数据类型)。Java1.5之后，add方法中可以直接写基本数据类型(原因后面再说)
	Java在最初，在版本1.2之前，只有一个基于数组的容器(类似于MyArrayList)：Vector。
	在Java1.2中，引入了大量的容器：所有这些容器，都有一个父接口(Collection)，也就是说，所有的容器都是一个Collection。
	Java称Collection，及其所有的子接口和实现类组成的这么一个体系，称之为：集合框架(Collection Framework)
	
	集合框架中，最常见的是如下几个：ArrayList,LinkedList,HashSet,TreeSet,Stack,Vector,
	其中ArrayList，Vector都是基于数组的，和我写的MyArrayList原理差不多。
	Vector比较老，其实ArrayList是用来替代Vector的。也就是说，ArrayList在某些方面是优于Vector。
	
	=====================================================================
	[ArrayList的使用]
	
	添加数据：add(Object)//在容器的下一个位置添加数据             add(int,Object)//在指定为置添加数据
	删除数据：remove(int)//删除给定下标的对象               remove(Object)//删除给定对象                clear()//删除所有数据
	修改数据：set(int,Object)//将指定下标处的元素改为参数中的
	获取数据：get(int)//获取指定位置的元素,返回值类型是Object
	
	其他方法：indexOf(Object)//第一次出现的下标  lastIndexOf(Object)//最后一次出现的下标
	 	    contains(Object)//返回true/false，表示有没有这个元素
	 	    isEmpty()//返回true/false，表示集合是不是空的
	 	    
	【题】[一个循环(不要嵌套循环)去除ArrayList中的重复元素，不建立新的容器]
	
	[研究一下LinkedList的用法]
	
	 */
	
	//其他方法
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("aaa");
		list.add("bbbbbbbbbbb");
		list.add("aaa");
		list.add("ccccccccccc");
		list.add("aaa");
		list.add("ddddddddddd");
		list.add("aaa");
		System.out.println(list);
		
		int index1=list.indexOf("aaa");
		int index2=list.lastIndexOf("aaa");
		System.out.println("aaa第一次出现的下标："+index1);
		System.out.println("aaa最后一次出现的下标："+index2);
		
		boolean isIn1=list.contains("bbbbbbbbbbb");
		System.out.println("list中有没有bbbbbbbbbbb  "+isIn1);
		
		boolean isIn2=list.contains("bbbbbb");
		System.out.println("list中有没有bbbbbb  "+isIn2);
		
		System.out.println("list是空的吗？"+list.isEmpty());
		list.clear();
		System.out.println("list是空的吗？"+list.isEmpty());
	}
	
	//修改和获取
	public static void main04(String[] args) {
		ArrayList list=new ArrayList();
		list.add(new Person("胡班", 34));
		list.add(new Person("老顾", 40));
		list.add(new Person("邱宁", 20));
		System.out.println(list);
		list.set(2,new Person("哈哈",20));
		System.out.println(list);
		
		Person p=(Person)list.get(0);
		System.out.println("0位置的元素是："+p);
	}
	
	//添加和删除
	public static void main03(String[] args) {
		ArrayList list=new ArrayList();
		list.add("aaa");
		list.add(0,"bbb");
		System.out.println(list);
		list.add("ccc");
		list.add("ddd");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.remove("bbb");
		System.out.println(list);
		list.clear();
		System.out.println(list);
		System.out.println("---------------------------");
		ArrayList list2=new ArrayList();//研究 remove(Object)能删除几个相同的对象
		list2.add("aaa");
		list2.add("bbb");
		list2.add("aaa");
		System.out.println(list2);
		list2.remove("aaa");
		System.out.println(list2);//结果表明，只删除遇到的第一个相同的对象
	}
	
	//集合中可以添加不同类型的数据，但是开发中不允许
	public static void main02(String[] args) {
		ArrayList list=new ArrayList();
		list.add("abc");
		list.add(true);
		list.add(0);
		list.add(3.2);
		list.add('哈');
		list.add(new Date());
		list.add(new Person("汉献帝",2));
		System.out.println(list);
	}
	
	public static void main01(String[] args) {
		MyArrayList list=new MyArrayList();
		list.add(new Person("曹操", 12));
		list.add(new Person("曹植", 10));
		list.add(new Person("孙权", 12));
		list.add(new Person("刘备", 11));
		list.add(new Person("诸葛亮", 6));
		list.add(new Person("关羽", 7));
		list.add(new Person("赵云", 4));
		
		list.delete(2);
		list.add(2, new Person("孙策", 13));
		
		for(int i=0;i<list.size();++i){
			Person p=list.get(i);
			System.out.println(p);
		}

	}

}

