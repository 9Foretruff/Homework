package Zoom.ZaurGenericsAgain.Igra;

public class Test {
    public static void main(String[] args) {
        Scholar scholar1 = new Scholar("Vanya", 12);
        Scholar scholar2 = new Scholar("Oleg", 14);

        Student student1 = new Student("Illya", 16);
        Student student2 = new Student("Maksim", 17);

        Employee employee1 = new Employee("Vladimir", 45);
        Employee employee2 = new Employee("Zaur", 35);

        Team<Scholar> scholarTeam = new Team<>("Vitality");
        scholarTeam.addNewParticipant(scholar1);
        scholarTeam.addNewParticipant(scholar2);

        Team<Student> studentTeam = new Team<>("Navi");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Mouz");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Scholar> scholarTeam2 = new Team<>("Gambit");
        Scholar scholar3 = new Scholar("Pavel", 11);
        Scholar scholar4 = new Scholar("Dmitry", 10);
        scholarTeam2.addNewParticipant(scholar3);
        scholarTeam2.addNewParticipant(scholar4);

        scholarTeam.playWith(scholarTeam2);
    }
}
