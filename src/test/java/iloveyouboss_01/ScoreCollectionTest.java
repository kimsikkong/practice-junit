package iloveyouboss_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class ScoreCollectionTest {

    @Test
    void test() {
        // given
        ScoreCollection scoreCollection = new ScoreCollection();
        scoreCollection.add(() -> 5);
        scoreCollection.add(() -> 7);

        // when
        int actualResult = scoreCollection.arithmeticMean();

        // then
        assertThat(actualResult, equalTo(6));
    }

}