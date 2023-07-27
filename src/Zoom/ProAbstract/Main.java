package Zoom.ProAbstract;

public class Main {
    public static void main(String[] args) {
//        System.out.println(new ReactiveHttp2Client().doGet("wew"));
//        System.out.println(new ReactiveHttp2Client().doPost("wew"));
        User user = new User();

        user.car = new Toyota();
        user.goToWork();
        user.car = new Tesla();
        user.goToWork();

    }
}
