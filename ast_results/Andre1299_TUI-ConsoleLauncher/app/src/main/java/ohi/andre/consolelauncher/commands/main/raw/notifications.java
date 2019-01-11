// isComment
package ohi.andre.consolelauncher.commands.main.raw;

import android.content.Intent;
import java.io.File;
import ohi.andre.consolelauncher.R;
import ohi.andre.consolelauncher.commands.CommandAbstraction;
import ohi.andre.consolelauncher.commands.ExecutePack;
import ohi.andre.consolelauncher.commands.main.MainPack;
import ohi.andre.consolelauncher.commands.specific.ParamCommand;
import ohi.andre.consolelauncher.managers.notifications.NotificationManager;
import ohi.andre.consolelauncher.tuils.Tuils;

public class isClassOrIsInterface extends ParamCommand {

    private enum Param implements ohi.andre.consolelauncher.commands.main.Param {

        inc {

            @Override
            public String isMethod(ExecutePack isParameter) {
                String isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isFieldAccessExpr.isMethod(), true);
                if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant)
                    return null;
                return isNameExpr;
            }

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter, int isParameter) {
                return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
        ,
        exc {

            @Override
            public String isMethod(ExecutePack isParameter) {
                String isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isFieldAccessExpr.isMethod(), true);
                if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant)
                    return null;
                return isNameExpr;
            }

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter, int isParameter) {
                return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
        ,
        color {

            @Override
            public String isMethod(ExecutePack isParameter) {
                String isVariable = isNameExpr.isMethod();
                String isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isFieldAccessExpr.isMethod(), isNameExpr);
                if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant)
                    return null;
                return isNameExpr;
            }

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter, int isParameter) {
                int isVariable;
                if (isNameExpr == isIntegerConstant)
                    isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                else
                    isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            }
        }
        ,
        format {

            @Override
            public String isMethod(ExecutePack isParameter) {
                String isVariable = isNameExpr.isMethod();
                String isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isFieldAccessExpr.isMethod(), isNameExpr);
                if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant)
                    return null;
                return isNameExpr;
            }

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter, int isParameter) {
                return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
        ,
        add_filter {

            @Override
            public String isMethod(ExecutePack isParameter) {
                int isVariable = isNameExpr.isMethod();
                String isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
                if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant)
                    return null;
                return isNameExpr;
            }

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter, int isParameter) {
                return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
        ,
        add_format {

            @Override
            public String isMethod(ExecutePack isParameter) {
                int isVariable = isNameExpr.isMethod();
                String isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
                if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant)
                    return null;
                return isNameExpr;
            }

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter, int isParameter) {
                return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
        ,
        rm_filter {

            @Override
            public String isMethod(ExecutePack isParameter) {
                String isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
                if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant)
                    return null;
                return isNameExpr;
            }

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter, int isParameter) {
                return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
        ,
        rm_format {

            @Override
            public String isMethod(ExecutePack isParameter) {
                String isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
                if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant)
                    return null;
                return isNameExpr;
            }

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter, int isParameter) {
                return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
        ,
        file {

            @Override
            public int[] isMethod() {
                return new int[isIntegerConstant];
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(new File(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr)));
                return null;
            }
        }
        ,
        access {

            @Override
            public int[] isMethod() {
                return new int[isIntegerConstant];
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                try {
                    isNameExpr.isFieldAccessExpr.isMethod(new Intent("isStringConstant"));
                } catch (Exception isParameter) {
                    return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                }
                return null;
            }
        }
        ,
        tutorial {

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
            return null;
        }

        @Override
        public String isMethod(ExecutePack isParameter, int isParameter) {
            return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
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
    public String[] isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }
}
