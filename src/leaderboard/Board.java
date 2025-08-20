package leaderboard;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

// set, get 하지 않아도 자동으로 오버라이딩 되어있음 (toString 등)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private int bno;
    private String bTitle;
    private String bContent;
    private String bWriter;
    private Date bDate;
}
