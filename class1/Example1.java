package class1;

import java.util.HashMap;

public class Example1 {
	
	public static void main(String[] args){
		String s="Lsn Software Private Limited";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length()-1;i++) {
			if(map.containsKey(s.charAt(i)) ) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else if(s.charAt(i)!=' '){
				map.put(s.charAt(i), 1);
			}
		}
		System.out.println(map);
		
		
		
	}

}
