package AIInterviewSimulater;

import java.util.Scanner;

public class Main {

    static int totalInterviews = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("   AI INTERVIEW READINESS SIMULATOR");
        System.out.println("======================================");

        // Candidate details
        System.out.print("Enter Candidate ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Candidate Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        Candidate candidate =
                new Candidate(id, name, email);

        candidate.displayCandidate();

        // Category selection
        System.out.println("\n========== SELECT CATEGORY ==========");

        System.out.println("1. Core Java");
        System.out.println("2. OOP");
        System.out.println("3. DBMS");
        System.out.println("4. DSA");
        System.out.println("5. HR");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        Question[] questions;

        switch (choice) {

            // ================= CORE JAVA =================

            case 1:

                questions = new Question[5];

                questions[0] = new TechnicalQuestion(
                        "Which keyword is used to inherit a class?",
                        "extends",
                        "Core Java",
                        "Inheritance"
                );

                questions[1] = new TechnicalQuestion(
                        "Which keyword is used to create an object?",
                        "new",
                        "Core Java",
                        "Objects"
                );

                questions[2] = new TechnicalQuestion(
                        "Which method is the entry point of Java?",
                        "main",
                        "Core Java",
                        "Java Basics"
                );

                questions[3] = new TechnicalQuestion(
                        "Which keyword is used to make a variable constant?",
                        "final",
                        "Core Java",
                        "Keywords"
                );

                questions[4] = new TechnicalQuestion(
                        "Which keyword is used to create a child class?",
                        "extends",
                        "Core Java",
                        "Inheritance"
                );

                break;


            // ================= OOP =================

            case 2:

                questions = new Question[5];

                questions[0] = new TechnicalQuestion(
                        "Which OOP concept hides data?",
                        "encapsulation",
                        "OOP",
                        "Encapsulation"
                );

                questions[1] = new TechnicalQuestion(
                        "Which OOP concept allows method overriding?",
                        "polymorphism",
                        "OOP",
                        "Polymorphism"
                );

                questions[2] = new TechnicalQuestion(
                        "Which keyword is used for inheritance?",
                        "extends",
                        "OOP",
                        "Inheritance"
                );

                questions[3] = new TechnicalQuestion(
                        "Which keyword refers to the current object?",
                        "this",
                        "OOP",
                        "this Keyword"
                );

                questions[4] = new TechnicalQuestion(
                        "Which keyword calls the parent constructor?",
                        "super",
                        "OOP",
                        "super Keyword"
                );

                break;


            // ================= DBMS =================

            case 3:

                questions = new Question[5];

                questions[0] = new TechnicalQuestion(
                        "What does SQL stand for?",
                        "structured query language",
                        "DBMS",
                        "SQL"
                );

                questions[1] = new TechnicalQuestion(
                        "Which key uniquely identifies a record?",
                        "primary key",
                        "DBMS",
                        "Keys"
                );

                questions[2] = new TechnicalQuestion(
                        "Which command is used to retrieve data?",
                        "select",
                        "DBMS",
                        "SQL"
                );

                questions[3] = new TechnicalQuestion(
                        "Which command is used to remove a table?",
                        "drop",
                        "DBMS",
                        "DDL"
                );

                questions[4] = new TechnicalQuestion(
                        "Which command is used to add a new record?",
                        "insert",
                        "DBMS",
                        "DML"
                );

                break;


            // ================= DSA =================

            case 4:

                questions = new Question[5];

                questions[0] = new TechnicalQuestion(
                        "Which data structure follows LIFO?",
                        "stack",
                        "DSA",
                        "Stack"
                );

                questions[1] = new TechnicalQuestion(
                        "Which data structure follows FIFO?",
                        "queue",
                        "DSA",
                        "Queue"
                );

                questions[2] = new TechnicalQuestion(
                        "Which algorithm is used to search a sorted array?",
                        "binary search",
                        "DSA",
                        "Searching"
                );

                questions[3] = new TechnicalQuestion(
                        "Which data structure uses nodes and links?",
                        "linked list",
                        "DSA",
                        "Linked List"
                );

                questions[4] = new TechnicalQuestion(
                        "Which sorting algorithm repeatedly swaps adjacent elements?",
                        "bubble sort",
                        "DSA",
                        "Sorting"
                );

                break;


            // ================= HR =================

            case 5:

                questions = new Question[5];

                questions[0] = new HRQuestion(
                        "Are you comfortable working in a team?",
                        "yes"
                );

                questions[1] = new HRQuestion(
                        "Are you willing to relocate?",
                        "yes"
                );

                questions[2] = new HRQuestion(
                        "Are you ready for an interview?",
                        "yes"
                );

                questions[3] = new HRQuestion(
                        "Are you comfortable working under pressure?",
                        "yes"
                );

                questions[4] = new HRQuestion(
                        "Do you consider yourself a quick learner?",
                        "yes"
                );

                break;


            default:

                System.out.println("Invalid choice.");
                sc.close();
                return;
        }

        // Create Interview object
        Interview interview =
                new Interview(candidate, questions);

        // Static counter
        totalInterviews++;

        // Start interview
        interview.startInterview(sc);

        // Analyze result
        ScoreAnalyzer analyzer =
                new ScoreAnalyzer();

        analyzer.analyze(
                interview.getCorrect(),
                interview.getTotalQuestions()
        );

        System.out.println(
                "\nTotal Interviews Conducted: "
                + totalInterviews
        );

        System.out.println(
                "\nThank you for using the simulator!"
        );

        sc.close();
    }
}