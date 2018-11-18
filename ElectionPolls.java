package javaTrack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ElectionPolls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> valletBox=new ArrayList<>();
		valletBox.add("Jessy");
		valletBox.add("Philip");
		valletBox.add("Jessy");
		valletBox.add("Philip");
		
		List<String> valletBox2=new ArrayList<>();
		valletBox2.add("Jessy");
		valletBox2.add("Philip");
		valletBox2.add("Jessy");
		valletBox2.add("Jessy");
		valletBox2.add("Jessy");
		
		System.out.println(whoWins(valletBox));
		System.out.println(whoWins(valletBox2));
	}

	private static String whoWins(List<String> valletBox) {
		// TODO Auto-generated method stub
		Map<String, Integer> map=new TreeMap<>();
		for(String candidate:valletBox) {
			if(map.containsKey(candidate)) {
				
				map.put(candidate, map.get(candidate)+1);
			}
			else
				map.put(candidate, 1);
		}
		
		//MyComparator comp=new MyComparator();
		String name=null;
		Set<Entry<String, Integer>> set=map.entrySet();
		Iterator<Entry<String, Integer>> i=set.iterator();
		Entry<String, Integer> e1 = null;
		if(set.size()>0)
			e1=i.next();
		name=e1.getKey();
		while(i.hasNext()) {
			Entry<String, Integer> e=i.next();
			if(e.getValue()>=e1.getValue())
				name=e.getKey();
			e1=e;
		}
		return name;
	}

}