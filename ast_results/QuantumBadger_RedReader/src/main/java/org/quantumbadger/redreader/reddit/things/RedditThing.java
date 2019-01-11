// isComment
package org.quantumbadger.redreader.reddit.things;

import org.quantumbadger.redreader.jsonwrap.JsonBufferedObject;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public final class isClassOrIsInterface {

    public enum Kind {

        POST,
        USER,
        COMMENT,
        MESSAGE,
        SUBREDDIT,
        MORE_COMMENTS,
        LISTING
    }

    private static final Map<String, Kind> isVariable;

    static {
        isNameExpr = new HashMap<>();
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
    }

    public String isVariable;

    public JsonBufferedObject isVariable;

    public Kind isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    public RedditMoreComments isMethod() throws InstantiationException, IllegalAccessException, InterruptedException, IOException, NoSuchMethodException, InvocationTargetException {
        return isNameExpr.isMethod(RedditMoreComments.class);
    }

    public RedditComment isMethod() throws InstantiationException, IllegalAccessException, InterruptedException, IOException, NoSuchMethodException, InvocationTargetException {
        return isNameExpr.isMethod(RedditComment.class);
    }

    public RedditPost isMethod() throws InstantiationException, IllegalAccessException, InterruptedException, IOException, NoSuchMethodException, InvocationTargetException {
        return isNameExpr.isMethod(RedditPost.class);
    }

    public RedditSubreddit isMethod() throws InstantiationException, IllegalAccessException, InterruptedException, IOException, NoSuchMethodException, InvocationTargetException {
        return isNameExpr.isMethod(RedditSubreddit.class);
    }

    public RedditUser isMethod() throws InstantiationException, IllegalAccessException, InterruptedException, IOException, NoSuchMethodException, InvocationTargetException {
        return isNameExpr.isMethod(RedditUser.class);
    }

    public RedditMessage isMethod() throws IllegalAccessException, InterruptedException, InstantiationException, InvocationTargetException, NoSuchMethodException, IOException {
        return isNameExpr.isMethod(RedditMessage.class);
    }
}
