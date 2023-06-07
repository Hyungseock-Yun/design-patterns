package gof.designpatterns._03_behavioral._06_memento._02_after;

import lombok.Data;

@Data
public class Game {

    private int redTeamScore;

    private int blueTeamScore;

    public GameSave save() {
        return new GameSave(this.blueTeamScore, this.redTeamScore);
    }

    public void restore(GameSave gameSave) {
        this.blueTeamScore = gameSave.getBlueTeamScore();
        this.redTeamScore = gameSave.getRedTeamScore();
    }
}
