package Hash_Map;

import java.util.*;
public class one {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
char[] c = s.toCharArray();
HashMap<Character,Integer> hm = new HashMap<>();
for(char key:c){
    Integer frequency = hm.get(key);
    if(frequency==null)
    frequency=1;
    else
    frequency+=1;
    hm.put(key,frequency);
} 
System.out.println(hm.get('4'));
sc.close();
}
}

