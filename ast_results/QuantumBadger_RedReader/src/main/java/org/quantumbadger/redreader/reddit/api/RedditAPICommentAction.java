// isComment
package org.quantumbadger.redreader.reddit.api;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.ClipboardManager;
import android.widget.Toast;
import org.apache.commons.lang3.StringEscapeUtils;
import org.quantumbadger.redreader.R;
import org.quantumbadger.redreader.account.RedditAccount;
import org.quantumbadger.redreader.account.RedditAccountManager;
import org.quantumbadger.redreader.activities.CommentEditActivity;
import org.quantumbadger.redreader.activities.CommentReplyActivity;
import org.quantumbadger.redreader.cache.CacheManager;
import org.quantumbadger.redreader.cache.CacheRequest;
import org.quantumbadger.redreader.common.AndroidCommon;
import org.quantumbadger.redreader.common.General;
import org.quantumbadger.redreader.common.LinkHandler;
import org.quantumbadger.redreader.common.PrefsUtility;
import org.quantumbadger.redreader.common.RRError;
import org.quantumbadger.redreader.common.RRTime;
import org.quantumbadger.redreader.fragments.CommentListingFragment;
import org.quantumbadger.redreader.fragments.CommentPropertiesDialog;
import org.quantumbadger.redreader.reddit.APIResponseHandler;
import org.quantumbadger.redreader.reddit.RedditAPI;
import org.quantumbadger.redreader.reddit.prepared.RedditChangeDataManager;
import org.quantumbadger.redreader.reddit.prepared.RedditRenderableComment;
import org.quantumbadger.redreader.reddit.things.RedditComment;
import org.quantumbadger.redreader.reddit.url.UserProfileURL;
import org.quantumbadger.redreader.views.RedditCommentView;
import java.util.ArrayList;
import java.util.HashSet;

public class isClassOrIsInterface {

    public enum RedditCommentAction {

        UPVOTE,
        UNVOTE,
        DOWNVOTE,
        SAVE,
        UNSAVE,
        REPORT,
        SHARE,
        COPY_TEXT,
        COPY_URL,
        REPLY,
        USER_PROFILE,
        COMMENT_LINKS,
        COLLAPSE,
        EDIT,
        DELETE,
        PROPERTIES,
        CONTEXT,
        GO_TO_COMMENT,
        ACTION_MENU,
        BACK
    }

    private static class isClassOrIsInterface {

        public final String isVariable;

        public final RedditCommentAction isVariable;

