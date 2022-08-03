package baseball.view;

import baseball.ball.BallStatus;

import java.util.HashMap;

public class Output {

    public static String sayResult(HashMap<BallStatus, Integer> scoreboard) {
        int strikecnt = scoreboard.get(BallStatus.STRIKE);
        int ballcnt = scoreboard.get(BallStatus.BALL);
        if (strikecnt == 3) {
            return "3 스트라이크!! 축하드립니다.";
        } else if (strikecnt > 0 && ballcnt == 0) {
            return strikecnt + " 스트라이크";
        } else if (strikecnt > 0 && ballcnt > 0) {
            return strikecnt + " 스트라이크" + ballcnt + " 볼";
        } else if (strikecnt == 0 && ballcnt > 0) {
            return ballcnt + " 볼 ";
        } else return "낫싱";
    }


}
