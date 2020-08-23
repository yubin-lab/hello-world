package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = "";
		Scanner scan = new Scanner(System.in);
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String player : participant) {
			map.put(player, map.getOrDefault(player, 0)+1);
		}
		
		for(String player : completion) {
			map.put(player, map.getOrDefault(player, 0)-1);
		}

		for(String key : map.keySet()) {
			if(map.get(key) != 0) {
				answer = key;
			}
		}
		System.out.println(map);
		System.out.println(answer);
		System.out.println(solution(12));
	}
	
	
	public static int solution(int n) {
      int answer = 0;
      for(int i = 1; i <= n; i++){
          if(n%i == 0){
              answer= answer + i;
          }
      }
      
      return answer;
      
  }

}
