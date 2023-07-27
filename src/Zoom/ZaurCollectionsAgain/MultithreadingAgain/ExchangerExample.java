package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

enum Action {
    KAMEN, NOJNICI, BUMAGA;
}

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.NOJNICI);
        friend1Action.add(Action.BUMAGA);
        friend1Action.add(Action.NOJNICI);
        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.KAMEN);
        friend2Action.add(Action.KAMEN);
        new BestFriend("Zaur", exchanger, friend1Action);
        new BestFriend("Maksim", exchanger, friend2Action);
    }
}

class BestFriend extends Thread {
    private String name;
    private Exchanger<Action> exchanger;
    private List<Action> myActions;

    public BestFriend(String name, Exchanger<Action> exchanger, List<Action> myActions) {
        this.name = name;
        this.exchanger = exchanger;
        this.myActions = myActions;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if ((myAction == Action.KAMEN && friendsAction == Action.NOJNICI)
                || (myAction == Action.NOJNICI && friendsAction == Action.BUMAGA)
                || (myAction == Action.BUMAGA && friendsAction == Action.KAMEN)) {
            System.out.println(name + " WINS !!!");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
