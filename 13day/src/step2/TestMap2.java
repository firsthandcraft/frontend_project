package step2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestMap2 {
public static void main(String[] args) {
	
	HashMap map = new HashMap();
	map.put("a",new FriendVO("謝尻仙","殿肩",200));
	map.put("b",new FriendVO("滴軒什纏","葛勲走たい",300));
	map.put("c",new FriendVO("社走っさげ","督嘘",400));
	System.out.println(map);
	//{a=FriendVO [name=謝尻仙, address=殿肩, money=200], b=FriendVO [name=滴軒什纏, address=葛勲走たい, money=300], c=FriendVO [name=社走っさげ, address=督嘘, money=400]}

	FriendVO vo = (FriendVO)map.get("c");
	System.out.println(vo.getName()+""+vo.getAddress());//社走っさげ督嘘
	System.out.println(map.get("C"));//key葵精 企社庚切 姥紺廃陥.//null
	
	Set set=map.keySet();
	Iterator it =set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		/* a
			b
			c*/
	}
	System.out.println("map税 value級幻 窒径");
	Collection col = map.values();
	Iterator it2 =set.iterator();//切戟姥繕税 汽戚斗鷺幻 級嬢哀呪 赤惟 窒径
	while(it2.hasNext()) {
		System.out.println(it2.next());
		/* a
			b
			c*/
	}
	
	
}}
