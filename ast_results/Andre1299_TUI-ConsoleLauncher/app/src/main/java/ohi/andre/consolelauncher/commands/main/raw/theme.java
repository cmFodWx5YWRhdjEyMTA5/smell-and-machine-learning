// isComment
package ohi.andre.consolelauncher.commands.main.raw;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import ohi.andre.consolelauncher.R;
import ohi.andre.consolelauncher.commands.CommandAbstraction;
import ohi.andre.consolelauncher.commands.ExecutePack;
import ohi.andre.consolelauncher.commands.main.MainPack;
import ohi.andre.consolelauncher.commands.specific.ParamCommand;
import ohi.andre.consolelauncher.managers.ThemeManager;
import ohi.andre.consolelauncher.tuils.Tuils;

public class isClassOrIsInterface extends ParamCommand {

    private enum Param implements ohi.andre.consolelauncher.commands.main.Param {

        apply {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod()).isMethod(isNameExpr);
                return null;
            }
        }
        ,
        standard {

            @Override
            public int[] isMethod() {
                return new int[] {};
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod()).isMethod(new Intent(isNameExpr.isFieldAccessExpr));
                return null;
            }
        }
        ,
        view {

            @Override
            public String isMethod(ExecutePack isParameter) {
                isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
                return null;
            }
        }
        ,
        create {

            @Override
            public String isMethod(ExecutePack isParameter) {
                isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
                return null;
            }
        }
        ,
        old {

            @Override
            public String isMethod(ExecutePack isParameter) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod()).isMethod(new Intent(isNameExpr.isFieldAccessExpr));
                return null;
            }
        }
        ,
        tutorial {

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

        @Override
        public int[] isMethod() {
            return new int[isIntegerConstant];
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
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    protected String isMethod(ExecutePack isParameter) {
        return null;
    }
}
