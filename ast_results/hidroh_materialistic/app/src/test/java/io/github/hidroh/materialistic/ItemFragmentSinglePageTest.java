// isComment
package io.github.hidroh.materialistic;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupMenu;
import android.widget.TextView;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
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
import org.robolectric.shadows.ShadowNetworkInfo;
import org.robolectric.shadows.ShadowPopupMenu;
import org.robolectric.shadows.ShadowToast;
import org.robolectric.shadows.support.v4.SupportFragmentTestUtil;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Named;
import io.github.hidroh.materialistic.accounts.UserServices;
import io.github.hidroh.materialistic.data.Item;
import io.github.hidroh.materialistic.data.ItemManager;
import io.github.hidroh.materialistic.data.ResponseListener;
import io.github.hidroh.materialistic.data.TestHnItem;
import io.github.hidroh.materialistic.test.TestItem;
import io.github.hidroh.materialistic.test.TestLayoutManager;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.shadow.ShadowItemTouchHelper;
import io.github.hidroh.materialistic.test.shadow.ShadowRecyclerView;
import io.github.hidroh.materialistic.test.shadow.ShadowRecyclerViewAdapter;
import io.github.hidroh.materialistic.test.shadow.ShadowTextView;
import io.github.hidroh.materialistic.widget.MultiPageItemRecyclerViewAdapter;
import io.github.hidroh.materialistic.widget.SinglePageItemRecyclerViewAdapter;
import io.github.hidroh.materialistic.widget.ToggleItemViewHolder;
import static io.github.hidroh.materialistic.test.shadow.CustomShadows.customShadowOf;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import static org.assertj.android.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.robolectric.Shadows.shadowOf;

