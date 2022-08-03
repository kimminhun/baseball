package baseball.member;

import baseball.ball.Ball;
import baseball.ball.BallStatus;

import java.util.HashMap;
import java.util.List;

public class Referee {
    public HashMap<BallStatus, Integer> scoreBoard = new HashMap<>();
    int strike = 0;
    int ballcnt = 0;

    public void getBall(List<Ball> computer,List<Ball> players) {
        strike = 0;
        ballcnt = 0;
        for (int i = 0; i < 3; i++) {
            getJudge(computer, players.get(i));
        }
    }
    public HashMap<BallStatus,Integer> getResult(){
        return scoreBoard;
    }

    private void getJudge(List<Ball> computer, Ball ball) {

        for (Ball com : computer) {
            BallStatus status = getCompare(com, ball);
            if (status==BallStatus.STRIKE) {
                strike++;
            } else if (status == BallStatus.BALL) {
                ballcnt++;
            }
        }
        scoreBoard.put(BallStatus.STRIKE, strike);
        scoreBoard.put(BallStatus.BALL, ballcnt);
    }

    private BallStatus getCompare(Ball com, Ball ball) {
        if (com.getIdx() == ball.getIdx() && com.getValue() == ball.getValue()) {
            return BallStatus.STRIKE;
        } else if (com.getValue() == ball.getValue()) {
            return BallStatus.BALL;
        } else {
            return BallStatus.NOTHING;
        }
    }


}
