package chapter_02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private final List<Question> characteristics = new ArrayList<>();

    public void add(Question characteristic) {
        characteristics.add(characteristic);
    }

    public List<Question> getCharacteristics() {
        return characteristics;
    }

    public List<Question> withCharacteristic(String questionPattern) {
        return characteristics.stream().filter(c -> c.getText().endsWith(questionPattern)).collect(Collectors.toList());
    }
}
