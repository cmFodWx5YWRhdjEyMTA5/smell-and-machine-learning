// isComment
package org.andstatus.app.origin;

import android.content.Context;
import org.andstatus.app.R;
import org.andstatus.app.context.MyContext;
import org.andstatus.app.data.TextMediaType;
import org.andstatus.app.lang.SelectableEnum;
import org.andstatus.app.net.http.HttpConnectionBasic;
import org.andstatus.app.net.http.HttpConnectionEmpty;
import org.andstatus.app.net.http.HttpConnectionOAuthApache;
import org.andstatus.app.net.http.HttpConnectionOAuthJavaNet;
import org.andstatus.app.net.http.HttpConnectionOAuthMastodon;
import org.andstatus.app.net.social.ConnectionEmpty;
import org.andstatus.app.net.social.ConnectionMastodon;
import org.andstatus.app.net.social.ConnectionTheTwitter;
import org.andstatus.app.net.social.ConnectionTwitterGnuSocial;
import org.andstatus.app.net.social.Patterns;
import org.andstatus.app.net.social.pumpio.ConnectionPumpio;
import org.andstatus.app.timeline.meta.TimelineType;
import org.andstatus.app.util.TriState;
import org.andstatus.app.util.UrlUtils;
import java.net.URL;
import java.util.function.Function;
import java.util.regex.Pattern;

public enum OriginType implements SelectableEnum {

