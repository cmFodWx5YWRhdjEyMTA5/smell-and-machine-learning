// isComment
package com.github.pockethub.android.core.issue;

import com.meisolsson.githubsdk.model.GitHubEvent;
import com.meisolsson.githubsdk.model.Issue;
import com.meisolsson.githubsdk.model.payload.IssueCommentPayload;
import com.meisolsson.githubsdk.model.payload.IssuesPayload;
import com.meisolsson.githubsdk.model.payload.PullRequestPayload;
import static com.github.pockethub.android.core.issue.IssueUtils.toIssue;

/**
 * isComment
 */
public class isClassOrIsInterface {

    /**
     * isComment
     */
    public static Issue isMethod(GitHubEvent isParameter) {
        if (isNameExpr == null || isNameExpr.isMethod() == null) {
            return null;
        }
        switch(isNameExpr.isMethod()) {
            case isNameExpr:
                return ((IssuesPayload) isNameExpr.isMethod()).isMethod();
            case isNameExpr:
                return ((IssueCommentPayload) isNameExpr.isMethod()).isMethod();
            case isNameExpr:
                return isMethod(((PullRequestPayload) isNameExpr.isMethod()).isMethod());
            default:
                return null;
        }
    }
}
