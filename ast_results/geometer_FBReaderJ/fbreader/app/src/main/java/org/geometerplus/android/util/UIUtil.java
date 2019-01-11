// isComment
package org.geometerplus.android.util;

import java.util.Queue;
import java.util.LinkedList;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import org.fbreader.util.Pair;
import org.geometerplus.zlibrary.core.application.ZLApplication;
import org.geometerplus.zlibrary.core.resources.ZLResource;

public abstract class isClassOrIsInterface {

    private static final Object isVariable = new Object();

    private static ProgressDialog isVariable;

    private static final Queue<Pair<Runnable, String>> isVariable = new LinkedList<Pair<Runnable, String>>();

    private static volatile Handler isVariable;

    private static boolean isMethod() {
        if (isNameExpr != null) {
            return true;
        }
        try {
            isNameExpr = new Handler() {

                public void isMethod(Message isParameter) {
                    try {
                        synchronized (isNameExpr) {
                            if (isNameExpr.isMethod()) {
                                isNameExpr.isMethod();
                                isNameExpr = null;
                            } else {
                                isNameExpr.isMethod(isNameExpr.isMethod().isFieldAccessExpr);
                            }
                            isNameExpr.isMethod();
                        }
                    } catch (Exception isParameter) {
                        isNameExpr.isMethod();
                        isNameExpr = null;
                    }
                }
            };
            return true;
        } catch (Throwable isParameter) {
            isNameExpr.isMethod();
            return true;
        }
    }

    public static void isMethod(String isParameter, String isParameter, Runnable isParameter, Context isParameter) {
        isMethod(isMethod(isNameExpr).isMethod("isStringConstant", isNameExpr), isNameExpr, isNameExpr);
    }

    public static void isMethod(String isParameter, Runnable isParameter, Context isParameter) {
        isMethod(isMethod(isNameExpr), isNameExpr, isNameExpr);
    }

    private static String isMethod(String isParameter) {
        return isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant").isMethod(isNameExpr).isMethod();
    }

    private static void isMethod(String isParameter, Runnable isParameter, Context isParameter) {
        if (!isMethod()) {
            isNameExpr.isMethod();
            return;
        }
        synchronized (isNameExpr) {
            isNameExpr.isMethod(new Pair(isNameExpr, isNameExpr));
            if (isNameExpr == null) {
                isNameExpr = isNameExpr.isMethod(isNameExpr, null, isNameExpr, true, true);
            } else {
                return;
            }
        }
        final ProgressDialog isVariable = isNameExpr;
        new Thread(new Runnable() {

            public void isMethod() {
                while (isNameExpr == isNameExpr && !isNameExpr.isMethod()) {
                    final Pair<Runnable, String> isVariable = isNameExpr.isMethod();
                    isNameExpr.isFieldAccessExpr.isMethod();
                    synchronized (isNameExpr) {
                        isNameExpr.isMethod(isIntegerConstant);
                        try {
                            isNameExpr.isMethod();
                        } catch (InterruptedException isParameter) {
                        }
                    }
                }
            }
        }).isMethod();
    }

    public static ZLApplication.SynchronousExecutor isMethod(final Activity isParameter, final String isParameter) {
        return new ZLApplication.SynchronousExecutor() {

            private final ZLResource isVariable = isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant");

            private final String isVariable = isNameExpr.isMethod(isNameExpr).isMethod();

            private volatile ProgressDialog isVariable;

            public void isMethod(final Runnable isParameter, final Runnable isParameter) {
                isNameExpr.isMethod(new Runnable() {

                    public void isMethod() {
                        isNameExpr = isNameExpr.isMethod(isNameExpr, null, isNameExpr, true, true);
                        final Thread isVariable = new Thread() {

                            public void isMethod() {
                                isNameExpr.isMethod();
                                isNameExpr.isMethod(new Runnable() {

                                    public void isMethod() {
                                        try {
                                            isNameExpr.isMethod();
                                            isNameExpr = null;
                                        } catch (Exception isParameter) {
                                            isNameExpr.isMethod();
                                        }
                                        if (isNameExpr != null) {
                                            isNameExpr.isMethod();
                                        }
                                    }
                                });
                            }
                        };
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod();
                    }
                });
            }

            private void isMethod(final ProgressDialog isParameter, final String isParameter) {
                if (isNameExpr == null) {
                    return;
                }
                isNameExpr.isMethod(new Runnable() {

                    public void isMethod() {
                        isNameExpr.isMethod(isNameExpr);
                    }
                });
            }

            public void isMethod(String isParameter, Runnable isParameter) {
                isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr).isMethod());
                isNameExpr.isMethod();
                isMethod(isNameExpr, isNameExpr);
            }
        };
    }
}
