package com;

import java.util.ArrayList;
import java.util.Date;

public class Test {

	/**
	
	������װ�ܶ����ݵ���,������ֻ�ܷ������ͱ���(�ǻ�����������)��Java1.5֮��add�����п���ֱ��д������������(ԭ�������˵)
	Java��������ڰ汾1.2֮ǰ��ֻ��һ���������������(������MyArrayList)��Vector��
	��Java1.2�У������˴�����������������Щ����������һ�����ӿ�(Collection)��Ҳ����˵�����е���������һ��Collection��
	Java��Collection���������е��ӽӿں�ʵ������ɵ���ôһ����ϵ����֮Ϊ�����Ͽ��(Collection Framework)
	
	���Ͽ���У�����������¼�����ArrayList,LinkedList,HashSet,TreeSet,Stack,Vector,
	����ArrayList��Vector���ǻ�������ģ�����д��MyArrayListԭ���ࡣ
	Vector�Ƚ��ϣ���ʵArrayList���������Vector�ġ�Ҳ����˵��ArrayList��ĳЩ����������Vector��
	
	=====================================================================
	[ArrayList��ʹ��]
	
	������ݣ�add(Object)//����������һ��λ���������             add(int,Object)//��ָ��Ϊ���������
	ɾ�����ݣ�remove(int)//ɾ�������±�Ķ���               remove(Object)//ɾ����������                clear()//ɾ����������
	�޸����ݣ�set(int,Object)//��ָ���±괦��Ԫ�ظ�Ϊ�����е�
	��ȡ���ݣ�get(int)//��ȡָ��λ�õ�Ԫ��,����ֵ������Object
	
	����������indexOf(Object)//��һ�γ��ֵ��±�  lastIndexOf(Object)//���һ�γ��ֵ��±�
	 	    contains(Object)//����true/false����ʾ��û�����Ԫ��
	 	    isEmpty()//����true/false����ʾ�����ǲ��ǿյ�
	 	    
	���⡿[һ��ѭ��(��ҪǶ��ѭ��)ȥ��ArrayList�е��ظ�Ԫ�أ��������µ�����]
	
	[�о�һ��LinkedList���÷�]
	
	 */
	
	//��������
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
		System.out.println("aaa��һ�γ��ֵ��±꣺"+index1);
		System.out.println("aaa���һ�γ��ֵ��±꣺"+index2);
		
		boolean isIn1=list.contains("bbbbbbbbbbb");
		System.out.println("list����û��bbbbbbbbbbb  "+isIn1);
		
		boolean isIn2=list.contains("bbbbbb");
		System.out.println("list����û��bbbbbb  "+isIn2);
		
		System.out.println("list�ǿյ���"+list.isEmpty());
		list.clear();
		System.out.println("list�ǿյ���"+list.isEmpty());
	}
	
	//�޸ĺͻ�ȡ
	public static void main04(String[] args) {
		ArrayList list=new ArrayList();
		list.add(new Person("����", 34));
		list.add(new Person("�Ϲ�", 40));
		list.add(new Person("����", 20));
		System.out.println(list);
		list.set(2,new Person("����",20));
		System.out.println(list);
		
		Person p=(Person)list.get(0);
		System.out.println("0λ�õ�Ԫ���ǣ�"+p);
	}
	
	//��Ӻ�ɾ��
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
		ArrayList list2=new ArrayList();//�о� remove(Object)��ɾ��������ͬ�Ķ���
		list2.add("aaa");
		list2.add("bbb");
		list2.add("aaa");
		System.out.println(list2);
		list2.remove("aaa");
		System.out.println(list2);//���������ֻɾ�������ĵ�һ����ͬ�Ķ���
	}
	
	//�����п�����Ӳ�ͬ���͵����ݣ����ǿ����в�����
	public static void main02(String[] args) {
		ArrayList list=new ArrayList();
		list.add("abc");
		list.add(true);
		list.add(0);
		list.add(3.2);
		list.add('��');
		list.add(new Date());
		list.add(new Person("���׵�",2));
		System.out.println(list);
	}
	
	public static void main01(String[] args) {
		MyArrayList list=new MyArrayList();
		list.add(new Person("�ܲ�", 12));
		list.add(new Person("��ֲ", 10));
		list.add(new Person("��Ȩ", 12));
		list.add(new Person("����", 11));
		list.add(new Person("�����", 6));
		list.add(new Person("����", 7));
		list.add(new Person("����", 4));
		
		list.delete(2);
		list.add(2, new Person("���", 13));
		
		for(int i=0;i<list.size();++i){
			Person p=list.get(i);
			System.out.println(p);
		}

	}

}

