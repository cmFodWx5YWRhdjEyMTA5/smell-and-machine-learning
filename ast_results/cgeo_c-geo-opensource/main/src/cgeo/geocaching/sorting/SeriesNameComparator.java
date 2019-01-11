// isComment
package cgeo.geocaching.sorting;

/**
 * isComment
 */
public class isClassOrIsInterface extends NameComparator {

    public static final SeriesNameComparator isVariable = new SeriesNameComparator();

    @Override
    public boolean isMethod() {
        return true;
    }
}
