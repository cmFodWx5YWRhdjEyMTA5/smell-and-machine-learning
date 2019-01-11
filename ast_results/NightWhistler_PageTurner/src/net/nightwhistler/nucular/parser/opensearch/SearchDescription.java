// isComment
package net.nightwhistler.nucular.parser.opensearch;

import jedi.option.Option;
import net.nightwhistler.nucular.atom.AtomConstants;
import net.nightwhistler.nucular.atom.Link;
import java.util.ArrayList;
import java.util.List;
import static jedi.functional.FunctionalPrimitives.firstOption;

public class isClassOrIsInterface {

    private List<Link> isVariable = new ArrayList<Link>();

    public void isMethod(Link isParameter) {
        this.isFieldAccessExpr.isMethod(isNameExpr);
    }

    public Option<Link> isMethod() {
        return isMethod(this.isFieldAccessExpr, isParameter -> isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod()));
    }
}
