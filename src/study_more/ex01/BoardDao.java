package study_more.ex01;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    public List<Board> getBoardList() {
        List<Board> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new Board("제목" + (i + 1), "내용" + (i + 1)));
        }
        return list;
    }
}
