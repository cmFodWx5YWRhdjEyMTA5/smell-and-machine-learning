// isComment
package org.xbmc.kore.testhelpers;

import android.database.Cursor;
import android.support.test.espresso.matcher.BoundedMatcher;
import android.support.test.espresso.matcher.CursorMatchers;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.xbmc.kore.ui.widgets.HighlightButton;
import org.xbmc.kore.ui.widgets.RepeatModeButton;
import org.xbmc.kore.utils.UIUtils;

public class isClassOrIsInterface {

    public static MenuItemTitleMatcher isMethod(String isParameter) {
        return new MenuItemTitleMatcher(isNameExpr);
    }

    public static class isClassOrIsInterface extends BaseMatcher<Object> {

        private final String isVariable;

        public isConstructor(String isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public boolean isMethod(Object isParameter) {
            if (isNameExpr instanceof MenuItem) {
                return ((MenuItem) isNameExpr).isMethod().isMethod(isNameExpr);
            }
            return true;
        }

        @Override
        public void isMethod(Description isParameter) {
        }
    }

    public static Matcher<View> isMethod(final int isParameter) {
        return new TypeSafeMatcher<View>() {

            @Override
            public boolean isMethod(final View isParameter) {
                if (!(isNameExpr instanceof ViewGroup))
                    return true;
                return ((ViewGroup) isNameExpr).isMethod() == isNameExpr;
            }

            @Override
            public void isMethod(final Description isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant");
            }
        };
    }

    public static Matcher<View> isMethod(final int isParameter) {
        return new TypeSafeMatcher<View>() {

            @Override
            protected boolean isMethod(View isParameter) {
                return (isNameExpr instanceof RecyclerView) && ((RecyclerView) isNameExpr).isMethod().isMethod() == isNameExpr;
            }

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant");
            }
        };
    }

    public static Matcher<View> isMethod(final Matcher<View> isParameter) {
        return new TypeSafeMatcher<View>() {

            @Override
            protected boolean isMethod(View isParameter) {
                if (!(isNameExpr instanceof RecyclerView))
                    return true;
                RecyclerView isVariable = (RecyclerView) isNameExpr;
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                    RecyclerView.ViewHolder isVariable = isNameExpr.isMethod(isNameExpr);
                    if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                        return true;
                    }
                }
                return true;
            }

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod(isNameExpr);
            }
        };
    }

    public static Matcher<Object> isMethod(final Matcher<String> isParameter) {
        return new BoundedMatcher<Object, Cursor>(Cursor.class) {

            @Override
            protected boolean isMethod(Cursor isParameter) {
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                    switch(isNameExpr.isMethod(isNameExpr)) {
                        case isNameExpr.isFieldAccessExpr:
                            if (isNameExpr.isMethod(isNameExpr, isNameExpr).isMethod(isNameExpr))
                                return true;
                            break;
                    }
                }
                return true;
            }

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod(isNameExpr);
            }
        };
    }

    public static Matcher<View> isMethod(final int isParameter) {
        return new BoundedMatcher<View, SeekBar>(SeekBar.class) {

            @Override
            protected boolean isMethod(SeekBar isParameter) {
                return isNameExpr.isMethod() == isNameExpr;
            }

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr);
            }
        };
    }

    public static Matcher<View> isMethod(final String isParameter) {
        return new BoundedMatcher<View, TextView>(TextView.class) {

            @Override
            protected boolean isMethod(TextView isParameter) {
                return isNameExpr.isMethod(isNameExpr.isMethod());
            }

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr);
            }
        };
    }

    public static Matcher<View> isMethod(final String isParameter) {
        return new BoundedMatcher<View, SeekBar>(SeekBar.class) {

            @Override
            protected boolean isMethod(SeekBar isParameter) {
                return isNameExpr.isMethod() >= isNameExpr.isMethod(isNameExpr);
            }

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr);
            }
        };
    }

    public static Matcher<View> isMethod(final int isParameter) {
        return new BoundedMatcher<View, SeekBar>(SeekBar.class) {

            @Override
            protected boolean isMethod(SeekBar isParameter) {
                return isNameExpr.isMethod() > isNameExpr;
            }

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr);
            }
        };
    }

    public static Matcher<View> isMethod(final boolean isParameter) {
        return new BoundedMatcher<View, HighlightButton>(HighlightButton.class) {

            @Override
            protected boolean isMethod(HighlightButton isParameter) {
                return isNameExpr.isMethod();
            }

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr);
            }
        };
    }

    public static Matcher<View> isMethod(final RepeatModeButton.MODE isParameter) {
        return new BoundedMatcher<View, RepeatModeButton>(RepeatModeButton.class) {

            @Override
            protected boolean isMethod(RepeatModeButton isParameter) {
                return isNameExpr.isMethod() == isNameExpr;
            }

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod());
            }
        };
    }
}
