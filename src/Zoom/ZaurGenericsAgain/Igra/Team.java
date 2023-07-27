package Zoom.ZaurGenericsAgain.Igra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> {
    private String nameOfTeam;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.nameOfTeam = name;
    }

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println("New player ( " + participant.getName() + " ) joined in team : " + nameOfTeam);
    }

    public void playWith(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerName = this.nameOfTeam;
        } else {
            winnerName = team.nameOfTeam;
        }
        System.out.println("The winner is " + winnerName + " !!!");
    }
}
