package homework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MemberController {
	Map<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMember(String id, Member m) {
		if (!map.containsKey(id)) {
			map.put(id, m);
			return true;
		} else {
			return false;
		}
	}
	
	public String logIn(String id, String password) {
		Member member = map.get(id);
		if (map.containsKey(id)) {
			if (member.getPassword().equals(password)) {
				return member.getName();
			}
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPW) {
		if (map.containsKey(id) && map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPW);
			return true;
		} else {
			return false;
		}
	}
	
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}
	
	public TreeMap<String, String> sameName(String name) {
		Set<String> mapSet = map.keySet();
		return null;
	}
}
