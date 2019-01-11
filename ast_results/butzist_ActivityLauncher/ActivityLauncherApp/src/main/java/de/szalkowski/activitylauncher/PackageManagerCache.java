// isComment
package de.szalkowski.activitylauncher;

import java.util.HashMap;
import java.util.Map;
import android.content.ComponentName;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

public class isClassOrIsInterface {

    public static PackageManagerCache isVariable = null;

    protected Map<String, MyPackageInfo> isVariable;

    protected Map<ComponentName, MyActivityInfo> isVariable;

    protected PackageManager isVariable;

    public static PackageManagerCache isMethod(PackageManager isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new PackageManagerCache(isNameExpr);
        }
        return isNameExpr;
    }

    private isConstructor(PackageManager isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = new HashMap<String, MyPackageInfo>();
        this.isFieldAccessExpr = new HashMap<ComponentName, MyActivityInfo>();
    }

    MyPackageInfo isMethod(String isParameter) throws NameNotFoundException {
        MyPackageInfo isVariable;
        synchronized (isNameExpr) {
            if (isNameExpr.isMethod(isNameExpr)) {
                return isNameExpr.isMethod(isNameExpr);
            }
            PackageInfo isVariable;
            try {
                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
            } catch (NameNotFoundException isParameter) {
                throw isNameExpr;
            }
            isNameExpr = new MyPackageInfo(isNameExpr, isNameExpr, this);
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }

    MyPackageInfo[] isMethod() {
        return null;
    }

    MyActivityInfo isMethod(ComponentName isParameter) {
        MyActivityInfo isVariable;
        synchronized (isNameExpr) {
            if (isNameExpr.isMethod(isNameExpr)) {
                return isNameExpr.isMethod(isNameExpr);
            }
            isNameExpr = new MyActivityInfo(isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }
}
