package gof.designpatterns._03_behavioral._06_memento._01_before;

/**
 * Client가 Game의 상세정보를 알고 있어야한다.
 * Game이 변경되면 Client도 변경해야함
 */
public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        int blueTeamScore = game.getBlueTeamScore();
        int redTeamScore = game.getRedTeamScore();

        Game restoredGame = new Game();
        game.setBlueTeamScore(blueTeamScore);
        game.setRedTeamScore(redTeamScore);
    }
}
