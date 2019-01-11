// isComment
package org.geometerplus.fbreader.network;

import java.util.*;
import org.geometerplus.zlibrary.core.network.ZLNetworkRequest;
import org.geometerplus.fbreader.network.authentication.NetworkAuthenticationManager;
import org.geometerplus.fbreader.network.urlInfo.UrlInfo;
import org.geometerplus.fbreader.network.urlInfo.UrlInfoWithDate;
import org.geometerplus.fbreader.network.tree.NetworkItemsLoader;

public interface isClassOrIsInterface extends Comparable<INetworkLink> {

    public enum Type {

        Predefined(isIntegerConstant), Custom(isIntegerConstant), Local(isIntegerConstant), Sync(isIntegerConstant);

        public final int isVariable;

        isConstructor(int isParameter) {
            isNameExpr = isNameExpr;
        }

        public static Type isMethod(int isParameter) {
            for (Type isVariable : isNameExpr.isMethod()) {
                if (isNameExpr.isFieldAccessExpr == isNameExpr) {
                    return isNameExpr;
                }
            }
            return isNameExpr;
        }
    }

    public enum AccountStatus {

        NotSupported, NoUserName, SignedIn, SignedOut, NotChecked
    }

    public static final int isVariable = -isIntegerConstant;

    int isMethod();

    void isMethod(int isParameter);

    String isMethod();

    String isMethod();

    String isMethod();

    String isMethod();

    String isMethod();

    String isMethod(UrlInfo.Type isParameter);

    UrlInfoWithDate isMethod(UrlInfo.Type isParameter);

    Set<UrlInfo.Type> isMethod();

    /**
     * isComment
     */
    // isComment
    Type isMethod();

    /**
     * isComment
     */
    String isMethod();

    /**
     * isComment
     */
    NetworkOperationData isMethod(NetworkItemsLoader isParameter);

    BasketItem isMethod();

    ZLNetworkRequest isMethod(String isParameter, NetworkOperationData isParameter);

    ZLNetworkRequest isMethod(NetworkOperationData isParameter);

    NetworkCatalogItem isMethod();

    NetworkAuthenticationManager isMethod();

    String isMethod(String isParameter, boolean isParameter);
}
