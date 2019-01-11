// isComment
package javax.measure;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

/**
 * isComment
 */
public interface isClassOrIsInterface<Q extends Quantity> extends Comparable<Measurable<Q>> {

    /**
     * isComment
     */
    double isMethod(Unit<Q> isParameter);

    /**
     * isComment
     */
    long isMethod(Unit<Q> isParameter) throws ArithmeticException;
}
