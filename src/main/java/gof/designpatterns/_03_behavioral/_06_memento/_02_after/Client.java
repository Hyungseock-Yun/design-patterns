package gof.designpatterns._03_behavioral._06_memento._02_after;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        GameSave gameSave = game.save();

        game.setBlueTeamScore(12);
        game.setRedTeamScore(22);

        game.restore(gameSave);

        System.out.println(game.getBlueTeamScore());
        System.out.println(game.getRedTeamScore());
    }
}
