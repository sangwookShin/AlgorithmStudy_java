package programmers;
import java.util.*;

public class Phonenumber_list {

	public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        //해쉬맵 생성
        HashMap<String, Integer> map = new HashMap<>();
        
        //해쉬맵 값 추가
        for(int i=0;i<phone_book.length;i++) {
            map.put(phone_book[i], i);
        }
        
        //값 비교
        for(int i=0;i<phone_book.length;i++) {
            
            for(int j=1;j<phone_book[i].length();j++) {

                if(map.containsKey(phone_book[i].substring(0,j))) {
                    return false;
                }
            }
   
        }

        return answer;
    }
}
