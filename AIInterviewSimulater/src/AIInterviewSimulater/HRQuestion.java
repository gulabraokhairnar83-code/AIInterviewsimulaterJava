package AIInterviewSimulater;

public class HRQuestion extends Question {

    public HRQuestion(String question, String answer) {

        super(question, answer, "HR");
    }

    @Override
    public void displayQuestion() {

        System.out.println("\n[HR Question]");
        System.out.println(question);
    }
}