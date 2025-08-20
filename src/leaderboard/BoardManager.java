package leaderboard;

import java.util.LinkedHashMap;
import java.util.Map;

public class BoardManager {
    private Map<String,Board> boardMap = new LinkedHashMap<>();

    // Singleton pattern을 적용하여 어드민계정은 하나이다. 어드민 계정은 게시글 저장소를 관리함
    private static BoardManager boardManagerSingleton = new BoardManager();

    public static BoardManager getInstance() {
        return boardManagerSingleton;
    }

    public Map<String, Board> getBoardMap() {
        return boardMap;
    }

    public void setBoardMap(Map<String, Board> boardMap) {
        this.boardMap = boardMap;
    }

}
