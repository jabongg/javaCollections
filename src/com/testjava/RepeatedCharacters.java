import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {
	public static void main(String[] args) {
		String str = "aabbbbcddd";
		Map<Character,Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				int value = map.get(ch);
				map.put(ch, value + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);						
	}    
}