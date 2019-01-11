// isComment
package ohi.andre.consolelauncher.commands.main.raw;

import java.io.File;
import java.util.ArrayList;
import ohi.andre.consolelauncher.R;
import ohi.andre.consolelauncher.commands.CommandAbstraction;
import ohi.andre.consolelauncher.commands.ExecutePack;
import ohi.andre.consolelauncher.commands.main.MainPack;
import ohi.andre.consolelauncher.commands.specific.ParamCommand;
import ohi.andre.consolelauncher.managers.AliasManager;
import ohi.andre.consolelauncher.tuils.Tuils;

/**
 * isComment
 */
public class isClassOrIsInterface extends ParamCommand {

    private enum Param implements ohi.andre.consolelauncher.commands.main.Param {

        add {

            @Override
            public String isMethod(ExecutePack isParameter) {
                ArrayList<String> isVariable = isNameExpr.isMethod();
                if (isNameExpr.isMethod() < isIntegerConstant)
                    return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                if (((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr.isMethod(isIntegerConstant), isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr))) {
                    return null;
                } else {
                    return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                }
            }

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }
        }
        , rm {

            @Override
            public String isMethod(ExecutePack isParameter) {
                ArrayList<String> isVariable = isNameExpr.isMethod();
                if (isNameExpr.isMethod() < isIntegerConstant)
                    return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                if (((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr.isMethod(isIntegerConstant)))
                    return null;
                else
                    return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + isNameExpr.isFieldAccessExpr + isNameExpr.isMethod(isIntegerConstant);
            }

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }
        }
        , file {

            @Override
            public String isMethod(ExecutePack isParameter) {
                isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(new File(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr)));
                return null;
            }

            @Override
            public int[] isMethod() {
                return new int[isIntegerConstant];
            }
        }
        , ls {

            @Override
            public String isMethod(ExecutePack isParameter) {
                return ((MainPack) isNameExpr).isFieldAccessExpr.isMethod();
            }

            @Override
            public int[] isMethod() {
                return new int[isIntegerConstant];
            }
        }
        , tutorial {

            @Override
            public int[] isMethod() {
                return new int[isIntegerConstant];
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
                return null;
            }
        }
        ;

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

        @Override
        public String isMethod() {
            return isNameExpr.isFieldAccessExpr + isMethod();
        }

        @Override
        public String isMethod(ExecutePack isParameter, int isParameter) {
            return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }

        @Override
        public String isMethod(ExecutePack isParameter, int isParameter) {
            return null;
        }
    }

    @Override
    public String[] isMethod() {
        return isNameExpr.isMethod();
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
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }
}
