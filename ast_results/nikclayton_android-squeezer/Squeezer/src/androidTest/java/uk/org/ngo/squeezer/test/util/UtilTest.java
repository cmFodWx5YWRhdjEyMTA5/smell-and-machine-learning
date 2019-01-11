// isComment
package uk.org.ngo.squeezer.test.util;

import junit.framework.TestCase;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import uk.org.ngo.squeezer.Util;
import uk.org.ngo.squeezer.framework.Item;
import uk.org.ngo.squeezer.model.Album;
import uk.org.ngo.squeezer.model.Song;

public class isClassOrIsInterface extends TestCase {

    public void isMethod() {
        AtomicReference<String> isVariable = new AtomicReference<String>();
        isMethod(isNameExpr.isMethod(isNameExpr, null));
        isMethod(null, isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr, "isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr, "isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr, "isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr, null));
        isMethod(null, isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr, "isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr, null));
        isMethod(null, isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr, null));
        isMethod(null, isNameExpr.isMethod());
        AtomicReference<Item> isVariable = new AtomicReference<Item>();
        Album isVariable = new Album("isStringConstant", "isStringConstant");
        Song isVariable = new Song(new HashMap<String, String>());
        isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr, null));
        isMethod(null, isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
        isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
        isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr, null));
        isMethod(null, isNameExpr.isMethod());
    }

    public void isMethod() {
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant"));
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant"));
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant"));
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant"));
        isMethod(isIntegerConstant, isNameExpr.isMethod(null));
        isMethod(-isIntegerConstant, isNameExpr.isMethod("isStringConstant"));
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant"));
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant", -isIntegerConstant));
        isMethod(-isIntegerConstant, isNameExpr.isMethod("isStringConstant", -isIntegerConstant));
    }

    public void isMethod() {
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
    }

    public void isMethod() {
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")));
        // isComment
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
    }
}
