package p11api.p03lecture.p03object.p04wrapper;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		int [] arr1 = new int[3];
		arr1[0] = 11;
		arr1[1] = 12;
		arr1[2] = 13;
		
//		int[] arr2 = new int[4];
		int[] arr2 = Arrays.copyOf(arr1, 5);
		System.out.println(Arrays.toString(arr2));
		
		//ArrayList
		
		System.out.println("======================");
		ArrayList<String> list1 = new ArrayList<>(); //처음 만들때 길이 정해질 필요 없음
		list1.add("java");
		list1.add("java1");
		list1.add("java2");
		
		System.out.println(list1); //값을 집어 넣을 때마다 길이가 늘어난다.
		
		//int in ArrayList	
		System.out.println("=======================");
//		ArryaList<int> list2 = new ArrayList<>(); //기본타입을 담을 수 없는 콜랙션
		ArrayList<Integer> list2 = new ArrayList<>(); //wrapper클래스 활용해야함
		list2.add(new Integer(100)); //autoboxing일어남
		list2.add(200);//autoboxing일어남
		list2.add(300);
		System.out.println(list2);//실제로 기본타입 값들이 아니라, 참조타입 값들이 들어있는것
		
		list2.get(2); //300을 꺼내고 싶을때
		//get은 integer타입을 리턴함
		
		Integer i3 = list2.get(2);
		System.out.println(i3);
		int k1 = list2.get(2);
		System.out.println(k1);
		
		//예전 방법
		if(list2.get(2) != null) {
			int i5 = list2.get(2).intValue();
			System.out.println(i5);
		}
		
		//null 주의 해야함
		int i6 = list2.get(3);
		System.out.println(i6);
		
	}
}
