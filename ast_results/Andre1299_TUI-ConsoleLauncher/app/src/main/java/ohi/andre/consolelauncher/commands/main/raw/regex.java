// isComment
package ohi.andre.consolelauncher.commands.main.raw;

import ohi.andre.consolelauncher.R;
import ohi.andre.consolelauncher.commands.CommandAbstraction;
import ohi.andre.consolelauncher.commands.ExecutePack;
import ohi.andre.consolelauncher.commands.main.MainPack;
import ohi.andre.consolelauncher.commands.specific.ParamCommand;
import ohi.andre.consolelauncher.managers.RegexManager;
import ohi.andre.consolelauncher.tuils.Tuils;

public class isClassOrIsInterface extends ParamCommand {

    private enum Param implements ohi.andre.consolelauncher.commands.main.Param {

        add {

            @Override
            public String isMethod(ExecutePack isParameter) {
                String isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
                if (isNameExpr == null)
                    return null;
                if (isNameExpr.isMethod() == isIntegerConstant)
                    return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                else
                    return isNameExpr;
            }

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };
            }
        }
        , rm {

            @Override
            public String isMethod(ExecutePack isParameter) {
                String isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
                if (isNameExpr == null)
                    return null;
                if (isNameExpr.isMethod() == isIntegerConstant)
                    return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                return isNameExpr;
            }

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }
        }
        , get {

            @Override
            public String isMethod(ExecutePack isParameter) {
                RegexManager.Regex isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
                if (isNameExpr == null)
                    return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                return isNameExpr.isFieldAccessExpr != null ? isNameExpr.isFieldAccessExpr.isMethod() : isNameExpr.isFieldAccessExpr;
            }

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }
        }
        , test {

            @Override
            public String isMethod(ExecutePack isParameter) {
                CharSequence isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
                if (isNameExpr.isMethod() == isIntegerConstant)
                    return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                return null;
            }

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };
            }
        }
        ;

        @Override
        public String isMethod(ExecutePack isParameter, int isParameter) {
            return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }

        @Override
        public String isMethod(ExecutePack isParameter, int isParameter) {
            return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }

        @Override
        public String isMethod() {
            return isNameExpr.isFieldAccessExpr + isMethod();
        }

        static Param isMethod(String isParameter) {
            isNameExpr = isNameExpr.isMethod();
            Param[] isVariable = isMethod();
            for (Param isVariable : isNameExpr) if (isNameExpr.isMethod(isNameExpr.isMethod()))
                return isNameExpr;
            return null;
        }

        static String[] isMethod() {
            Param[] isVariable = isMethod();
            String[] isVariable = new String[isNameExpr.isFieldAccessExpr];
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
                isNameExpr[isNameExpr] = isNameExpr[isNameExpr].isMethod();
            }
            return isNameExpr;
        }
    }

    @Override
    protected ohi.andre.consolelauncher.commands.main.Param isMethod(MainPack isParameter, String isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    protected String isMethod(ExecutePack isParameter) {
        return null;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public String[] isMethod() {
        return isNameExpr.isMethod();
    }
}
