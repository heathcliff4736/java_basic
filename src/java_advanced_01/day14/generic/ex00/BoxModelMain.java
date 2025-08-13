package java_advanced_01.day14.generic.ex00;

import java.util.ArrayList;

public class BoxModelMain {
    public static void main(String[] args) {
        // 로켓 프레쉬 라인, 철호가 "배추", "무", "상추", "삼겹살" 구매하였다.
        // 물품을 담아서 box에 담고 box에 담긴 내용을 출력하세요

        ArrayList<String> boxModel = new ArrayList<>();
        boxModel.add("배추");
        boxModel.add("무");
        boxModel.add("상추");
        boxModel.add("삼겹살");

        for (String string : boxModel) {
            System.out.println(string);
        }
    }
}
