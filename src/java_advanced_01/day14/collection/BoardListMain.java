package java_advanced_01.day14.collection;

import java.util.ArrayList;
import java.util.List;

public class BoardListMain {
    public static void main(String[] args) {
        List<Board> boardList = new ArrayList<>();

        // 글 하나를 작성하여 게시판에 올립니다.
        boardList.add(new Board("컬렉션 학습 첫째날", "쉽지 않음", "sym"));
        boardList.add(new Board("컬렉션 학습 둘째날", "어려움", "sym"));
        boardList.add(new Board("컬렉션 학습 셋째날", "보통", "sym"));
        boardList.add(new Board("컬렉션 학습 넷째날", "어렵지 않음", "sym"));


        // 현재 게시판의 글의 수
        int size = boardList.size();
        System.out.println("전체 글 수 : " + size);

        for (Board board : boardList) {
            System.out.print("제목: "+board.getSubject()+"\t\s");
            System.out.print("내용: "+board.getContent()+"\t\s");
            System.out.print("작성자: "+board.getWriter()+"\n");
            System.out.println("===============================================");
        }
        
        // 특정 인덱스의 객체 가져오기
        Board board = boardList.get(2);
        System.out.print("제목: "+board.getSubject()+"\t\s");
        System.out.print("내용: "+board.getContent()+"\t\s");
        System.out.print("작성자: "+board.getWriter()+"\n");

        System.out.println("=======================삭제======================");
        boardList.remove(2);
        Board board1 = boardList.get(2);
        System.out.print("제목: "+board1.getSubject()+"\t\s");
        System.out.print("내용: "+board1.getContent()+"\t\s");
        System.out.print("작성자: "+board1.getWriter()+"\n");
        System.out.println("===============================================");

    }
}
