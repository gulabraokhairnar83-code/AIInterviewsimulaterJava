package AIInterviewSimulater;


public class TechnicalQuestion extends Question {

    private String topic;

    public TechnicalQuestion(String question, String answer,
                             String category, String topic) {

        super(question, answer, category);

        this.topic = topic;
    }

    @Override
    public void displayQuestion() {

        System.out.println("\n[" + category + " - " + topic + "]");
        System.out.println(question);
    }

    public String getTopic() {
        return topic;
    }
}