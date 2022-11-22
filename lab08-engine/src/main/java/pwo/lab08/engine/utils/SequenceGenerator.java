package pwo.lab08.engine.utils;

import java.math.BigDecimal;

/**
 *
 * @author NK
 */
public interface SequenceGenerator {

    void reset();

    BigDecimal nextTerm();

    BigDecimal getTerm(int i);
}