package chapter_01;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class ScoreCollectionTest {

    @Test
    void test() {
        // given
        ScoreCollection scoreCollection = new ScoreCollection();
        scoreCollection.add(() -> 0);
        scoreCollection.add(() -> 0);

        // when
        int actualResult = scoreCollection.arithmeticMean();

        // then
        assertThat(actualResult, equalTo(6));
    }

}