        private isConstructor(Context isParameter, int isParameter, RedditCommentAction isParameter) {
            this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr);
            this.isFieldAccessExpr = isNameExpr;
        }
    }

    public static void isMethod(final AppCompatActivity isParameter, final CommentListingFragment isParameter, final RedditRenderableComment isParameter, final RedditCommentView isParameter, final RedditChangeDataManager isParameter, final boolean isParameter) {
        final RedditAccount isVariable = isNameExpr.isMethod(isNameExpr).isMethod();
        final ArrayList<RCVMenuItem> isVariable = new ArrayList<>();
        if (!isNameExpr.isMethod()) {
            if (!isNameExpr) {
                if (!isNameExpr.isMethod(isNameExpr)) {
                    isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
                } else {
                    isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
                }
                if (!isNameExpr.isMethod(isNameExpr)) {
                    isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
                } else {
                    isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
                }
            }
            if (isNameExpr.isMethod(isNameExpr)) {
                isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
            } else {
                isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
            }
            isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
            if (!isNameExpr)
                isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod().isMethod().isFieldAccessExpr)) {
                if (!isNameExpr)
                    isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
                isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
            }
        }
        isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        if (isNameExpr != null) {
            isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        }
        isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(new RCVMenuItem(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        final String[] isVariable = new String[isNameExpr.isMethod()];
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            isNameExpr[isNameExpr] = isNameExpr.isMethod(isNameExpr).isFieldAccessExpr;
        }
        final AlertDialog.Builder isVariable = new AlertDialog.Builder(isNameExpr);
        isNameExpr.isMethod(isNameExpr, new DialogInterface.OnClickListener() {

            @Override
            public void isMethod(DialogInterface isParameter, int isParameter) {
                isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr).isFieldAccessExpr, isNameExpr);
            }
        });
        final AlertDialog isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(true);
        isNameExpr.isMethod();
    }

    public static void isMethod(final RedditRenderableComment isParameter, final RedditCommentView isParameter, final AppCompatActivity isParameter, final CommentListingFragment isParameter, final RedditCommentAction isParameter, final RedditChangeDataManager isParameter) {
        final RedditComment isVariable = isNameExpr.isMethod().isMethod();
        switch(isNameExpr) {
            case isNameExpr:
                isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
                break;
            case isNameExpr:
                isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
                break;
            case isNameExpr:
                isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
                break;
            case isNameExpr:
                isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
                break;
            case isNameExpr:
                isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
                break;
            case isNameExpr:
                new AlertDialog.Builder(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new DialogInterface.OnClickListener() {

                    @Override
                    public void isMethod(final DialogInterface isParameter, final int isParameter) {
                        isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
                    }
                }).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null).isMethod();
                break;
            case isNameExpr:
                {
                    final Intent isVariable = new Intent(isNameExpr, CommentReplyActivity.class);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
                    isNameExpr.isMethod(isNameExpr);
                    break;
                }
            case isNameExpr:
                {
                    final Intent isVariable = new Intent(isNameExpr, CommentEditActivity.class);
                    isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
                    isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
                    isNameExpr.isMethod(isNameExpr);
                    break;
                }
            case isNameExpr:
                {
                    new AlertDialog.Builder(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new DialogInterface.OnClickListener() {

                        @Override
                        public void isMethod(final DialogInterface isParameter, final int isParameter) {
                            isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
                        }
                    }).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null).isMethod();
                    break;
                }
            case isNameExpr:
                final HashSet<String> isVariable = isNameExpr.isMethod();
                if (isNameExpr.isMethod()) {
                    isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                } else {
                    final String[] isVariable = isNameExpr.isMethod(new String[isNameExpr.isMethod()]);
                    final AlertDialog.Builder isVariable = new AlertDialog.Builder(isNameExpr);
                    isNameExpr.isMethod(isNameExpr, new DialogInterface.OnClickListener() {

                        @Override
                        public void isMethod(DialogInterface isParameter, int isParameter) {
                            isNameExpr.isMethod(isNameExpr, isNameExpr[isNameExpr], true);
                            isNameExpr.isMethod();
                        }
                    });
                    final AlertDialog isVariable = isNameExpr.isMethod();
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(true);
                    isNameExpr.isMethod();
                }
                break;
            case isNameExpr:
                final Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod("isStringConstant");
                String isVariable = "isStringConstant";
                if (isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr))) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(), isNameExpr.isFieldAccessExpr));
                    // isComment
                    if (isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr))) {
                        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) + "isStringConstant";
                    }
                }
                isNameExpr += isNameExpr.isMethod().isMethod().isMethod();
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isIntegerConstant);
                break;
            case isNameExpr:
                {
                    ClipboardManager isVariable = (ClipboardManager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    // isComment
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
                    break;
                }
            case isNameExpr:
                {
                    ClipboardManager isVariable = (ClipboardManager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    // isComment
                    isNameExpr.isMethod(isNameExpr.isMethod().isMethod(null).isMethod().isMethod());
                    break;
                }
            case isNameExpr:
                {
                    isNameExpr.isMethod(isNameExpr);
                    break;
                }
            case isNameExpr:
                isNameExpr.isMethod(isNameExpr, new UserProfileURL(isNameExpr.isFieldAccessExpr).isMethod());
                break;
            case isNameExpr:
                isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isMethod(), null);
                break;
            case isNameExpr:
                {
                    isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod().isMethod(null).isMethod());
                    break;
                }
            case isNameExpr:
                {
                    isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod().isMethod());
                    break;
                }
            case isNameExpr:
                isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod());
                break;
            case isNameExpr:
                isNameExpr.isMethod();
                break;
        }
    }

    public static void isMethod(final AppCompatActivity isParameter, final RedditComment isParameter, @RedditAPI.RedditAction final int isParameter, final RedditChangeDataManager isParameter) {
        final RedditAccount isVariable = isNameExpr.isMethod(isNameExpr).isMethod();
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            return;
        }
        final boolean isVariable = isNameExpr.isMethod(isNameExpr);
        final boolean isVariable = isNameExpr.isMethod(isNameExpr);
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                if (!isNameExpr.isMethod()) {
                    isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
                }
                break;
            case isNameExpr.isFieldAccessExpr:
                if (!isNameExpr.isMethod()) {
                    isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
                }
                break;
            case isNameExpr.isFieldAccessExpr:
                if (!isNameExpr.isMethod()) {
                    isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
                }
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, true);
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, true);
                break;
        }
        boolean isVariable = (isNameExpr == isNameExpr.isFieldAccessExpr | isNameExpr == isNameExpr.isFieldAccessExpr | isNameExpr == isNameExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod() && isNameExpr) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
            return;
        }
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), new APIResponseHandler.ActionResponseHandler(isNameExpr) {

            @Override
            protected void isMethod(final Throwable isParameter) {
                throw new RuntimeException(isNameExpr);
            }

            @Override
            protected void isMethod(@CacheRequest.RequestFailureType final int isParameter, final Throwable isParameter, final Integer isParameter, final String isParameter) {
                isMethod();
                if (isNameExpr != null)
                    isNameExpr.isMethod();
                final RRError isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null);
                isNameExpr.isFieldAccessExpr.isMethod(new Runnable() {

                    @Override
                    public void isMethod() {
                        isNameExpr.isMethod(isNameExpr, isNameExpr);
                    }
                });
            }

            @Override
            protected void isMethod(final APIFailureType isParameter) {
                isMethod();
                final RRError isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
                isNameExpr.isFieldAccessExpr.isMethod(new Runnable() {

                    @Override
                    public void isMethod() {
                        isNameExpr.isMethod(isNameExpr, isNameExpr);
                    }
                });
            }

            @Override
            protected void isMethod(@Nullable final String isParameter) {
                if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                    isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                }
            }

            private void isMethod() {
                switch(isNameExpr) {
                    case isNameExpr.isFieldAccessExpr:
                    case isNameExpr.isFieldAccessExpr:
                    case isNameExpr.isFieldAccessExpr:
                        if (isNameExpr) {
                            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
                        } else if (isNameExpr) {
                            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
                        } else {
                            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
                        }
                    case isNameExpr.isFieldAccessExpr:
                        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, true);
                        break;
                    case isNameExpr.isFieldAccessExpr:
                        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, true);
                        break;
                }
            }
        }, isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
    }
}
