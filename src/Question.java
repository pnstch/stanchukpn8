import java.util.ArrayList;
import java.util.List;

public class Question {

    public Question() {
    }

    public Question(String questions, List<String> answers, int rightAnswer) {

        this.questions = questions;
        this.answers = answers;
        this.rightAnswer = rightAnswer;

    }

    public void outQuestion(){

        System.out.println(questions + "\n");
        for (int i = 0; i < answers.size() ; i++){
            System.out.println(answers.get(i) + "\n");
        }

    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    private String questions;
    private List<String> answers = new ArrayList<>();
    private int rightAnswer;

}