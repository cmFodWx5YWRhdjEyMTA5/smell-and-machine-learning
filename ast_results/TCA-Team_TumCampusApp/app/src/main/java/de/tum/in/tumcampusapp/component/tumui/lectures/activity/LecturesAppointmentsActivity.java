// isComment
package de.tum.in.tumcampusapp.component.tumui.lectures.activity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import android.widget.ListView;
import android.widget.TextView;
import java.util.List;
import de.tum.in.tumcampusapp.R;
import de.tum.in.tumcampusapp.api.tumonline.CacheControl;
import de.tum.in.tumcampusapp.component.other.generic.activity.ActivityForAccessingTumOnline;
import de.tum.in.tumcampusapp.component.tumui.lectures.adapter.LectureAppointmentsListAdapter;
import de.tum.in.tumcampusapp.component.tumui.lectures.model.LectureAppointment;
import de.tum.in.tumcampusapp.component.tumui.lectures.model.LectureAppointmentsResponse;
import de.tum.in.tumcampusapp.utils.Const;
import retrofit2.Call;

/**
 * isComment
 */
public class isClassOrIsInterface extends ActivityForAccessingTumOnline<LectureAppointmentsResponse> {

    private ListView isVariable;

    private String isVariable;

    public isConstructor() {
        super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (isMethod() != null) {
            isMethod().isMethod(true);
        }
        isNameExpr = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        String isVariable = isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        TextView isVariable = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = isMethod().isMethod("isStringConstant");
        if (isNameExpr == null) {
            isMethod();
            return;
        }
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod() {
        if (isNameExpr != null) {
            isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        }
    }

    private void isMethod(@NonNull String isParameter, CacheControl isParameter) {
        Call<LectureAppointmentsResponse> isVariable = isMethod().isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    @Override
    public void isMethod(@NonNull LectureAppointmentsResponse isParameter) {
        List<LectureAppointment> isVariable = isNameExpr.isMethod();
        if (isNameExpr == null || isNameExpr.isMethod()) {
            // isComment
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            return;
        }
        isNameExpr.isMethod(new LectureAppointmentsListAdapter(this, isNameExpr));
    }
}
