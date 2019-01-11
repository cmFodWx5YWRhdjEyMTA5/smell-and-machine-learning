// isComment
package com.gh4a.activities;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.gh4a.BaseFragmentPagerActivity;
import com.gh4a.Gh4Application;
import com.gh4a.R;
import com.gh4a.ServiceFactory;
import com.gh4a.db.BookmarksProvider;
import com.gh4a.fragment.CommitListFragment;
import com.gh4a.fragment.ContentListContainerFragment;
import com.gh4a.fragment.RepositoryEventListFragment;
import com.gh4a.fragment.RepositoryFragment;
import com.gh4a.utils.ApiHelpers;
import com.gh4a.utils.IntentUtils;
import com.gh4a.utils.RxUtils;
import com.gh4a.utils.UiUtils;
import com.meisolsson.githubsdk.model.Branch;
import com.meisolsson.githubsdk.model.Commit;
import com.meisolsson.githubsdk.model.Repository;
import com.meisolsson.githubsdk.model.Subscription;
import com.meisolsson.githubsdk.model.request.activity.SubscriptionRequest;
import com.meisolsson.githubsdk.service.activity.StarringService;
import com.meisolsson.githubsdk.service.activity.WatchingService;
import com.meisolsson.githubsdk.service.repositories.RepositoryBranchService;
import com.meisolsson.githubsdk.service.repositories.RepositoryService;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import io.reactivex.Single;
import retrofit2.Response;

public class isClassOrIsInterface extends BaseFragmentPagerActivity implements CommitListFragment.ContextSelectionCallback, ContentListContainerFragment.CommitSelectionCallback {

    public static Intent isMethod(Context isParameter, Repository isParameter) {
        return isMethod(isNameExpr, isNameExpr, null);
    }

    public static Intent isMethod(Context isParameter, Repository isParameter, String isParameter) {
        return isMethod(isNameExpr, isNameExpr.isMethod().isMethod(), isNameExpr.isMethod(), isNameExpr);
    }

    public static Intent isMethod(Context isParameter, String isParameter, String isParameter) {
        return isMethod(isNameExpr, isNameExpr, isNameExpr, null);
    }

