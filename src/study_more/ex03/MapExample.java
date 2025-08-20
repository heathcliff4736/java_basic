package study_more.ex03;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        // 코드 작성
        for (Integer value : map.values()) {
            totalScore = totalScore + value;
        }
//        totalScore = map.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("평균 점수: " + (totalScore / 3));
        
        maxScore = Collections.max(map.values());
        System.out.println("최고 점수: " + maxScore);

        name = Collections.max(map.keySet());
        System.out.println("최고 점수를 받은 아이디: " + name);


    }
}
