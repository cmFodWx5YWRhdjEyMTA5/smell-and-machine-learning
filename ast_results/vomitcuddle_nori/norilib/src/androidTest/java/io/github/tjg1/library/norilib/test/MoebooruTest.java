// isComment
package io.github.tjg1.library.norilib.test;

import io.github.tjg1.library.norilib.clients.DanbooruLegacy;
import io.github.tjg1.library.norilib.clients.SearchClient;

/**
 * isComment
 */
public class isClassOrIsInterface extends SearchClientTestCase {

    @Override
    protected SearchClient isMethod() {
        return new DanbooruLegacy(isMethod().isMethod(), "isStringConstant", "isStringConstant");
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }
}
