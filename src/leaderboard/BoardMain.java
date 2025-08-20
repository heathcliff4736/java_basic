package leaderboard;

public class BoardMain {
    public static void main(String[] args) {
        BoardManager boardManager = new BoardManager();
        BoardExample boards = new BoardExample(boardManager);
        // 생성자 인젝션 : boardManager객체를 주입함

        boards.run();
    }
}
