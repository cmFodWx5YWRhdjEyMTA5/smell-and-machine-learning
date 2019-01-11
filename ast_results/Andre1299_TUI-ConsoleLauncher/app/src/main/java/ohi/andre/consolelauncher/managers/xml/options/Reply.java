// isComment
package ohi.andre.consolelauncher.managers.xml.options;

import ohi.andre.consolelauncher.managers.notifications.reply.ReplyManager;
import ohi.andre.consolelauncher.managers.xml.classes.XMLPrefsElement;
import ohi.andre.consolelauncher.managers.xml.classes.XMLPrefsSave;

public enum Reply implements XMLPrefsSave {

    reply_enabled {

        @Override
        public String isMethod() {
            return "isStringConstant";
        }

        @Override
        public String isMethod() {
            return isNameExpr.isFieldAccessExpr;
        }

        @Override
        public String isMethod() {
            return "isStringConstant";
        }
    }
    ;

    @Override
    public XMLPrefsElement isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public String isMethod() {
        return isMethod();
    }

    @Override
    public boolean isMethod(String isParameter) {
        return isMethod().isMethod(isNameExpr);
    }
}
