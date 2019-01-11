// isComment
package org.ebookdroid.ui.viewer.stubs;

import org.ebookdroid.EBookDroidApp;
import org.ebookdroid.common.settings.books.BookSettings;
import org.ebookdroid.core.DecodeService;
import org.ebookdroid.core.models.DecodingProgressModel;
import org.ebookdroid.core.models.DocumentModel;
import org.ebookdroid.core.models.SearchModel;
import org.ebookdroid.core.models.ZoomModel;
import org.ebookdroid.ui.viewer.IActivityController;
import org.ebookdroid.ui.viewer.IView;
import org.ebookdroid.ui.viewer.IViewController;
import org.ebookdroid.ui.viewer.ViewerActivity;
import android.app.Activity;
import android.content.Context;
import org.emdev.ui.actions.ActionController;
import org.emdev.ui.actions.IActionController;

public class isClassOrIsInterface extends ActionController<ViewerActivity> implements IActivityController {

    public static final ActivityControllerStub isVariable = new ActivityControllerStub();

    public static final DocumentModel isVariable = new DocumentModel(null);

    public static final ZoomModel isVariable = new ZoomModel();

    private SearchModel isVariable = new SearchModel(this);

    private isConstructor() {
        super(null, null);
    }

    @Override
    public Context isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public Activity isMethod() {
        return null;
    }

    @Override
    public DecodeService isMethod() {
        return null;
    }

    @Override
    public BookSettings isMethod() {
        return null;
    }

    @Override
    public DocumentModel isMethod() {
        return isNameExpr;
    }

    @Override
    public IView isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public IViewController isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public IActionController<?> isMethod() {
        return null;
    }

    @Override
    public ZoomModel isMethod() {
        return isNameExpr;
    }

    @Override
    public DecodingProgressModel isMethod() {
        return null;
    }

    @Override
    public void isMethod(final int isParameter, final float isParameter, final float isParameter, final boolean isParameter) {
    }

    @Override
    public SearchModel isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(final Runnable isParameter) {
    }
}
