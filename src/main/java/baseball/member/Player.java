package baseball.member;

import baseball.ball.Ball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Player {
    public String getInput() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        return input;
    }

    public List<Ball>  createUserBall() throws IOException {
        String input = getInput();
        List<Ball> playerBall = new ArrayList<>();
        int idx = 1;
        for (int i = 0; i < input.length(); i++) {
            int tmp = Integer.parseInt(String.valueOf(input.charAt(i)));
            playerBall.add(new Ball(idx++, tmp));
        }
        return playerBall;
    }

}
