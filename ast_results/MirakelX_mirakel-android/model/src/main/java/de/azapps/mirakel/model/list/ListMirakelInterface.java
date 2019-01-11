// isComment
package de.azapps.mirakel.model.list;

import android.os.Parcelable;
import java.util.List;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder;
import de.azapps.mirakel.model.task.Task;

public interface isClassOrIsInterface extends Parcelable {

    MirakelQueryBuilder isMethod();

    CharSequence isMethod();

    List<Task> isMethod();

    long isMethod();

    ShowDoneCases isMethod();

    enum ShowDoneCases {

        ONLY_DONE, ONLY_UNDONE, BOTH, status, NOTHING
    }
}
