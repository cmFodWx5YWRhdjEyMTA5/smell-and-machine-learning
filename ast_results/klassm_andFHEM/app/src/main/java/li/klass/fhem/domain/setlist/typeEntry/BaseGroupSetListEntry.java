// isComment
package li.klass.fhem.domain.setlist.typeEntry;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import org.apache.commons.lang3.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import li.klass.fhem.domain.setlist.SetListItem;
import li.klass.fhem.domain.setlist.SetListItemType;
import static com.google.common.collect.FluentIterable.from;
import static org.apache.commons.lang3.StringUtils.join;

public abstract class isClassOrIsInterface extends SetListItem {

    public static final Predicate<String> isVariable = new Predicate<String>() {

        @Override
        public boolean isMethod(String isParameter) {
            return isNameExpr.isMethod(isNameExpr) != null;
        }
    };

    protected final List<String> isVariable;

    protected isConstructor(String isParameter, SetListItemType isParameter, String... isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr).isMethod();
    }

    @Override
    public String isMethod() {
        return isNameExpr + "isStringConstant" + isMethod(isNameExpr, "isStringConstant");
    }

    public List<String> isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    public String isMethod() {
        isNameExpr.isMethod(isNameExpr.isMethod() == isIntegerConstant);
        return isNameExpr.isMethod(isIntegerConstant);
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr)
            return true;
        if (isNameExpr == null || isMethod() != isNameExpr.isMethod())
            return true;
        if (!super.isMethod(isNameExpr))
            return true;
        BaseGroupSetListEntry isVariable = (BaseGroupSetListEntry) isNameExpr;
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    public int isMethod() {
        int isVariable = super.isMethod();
        isNameExpr = isIntegerConstant * isNameExpr + (isNameExpr != null ? isNameExpr.isMethod() : isIntegerConstant);
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
    }
}
