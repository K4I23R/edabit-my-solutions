package pl.michalsnella;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ChallengeTest {
    @Test
    public void test1() {
        assertThat(Challenge.palindromeDescendant(11211230), is(true));
    }

    @Test
    public void test2() {
        assertThat(Challenge.palindromeDescendant(13001120), is(true));
    }

    @Test
    public void test3() {
        assertThat(Challenge.palindromeDescendant(23336014), is(true));
    }

    @Test
    public void test4() {
        assertThat(Challenge.palindromeDescendant(11), is(true));
    }

    @Test
    public void test5() {
        assertThat(Challenge.palindromeDescendant(1122), is(false));
    }

    @Test
    public void test6() {
        assertThat(Challenge.palindromeDescendant(332233), is(true));
    }

    @Test
    public void test7() {
        assertThat(Challenge.palindromeDescendant(10210112), is(true));
    }

    @Test
    public void test8() {
        assertThat(Challenge.palindromeDescendant(9735), is(false));
    }

    @Test
    public void test9() {
        assertThat(Challenge.palindromeDescendant(97358817), is(false));
    }
}
