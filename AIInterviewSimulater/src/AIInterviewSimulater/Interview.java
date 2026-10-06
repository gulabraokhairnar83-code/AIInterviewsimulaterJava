package AIInterviewSimulater;


import java.util.Scanner;

public class Interview {

    private Candidate candidate;
    private Question[] questions;

    private int correct = 0;
    private int wrong = 0;

    public Interview(Candidate candidate, Question[] questions) {

        this.candidate = candidate;
        this.questions = questions;
    }

    public void startInterview() {
        startInterview(new Scanner(System.in));
    }

    public void startInterview(Scanner sc) {

        System.out.println("\n======================================");
        System.out.println("          INTERVIEW STARTED");
        System.out.println("======================================");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\nQuestion " + (i + 1));

            // Runtime Polymorphism
            questions[i].displayQuestion();

            System.out.print("Your Answer: ");

            String userAnswer = sc.nextLine();

            if (questions[i].checkAnswer(userAnswer)) {

                System.out.println("Correct!");
                correct++;

            } else {

                System.out.println("Wrong!");
                wrong++;
            }
        }

        System.out.println("\n======================================");
        System.out.println("        INTERVIEW COMPLETED");
        System.out.println("======================================");

        System.out.println("Candidate : " + candidate.getName());
        System.out.println("Correct   : " + correct);
        System.out.println("Wrong     : " + wrong);
    }

    public int getCorrect() {
        return correct;
    }

    public int getWrong() {
        return wrong;
    }

    public int getTotalQuestions() {
        return questions.length;
    }

    public Question[] getQuestions() {
        return questions;
    }
}