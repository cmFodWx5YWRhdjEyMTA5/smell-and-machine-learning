// isComment
package io.github.hidroh.materialistic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;
import org.robolectric.fakes.RoboMenuItem;
import org.robolectric.shadow.api.Shadow;
import org.robolectric.shadows.ShadowApplication;
import org.robolectric.shadows.ShadowGestureDetector;
import org.robolectric.shadows.ShadowLooper;
import org.robolectric.shadows.ShadowPackageManager;
import org.robolectric.shadows.ShadowPopupMenu;
import org.robolectric.shadows.ShadowResolveInfo;
import org.robolectric.shadows.ShadowToast;
import org.robolectric.shadows.support.v4.ShadowLocalBroadcastManager;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Named;
import io.github.hidroh.materialistic.accounts.UserServices;
import io.github.hidroh.materialistic.data.FavoriteManager;
import io.github.hidroh.materialistic.data.HackerNewsClient;
import io.github.hidroh.materialistic.data.Item;
import io.github.hidroh.materialistic.data.ItemManager;
import io.github.hidroh.materialistic.data.MaterialisticDatabase;
import io.github.hidroh.materialistic.data.ResponseListener;
import io.github.hidroh.materialistic.data.TestHnItem;
import io.github.hidroh.materialistic.data.WebItem;
import io.github.hidroh.materialistic.test.TestItem;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.TestWebItem;
import io.github.hidroh.materialistic.test.shadow.ShadowFloatingActionButton;
import io.github.hidroh.materialistic.test.shadow.ShadowRecyclerView;
import static io.github.hidroh.materialistic.test.shadow.CustomShadows.customShadowOf;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.assertj.android.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.robolectric.Shadows.shadowOf;

@SuppressWarnings("isStringConstant")
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private ActivityController<ItemActivity> isVariable;

    private ItemActivity isVariable;

    @Inject
    @Named(isNameExpr.isFieldAccessExpr)
    ItemManager isVariable;

    @Inject
    FavoriteManager isVariable;

    @Inject
    UserServices isVariable;

    @Inject
    KeyDelegate isVariable;

    @Captor
    ArgumentCaptor<ResponseListener<Item>> isVariable;

    @Captor
    ArgumentCaptor<UserServices.Callback> isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(ItemActivity.class);
        isNameExpr = isNameExpr.isMethod();
    }

    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant"));
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr), isMethod(ResponseListener.class));
    }

    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod("isStringConstant"), isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(new TestItem() {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public String isMethod() {
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public boolean isMethod() {
                return true;
            }
        });
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod(((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod()[isIntegerConstant]).isMethod());
        isMethod((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr), isMethod(ResponseListener.class));
    }

    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new TestItem() {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }

            @Override
            public boolean isMethod() {
                return true;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        });
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod(((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod()[isIntegerConstant]).isMethod());
    }

    @SuppressLint("isStringConstant")
    @Test
    public void isMethod() {
        ShadowPackageManager isVariable = isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        isNameExpr.isMethod(new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod("isStringConstant")), isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant"));
        isNameExpr.isMethod(new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"))), isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant"));
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new TestItem() {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public boolean isMethod() {
                return true;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        });
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod().isMethod().isMethod();
        // isComment
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod().isMethod().isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod().isMethod().isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @SuppressLint("isStringConstant")
    @Test
    public void isMethod() {
        isNameExpr.isMethod(new Intent(isNameExpr.isFieldAccessExpr));
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new TestItem() {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public boolean isMethod() {
                return true;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        });
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod().isMethod().isMethod();
        // isComment
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod().isMethod().isMethod();
        Intent isVariable = isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        isNameExpr.isMethod(new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod("isStringConstant")));
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new TestItem() {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public boolean isMethod() {
                return true;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        });
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        TestHnItem isVariable = new TestHnItem(isStringConstant) {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }
        };
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod().isMethod("isStringConstant").isMethod("isStringConstant").isMethod());
        isMethod(isNameExpr.isMethod());
        isMethod((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod().isMethod("isStringConstant").isMethod("isStringConstant").isMethod());
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        TestHnItem isVariable = new TestHnItem(isStringConstant) {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }
        };
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod().isMethod("isStringConstant").isMethod("isStringConstant").isMethod());
        isMethod(isNameExpr.isMethod());
    }

    @Config(shadows = ShadowRecyclerView.class)
    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new TestItem() {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public boolean isMethod() {
                return true;
            }

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        });
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod().isMethod().isMethod();
        RecyclerView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isIntegerConstant);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isIntegerConstant);
        TabLayout isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant).isMethod();
        isNameExpr.isMethod(isIntegerConstant).isMethod();
        isNameExpr.isMethod(isIntegerConstant).isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new TestItem() {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public boolean isMethod() {
                return true;
            }

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        });
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        TabLayout isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new TestHnItem(isIntegerConstant));
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(true);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, LoginActivity.class);
    }

    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new TestHnItem(isIntegerConstant));
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(true);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new TestHnItem(isIntegerConstant));
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod("isStringConstant"), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(new IOException());
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new TestHnItem(isStringConstant));
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, ComposeActivity.class);
    }

    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        WebItem isVariable = new TestWebItem() {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        };
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new KeyEvent(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(Scrollable.class), isMethod(AppBarLayout.class));
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(KeyEvent.class));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new KeyEvent(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(KeyEvent.class));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new KeyEvent(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(KeyEvent.class));
    }

    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        WebItem isVariable = new TestWebItem() {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        };
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new KeyEvent(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod());
        isMethod(isNameExpr).isMethod(isMethod(), isMethod(KeyEvent.class));
    }

    @Config(shadows = { ShadowFloatingActionButton.class })
    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        WebItem isVariable = new TestWebItem() {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        };
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        ShadowFloatingActionButton isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr).isMethod(new Intent(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr, true));
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr).isMethod(new Intent(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr, true));
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        WebItem isVariable = new TestWebItem() {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        };
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr).isMethod(new Intent(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr, true));
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        isMethod();
        TabLayout isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isIntegerConstant), isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(new TestHnItem(isStringConstant) {

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }
        });
        isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isIntegerConstant), isNameExpr.isMethod(isIntegerConstant).isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        isMethod();
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod();
        ((GestureDetector.SimpleOnGestureListener) isMethod(isNameExpr).isMethod()).isMethod(isMethod(MotionEvent.class));
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        isMethod();
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr).isMethod().isMethod(isMethod(MotionEvent.class));
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        MotionEvent isVariable = isMethod(MotionEvent.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isDoubleConstant);
        isMethod(isNameExpr).isMethod().isMethod(isNameExpr, isNameExpr);
        isNameExpr = isMethod(MotionEvent.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod().isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isDoubleConstant).isMethod(isDoubleConstant);
    }

    @After
    public void isMethod() {
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod();
    }

    private void isMethod() {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new TestItem() {

            @NonNull
            @Override
            public String isMethod() {
                return isNameExpr;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public boolean isMethod() {
                return true;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        });
        isNameExpr = isNameExpr.isMethod(ItemActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
    }

    private ShadowGestureDetector isMethod(View isParameter) {
        isMethod(isNameExpr).isMethod().isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isNameExpr.isFieldAccessExpr, isIntegerConstant, isIntegerConstant, isIntegerConstant));
        return isMethod(isNameExpr.isMethod());
    }
}
