package baseball;

import baseball.ball.Ball;
import baseball.ball.BallStatus;
import baseball.member.Computer;
import baseball.member.Referee;
import baseball.member.Player;
import baseball.view.Output;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public  class Game {

    Computer com = new Computer();
    Player player = new Player();
    Referee referee = new Referee();

    public void game() throws IOException {

        List<Ball> comball = com.CreateComputerBall();

        for (Ball ball : comball) {
            System.out.println(ball.getValue());
        }

        while (true){
            System.out.println("숫자를 입력해주세요 : ");
            List<Ball> userBall = player.createUserBall();
            referee.getBall(comball, userBall);
            HashMap<BallStatus, Integer> result = referee.getResult();
            Integer results = result.get(BallStatus.STRIKE);

            System.out.println(Output.sayResult(result));
            if (results == 3) {
                System.out.println("게임종료");
            }

        }
    }

    public boolean getReplay() {
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            return true;
        }else {
            return false;
        }

    }


}
