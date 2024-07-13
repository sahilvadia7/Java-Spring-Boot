package projects.quizApp;

public class Quiz {
    public static void main(String[] args) {
        QuestionService service = new QuestionService();
        service.playQuiz();
        service.PrintScore();
        }   
}
