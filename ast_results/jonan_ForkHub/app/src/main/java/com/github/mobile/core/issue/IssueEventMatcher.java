// isComment
package com.github.mobile.core.issue;

import static org.eclipse.egit.github.core.event.Event.TYPE_ISSUES;
import static org.eclipse.egit.github.core.event.Event.TYPE_ISSUE_COMMENT;
import static org.eclipse.egit.github.core.event.Event.TYPE_PULL_REQUEST;
import static org.eclipse.egit.github.core.event.Event.TYPE_PULL_REQUEST_REVIEW_COMMENT;
import org.eclipse.egit.github.core.Issue;
import org.eclipse.egit.github.core.event.Event;
import org.eclipse.egit.github.core.event.EventPayload;
import org.eclipse.egit.github.core.event.IssueCommentPayload;
import org.eclipse.egit.github.core.event.IssuesPayload;
import org.eclipse.egit.github.core.event.PullRequestPayload;
import org.eclipse.egit.github.core.event.PullRequestReviewCommentPayload;

/**
 * isComment
 */
public class isClassOrIsInterface {

    /**
     * isComment
     */
    public static Issue isMethod(Event isParameter) {
        if (isNameExpr == null)
            return null;
        EventPayload isVariable = isNameExpr.isMethod();
        if (isNameExpr == null)
            return null;
        String isVariable = isNameExpr.isMethod();
        if (isNameExpr.isMethod(isNameExpr))
            return ((IssuesPayload) isNameExpr).isMethod();
        else if (isNameExpr.isMethod(isNameExpr))
            return ((IssueCommentPayload) isNameExpr).isMethod();
        else if (isNameExpr.isMethod(isNameExpr))
            return isNameExpr.isMethod(((PullRequestPayload) isNameExpr).isMethod());
        else if (isNameExpr.isMethod(isNameExpr))
            return isNameExpr.isMethod(((PullRequestReviewCommentPayload) isNameExpr).isMethod());
        else
            return null;
    }
}