@SuppressWarnings("isStringConstant")
@Config(shadows = { ShadowRecyclerViewAdapter.class, ShadowTextView.class })
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    @Inject
    @Named(isNameExpr.isFieldAccessExpr)
    ItemManager isVariable;

    @Inject
    UserServices isVariable;

    @Captor
    ArgumentCaptor<ResponseListener<Item>> isVariable;

    @Captor
    ArgumentCaptor<UserServices.Callback> isVariable;

    private RecyclerView isVariable;

    private SinglePageItemRecyclerViewAdapter isVariable;

    private ToggleItemViewHolder isVariable;

    private ToggleItemViewHolder isVariable;

    private ToggleItemViewHolder isVariable;

    private ItemFragmentMultiPageTest.TestItemActivity isVariable;

    private ItemFragment isVariable;

    private ActivityController<ItemFragmentMultiPageTest.TestItemActivity> isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(((WindowManager) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod()).isMethod(// isComment
        isIntegerConstant);
        isMethod((ConnectivityManager) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(null, isNameExpr.isFieldAccessExpr, isIntegerConstant, true, true));
        final TestHnItem isVariable = new TestHnItem(isIntegerConstant, isIntegerConstant) {

            @Override
            public long isMethod(int isParameter) {
                if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                    return isStringConstant;
                }
                return super.isMethod(isNameExpr);
            }
        };
        isNameExpr.isMethod(new // isComment
        TestItem() {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }

            @Override
            public long[] isMethod() {
                return new long[] { isStringConstant };
            }
        });
        final TestHnItem isVariable = new TestHnItem(isIntegerConstant, isIntegerConstant);
        isNameExpr.isMethod(new // isComment
        TestItem() {

            @Override
            public String isMethod() {
                return "isStringConstant";
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

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }

            @Override
            public long[] isMethod() {
                return new long[] { isStringConstant };
            }
        });
        isNameExpr.isMethod()[isIntegerConstant] = isNameExpr;
        final TestHnItem isVariable = new TestHnItem(isIntegerConstant, isIntegerConstant);
        isNameExpr.isMethod(new // isComment
        TestItem() {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public long[] isMethod() {
                return new long[isIntegerConstant];
            }

            @Override
            public int isMethod() {
                return isIntegerConstant;
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
        isNameExpr.isMethod()[isIntegerConstant] = isNameExpr;
        TestHnItem isVariable = new TestHnItem(isIntegerConstant, isIntegerConstant) {

            @Override
            public long isMethod(int isParameter) {
                if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                    return isStringConstant;
                }
                return super.isMethod(isNameExpr);
            }
        };
        isNameExpr.isMethod(new // isComment
        TestItem() {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }

            @Override
            public long[] isMethod() {
                return new long[isIntegerConstant];
            }
        });
        TestHnItem isVariable = new TestHnItem(isIntegerConstant);
        isNameExpr.isMethod(new TestItem() {

            @Override
            public long[] isMethod() {
                return new long[] { isStringConstant, isStringConstant };
            }

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }
        });
        isNameExpr.isMethod()[isIntegerConstant] = isNameExpr;
        isNameExpr.isMethod()[isIntegerConstant] = isNameExpr;
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = (ItemFragment) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, ItemFragment.class.isMethod(), isNameExpr);
        isNameExpr = isNameExpr.isMethod(ItemFragmentMultiPageTest.TestItemActivity.class);
        isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod().isMethod();
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true).isMethod();
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, ItemFragment.class.isMethod()).isMethod();
        isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (SinglePageItemRecyclerViewAdapter) isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant)), isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant)), isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant)), isIntegerConstant);
        // isComment
        isNameExpr = (ToggleItemViewHolder) isMethod(isNameExpr).isMethod(isIntegerConstant);
        isNameExpr = (ToggleItemViewHolder) isMethod(isNameExpr).isMethod(isIntegerConstant);
        isNameExpr = (ToggleItemViewHolder) isMethod(isNameExpr).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() {
        // isComment
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isMethod(isIntegerConstant, isNameExpr.isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() {
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new TestItem() {

            @Override
            public Item[] isMethod() {
                return new Item[] { new TestItem() {

                    @Override
                    public int isMethod() {
                        return -isIntegerConstant;
                    }
                } };
            }

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }
        });
        Fragment isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, ItemFragment.class.isMethod(), isNameExpr);
        isNameExpr.isMethod(isNameExpr, ItemFragmentMultiPageTest.TestItemActivity.class, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (RecyclerView) isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (SinglePageItemRecyclerViewAdapter) isNameExpr.isMethod();
    }

    @Test
    @Ignore
    public void isMethod() {
        // isComment
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        // isComment
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        // isComment
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        // isComment
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    @Config(shadows = { ShadowRecyclerView.class, ShadowItemTouchHelper.class })
    @Test
    @Ignore
    public void isMethod() {
        ItemTouchHelper.SimpleCallback isVariable = (ItemTouchHelper.SimpleCallback) isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr)).isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr)).isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isMethod(Canvas.class), isNameExpr, isNameExpr, isDoubleConstant, isDoubleConstant, isNameExpr.isFieldAccessExpr, true);
        // isComment
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        // isComment
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isMethod(isMethod((View) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod());
    }

    @Test
    public void isMethod() {
        isMethod(((TextView) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(((TextView) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr)));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        final TestItem isVariable = new // isComment
        TestItem() {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }

            @Override
            public Item[] isMethod() {
                return new Item[] { new TestItem() {

                    @Override
                    public String isMethod() {
                        return "isStringConstant";
                    }
                } };
            }
        };
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new TestItem() {

            @Override
            public Item[] isMethod() {
                return new Item[] { isNameExpr };
            }

            @Override
            public int isMethod() {
                return isIntegerConstant;
            }
        });
        Fragment isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, ItemFragment.class.isMethod(), isNameExpr);
        isNameExpr.isMethod(isNameExpr, ItemFragmentMultiPageTest.TestItemActivity.class, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (RecyclerView) isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = (SinglePageItemRecyclerViewAdapter) isNameExpr.isMethod();
        // isComment
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        // isComment
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod();
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isMethod((View) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
    }

    @Test
    public void isMethod() {
        isMethod();
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod();
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod();
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(true);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(true);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, LoginActivity.class);
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(new IOException());
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, ComposeActivity.class).isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    @Test
    public void isMethod() {
        isNameExpr.isMethod(new Intent(isNameExpr.isFieldAccessExpr));
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        PopupMenu isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod().isMethod(new RoboMenuItem(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Config(shadows = ShadowRecyclerView.class)
    @Test
    @Ignore
    public void isMethod() {
        ShadowRecyclerView isVariable = isMethod(isNameExpr);
        TestLayoutManager isVariable = new TestLayoutManager(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isFieldAccessExpr = isIntegerConstant;
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isFieldAccessExpr = isIntegerConstant;
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isFieldAccessExpr = isIntegerConstant;
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @After
    public void isMethod() {
        isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod();
    }

    private void isMethod() {
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod()).isMethod(SinglePageItemRecyclerViewAdapter.class);
    }

    private void isMethod() {
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod()).isMethod(MultiPageItemRecyclerViewAdapter.class);
    }
}
