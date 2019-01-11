// isComment
package com.gh4a.fragment;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.gh4a.BaseActivity;
import com.gh4a.Gh4Application;
import com.gh4a.R;
import com.gh4a.activities.CommitActivity;
import com.gh4a.activities.CompareActivity;
import com.gh4a.activities.GistActivity;
import com.gh4a.activities.IssueActivity;
import com.gh4a.activities.IssueListActivity;
import com.gh4a.activities.PullRequestActivity;
import com.gh4a.activities.ReleaseInfoActivity;
import com.gh4a.activities.RepositoryActivity;
import com.gh4a.activities.UserActivity;
import com.gh4a.activities.WikiListActivity;
import com.gh4a.adapter.EventAdapter;
import com.gh4a.adapter.RootAdapter;
import com.gh4a.resolver.CommitCommentLoadTask;
import com.gh4a.resolver.PullRequestReviewCommentLoadTask;
import com.gh4a.utils.IntentUtils;
import com.gh4a.utils.Optional;
import com.gh4a.utils.RxUtils;
import com.gh4a.utils.UiUtils;
import com.gh4a.widget.ContextMenuAwareRecyclerView;
import com.meisolsson.githubsdk.model.Download;
import com.meisolsson.githubsdk.model.GitHubEvent;
import com.meisolsson.githubsdk.model.GitHubEventType;
import com.meisolsson.githubsdk.model.GitHubWikiPage;
import com.meisolsson.githubsdk.model.Issue;
import com.meisolsson.githubsdk.model.PullRequest;
import com.meisolsson.githubsdk.model.ReferenceType;
import com.meisolsson.githubsdk.model.Release;
import com.meisolsson.githubsdk.model.ReleaseAsset;
import com.meisolsson.githubsdk.model.Repository;
import com.meisolsson.githubsdk.model.ReviewComment;
import com.meisolsson.githubsdk.model.User;
import com.meisolsson.githubsdk.model.git.GitComment;
import com.meisolsson.githubsdk.model.git.GitCommit;
import com.meisolsson.githubsdk.model.payload.CommitCommentPayload;
import com.meisolsson.githubsdk.model.payload.CreatePayload;
import com.meisolsson.githubsdk.model.payload.DownloadPayload;
import com.meisolsson.githubsdk.model.payload.FollowPayload;
import com.meisolsson.githubsdk.model.payload.ForkPayload;
import com.meisolsson.githubsdk.model.payload.GistPayload;
import com.meisolsson.githubsdk.model.payload.GollumPayload;
import com.meisolsson.githubsdk.model.payload.IssueCommentPayload;
import com.meisolsson.githubsdk.model.payload.IssuesPayload;
import com.meisolsson.githubsdk.model.payload.PullRequestPayload;
import com.meisolsson.githubsdk.model.payload.PullRequestReviewCommentPayload;
import com.meisolsson.githubsdk.model.payload.PushPayload;
import com.meisolsson.githubsdk.model.payload.ReleasePayload;
import java.util.Arrays;
import java.util.List;
import io.reactivex.Single;

public abstract class isClassOrIsInterface extends PagedDataBaseFragment<GitHubEvent> {

    private static final int isVariable = isIntegerConstant;

    private static final int isVariable = isIntegerConstant;

    private EventAdapter isVariable;

    private static final GitHubEventType[] isVariable = new GitHubEventType[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };

