package Generics.Igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 32);
        Schoolar schoolar2 = new Schoolar("Korechz", 52);

        Student student1 = new Student("Maksim", 17);
        Student student2 = new Student("Nekit", 17);

        Employee employee1 = new Employee("Petya", 76);
        Employee employee2 = new Employee("Vanya", 12);

        Student student3 = new Student("Golova", 18);
        Student student4 = new Student("Polak", 19);

        Team<Student> studentTeam1 = new Team<>("Rokitko");
        studentTeam1.addNewParticipant(student1);
        studentTeam1.addNewParticipant(student2);

        Team<Schoolar>scholarTeam = new Team<>("Top");
        scholarTeam.addNewParticipant(schoolar1);
        scholarTeam.addNewParticipant(schoolar2);

        Team<Employee>employeeTeam = new Team<>("Rabotyagi");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        // Team<String>employeeTeam2 = new Team<>("Rabotyagi");

        Team<Student> studentTeam2 = new Team<>("Cheglu");
        studentTeam2.addNewParticipant(student3);
        studentTeam2.addNewParticipant(student4);

        studentTeam1.playWith(studentTeam2);


    }
}
