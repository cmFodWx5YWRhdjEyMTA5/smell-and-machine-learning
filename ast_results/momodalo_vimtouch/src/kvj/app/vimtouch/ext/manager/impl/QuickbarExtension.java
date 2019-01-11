// isComment
package kvj.app.vimtouch.ext.manager.impl;

import java.util.ArrayList;
import java.util.List;
import net.momodalo.app.vimtouch.VimTouch;
import kvj.app.vimtouch.ext.manager.impl.QuickbarExtension.QuickbarInput;
import org.kvj.vimtouch.ext.IncomingTransfer;
import org.kvj.vimtouch.ext.OutgoingTransfer;
import org.kvj.vimtouch.ext.Transferable;
import org.kvj.vimtouch.ext.impl.EmptyTransferable;
import org.kvj.vimtouch.ext.impl.read.BooleanFieldReader;
import org.kvj.vimtouch.ext.impl.read.ListFieldReader;
import org.kvj.vimtouch.ext.impl.read.StringFieldReader;
import org.kvj.vimtouch.ext.manager.IntegrationExtension;
import org.kvj.vimtouch.ext.manager.IntegrationExtensionException;

public class isClassOrIsInterface implements IntegrationExtension<QuickbarInput, EmptyTransferable> {

    private VimTouch isVariable = null;

    public isConstructor(VimTouch isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public static class isClassOrIsInterface implements Transferable {

        private List<String> isVariable = new ArrayList<String>();

        private boolean isVariable = true;

        @Override
        public void isMethod(IncomingTransfer isParameter) {
            isNameExpr.isMethod("isStringConstant", new ListFieldReader<String>(new StringFieldReader() {

                @Override
                public void isMethod(String isParameter) {
                }
            }) {

                @Override
                public void isMethod(List<String> isParameter) {
                }

                @Override
                public void isMethod(String isParameter) {
                    isNameExpr.isMethod(isNameExpr);
                }
            });
            isNameExpr.isMethod("isStringConstant", new BooleanFieldReader() {

                @Override
                public void isMethod(Boolean isParameter) {
                    isNameExpr = isNameExpr;
                }
            });
        }

        @Override
        public void isMethod(OutgoingTransfer isParameter) {
        }
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public QuickbarInput isMethod() {
        return new QuickbarInput();
    }

    @Override
    public EmptyTransferable isMethod(final QuickbarInput isParameter) throws IntegrationExtensionException {
        isNameExpr.isMethod(new Runnable() {

            @Override
            public void isMethod() {
                if (isNameExpr.isFieldAccessExpr) {
                    isNameExpr.isMethod();
                } else {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                }
            }
        });
        return new EmptyTransferable();
    }
}
