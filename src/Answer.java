public class Answer {

    public Answer() {
    }

    public Answer(Question question, int yourAnswer) {
        this.yourAnswer = yourAnswer;
        this.question = question;
    }

    public boolean checkCorrect() {
        if (question.getRightAnswer() == yourAnswer)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "yourAnswer=" + yourAnswer +
                ", question=" + question +
                '}';
    }

    private int yourAnswer;
    private Question question;

}
