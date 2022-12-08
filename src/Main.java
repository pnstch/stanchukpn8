import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        List<Answer> answers = inputAnswers();
        Answer answer = new Answer();
        for (int i = 0; i < answers.size(); i++) {
            answer = answers.get(i);
            if (answer.checkCorrect()) {
                System.out.println("Задание: " + i + "  верный ответ");
                counter++;
            } else
                System.out.println("Задание: " + i + "  ошибка");
        }
        System.out.println("Верных ответов: " + counter + " из " + answers.size());
    }

    private static List<Answer> inputAnswers() {

        Scanner scanner = new Scanner(System.in);
        List<Answer> answers = new ArrayList<>();
        Question temp = new Question();
        List<Question> questions = formationQuestion();
        for (int i = 0; i < questions.size(); i++) {
            temp = questions.get(i);
            temp.outQuestion();
            answers.add(new Answer(temp, scanner.nextInt()));
        }
        scanner.close();
        return answers;

    }

    private static List<Question> formationQuestion() {

        List<Question> questions = new ArrayList<>();
        List<String> tasksAnswers = new ArrayList<>();
        tasksAnswers.add("1.метод, который вызывается при создании экземпляра объекта");
        tasksAnswers.add("2.специальная переменная класса;");
        tasksAnswers.add("3.объект класса;");
        questions.add(new Question("Что такое конструктор у класса?", tasksAnswers, 1));

        List<String> tasksAnswers2 = new ArrayList<>();
        tasksAnswers2.add("1.у данного класса автоматически создается конструктор по умолчанию;");
        tasksAnswers2.add("2. нельзя создать объект этого класса;");
        tasksAnswers2.add("3. код не скомпилируется;");
        questions.add(new Question("Если у класса в теле не объявлен конструктор тогда", tasksAnswers2, 1));

        List<String> tasksAnswers3 = new ArrayList<>();
        tasksAnswers3.add("1.неограниченное количество;");
        tasksAnswers3.add("2.только один;");
        tasksAnswers3.add("3. не более пяти;");
        questions.add(new Question("Сколько конструкторов может быть у класса?", tasksAnswers3, 1));

        List<String> tasksAnswers4 = new ArrayList<>();
        tasksAnswers4.add("1.в порядке их объявления;");
        tasksAnswers4.add("2.все одновременно;");
        tasksAnswers4.add("3.в случайном порядке;");
        questions.add(new Question("Переменные в классе инициализируется", tasksAnswers4, 1));

        List<String> tasksAnswers5 = new ArrayList<>();
        tasksAnswers5.add("1.чтобы другие классы могли корректно получать или менять данные внутри объектов вашего класса;");
        tasksAnswers5.add("2.это специальные конструкторы класса;");
        questions.add(new Question("Для каких целей служат методы get и set", tasksAnswers5, 1));
        return questions;

    }
}