package leaderboard;

import lombok.Data;

import java.util.Date;

// set, get 하지 않아도 자동으로 오버라이딩 되어있음 (toString 등)
@Data
public class Board {
    private int bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private Date bdate;
}
