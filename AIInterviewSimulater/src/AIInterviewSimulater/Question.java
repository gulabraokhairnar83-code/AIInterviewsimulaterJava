package AIInterviewSimulater;

public class Question {

    protected String question;
    protected String answer;
    protected String category;

    public Question(String question, String answer, String category) {
        this.question = question;
        this.answer = answer;
        this.category = category;
    }

    public void displayQuestion() {
        System.out.println(question);
    }

    public boolean checkAnswer(String userAnswer) {
        return answer.equalsIgnoreCase(userAnswer.trim());
    }

    public String getCategory() {
        return category;
    }
}