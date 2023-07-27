package Generics.Igra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{
    private String teamName;
    private List<T> participants = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addNewParticipant(T participant){
        this.participants.add(participant);
        System.out.println("V comandy " + teamName + " zachel Ychastnik " + participant.getName());
    }

    public void playWith(Team<T> team){
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i==0){
            winnerName = this.teamName;
        }else {
            winnerName = team.teamName;
        }
        System.out.println("Team who wins is " + winnerName);

    }
}
