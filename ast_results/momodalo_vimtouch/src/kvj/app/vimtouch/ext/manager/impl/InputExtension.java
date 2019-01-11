// isComment
package kvj.app.vimtouch.ext.manager.impl;

import net.momodalo.app.vimtouch.VimTouch;
import kvj.app.vimtouch.ext.manager.impl.InputExtension.InputExtensionInput;
import org.kvj.vimtouch.ext.IncomingTransfer;
import org.kvj.vimtouch.ext.OutgoingTransfer;
import org.kvj.vimtouch.ext.Transferable;
import org.kvj.vimtouch.ext.impl.EmptyTransferable;
import org.kvj.vimtouch.ext.impl.read.StringFieldReader;
import org.kvj.vimtouch.ext.manager.IntegrationExtension;
import org.kvj.vimtouch.ext.manager.IntegrationExtensionException;

public class isClassOrIsInterface implements IntegrationExtension<InputExtensionInput, EmptyTransferable> {

    public static class isClassOrIsInterface implements Transferable {

        String isVariable = "isStringConstant";

        @Override
        public void isMethod(IncomingTransfer isParameter) {
            isNameExpr.isMethod("isStringConstant", new StringFieldReader() {

                @Override
                public void isMethod(String isParameter) {
                    isNameExpr = isNameExpr;
                }
            });
        }

        @Override
        public void isMethod(OutgoingTransfer isParameter) {
        }
    }

    protected static final String isVariable = "isStringConstant";

    private VimTouch isVariable = null;

    public isConstructor(VimTouch isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public InputExtensionInput isMethod() {
        return new InputExtensionInput();
    }

    @Override
    public EmptyTransferable isMethod(InputExtensionInput isParameter) throws IntegrationExtensionException {
        if ("isStringConstant".isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr.isMethod(new Runnable() {

                @Override
                public void isMethod() {
                    isNameExpr.isMethod();
                }
            });
        }
        if ("isStringConstant".isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr.isMethod(new Runnable() {

                @Override
                public void isMethod() {
                    isNameExpr.isMethod();
                }
            });
        }
        return new EmptyTransferable();
    }
}
