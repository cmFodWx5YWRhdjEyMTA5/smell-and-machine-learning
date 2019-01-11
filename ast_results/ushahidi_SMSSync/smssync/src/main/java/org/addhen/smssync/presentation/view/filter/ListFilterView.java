// isComment
package org.addhen.smssync.presentation.view.filter;

import com.addhen.android.raiburari.presentation.ui.view.UiView;
import org.addhen.smssync.presentation.model.FilterModel;
import org.addhen.smssync.presentation.model.WebServiceModel;
import java.util.List;

/**
 * isComment
 */
public interface isClassOrIsInterface extends UiView {

    void isMethod(List<FilterModel> isParameter);

    void isMethod(List<WebServiceModel> isParameter);
}
