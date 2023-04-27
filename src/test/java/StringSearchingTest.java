import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static sorting.CyclicSort.cyclicSort;
import static stringSearching.KMPAlgorithm.strStr;

public class StringSearchingTest {
    @Test
    public void test() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'

        Random random = new Random();

        for(int i=0 ; i < 1000; i++) {
            int targetStringLength = random.nextInt(5, 100);
            int patternLength = random.nextInt(1, 5);
            String exampleString = random.ints(leftLimit, rightLimit + 1)
                    .limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            String pattern = random.ints(leftLimit, rightLimit + 1)
                    .limit(patternLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            System.out.println("exampleString: " + exampleString);
            System.out.println("pattern: " + pattern);
            System.out.println(exampleString.indexOf(pattern));
            System.out.println(strStr(exampleString, pattern));

            Assert.assertEquals("not equal", exampleString.indexOf(pattern), strStr(exampleString, pattern));
        }

    }
}