    /**
     * isComment
     */
    TWITTER(isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    /**
     * isComment
     */
    PUMPIO(isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    GNUSOCIAL(isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    /**
     * isComment
     */
    MASTODON(isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    UNKNOWN(isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    private enum NoteName {

        YES, NO
    }

    private enum PublicWithAudience {

        YES, NO
    }

    /**
     * isComment
     */
    private enum ApiEnum {

        UNKNOWN_API,
        /**
         * isComment
         */
        TWITTER1P0,
        /**
         * isComment
         */
        TWITTER1P1,
        /**
         * isComment
         */
        GNUSOCIAL_TWITTER,
        /**
         * isComment
         */
        PUMPIO,
        /**
         * isComment
         */
        MASTODON
    }

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    public static final OriginType isVariable = isNameExpr;

    public static final int isVariable = isIntegerConstant;

    private final long isVariable;

    private final String isVariable;

    protected final boolean isVariable;

    public final Function<MyContext, Origin> isVariable;

    private final Class<? extends org.andstatus.app.net.social.Connection> isVariable;

    private final Class<? extends org.andstatus.app.net.http.HttpConnection> isVariable;

    private final Class<? extends org.andstatus.app.net.http.HttpConnection> isVariable;

    private final boolean isVariable;

    /**
     * isComment
     */
    protected boolean isVariable = true;

    /**
     * isComment
     */
    protected boolean isVariable = true;

    protected boolean isVariable = true;

    /**
     * isComment
     */
    protected boolean isVariable = true;

    protected final Pattern isVariable;

    public final String isVariable;

    /**
     * isComment
     */
    protected int isVariable = isIntegerConstant;

    protected boolean isVariable = true;

    protected boolean isVariable = true;

    protected boolean isVariable = true;

    public final TextMediaType isVariable;

    public final TextMediaType isVariable;

    /**
     * isComment
     */
    protected int isVariable = isIntegerConstant;

    private URL isVariable = null;

    private String isVariable = isNameExpr;

    private String isVariable = isNameExpr;

    private final boolean isVariable;

    private boolean isVariable = true;

    private boolean isVariable = true;

    private boolean isVariable = true;

    private boolean isVariable = true;

    private final boolean isVariable;

    private final boolean isVariable;

    public final boolean isVariable;

    public final boolean isVariable;

    isConstructor(long isParameter, String isParameter, ApiEnum isParameter, NoteName isParameter, PublicWithAudience isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = isNameExpr == isNameExpr.isFieldAccessExpr;
        isNameExpr = isNameExpr == isNameExpr.isFieldAccessExpr;
        switch(isNameExpr) {
            case isNameExpr:
                isNameExpr = true;
                // isComment
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                // isComment
                isNameExpr = isIntegerConstant;
                isNameExpr = isNameExpr.isFieldAccessExpr;
                isNameExpr = isNameExpr;
                isNameExpr = isIntegerConstant;
                isNameExpr = isNameExpr.isMethod("isStringConstant");
                isNameExpr = "isStringConstant";
                isNameExpr = isNameExpr;
                isNameExpr = isParameter -> new OriginTwitter(isNameExpr, this);
                isNameExpr = ConnectionTheTwitter.class;
                isNameExpr = HttpConnectionOAuthApache.class;
                isNameExpr = HttpConnectionBasic.class;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = isNameExpr.isFieldAccessExpr;
                isNameExpr = isNameExpr.isFieldAccessExpr;
                break;
            case isNameExpr:
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = isNameExpr.isFieldAccessExpr;
                isNameExpr = "isStringConstant";
                // isComment
                isNameExpr = isNameExpr;
                isNameExpr = isNameExpr;
                isNameExpr = isNameExpr;
                isNameExpr = isParameter -> new OriginPumpio(isNameExpr, this);
                isNameExpr = ConnectionPumpio.class;
                isNameExpr = HttpConnectionOAuthJavaNet.class;
                isNameExpr = HttpConnectionEmpty.class;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = isNameExpr.isFieldAccessExpr;
                isNameExpr = isNameExpr.isFieldAccessExpr;
                break;
            case isNameExpr:
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = isNameExpr.isFieldAccessExpr;
                isNameExpr = isNameExpr;
                isNameExpr = true;
                isNameExpr = isNameExpr;
                isNameExpr = isNameExpr;
                isNameExpr = isParameter -> new OriginGnuSocial(isNameExpr, this);
                isNameExpr = ConnectionTwitterGnuSocial.class;
                isNameExpr = HttpConnectionOAuthApache.class;
                isNameExpr = HttpConnectionBasic.class;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = isNameExpr.isFieldAccessExpr;
                isNameExpr = isNameExpr.isFieldAccessExpr;
                break;
            case isNameExpr:
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = isNameExpr.isFieldAccessExpr;
                isNameExpr = isNameExpr;
                isNameExpr = isIntegerConstant;
                isNameExpr = "isStringConstant";
                isNameExpr = "isStringConstant";
                isNameExpr = isParameter -> new OriginMastodon(isNameExpr, this);
                isNameExpr = ConnectionMastodon.class;
                isNameExpr = HttpConnectionOAuthMastodon.class;
                isNameExpr = HttpConnectionEmpty.class;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = isNameExpr.isFieldAccessExpr;
                isNameExpr = isNameExpr.isFieldAccessExpr;
                break;
            default:
                isNameExpr = true;
                isNameExpr = isNameExpr.isFieldAccessExpr;
                isNameExpr = isParameter -> new Origin(isNameExpr, this);
                isNameExpr = ConnectionEmpty.class;
                isNameExpr = HttpConnectionEmpty.class;
                isNameExpr = HttpConnectionEmpty.class;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = isNameExpr;
                isNameExpr = true;
                isNameExpr = isNameExpr.isFieldAccessExpr;
                isNameExpr = isNameExpr.isFieldAccessExpr;
                break;
        }
    }

    public Class<? extends org.andstatus.app.net.social.Connection> isMethod() {
        return isNameExpr;
    }

    public Class<? extends org.andstatus.app.net.http.HttpConnection> isMethod(boolean isParameter) {
        if (isMethod(isNameExpr)) {
            return isNameExpr;
        } else {
            return isNameExpr;
        }
    }

    @Override
    public boolean isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod(isMethod());
    }

    @Override
    public CharSequence isMethod(Context isParameter) {
        return isMethod();
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    public long isMethod() {
        return isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
    }

    public boolean isMethod(TriState isParameter) {
        return isMethod(isNameExpr.isMethod(isNameExpr));
    }

    public boolean isMethod(boolean isParameter) {
        boolean isVariable = isNameExpr;
        if (isNameExpr != isNameExpr && !isNameExpr) {
            isNameExpr = isNameExpr;
        }
        return isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    public static OriginType isMethod(long isParameter) {
        for (OriginType isVariable : isMethod()) {
            if (isNameExpr.isFieldAccessExpr == isNameExpr) {
                return isNameExpr;
            }
        }
        return isNameExpr;
    }

    public static OriginType isMethod(String isParameter) {
        for (OriginType isVariable : isMethod()) {
            if (isNameExpr.isMethod().isMethod(isNameExpr)) {
                return isNameExpr;
            }
        }
        return isNameExpr;
    }

    public boolean isMethod(TimelineType isParameter) {
        if (isNameExpr == null || !isNameExpr.isMethod()) {
            return true;
        }
        switch(isNameExpr) {
            case isNameExpr:
                return isNameExpr;
            case isNameExpr:
                return isNameExpr;
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
                return isNameExpr;
            case isNameExpr:
                return isNameExpr;
            default:
                return true;
        }
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    public boolean isMethod(boolean isParameter) {
        return isNameExpr ? isNameExpr : isNameExpr;
    }

    public URL isMethod() {
        return isNameExpr;
    }
}
