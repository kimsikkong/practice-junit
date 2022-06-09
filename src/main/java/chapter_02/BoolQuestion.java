package chapter_02;

public class BoolQuestion extends Question {

    public BoolQuestion(String text, int id) {
        super(text, new String[]{"No", "Yes"}, id);
    }

    @Override
    public boolean match(int expected, int actual) {
        return expected == actual;
    }
}
