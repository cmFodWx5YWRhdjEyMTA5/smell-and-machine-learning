// isComment
package com.biglybt.update;

import com.biglybt.pif.Plugin;
import com.biglybt.pif.PluginInterface;
import com.biglybt.pif.update.UpdatableComponent;
import com.biglybt.pif.update.UpdateChecker;

public class isClassOrIsInterface implements Plugin, UpdatableComponent {

    @Override
    public void isMethod(PluginInterface isParameter) {
    }

    @Override
    public String isMethod() {
        return ("isStringConstant");
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public void isMethod(final UpdateChecker isParameter) {
    }
}
