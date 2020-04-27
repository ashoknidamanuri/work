package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List lst=new ArrayList();
		lst.add(0,"hari");
		lst.add(1,1);
		//System.out.println(lst.get(1));
		//lst.remove(1);
		//System.out.println(lst);
		lst.add(0,"siva");
		System.out.println(lst);
		
		
		String a[]= {"a","b","c"};
		String b[]= {"e","d","f"};
		
		List lst1=new ArrayList(Arrays.asList(a));
		lst1.addAll(Arrays.asList(b));
		System.out.println(lst1);
		
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(0,1);
		l1.add(1,2);
		l1.add(2,3);
		
		System.out.println(l1);
		
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		
		//l1.addAll(l2);
		//
		System.out.println(l1);
		l1.addAll(1,l2);
		System.out.println(l1);
		
		l1.remove(1);
		System.out.println(l1);
		
		
		
		List<String> list = new ArrayList<String>(Arrays.asList("a", "b", "d", "c"));
	    List<String> list2 = new ArrayList<String>(Arrays.asList("b", "f", "c"));

	    list.retainAll(list2);
	    list2.removeAll(list);
	    System.out.println("similiar " + list);
	    System.out.println("different " + list2);

		List k=new LinkedList();
		k.add(0,5);
		k.add(0,10);
		System.out.println(k);
		
		Set<String> s=new HashSet<String>(Arrays.asList("babu","kk","kk"));
		System.out.println(s);
		s.add("ram");
		for(String i:s) {
			System.out.println(i);
		}
		
		int limit=100;
		for(int i=2;i<limit;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i);
			}
		}
		
		//duplicate characters
		
		String s1="haribaburamakrishna";
		char[] ch=s1.toCharArray();
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		for(Character chars:ch) {
			if(map.containsKey(chars)) {
				map.put(chars, map.get(chars)+1);
			}
			else {
				map.put(chars, 1);
			}
			
		}
		Set<Character> keys=map.keySet();
		for(Character c:keys) {
			if(map.get(c)>1) {
				System.out.println(c + " " + map.get(c));
			}
		}
		//reverse string
		String str = "suresh";
		char[] ch1 = str.toCharArray();
		Arrays.sort(ch1);
		System.out.println(ch1);
		String str1 = "662366372379973772377563562365265";
		char[] c = str1.toCharArray();
		Arrays.sort(c);
		System.out.println(c);
		
		//big number
		int[] ar = { 21, 5, 7, 45, 38, 75, 89, 3, 6 };

		Arrays.sort(ar);
		int bignm=0;
		for(int num:ar) {
			if(bignm<num) {
				bignm=num;
			}
		}
		System.out.println(bignm);
		
		
	}

		
}