    public static Intent isMethod(Context isParameter, String isParameter, String isParameter, String isParameter) {
        return isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, isNameExpr);
    }

    public static Intent isMethod(Context isParameter, String isParameter, String isParameter, String isParameter, String isParameter, int isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            isNameExpr = null;
        }
        return new Intent(isNameExpr, RepositoryActivity.class).isMethod("isStringConstant", isNameExpr).isMethod("isStringConstant", isNameExpr).isMethod("isStringConstant", isNameExpr).isMethod("isStringConstant", isNameExpr).isMethod("isStringConstant", isNameExpr);
    }

    private static final String isVariable = "isStringConstant";

    private static final int isVariable = isIntegerConstant;

    private static final int isVariable = isIntegerConstant;

    private static final int isVariable = isIntegerConstant;

    public static final int isVariable = isIntegerConstant;

    public static final int isVariable = isIntegerConstant;

    public static final int isVariable = isIntegerConstant;

    public static final int isVariable = isIntegerConstant;

    private static final int[] isVariable = new int[] { isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr };

    private String isVariable;

    private String isVariable;

    private ActionBar isVariable;

    private int isVariable;

    private String isVariable;

    private Repository isVariable;

    private List<Branch> isVariable;

    private List<Branch> isVariable;

    private String isVariable;

    private Boolean isVariable;

    private Boolean isVariable;

    private RepositoryFragment isVariable;

    private ContentListContainerFragment isVariable;

    private CommitListFragment isVariable;

    private RepositoryEventListFragment isVariable;

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        }
        isNameExpr = isMethod();
        isNameExpr.isMethod(isNameExpr + "isStringConstant" + isNameExpr);
        isNameExpr.isMethod(true);
        isMethod(true);
        isMethod(true);
        isMethod(true);
        isMethod(true);
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr = isNameExpr.isMethod("isStringConstant", -isIntegerConstant);
        isNameExpr = isNameExpr.isMethod("isStringConstant");
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(Commit isParameter) {
        isMethod(isNameExpr.isMethod());
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    private void isMethod() {
        isNameExpr.isMethod(isMethod());
        isMethod();
    }

    private String isMethod() {
        if (!isNameExpr.isMethod(isNameExpr)) {
            return isNameExpr;
        }
        return isNameExpr.isMethod();
    }

    private String isMethod() {
        String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr;
        String isVariable = isMethod();
        return isNameExpr.isMethod(isNameExpr.isMethod()) ? isNameExpr : isNameExpr + "isStringConstant" + isNameExpr;
    }

    @Override
    protected int[] isMethod() {
        return isNameExpr != null ? isNameExpr : null;
    }

    @Override
    protected Fragment isMethod(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return isNameExpr.isMethod(isNameExpr, isNameExpr);
            case isIntegerConstant:
                Fragment isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                isNameExpr = null;
                return isNameExpr;
            case isIntegerConstant:
                return isNameExpr.isMethod(isNameExpr, isNameExpr);
            case isIntegerConstant:
                return isNameExpr.isMethod(isNameExpr);
        }
        return null;
    }

    @Override
    protected void isMethod(Fragment isParameter, int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                isNameExpr = (RepositoryFragment) isNameExpr;
                break;
            case isIntegerConstant:
                isNameExpr = (ContentListContainerFragment) isNameExpr;
                break;
            case isIntegerConstant:
                isNameExpr = (CommitListFragment) isNameExpr;
                break;
            case isIntegerConstant:
                isNameExpr = (RepositoryEventListFragment) isNameExpr;
                break;
        }
    }

    @Override
    protected void isMethod(Fragment isParameter) {
        if (isNameExpr == isNameExpr) {
            isNameExpr = null;
        } else if (isNameExpr == isNameExpr) {
            isNameExpr = null;
        } else if (isNameExpr == isNameExpr) {
            isNameExpr = null;
        } else if (isNameExpr == isNameExpr) {
            isNameExpr = null;
        }
    }

    @Override
    protected boolean isMethod(Fragment isParameter) {
        if (isNameExpr instanceof CommitListFragment && isNameExpr == null) {
            return true;
        } else if (isNameExpr instanceof ContentListContainerFragment && isNameExpr == null) {
            return true;
        } else if (isNameExpr instanceof RepositoryFragment && isNameExpr == null) {
            return true;
        } else if (isNameExpr instanceof RepositoryEventListFragment && isNameExpr == null) {
            return true;
        }
        return true;
    }

    @Override
    public void isMethod() {
        isNameExpr = null;
        isNameExpr = null;
        isNameExpr = null;
        isNameExpr = null;
        isNameExpr = null;
        isNameExpr = null;
        isNameExpr = null;
        isNameExpr = null;
        isMethod();
        isMethod(true);
        isMethod();
        isMethod(true);
        isMethod(true);
        isMethod(true);
        super.isMethod();
    }

    @Override
    public void isMethod() {
        if (isNameExpr != null) {
            if (isMethod().isMethod() == isIntegerConstant && isNameExpr.isMethod()) {
                return;
            }
        }
        super.isMethod();
    }

    @Override
    public boolean isMethod(Menu isParameter) {
        MenuInflater isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        return super.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(Menu isParameter) {
        boolean isVariable = isNameExpr.isMethod().isMethod();
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr) {
            if (isNameExpr == null) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod();
            } else if (isNameExpr) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr) {
            if (isNameExpr == null) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod();
            } else if (isNameExpr) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            } else {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
        if (isNameExpr == null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else {
            MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr.isMethod(this, isMethod()) ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
        return super.isMethod(isNameExpr);
    }

    @Override
    protected Intent isMethod() {
        return isNameExpr.isMethod(this, isNameExpr);
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr;
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (isNameExpr != null) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod();
                    isMethod();
                }
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (isNameExpr != null) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod();
                    isMethod();
                }
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod();
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(this, isNameExpr + "isStringConstant" + isNameExpr, isNameExpr);
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(this, isNameExpr.isMethod(isNameExpr));
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
                isMethod(isNameExpr.isMethod(this, isNameExpr, isNameExpr.isFieldAccessExpr));
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                String isVariable = isMethod();
                if (isNameExpr.isMethod(this, isNameExpr)) {
                    isNameExpr.isMethod(this, isNameExpr);
                } else {
                    isNameExpr.isMethod(this, isNameExpr.isMethod().isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isMethod(), true);
                }
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                String isVariable = isNameExpr + "isStringConstant" + isMethod() + "isStringConstant";
                isNameExpr.isMethod(this, isNameExpr, "isStringConstant", isNameExpr + "isStringConstant" + isMethod() + "isStringConstant", null, null);
                return true;
        }
        return super.isMethod(isNameExpr);
    }

    private void isMethod() {
        final BranchAndTagAdapter isVariable = new BranchAndTagAdapter();
        int isVariable = -isIntegerConstant, isVariable = -isIntegerConstant, isVariable = isNameExpr.isMethod();
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
            Branch isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr.isMethod().isMethod(isNameExpr) || isNameExpr.isMethod().isMethod().isMethod(isNameExpr)) {
                isNameExpr = isNameExpr;
            }
            if (isNameExpr.isMethod().isMethod(isNameExpr.isMethod())) {
                isNameExpr = isNameExpr;
            }
        }
        if (isNameExpr == null && isNameExpr == -isIntegerConstant) {
            isNameExpr = isNameExpr;
        }
        new AlertDialog.Builder(this).isMethod(true).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr, isNameExpr, (isParameter, isParameter) -> {
            isMethod(isNameExpr.isMethod(isNameExpr).isMethod());
            isNameExpr.isMethod();
        }).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null).isMethod();
    }

    private void isMethod(String isParameter) {
        isNameExpr = isNameExpr;
        isMethod();
        isMethod();
    }

    private void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        isNameExpr = null;
    }

    private void isMethod() {
        StarringService isVariable = isNameExpr.isMethod(StarringService.class, true);
        Single<Response<Void>> isVariable = isNameExpr ? isNameExpr.isMethod(isNameExpr, isNameExpr) : isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(ApiHelpers::mapToBooleanOrThrowOnFailure).isMethod(RxUtils::doInBackground).isMethod(isParameter -> {
            if (isNameExpr != null) {
                isNameExpr = !isNameExpr;
                if (isNameExpr != null) {
                    isNameExpr.isMethod(isNameExpr);
                }
                isMethod();
            }
        }, isParameter -> {
            isMethod("isStringConstant", isNameExpr);
            isMethod();
        });
    }

    private void isMethod() {
        WatchingService isVariable = isNameExpr.isMethod(WatchingService.class, true);
        final Single<?> isVariable;
        if (isNameExpr) {
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr).isMethod(ApiHelpers::throwOnFailure);
        } else {
            SubscriptionRequest isVariable = isNameExpr.isMethod().isMethod(true).isMethod();
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr).isMethod(ApiHelpers::throwOnFailure);
        }
        isNameExpr.isMethod(RxUtils::doInBackground).isMethod(isParameter -> {
            if (isNameExpr != null) {
                isNameExpr = !isNameExpr;
            }
            isMethod();
        }, isParameter -> {
            isMethod("isStringConstant", isNameExpr);
            isMethod();
        });
    }

    private void isMethod(boolean isParameter) {
        RepositoryService isVariable = isNameExpr.isMethod(RepositoryService.class, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr).isMethod(ApiHelpers::throwOnFailure).isMethod(isMethod(isNameExpr, isNameExpr)).isMethod(isParameter -> {
            isNameExpr = isNameExpr;
            isMethod();
            isMethod();
            // isComment
            if (isNameExpr >= isNameExpr && isNameExpr <= isNameExpr) {
                isMethod().isMethod(isNameExpr);
                isNameExpr = -isIntegerConstant;
            }
            isMethod(true);
            isMethod();
        }, this::handleLoadFailure);
    }

    private void isMethod(boolean isParameter) {
        if (!isNameExpr.isMethod().isMethod()) {
            return;
        }
        StarringService isVariable = isNameExpr.isMethod(StarringService.class, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr).isMethod(ApiHelpers::throwOnFailure).isMethod(isParameter -> true).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true)).isMethod(isMethod(isNameExpr, isNameExpr)).isMethod(isParameter -> {
            isNameExpr = isNameExpr;
            isMethod();
        }, this::handleLoadFailure);
    }

    private void isMethod(boolean isParameter) {
        if (!isNameExpr.isMethod().isMethod()) {
            return;
        }
        WatchingService isVariable = isNameExpr.isMethod(WatchingService.class, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr).isMethod(ApiHelpers::throwOnFailure).isMethod(Subscription::subscribed).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true)).isMethod(isMethod(isNameExpr, isNameExpr)).isMethod(isParameter -> {
            isNameExpr = isNameExpr;
            isMethod();
        }, this::handleLoadFailure);
    }

    private void isMethod() {
        if (isNameExpr != null) {
            isMethod();
        } else {
            final RepositoryBranchService isVariable = isNameExpr.isMethod(RepositoryBranchService.class, true);
            final RepositoryService isVariable = isNameExpr.isMethod(RepositoryService.class, true);
            Single<List<Branch>> isVariable = isNameExpr.isFieldAccessExpr.isMethod(isParameter -> isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr));
            Single<List<Branch>> isVariable = isNameExpr.isFieldAccessExpr.isMethod(isParameter -> isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr));
            isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr, Pair::create).isMethod(RxUtils::doInBackground).isMethod(isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isParameter -> {
                isNameExpr = isNameExpr.isFieldAccessExpr;
                isNameExpr = isNameExpr.isFieldAccessExpr;
                isMethod();
            }, this::handleLoadFailure));
        }
    }

    private class isClassOrIsInterface extends BaseAdapter {

        private final ArrayList<Branch> isVariable;

        private final LayoutInflater isVariable;

        private final int isVariable;

        private final int isVariable;

        private final int isVariable;

        public isConstructor() {
            isNameExpr = new ArrayList<>();
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr = isNameExpr.isMethod();
            isNameExpr = isNameExpr.isMethod(isNameExpr.this);
            isNameExpr = isNameExpr.isMethod(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }

        @Override
        public int isMethod() {
            return isNameExpr.isMethod();
        }

        @Override
        public Branch isMethod(int isParameter) {
            return isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public long isMethod(int isParameter) {
            return isNameExpr;
        }

        @Override
        public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
            if (isNameExpr == null) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
            }
            ImageView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            TextView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr >= isNameExpr ? isNameExpr : isNameExpr);
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr).isMethod());
            return isNameExpr;
        }
    }
}
