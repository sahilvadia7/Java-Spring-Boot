package projects.quizApp;

import java.util.Scanner;

public class QuestionService {

    static Questions[] question = new Questions[5];
    static String selection[] = new String[5];

    public QuestionService() {
        question[0] = new Questions(1, "Apple color", "Pink", "red", "yellow", "blue", "red");
        question[1] = new Questions(2, "banana color", "Pink", "red", "yellow", "blue", "yellow");
        question[2] = new Questions(3, "orange color", "Pink", "red", "yellow", "orange", "orange");
        question[3] = new Questions(4, "pine-apple color", "Pink", "red", "yellow", "blue", "yellow");
        question[4] = new Questions(5, "kiwi color", "Green", "red", "yellow", "blue", "Green");

    }

    int in = 0;

    public void playQuiz() {
        for (Questions i : question) {
            System.out.println("\nQuestion number : " + i.getId());
            System.out.println(i.getQuestion());
            System.out.println(i.getOpt1());
            System.out.println(i.getOpt2());
            System.out.println(i.getOpt3());
            System.out.println(i.getOpt4());

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter ans : ");
            selection[in] = sc.nextLine();
            in++;
            sc.close();
        }

        // for(String s: selection){
        // System.out.println(s);
        // }

    }

    public void PrintScore() {
        int score = 0;

        for (int i = 0; i < question.length; i++) {
            Questions que = question[i];
            String ansKey = que.getAnswer();
            String userAnswer = selection[i];

            if (ansKey.equals(userAnswer)) {
                score++;
            }
        }

        System.out.println("Your Socre is : " + score);
    }

}
