package baseball.member;

import baseball.ball.Ball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {

    public List<Integer> BallGenerator() {
        List<Integer> randomball = new ArrayList<>();
        Random random = new Random();
        while (randomball.size() < 3) {
            int random_number = random.nextInt(9) + 1;
            if (!randomball.contains(random_number)) {
                randomball.add(random_number);
            }
        }
        return randomball;
    }

    public List<Ball> CreateComputerBall() {
        List<Ball> ComputerBall = new ArrayList<>();
        int idx = 1;
        for (Integer ball : BallGenerator()) {
            ComputerBall.add(new Ball(idx++, ball));
        }
        return ComputerBall;
    }



}
