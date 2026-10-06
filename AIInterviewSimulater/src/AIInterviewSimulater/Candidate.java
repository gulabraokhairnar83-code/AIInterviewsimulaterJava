package AIInterviewSimulater;


public class Candidate {

    private int id;
    private String name;
    private String email;

    public Candidate(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void displayCandidate() {
        System.out.println("\n========== CANDIDATE DETAILS ==========");
        System.out.println("Candidate ID : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Email        : " + email);
    }

    public String getName() {
        return name;
    }
}
