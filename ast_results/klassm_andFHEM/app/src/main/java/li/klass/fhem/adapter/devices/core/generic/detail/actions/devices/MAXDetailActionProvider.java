// isComment
package li.klass.fhem.adapter.devices.core.generic.detail.actions.devices;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import li.klass.fhem.R;
import li.klass.fhem.adapter.devices.core.generic.detail.actions.DeviceDetailActionProvider;
import li.klass.fhem.adapter.devices.core.generic.detail.actions.action_card.ActionCardAction;
import li.klass.fhem.adapter.devices.core.generic.detail.actions.action_card.ActionCardButton;
import li.klass.fhem.adapter.uiservice.FragmentUiService;
import li.klass.fhem.domain.heating.schedule.configuration.MAXConfiguration;
import li.klass.fhem.update.backend.xmllist.XmlListDevice;

@Singleton
public class isClassOrIsInterface extends DeviceDetailActionProvider {

    private final FragmentUiService isVariable;

    @Inject
    public isConstructor(FragmentUiService isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public List<ActionCardAction> isMethod(Context isParameter) {
        return isNameExpr.<ActionCardAction>isMethod(new ActionCardButton(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr) {

            @Override
            protected void isMethod(XmlListDevice isParameter, String isParameter, Context isParameter) {
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, new MAXConfiguration());
            }
        });
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }
}
