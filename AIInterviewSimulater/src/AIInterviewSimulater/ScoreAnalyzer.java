package AIInterviewSimulater;


public class ScoreAnalyzer {

    private final int PASS_PERCENTAGE = 60;

    public void analyze(int correct, int total) {

        double percentage = (correct * 100.0) / total;

        System.out.println("\n======================================");
        System.out.println("          PERFORMANCE REPORT");
        System.out.println("======================================");

        System.out.println("Total Questions : " + total);
        System.out.println("Correct Answers : " + correct);
        System.out.println("Wrong Answers   : " + (total - correct));
        System.out.println("Score           : " + correct + "/" + total);
        System.out.println("Readiness       : " + percentage + "%");

        if (percentage >= 80) {

            System.out.println("Level           : Excellent");
            System.out.println("Status          : Interview Ready");

        } else if (percentage >= PASS_PERCENTAGE) {

            System.out.println("Level           : Good");
            System.out.println("Status          : Almost Ready");

        } else {

            System.out.println("Level           : Needs Improvement");
            System.out.println("Status          : Not Ready");
        }

        System.out.println("\n========== FINAL RECOMMENDATION ==========");

        if (percentage >= 80) {

            System.out.println(
                "You are ready for technical interviews."
            );

        } else if (percentage >= 60) {

            System.out.println(
                "You are almost ready. Improve your weak topics."
            );

        } else {

            System.out.println(
                "You need more preparation before interviews."
            );
        }
    }
}