package pwo.lab08.engine.seq;

/**
 *
 * @author NK
 */
import java.math.BigDecimal;

import pwo.lab08.engine.utils.SequenceGenerator;

abstract class Generator implements SequenceGenerator {

    protected int lastIndex = 0;
    protected int currentIndex = 0;
    protected BigDecimal current = null,
            f_1 = null,
            f_2 = null,
            f_3 = null;

    @Override
    public void reset() {
        lastIndex = 0;

    }

    @Override
    public final BigDecimal getTerm(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }

        currentIndex = i;
        if (i < lastIndex) {
            while (i < lastIndex) {
                lastIndex--;
            }
        }

        while (lastIndex <= i) {
            nextTerm();
        }
        return current;
    }
}