    @Override
    protected void isMethod(RecyclerView isParameter, LayoutInflater isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    @Override
    protected RootAdapter<GitHubEvent, ? extends RecyclerView.ViewHolder> isMethod() {
        isNameExpr = new EventAdapter(isMethod());
        isNameExpr.isMethod(true);
        return isNameExpr;
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(GitHubEvent isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            return;
        }
        GitHubEvent.RepoIdentifier isVariable = isNameExpr.isMethod();
        String isVariable = "isStringConstant";
        String isVariable = "isStringConstant";
        Intent isVariable = null;
        Single<Optional<Intent>> isVariable = null;
        if (isNameExpr != null) {
            String[] isVariable = isNameExpr.isMethod().isMethod("isStringConstant");
            if (isNameExpr.isFieldAccessExpr == isIntegerConstant) {
                isNameExpr = isNameExpr[isIntegerConstant];
                isNameExpr = isNameExpr[isIntegerConstant];
            }
        }
        if (isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod()) >= isIntegerConstant && isNameExpr == null) {
            isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
            return;
        }
        switch(isNameExpr.isMethod()) {
            case isNameExpr:
                {
                    CommitCommentPayload isVariable = (CommitCommentPayload) isNameExpr.isMethod();
                    GitComment isVariable = isNameExpr.isMethod();
                    if (isNameExpr != null) {
                        isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr.isMethod(), new IntentUtils.InitialCommentMarker(isNameExpr.isMethod()));
                    }
                    break;
                }
            case isNameExpr:
                {
                    CreatePayload isVariable = (CreatePayload) isNameExpr.isMethod();
                    String isVariable = null;
                    if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr || isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                        isNameExpr = isNameExpr.isMethod();
                    }
                    isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr);
                    break;
                }
            case isNameExpr:
                isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr);
                break;
            case isNameExpr:
                {
                    DownloadPayload isVariable = (DownloadPayload) isNameExpr.isMethod();
                    Download isVariable = isNameExpr.isMethod();
                    isNameExpr.isMethod((BaseActivity) isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), null);
                    break;
                }
            case isNameExpr:
                {
                    FollowPayload isVariable = (FollowPayload) isNameExpr.isMethod();
                    isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr.isMethod());
                    break;
                }
            case isNameExpr:
                {
                    ForkPayload isVariable = (ForkPayload) isNameExpr.isMethod();
                    Repository isVariable = isNameExpr.isMethod();
                    if (isNameExpr != null) {
                        isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr);
                    } else {
                        isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
                    }
                    break;
                }
            case isNameExpr:
                isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr);
                break;
            case isNameExpr:
                {
                    GistPayload isVariable = (GistPayload) isNameExpr.isMethod();
                    isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr.isMethod().isMethod());
                    break;
                }
            case isNameExpr:
                {
                    GollumPayload isVariable = (GollumPayload) isNameExpr.isMethod();
                    isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr.isMethod().isMethod() ? null : isNameExpr.isMethod().isMethod(isIntegerConstant));
                    break;
                }
            case isNameExpr:
                {
                    IssueCommentPayload isVariable = (IssueCommentPayload) isNameExpr.isMethod();
                    Issue isVariable = isNameExpr.isMethod();
                    PullRequest isVariable = isNameExpr != null ? isNameExpr.isMethod() : null;
                    IntentUtils.InitialCommentMarker isVariable = isNameExpr.isMethod() != null ? new IntentUtils.InitialCommentMarker(isNameExpr.isMethod().isMethod()) : null;
                    if (isNameExpr != null && isNameExpr.isMethod() != null) {
                        isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr != null ? isNameExpr.isFieldAccessExpr : -isIntegerConstant, isNameExpr);
                    } else if (isNameExpr != null) {
                        isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr);
                    }
                    break;
                }
            case isNameExpr:
                {
                    IssuesPayload isVariable = (IssuesPayload) isNameExpr.isMethod();
                    isMethod(isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr.isMethod().isMethod()));
                    break;
                }
            case isNameExpr:
                isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr);
                break;
            case isNameExpr:
                isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr);
                break;
            case isNameExpr:
                {
                    PullRequestPayload isVariable = (PullRequestPayload) isNameExpr.isMethod();
                    isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr.isMethod());
                    break;
                }
            case isNameExpr:
                {
                    PullRequestReviewCommentPayload isVariable = (PullRequestReviewCommentPayload) isNameExpr.isMethod();
                    PullRequest isVariable = isNameExpr.isMethod();
                    ReviewComment isVariable = isNameExpr.isMethod();
                    IntentUtils.InitialCommentMarker isVariable = isNameExpr != null ? new IntentUtils.InitialCommentMarker(isNameExpr.isMethod()) : null;
                    if (isNameExpr != null) {
                        if (isNameExpr != null) {
                            isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr);
                        } else {
                            isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr.isMethod(), -isIntegerConstant, null);
                        }
                    } else if (isNameExpr != null) {
                        isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr);
                    }
                    break;
                }
            case isNameExpr:
                {
                    PushPayload isVariable = (PushPayload) isNameExpr.isMethod();
                    List<GitCommit> isVariable = isNameExpr.isMethod();
                    if (isNameExpr != null && !isNameExpr.isMethod()) {
                        if (isNameExpr.isMethod() > isIntegerConstant) {
                            // isComment
                            isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod());
                        } else {
                            // isComment
                            isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr.isMethod(isIntegerConstant).isMethod());
                        }
                    } else {
                        isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr);
                    }
                    break;
                }
            case isNameExpr:
                {
                    ReleasePayload isVariable = (ReleasePayload) isNameExpr.isMethod();
                    Release isVariable = isNameExpr.isMethod();
                    if (isNameExpr != null) {
                        isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr.isMethod());
                    }
                    break;
                }
            case isNameExpr:
                isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr);
                break;
        }
        if (isNameExpr != null) {
            isMethod(isNameExpr);
        } else if (isNameExpr != null) {
            isNameExpr.isMethod(RxUtils::doInBackground).isMethod(isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isParameter -> {
                if (isNameExpr.isMethod() && isMethod()) {
                    isMethod(isNameExpr.isMethod());
                }
            }, isParameter -> isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr));
        }
    }

    @Override
    public void isMethod(ContextMenu isParameter, View isParameter, ContextMenuInfo isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        ContextMenuAwareRecyclerView.RecyclerContextMenuInfo isVariable = (ContextMenuAwareRecyclerView.RecyclerContextMenuInfo) isNameExpr;
        GitHubEvent isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod(isNameExpr)) {
            return;
        }
        GitHubEvent.RepoIdentifier isVariable = isNameExpr.isMethod();
        String[] isVariable = isNameExpr.isMethod().isMethod("isStringConstant");
        String isVariable = isNameExpr.isFieldAccessExpr == isIntegerConstant ? isNameExpr[isIntegerConstant] : null;
        String isVariable = isNameExpr.isFieldAccessExpr == isIntegerConstant ? isNameExpr[isIntegerConstant] : null;
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        /*isComment*/
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod())).isMethod(isNameExpr.isMethod(isMethod(), isNameExpr.isMethod()));
        if (isNameExpr != null) {
            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr + "isStringConstant" + isNameExpr)).isMethod(isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr));
        }
        switch(isNameExpr.isMethod()) {
            case isNameExpr:
                if (isNameExpr != null) {
                    CommitCommentPayload isVariable = (CommitCommentPayload) isNameExpr.isMethod();
                    String isVariable = isNameExpr.isMethod().isMethod();
                    isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant, isIntegerConstant))).isMethod(isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr));
                }
                break;
            case isNameExpr:
                {
                    DownloadPayload isVariable = (DownloadPayload) isNameExpr.isMethod();
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod()));
                    break;
                }
            case isNameExpr:
                {
                    FollowPayload isVariable = (FollowPayload) isNameExpr.isMethod();
                    User isVariable = isNameExpr.isMethod();
                    if (isNameExpr != null) {
                        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod())).isMethod(isNameExpr.isMethod(isMethod(), isNameExpr));
                    }
                    break;
                }
            case isNameExpr:
                {
                    ForkPayload isVariable = (ForkPayload) isNameExpr.isMethod();
                    Repository isVariable = isNameExpr.isMethod();
                    if (isNameExpr != null) {
                        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod() + "isStringConstant" + isNameExpr.isMethod())).isMethod(isNameExpr.isMethod(isMethod(), isNameExpr));
                    }
                    break;
                }
            case isNameExpr:
                {
                    GistPayload isVariable = (GistPayload) isNameExpr.isMethod();
                    String isVariable = isNameExpr.isMethod().isMethod();
                    isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr)).isMethod(isNameExpr.isMethod(isMethod(), isNameExpr));
                    break;
                }
            case isNameExpr:
                {
                    GollumPayload isVariable = (GollumPayload) isNameExpr.isMethod();
                    List<GitHubWikiPage> isVariable = isNameExpr.isMethod();
                    if (isNameExpr != null && !isNameExpr.isMethod()) {
                        // isComment
                        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant).isMethod())));
                    }
                    break;
                }
            case isNameExpr:
                {
                    IssueCommentPayload isVariable = (IssueCommentPayload) isNameExpr.isMethod();
                    boolean isVariable = isNameExpr.isMethod().isMethod() != null;
                    isNameExpr.isMethod(isMethod(isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr));
                    break;
                }
            case isNameExpr:
                {
                    IssuesPayload isVariable = (IssuesPayload) isNameExpr.isMethod();
                    int isVariable = isNameExpr.isMethod().isMethod();
                    isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr)).isMethod(isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr));
                    break;
                }
            case isNameExpr:
                {
                    PullRequestPayload isVariable = (PullRequestPayload) isNameExpr.isMethod();
                    isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod())).isMethod(isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr.isMethod()));
                    break;
                }
            case isNameExpr:
                {
                    if (isNameExpr != null) {
                        PushPayload isVariable = (PushPayload) isNameExpr.isMethod();
                        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod(isIntegerConstant, isIntegerConstant))).isMethod(isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod()));
                        for (GitCommit isVariable : isNameExpr.isMethod()) {
                            String isVariable = isNameExpr.isMethod();
                            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant, isIntegerConstant))).isMethod(isNameExpr.isMethod(isMethod(), isNameExpr, isNameExpr, isNameExpr));
                        }
                    }
                    break;
                }
            case isNameExpr:
                {
                    ReleasePayload isVariable = (ReleasePayload) isNameExpr.isMethod();
                    List<ReleaseAsset> isVariable = isNameExpr.isMethod().isMethod();
                    int isVariable = isNameExpr != null ? isNameExpr.isMethod() : isIntegerConstant;
                    for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr + isNameExpr, isNameExpr.isFieldAccessExpr, isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr).isMethod()));
                    }
                    break;
                }
        }
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        ContextMenuAwareRecyclerView.RecyclerContextMenuInfo isVariable = (ContextMenuAwareRecyclerView.RecyclerContextMenuInfo) isNameExpr.isMethod();
        if (isNameExpr.isFieldAccessExpr >= isNameExpr.isMethod()) {
            return true;
        }
        int isVariable = isNameExpr.isMethod();
        GitHubEvent isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr >= isNameExpr && isNameExpr <= isNameExpr) {
            if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                ReleasePayload isVariable = (ReleasePayload) isNameExpr.isMethod();
                ReleaseAsset isVariable = isNameExpr.isMethod().isMethod().isMethod(isNameExpr - isNameExpr);
                isNameExpr.isMethod((BaseActivity) isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), null);
            } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                DownloadPayload isVariable = (DownloadPayload) isNameExpr.isMethod();
                Download isVariable = isNameExpr.isMethod();
                isNameExpr.isMethod((BaseActivity) isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), null);
            }
            return true;
        }
        return true;
    }
}
