// isComment
package org.wordpress.android.ui.reader;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import org.jetbrains.annotations.NotNull;
import org.wordpress.android.R;
import org.wordpress.android.WordPress;
import org.wordpress.android.analytics.AnalyticsTracker;
import org.wordpress.android.datasets.ReaderPostTable;
import org.wordpress.android.fluxc.store.SiteStore;
import org.wordpress.android.models.ReaderPost;
import org.wordpress.android.models.ReaderTag;
import org.wordpress.android.ui.ActivityLauncher;
import org.wordpress.android.ui.RequestCodes;
import org.wordpress.android.ui.WPLaunchActivity;
import org.wordpress.android.ui.posts.BasicFragmentDialog;
import org.wordpress.android.ui.prefs.AppPrefs;
import org.wordpress.android.ui.reader.ReaderTypes.ReaderPostListType;
import org.wordpress.android.ui.reader.actions.ReaderActions;
import org.wordpress.android.ui.reader.actions.ReaderPostActions;
import org.wordpress.android.ui.reader.models.ReaderBlogIdPostId;
import org.wordpress.android.ui.reader.models.ReaderBlogIdPostIdList;
import org.wordpress.android.ui.reader.services.post.ReaderPostServiceStarter;
import org.wordpress.android.util.ActivityUtils;
import org.wordpress.android.util.analytics.AnalyticsUtils;
import org.wordpress.android.util.AniUtils;
import org.wordpress.android.util.AppLog;
import org.wordpress.android.util.LocaleManager;
import org.wordpress.android.util.NetworkUtils;
import org.wordpress.android.util.ToastUtils;
import org.wordpress.android.widgets.WPSwipeSnackbar;
import org.wordpress.android.widgets.WPViewPager;
import org.wordpress.android.widgets.WPViewPagerTransformer;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import de.greenrobot.event.EventBus;

/*isComment*/
public class isClassOrIsInterface extends AppCompatActivity implements ReaderInterfaces.AutoHideToolbarListener, BasicFragmentDialog.BasicDialogPositiveClickInterface {

    /**
     * isComment
     */
    private enum InterceptType {

        READER_BLOG, READER_FEED, WPCOM_POST_SLUG
    }

    /**
     * isComment
     */
    public enum DirectOperation {

        COMMENT_JUMP, COMMENT_REPLY, COMMENT_LIKE, POST_LIKE
    }

    private WPViewPager isVariable;

    private ProgressBar isVariable;

    private Toolbar isVariable;

    private ReaderTag isVariable;

    private boolean isVariable;

    private long isVariable;

    private long isVariable;

    private int isVariable;

    private DirectOperation isVariable;

    private String isVariable;

    private int isVariable = -isIntegerConstant;

    private ReaderPostListType isVariable;

    private boolean isVariable;

    private boolean isVariable;

    private boolean isVariable;

    private boolean isVariable;

    private boolean isVariable;

    private final HashSet<Integer> isVariable = new HashSet<>();

    @Inject
    SiteStore isVariable;

