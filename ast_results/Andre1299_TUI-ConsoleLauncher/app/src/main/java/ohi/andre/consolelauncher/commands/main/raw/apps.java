// isComment
package ohi.andre.consolelauncher.commands.main.raw;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.io.File;
import ohi.andre.consolelauncher.R;
import ohi.andre.consolelauncher.commands.CommandAbstraction;
import ohi.andre.consolelauncher.commands.ExecutePack;
import ohi.andre.consolelauncher.commands.main.MainPack;
import ohi.andre.consolelauncher.commands.specific.ParamCommand;
import ohi.andre.consolelauncher.managers.AppsManager;
import ohi.andre.consolelauncher.managers.xml.classes.XMLPrefsSave;
import ohi.andre.consolelauncher.managers.xml.options.Apps;
import ohi.andre.consolelauncher.tuils.Tuils;

public class isClassOrIsInterface extends ParamCommand {

    private enum Param implements ohi.andre.consolelauncher.commands.main.Param {

        ls {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                return ((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
            }

            @Override
            public String isMethod(ExecutePack isParameter, int isParameter) {
                return ((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
        }
        ,
        lsh {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                return ((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
            }

            @Override
            public String isMethod(ExecutePack isParameter, int isParameter) {
                return ((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
        }
        ,
        show {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                AppsManager.LaunchInfo isVariable = isNameExpr.isMethod();
                ((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr);
                return null;
            }
        }
        ,
        hide {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                AppsManager.LaunchInfo isVariable = isNameExpr.isMethod();
                ((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr);
                return null;
            }
        }
        ,
        l {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                try {
                    AppsManager.LaunchInfo isVariable = isNameExpr.isMethod();
                    PackageInfo isVariable = isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                    return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr, isNameExpr);
                } catch (PackageManager.NameNotFoundException isParameter) {
                    return isNameExpr.isMethod();
                }
            }
        }
        ,
        ps {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isFieldAccessExpr.isMethod());
                return null;
            }
        }
        ,
        default_app {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                int isVariable = isNameExpr.isMethod();
                Object isVariable = isNameExpr.isMethod();
                String isVariable;
                if (isNameExpr instanceof AppsManager.LaunchInfo) {
                    AppsManager.LaunchInfo isVariable = (AppsManager.LaunchInfo) isNameExpr;
                    isNameExpr = isNameExpr.isFieldAccessExpr.isMethod() + "isStringConstant" + isNameExpr.isFieldAccessExpr.isMethod();
                } else {
                    isNameExpr = (String) isNameExpr;
                }
                try {
                    XMLPrefsSave isVariable = isNameExpr.isMethod("isStringConstant" + isNameExpr);
                    isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr);
                    return null;
                } catch (Exception isParameter) {
                    return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                }
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
        st {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isFieldAccessExpr.isMethod());
                return null;
            }
        }
        ,
        frc {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                Intent isVariable = ((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr.isMethod());
                isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
                return null;
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
        // isComment
        reset {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                AppsManager.LaunchInfo isVariable = isNameExpr.isMethod();
                isNameExpr.isFieldAccessExpr = isIntegerConstant;
                ((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr);
                return null;
            }
        }
        ,
        mkgp {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                String isVariable = isNameExpr.isMethod();
                return ((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr);
            }
        }
        ,
        rmgp {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                String isVariable = isNameExpr.isMethod();
                return ((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr);
            }
        }
        ,
        gp_bg_color {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                String isVariable = isNameExpr.isMethod();
                String isVariable = isNameExpr.isMethod();
                return ((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr, isNameExpr);
            }

            @Override
            public String isMethod(ExecutePack isParameter, int isParameter) {
                if (isNameExpr == isIntegerConstant) {
                    String isVariable = isNameExpr.isMethod();
                    return ((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                }
                return super.isMethod(isNameExpr, isNameExpr);
            }

            @Override
            public String isMethod(ExecutePack isParameter, int isParameter) {
                return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
        ,
        gp_fore_color {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                String isVariable = isNameExpr.isMethod();
                String isVariable = isNameExpr.isMethod();
                return ((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr, isNameExpr);
            }

            @Override
            public String isMethod(ExecutePack isParameter, int isParameter) {
                if (isNameExpr == isIntegerConstant) {
                    String isVariable = isNameExpr.isMethod();
                    return ((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                }
                return super.isMethod(isNameExpr, isNameExpr);
            }

            @Override
            public String isMethod(ExecutePack isParameter, int isParameter) {
                return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
        ,
        lsgp {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                String isVariable = isNameExpr.isMethod();
                return ((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr);
            }

            @Override
            public String isMethod(ExecutePack isParameter, int isParameter) {
                return ((MainPack) isNameExpr).isFieldAccessExpr.isMethod();
            }
        }
        ,
        addtogp {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                String isVariable = isNameExpr.isMethod();
                AppsManager.LaunchInfo isVariable = isNameExpr.isMethod();
                return ((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr, isNameExpr);
            }
        }
        ,
        rmfromgp {

            @Override
            public int[] isMethod() {
                return new int[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr };
            }

            @Override
            public String isMethod(ExecutePack isParameter) {
                String isVariable = isNameExpr.isMethod();
                AppsManager.LaunchInfo isVariable = isNameExpr.isMethod();
                return ((MainPack) isNameExpr).isFieldAccessExpr.isMethod(isNameExpr, isNameExpr);
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
            return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
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

    private static void isMethod(Context isParameter, String isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    private static void isMethod(Context isParameter, String isParameter) {
        try {
            isNameExpr.isMethod(new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod("isStringConstant" + isNameExpr)));
        } catch (Exception isParameter) {
            isNameExpr.isMethod(new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod("isStringConstant" + isNameExpr)));
        }
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public String[] isMethod() {
        return isNameExpr.isMethod();
    }
}
