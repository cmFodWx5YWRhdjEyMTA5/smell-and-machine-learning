// isComment
package ohi.andre.consolelauncher.managers.xml.options;

import ohi.andre.consolelauncher.managers.AppsManager;
import ohi.andre.consolelauncher.managers.xml.classes.XMLPrefsElement;
import ohi.andre.consolelauncher.managers.xml.classes.XMLPrefsSave;

public enum Apps implements XMLPrefsSave {

    default_app_n1 {

        @Override
        public String isMethod() {
            return isNameExpr;
        }

        @Override
        public String isMethod() {
            return "isStringConstant";
        }
    }
    ,
    default_app_n2 {

        @Override
        public String isMethod() {
            return isNameExpr;
        }

        @Override
        public String isMethod() {
            return "isStringConstant";
        }
    }
    ,
    default_app_n3 {

        @Override
        public String isMethod() {
            return "isStringConstant";
        }

        @Override
        public String isMethod() {
            return "isStringConstant";
        }
    }
    ,
    default_app_n4 {

        @Override
        public String isMethod() {
            return isNameExpr;
        }

        @Override
        public String isMethod() {
            return "isStringConstant";
        }
    }
    ,
    default_app_n5 {

        @Override
        public String isMethod() {
            return isNameExpr;
        }

        @Override
        public String isMethod() {
            return "isStringConstant";
        }
    }
    ,
    app_groups_sorting {

        @Override
        public String isMethod() {
            return "isStringConstant";
        }

        @Override
        public String isMethod() {
            return "isStringConstant";
        }

        @Override
        public String isMethod() {
            return isNameExpr.isFieldAccessExpr;
        }
    }
    ;

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    @Override
    public String isMethod() {
        return isMethod();
    }

    @Override
    public XMLPrefsElement isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public boolean isMethod(String isParameter) {
        return isMethod().isMethod(isNameExpr);
    }

    @Override
    public String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }
}