    @Override
    protected void isMethod(Context isParameter) {
        super.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        ((WordPress) isMethod()).isMethod().isMethod(this);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
        ActionBar isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(true);
        }
        isNameExpr = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = (DirectOperation) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr = (ReaderPostListType) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr = (ReaderTag) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                Serializable isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                if (isNameExpr instanceof HashSet) {
                    isNameExpr.isMethod((HashSet<Integer>) isNameExpr);
                }
            }
        } else {
            isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr, true);
            isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
            isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
            isNameExpr = (DirectOperation) isMethod().isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
            isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr, true);
            isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr, true);
            isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr);
            if (isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr = (ReaderPostListType) isMethod().isMethod(isNameExpr.isFieldAccessExpr);
            }
            if (isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
                isNameExpr = (ReaderTag) isMethod().isMethod(isNameExpr.isFieldAccessExpr);
            }
        }
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
        }
        // isComment
        if (isNameExpr) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(new View.OnClickListener() {

                @Override
                public void isMethod(View isParameter) {
                    isMethod();
                }
            });
        }
        isNameExpr.isMethod(new ViewPager.SimpleOnPageChangeListener() {

            @Override
            public void isMethod(int isParameter) {
                super.isMethod(isNameExpr);
                isMethod(true);
                isMethod(isNameExpr);
                if (isNameExpr > -isIntegerConstant && isNameExpr != isNameExpr) {
                    // isComment
                    // isComment
                    ReaderPostDetailFragment isVariable = isMethod(isNameExpr);
                    if (isNameExpr != null) {
                        isNameExpr.isMethod();
                    }
                }
                // isComment
                ReaderPostDetailFragment isVariable = isMethod(isNameExpr);
                if (isNameExpr != null) {
                    isNameExpr.isMethod();
                }
                isNameExpr = isNameExpr;
                isMethod(isNameExpr);
            }
        });
        isNameExpr.isMethod(true, new WPViewPagerTransformer(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    /*isComment*/
    private void isMethod(int isParameter) {
        // isComment
        if (isNameExpr) {
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            return;
        }
        // isComment
        ReaderBlogIdPostId isVariable = isMethod(isNameExpr);
        if (isNameExpr != null) {
            String isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            if (!isNameExpr.isMethod()) {
                isMethod(isNameExpr);
                return;
            }
        }
        // isComment
        isMethod(isNameExpr.isMethod(isMethod()) ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    /*isComment*/
    @SuppressWarnings("isStringConstant")
    public void isMethod(ReaderEvents.SinglePostDownloaded isParameter) {
        if (!isMethod()) {
            isMethod(isNameExpr.isMethod());
        }
    }

    private void isMethod() {
        String isVariable = isMethod().isMethod();
        Uri isVariable = isMethod().isMethod();
        String isVariable = "isStringConstant";
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod();
        }
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr == null) {
            // isComment
            Intent isVariable = new Intent(this, WPLaunchActivity.class);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr);
            isMethod();
            return;
        }
        InterceptType isVariable = isNameExpr.isFieldAccessExpr;
        // isComment
        String isVariable = null;
        // isComment
        String isVariable = null;
        isNameExpr = isNameExpr.isMethod();
        List<String> isVariable = isNameExpr.isMethod();
        // isComment
        if (isNameExpr != null) {
            if (isNameExpr.isMethod(isIntegerConstant).isMethod("isStringConstant")) {
                if (isNameExpr.isMethod() > isIntegerConstant) {
                    isNameExpr = isNameExpr.isMethod(isIntegerConstant);
                    if (isNameExpr.isMethod(isIntegerConstant).isMethod("isStringConstant")) {
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                    } else if (isNameExpr.isMethod(isIntegerConstant).isMethod("isStringConstant")) {
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                        isNameExpr = true;
                    }
                }
                if (isNameExpr.isMethod() > isIntegerConstant && isNameExpr.isMethod(isIntegerConstant).isMethod("isStringConstant")) {
                    isNameExpr = isNameExpr.isMethod(isIntegerConstant);
                }
                isMethod(isNameExpr);
                isMethod(isNameExpr, isNameExpr, isNameExpr);
                return;
            } else if (isNameExpr.isMethod() >= isIntegerConstant) {
                isNameExpr = isNameExpr.isMethod();
                try {
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant), "isStringConstant");
                } catch (UnsupportedEncodingException isParameter) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                    isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                }
                isMethod(isNameExpr);
                isMethod(isNameExpr);
                isNameExpr = isNameExpr.isFieldAccessExpr;
                isMethod(isNameExpr, isNameExpr, isNameExpr);
                return;
            }
        }
        // isComment
        Intent isVariable = new Intent(this, WPLaunchActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
    }

    private void isMethod(@NonNull InterceptType isParameter, final String isParameter, final String isParameter) {
        if (!isNameExpr.isMethod(isNameExpr) && !isNameExpr.isMethod(isNameExpr)) {
            isNameExpr = true;
            isNameExpr = true;
            switch(isNameExpr) {
                case isNameExpr:
                    if (isMethod(isNameExpr, isNameExpr)) {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
                    // isComment
                    } else {
                        isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    }
                    break;
                case isNameExpr:
                    if (isMethod(isNameExpr, isNameExpr)) {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
                    // isComment
                    } else {
                        isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    }
                    break;
                case isNameExpr:
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr, isNameExpr);
                    // isComment
                    ReaderPost isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, true);
                    if (isNameExpr != null) {
                        // isComment
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                    } else {
                        // isComment
                        isNameExpr.isMethod(isNameExpr, isNameExpr, new ReaderActions.OnRequestListener() {

                            @Override
                            public void isMethod() {
                                isNameExpr = true;
                                ReaderPost isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, true);
                                ReaderEvents.PostSlugsRequestCompleted isVariable = (isNameExpr != null) ? new ReaderEvents.PostSlugsRequestCompleted(isIntegerConstant, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr) : new ReaderEvents.PostSlugsRequestCompleted(isIntegerConstant, isIntegerConstant, isIntegerConstant);
                                // isComment
                                isNameExpr.isMethod().isMethod(isNameExpr);
                                // isComment
                                if (isNameExpr != null) {
                                    isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
                                }
                            }

                            @Override
                            public void isMethod(int isParameter) {
                                isNameExpr = true;
                                // isComment
                                isNameExpr.isMethod().isMethod(new ReaderEvents.PostSlugsRequestCompleted(isNameExpr, isIntegerConstant, isIntegerConstant));
                            }
                        });
                        isNameExpr = true;
                    }
                    break;
            }
        } else {
            isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }

    private boolean isMethod(String isParameter, String isParameter) {
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        } catch (NumberFormatException isParameter) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
            return true;
        }
        return true;
    }

    /**
     * isComment
     */
    private void isMethod(Uri isParameter) {
        // isComment
        isNameExpr = null;
        if (isNameExpr == null || isNameExpr.isMethod() == null) {
            return;
        }
        final String isVariable = isNameExpr.isMethod();
        final Pattern isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        final Pattern isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        final Pattern isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        // isComment
        Matcher isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr.isMethod()) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr = isIntegerConstant;
            return;
        }
        // isComment
        Matcher isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr.isMethod()) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            // isComment
            final String isVariable = isNameExpr.isMethod("isStringConstant");
            if (isNameExpr != null) {
                try {
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                } catch (NumberFormatException isParameter) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant" + isNameExpr, isNameExpr);
                }
            }
            return;
        }
        // isComment
        Matcher isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr.isMethod() && isNameExpr.isMethod() > isIntegerConstant) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant));
            isNameExpr = isNameExpr.isFieldAccessExpr;
        }
    }

    /**
     * isComment
     */
    private void isMethod(Uri isParameter) {
        // isComment
        final boolean isVariable = "isStringConstant".isMethod(isNameExpr.isMethod("isStringConstant"));
        final String isVariable = isNameExpr.isMethod("isStringConstant");
        if (isNameExpr && isNameExpr != null && isNameExpr.isMethod().isMethod() > isIntegerConstant) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            // isComment
            final String isVariable = isNameExpr.isMethod("isStringConstant");
            if (isNameExpr != null) {
                try {
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                } catch (NumberFormatException isParameter) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant" + isNameExpr, isNameExpr);
                }
            }
        }
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod().isMethod(this);
        if (!isMethod() || isNameExpr) {
            if (isNameExpr.isMethod(isMethod())) {
                isMethod();
            }
            isMethod(isNameExpr, isNameExpr);
            // isComment
            isNameExpr = true;
        }
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod().isMethod(this);
    }

    @Override
    public boolean isMethod(final MenuItem isParameter) {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr) {
            isMethod();
            return true;
        }
        return super.isMethod(isNameExpr);
    }

    @SuppressWarnings("isStringConstant")
    private boolean isMethod() {
        return (isNameExpr != null && isNameExpr.isMethod() != null);
    }

    private PostPagerAdapter isMethod() {
        if (isNameExpr != null && isNameExpr.isMethod() != null) {
            return (PostPagerAdapter) isNameExpr.isMethod();
        } else {
            return null;
        }
    }

    @Override
    protected void isMethod(@NonNull Bundle isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        if (isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        }
        if (isMethod() != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod());
        }
        ReaderBlogIdPostId isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        }
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        if (isNameExpr.isMethod() > isIntegerConstant) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        }
        super.isMethod(isNameExpr);
    }

    private ReaderBlogIdPostId isMethod() {
        PostPagerAdapter isVariable = isMethod();
        if (isNameExpr == null) {
            return null;
        }
        return isNameExpr.isMethod();
    }

    private ReaderBlogIdPostId isMethod(int isParameter) {
        PostPagerAdapter isVariable = isMethod();
        if (isNameExpr == null) {
            return null;
        }
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        ReaderPostDetailFragment isVariable = isMethod();
        if (isNameExpr != null && isNameExpr.isMethod()) {
            // isComment
            isNameExpr.isMethod();
        } else // isComment
        if (isNameExpr != null && isNameExpr.isMethod()) {
        // isComment
        } else {
            super.isMethod();
        }
    }

    /*isComment*/
    private void isMethod(int isParameter) {
        if (!isMethod() || isNameExpr.isMethod(isNameExpr)) {
            return;
        }
        ReaderBlogIdPostId isVariable = isMethod(isNameExpr);
        if (isNameExpr == null) {
            return;
        }
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant" + isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
    }

    /*isComment*/
    private void isMethod(long isParameter, long isParameter) {
        // isComment
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr, isNameExpr, true));
    }

    /*isComment*/
    private void isMethod(final long isParameter, final long isParameter) {
        new Thread() {

            @Override
            public void isMethod() {
                final ReaderBlogIdPostIdList isVariable;
                if (isNameExpr) {
                    isNameExpr = new ReaderBlogIdPostIdList();
                    isNameExpr.isMethod(new ReaderBlogIdPostId(isNameExpr, isNameExpr));
                } else {
                    int isVariable = isNameExpr.isFieldAccessExpr;
                    switch(isMethod()) {
                        case isNameExpr:
                        case isNameExpr:
                            isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr);
                            break;
                        case isNameExpr:
                            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
                            break;
                        case isNameExpr:
                        default:
                            return;
                    }
                }
                final int isVariable = isNameExpr.isMethod();
                final int isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
                isMethod(new Runnable() {

                    @Override
                    public void isMethod() {
                        if (isMethod()) {
                            return;
                        }
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
                        PostPagerAdapter isVariable = new PostPagerAdapter(isMethod(), isNameExpr);
                        isNameExpr.isMethod(isNameExpr);
                        if (isNameExpr.isMethod(isNameExpr)) {
                            isNameExpr.isMethod(isNameExpr);
                            isMethod(isNameExpr);
                            isMethod(isNameExpr);
                        } else if (isNameExpr.isMethod(isNameExpr)) {
                            isNameExpr.isMethod(isNameExpr);
                            isMethod(isNameExpr);
                            isMethod(isNameExpr);
                        }
                        // isComment
                        if (isNameExpr.isMethod() > isIntegerConstant && !isNameExpr.isMethod()) {
                            isNameExpr.isMethod(isNameExpr);
                            isNameExpr.isMethod(true);
                        }
                    }
                });
            }
        }.isMethod();
    }

    private ReaderTag isMethod() {
        return isNameExpr;
    }

    private boolean isMethod() {
        return isNameExpr != null;
    }

    private ReaderPostListType isMethod() {
        return isNameExpr;
    }

    private Fragment isMethod() {
        PostPagerAdapter isVariable = isMethod();
        if (isNameExpr == null) {
            return null;
        }
        return isNameExpr.isMethod();
    }

    private ReaderPostDetailFragment isMethod() {
        Fragment isVariable = isMethod();
        if (isNameExpr instanceof ReaderPostDetailFragment) {
            return (ReaderPostDetailFragment) isNameExpr;
        } else {
            return null;
        }
    }

    private Fragment isMethod(int isParameter) {
        PostPagerAdapter isVariable = isMethod();
        if (isNameExpr == null) {
            return null;
        }
        return isNameExpr.isMethod(isNameExpr);
    }

    private ReaderPostDetailFragment isMethod(int isParameter) {
        Fragment isVariable = isMethod(isNameExpr);
        if (isNameExpr instanceof ReaderPostDetailFragment) {
            return (ReaderPostDetailFragment) isNameExpr;
        } else {
            return null;
        }
    }

    /*isComment*/
    private void isMethod() {
        if (isNameExpr) {
            return;
        }
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
        switch(isMethod()) {
            case isNameExpr:
            case isNameExpr:
                isNameExpr.isMethod(this, isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                break;
            case isNameExpr:
                isNameExpr.isMethod(this, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                break;
        }
    }

    @SuppressWarnings("isStringConstant")
    public void isMethod(ReaderEvents.UpdatePostsStarted isParameter) {
        if (isMethod()) {
            return;
        }
        isNameExpr = true;
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @SuppressWarnings("isStringConstant")
    public void isMethod(ReaderEvents.UpdatePostsEnded isParameter) {
        if (isMethod()) {
            return;
        }
        PostPagerAdapter isVariable = isMethod();
        if (isNameExpr == null) {
            return;
        }
        isNameExpr = true;
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
            // isComment
            ReaderBlogIdPostId isVariable = isNameExpr.isMethod();
            long isVariable = (isNameExpr != null ? isNameExpr.isMethod() : isIntegerConstant);
            long isVariable = (isNameExpr != null ? isNameExpr.isMethod() : isIntegerConstant);
            isMethod(isNameExpr, isNameExpr);
        } else {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
            isNameExpr.isFieldAccessExpr = true;
        }
    }

    @SuppressWarnings("isStringConstant")
    public void isMethod(ReaderEvents.DoSignIn isParameter) {
        if (isMethod()) {
            return;
        }
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(this);
    }

    /*isComment*/
    @Override
    public void isMethod(boolean isParameter) {
        if (!isMethod()) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
    }

    /**
     * isComment
     */
    private class isClassOrIsInterface extends FragmentStatePagerAdapter {

        private ReaderBlogIdPostIdList isVariable;

        private boolean isVariable;

        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        private final SparseArray<Fragment> isVariable = new SparseArray<>();

        isConstructor(FragmentManager isParameter, ReaderBlogIdPostIdList isParameter) {
            super(isNameExpr);
            isNameExpr = (ReaderBlogIdPostIdList) isNameExpr.isMethod();
        }

        @Override
        public void isMethod(Parcelable isParameter, ClassLoader isParameter) {
            // isComment
            try {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
                super.isMethod(isNameExpr, isNameExpr);
            } catch (IllegalStateException isParameter) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
            }
        }

        @Override
        public Parcelable isMethod() {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
            return super.isMethod();
        }

        private boolean isMethod() {
            return !isNameExpr && !isNameExpr && (isNameExpr != null && isNameExpr.isMethod() < isNameExpr.isFieldAccessExpr) && isNameExpr.isMethod(isNameExpr.this);
        }

        boolean isMethod(int isParameter) {
            return (isNameExpr >= isIntegerConstant && isNameExpr < isMethod());
        }

        @Override
        public int isMethod() {
            return isNameExpr.isMethod();
        }

        @Override
        public Fragment isMethod(int isParameter) {
            if ((isNameExpr == isMethod() - isIntegerConstant) && isMethod()) {
                isMethod();
            }
            return isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr).isMethod(), isNameExpr.isMethod(isNameExpr).isMethod(), isNameExpr, isNameExpr, isNameExpr, isNameExpr, isMethod(), isNameExpr);
        }

        @Override
        @NonNull
        public Object isMethod(ViewGroup isParameter, int isParameter) {
            Object isVariable = super.isMethod(isNameExpr, isNameExpr);
            if (isNameExpr instanceof Fragment) {
                isNameExpr.isMethod(isNameExpr, (Fragment) isNameExpr);
            }
            return isNameExpr;
        }

        @Override
        public void isMethod(ViewGroup isParameter, int isParameter, Object isParameter) {
            isNameExpr.isMethod(isNameExpr);
            super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }

        private Fragment isMethod() {
            return isMethod(isNameExpr.isMethod());
        }

        private Fragment isMethod(int isParameter) {
            if (isMethod(isNameExpr)) {
                return isNameExpr.isMethod(isNameExpr);
            } else {
                return null;
            }
        }

        private ReaderBlogIdPostId isMethod() {
            return isMethod(isNameExpr.isMethod());
        }

        ReaderBlogIdPostId isMethod(int isParameter) {
            if (isMethod(isNameExpr)) {
                return isNameExpr.isMethod(isNameExpr);
            } else {
                return null;
            }
        }
    }

    @Override
    protected void isMethod(int isParameter, int isParameter, Intent isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr = true;
        }
    }

    @Override
    public void isMethod(@NotNull String isParameter) {
        ReaderPostDetailFragment isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
