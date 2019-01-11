// isComment
package de.tum.in.tumcampusapp.component.tumui.lectures.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import de.tum.in.tumcampusapp.R;
import de.tum.in.tumcampusapp.api.tumonline.CacheControl;
import de.tum.in.tumcampusapp.component.other.generic.activity.ActivityForSearchingTumOnline;
import de.tum.in.tumcampusapp.component.other.generic.adapter.NoResultsAdapter;
import de.tum.in.tumcampusapp.component.tumui.lectures.LectureSearchSuggestionProvider;
import de.tum.in.tumcampusapp.component.tumui.lectures.adapter.LecturesListAdapter;
import de.tum.in.tumcampusapp.component.tumui.lectures.model.Lecture;
import de.tum.in.tumcampusapp.component.tumui.lectures.model.LecturesResponse;
import retrofit2.Call;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

/**
 * isComment
 */
public class isClassOrIsInterface extends ActivityForSearchingTumOnline<LecturesResponse> {

    private StickyListHeadersListView isVariable;

    public isConstructor() {
        super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant);
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod((isParameter, isParameter, isParameter, isParameter) -> {
            Object isVariable = isNameExpr.isMethod(isNameExpr);
            Lecture isVariable = (Lecture) isNameExpr;
            Intent isVariable = new Intent(this, LecturesDetailsActivity.class);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
            isMethod(isNameExpr);
        });
        isMethod();
    }

    @Override
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod() {
        isMethod();
        isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod(String isParameter) {
        isMethod();
        isMethod(isNameExpr);
    }

    private void isMethod(CacheControl isParameter) {
        Call<LecturesResponse> isVariable = isMethod().isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    private void isMethod(String isParameter) {
        Call<LecturesResponse> isVariable = isMethod().isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Override
    public void isMethod(@NonNull LecturesResponse isParameter) {
        if (isNameExpr.isMethod().isMethod()) {
            isNameExpr.isMethod(new NoResultsAdapter(this));
        } else {
            List<Lecture> isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(new LecturesListAdapter(this, isNameExpr));
        }
    }
}
