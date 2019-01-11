// isComment
package io.github.hidroh.materialistic.test.shadow;

import android.support.v4.widget.DrawerLayout;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.annotation.RealObject;
import org.robolectric.shadows.ShadowViewGroup;
import java.util.ArrayList;
import java.util.List;
import static org.robolectric.shadow.api.Shadow.directlyOn;

@Implements(DrawerLayout.class)
public class isClassOrIsInterface extends ShadowViewGroup {

    @RealObject
    private DrawerLayout isVariable;

    private List<DrawerLayout.DrawerListener> isVariable = new ArrayList<>();

    @Implementation
    public void isMethod(DrawerLayout.DrawerListener isParameter) {
        this.isFieldAccessExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, DrawerLayout.class).isMethod(isNameExpr);
    }

    @Implementation
    public void isMethod(DrawerLayout.DrawerListener isParameter) {
        this.isFieldAccessExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, DrawerLayout.class).isMethod(isNameExpr);
    }

    public List<DrawerLayout.DrawerListener> isMethod() {
        return isNameExpr;
    }
}
