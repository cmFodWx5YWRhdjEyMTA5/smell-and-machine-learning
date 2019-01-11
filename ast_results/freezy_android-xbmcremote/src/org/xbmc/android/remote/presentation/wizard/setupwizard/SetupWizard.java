// isComment
package org.xbmc.android.remote.presentation.wizard.setupwizard;

import org.xbmc.android.remote.presentation.wizard.Wizard;
import org.xbmc.android.remote.presentation.wizard.WizardPage;
import org.xbmc.android.util.ClientFactory;
import org.xbmc.android.util.HostFactory;
import org.xbmc.api.object.Host;

public class isClassOrIsInterface extends Wizard<Host> {

    private Host isVariable;

    @Override
    public void isMethod() {
        isNameExpr = new Host();
        WizardPage<Host> isVariable = new SetupWizardPage1(this, this);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(new SetupWizardPage2(this, this));
        isMethod(new SetupWizardPage3(this, this));
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod(this, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }
}
