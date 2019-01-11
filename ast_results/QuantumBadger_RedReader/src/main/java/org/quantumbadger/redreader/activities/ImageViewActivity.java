// isComment
package org.quantumbadger.redreader.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.github.lzyzsd.circleprogress.DonutProgress;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MergingMediaSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import org.quantumbadger.redreader.R;
import org.quantumbadger.redreader.account.RedditAccountManager;
import org.quantumbadger.redreader.cache.CacheManager;
import org.quantumbadger.redreader.cache.CacheRequest;
import org.quantumbadger.redreader.cache.downloadstrategy.DownloadStrategyIfNotCached;
import org.quantumbadger.redreader.common.AndroidCommon;
import org.quantumbadger.redreader.common.Constants;
import org.quantumbadger.redreader.common.General;
import org.quantumbadger.redreader.common.LinkHandler;
import org.quantumbadger.redreader.common.PrefsUtility;
import org.quantumbadger.redreader.common.RRError;
import org.quantumbadger.redreader.fragments.ImageInfoDialog;
import org.quantumbadger.redreader.image.GetAlbumInfoListener;
import org.quantumbadger.redreader.image.GetImageInfoListener;
import org.quantumbadger.redreader.image.GifDecoderThread;
import org.quantumbadger.redreader.image.ImageInfo;
import org.quantumbadger.redreader.image.ImgurAPI;
import org.quantumbadger.redreader.reddit.prepared.RedditParsedPost;
import org.quantumbadger.redreader.reddit.prepared.RedditPreparedPost;
import org.quantumbadger.redreader.reddit.things.RedditPost;
import org.quantumbadger.redreader.reddit.url.PostCommentListingURL;
import org.quantumbadger.redreader.views.GIFView;
import org.quantumbadger.redreader.views.HorizontalSwipeProgressOverlay;
import org.quantumbadger.redreader.views.RedditPostView;
import org.quantumbadger.redreader.views.bezelmenu.BezelSwipeOverlay;
import org.quantumbadger.redreader.views.bezelmenu.SideToolbarOverlay;
import org.quantumbadger.redreader.views.glview.RRGLSurfaceView;
import org.quantumbadger.redreader.views.imageview.BasicGestureHandler;
import org.quantumbadger.redreader.views.imageview.ImageTileSource;
import org.quantumbadger.redreader.views.imageview.ImageTileSourceWholeBitmap;
import org.quantumbadger.redreader.views.imageview.ImageViewDisplayListManager;
import org.quantumbadger.redreader.views.liststatus.ErrorView;
import org.quantumbadger.redreader.views.video.ExoPlayerWrapperView;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class isClassOrIsInterface extends BaseActivity implements RedditPostView.PostSelectionListener, ImageViewDisplayListManager.Listener {

    private static final String isVariable = "isStringConstant";

    private TextView isVariable;

    private GLSurfaceView isVariable;

    private ImageView isVariable;

    private GifDecoderThread isVariable;

    private ExoPlayerWrapperView isVariable;

    private String isVariable;

    private boolean isVariable = true, isVariable = true;

    private CacheRequest isVariable;

    private boolean isVariable = true;

    private ImageViewDisplayListManager isVariable;

    private HorizontalSwipeProgressOverlay isVariable;

    private boolean isVariable;

    private RedditPost isVariable;

    private ImageInfo isVariable;

    private ImgurAPI.AlbumInfo isVariable;

    private int isVariable;

    private FrameLayout isVariable;

    private int isVariable;

    @Nullable
    private LinearLayout isVariable;

    @Override
    protected boolean isMethod() {
        return true;
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        final SharedPreferences isVariable = isNameExpr.isMethod(this);
        final int isVariable = isNameExpr.isMethod(this, isNameExpr);
        isNameExpr = isNameExpr.isMethod(this, isNameExpr);
        final Intent isVariable = isMethod();
        isNameExpr = isNameExpr.isMethod();
        if (isNameExpr == null) {
            isMethod();
            return;
        }
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        if (isNameExpr.isMethod("isStringConstant")) {
            isNameExpr.isMethod(this, isNameExpr.isMethod("isStringConstant"), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, new GetAlbumInfoListener() {

                @Override
                public void isMethod(@CacheRequest.RequestFailureType final int isParameter, final Throwable isParameter, final Integer isParameter, final String isParameter) {
                // isComment
                }

                @Override
                public void isMethod(final ImgurAPI.AlbumInfo isParameter) {
                    isNameExpr.isFieldAccessExpr.isMethod(new Runnable() {

                        @Override
                        public void isMethod() {
                            isNameExpr = isNameExpr;
                            isNameExpr = isNameExpr.isMethod("isStringConstant", isIntegerConstant);
                        }
                    });
                }
            });
        }
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
        final DonutProgress isVariable = new DonutProgress(this);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant));
        isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant));
        final int isVariable = isNameExpr.isMethod(this, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(-isIntegerConstant);
        isNameExpr.isMethod();
        final LinearLayout isVariable = new LinearLayout(this);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        final int isVariable = isNameExpr.isMethod(this, isIntegerConstant);
        isNameExpr.isMethod().isFieldAccessExpr = isNameExpr;
        isNameExpr.isMethod().isFieldAccessExpr = isNameExpr;
        isNameExpr = new TextView(this);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        isNameExpr.isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        ((ViewGroup.MarginLayoutParams) isNameExpr.isMethod()).isFieldAccessExpr = isNameExpr.isMethod(this, isIntegerConstant);
        final RelativeLayout isVariable = new RelativeLayout(this);
        isNameExpr.isMethod(isNameExpr);
        ((RelativeLayout.LayoutParams) isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        isNameExpr.isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        isNameExpr = new FrameLayout(this);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(this, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, new GetImageInfoListener() {

            @Override
            public void isMethod(@CacheRequest.RequestFailureType final int isParameter, final Throwable isParameter, final Integer isParameter, final String isParameter) {
                isMethod();
            }

            @Override
            public void isMethod(final ImageInfo isParameter) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isFieldAccessExpr);
                isNameExpr = isNameExpr;
                final URI isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                final URI isVariable;
                if (isNameExpr == null) {
                    isMethod();
                    return;
                }
                if (isNameExpr.isFieldAccessExpr == null) {
                    isNameExpr = null;
                } else {
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                }
                isMethod(isNameExpr, isNameExpr, isNameExpr);
            }

            @Override
            public void isMethod() {
                isMethod();
            }
        });
        final RedditPreparedPost isVariable;
        if (isNameExpr != null) {
            final RedditParsedPost isVariable = new RedditParsedPost(isNameExpr, true);
            isNameExpr = new RedditPreparedPost(this, isNameExpr.isMethod(this), isIntegerConstant, isNameExpr, -isIntegerConstant, true, true);
        } else {
            isNameExpr = null;
        }
        final FrameLayout isVariable = new FrameLayout(this);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        isNameExpr.isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        if (isNameExpr.isMethod(this, isNameExpr.isMethod(this))) {
            isNameExpr = (LinearLayout) isNameExpr.isMethod(this).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
            isNameExpr.isMethod(isNameExpr);
            final ImageButton isVariable = (ImageButton) isNameExpr.isMethod(this).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
            final int isVariable = isNameExpr.isMethod(this, isIntegerConstant);
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr);
            }
            isNameExpr.isMethod(new View.OnClickListener() {

                @Override
                public void isMethod(final View isParameter) {
                    isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.this.isMethod(), null);
                }
            });
        }
        if (isNameExpr != null) {
            final SideToolbarOverlay isVariable = new SideToolbarOverlay(this);
            final BezelSwipeOverlay isVariable = new BezelSwipeOverlay(this, new BezelSwipeOverlay.BezelSwipeListener() {

                @Override
                public boolean isMethod(@BezelSwipeOverlay.SwipeEdge int isParameter) {
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.this, true, isNameExpr));
                    isNameExpr.isMethod(isNameExpr == isNameExpr.isFieldAccessExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    return true;
                }

                @Override
                public boolean isMethod() {
                    if (isNameExpr.isMethod()) {
                        isNameExpr.isMethod();
                        return true;
                    }
                    return true;
                }
            });
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            isNameExpr.isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            isNameExpr.isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            isNameExpr.isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        }
        isMethod(isNameExpr);
    }

    private void isMethod(View isParameter) {
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = new HorizontalSwipeProgressOverlay(this);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        isNameExpr.isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    private void isMethod(final CacheManager.ReadableCacheFile isParameter, @Nullable final CacheManager.ReadableCacheFile isParameter, final String isParameter) {
        if (isNameExpr == null || (!isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) && !isNameExpr.isFieldAccessExpr.isMethod(isNameExpr))) {
            isMethod();
            return;
        }
        final InputStream isVariable;
        try {
            isNameExpr = isNameExpr.isMethod();
        } catch (IOException isParameter) {
            isMethod();
            return;
        }
        if (isNameExpr == null) {
            isMethod();
            return;
        }
        final boolean isVariable;
        if (isNameExpr != null && ((isNameExpr.isFieldAccessExpr != null && isNameExpr.isFieldAccessExpr.isMethod() > isIntegerConstant) || (isNameExpr.isFieldAccessExpr != null && isNameExpr.isFieldAccessExpr.isMethod() > isIntegerConstant))) {
            isNameExpr = true;
            // isComment
            isNameExpr.isFieldAccessExpr.isMethod(new Runnable() {

                @Override
                public void isMethod() {
                    if (isNameExpr != null) {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    }
                }
            });
        } else {
            isNameExpr = true;
        }
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            isNameExpr.isFieldAccessExpr.isMethod(new Runnable() {

                @Override
                public void isMethod() {
                    if (isNameExpr)
                        return;
                    isNameExpr = null;
                    final PrefsUtility.VideoViewMode isVariable = isNameExpr.isMethod(isNameExpr.this, isNameExpr.isMethod(isNameExpr.this));
                    if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                        isMethod();
                    } else if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                        isMethod();
                    } else if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                        isNameExpr.isFieldAccessExpr.isMethod(new Runnable() {

                            @Override
                            public void isMethod() {
                                Intent isVariable = new Intent(isNameExpr.isFieldAccessExpr);
                                isNameExpr.isMethod("isStringConstant", "isStringConstant");
                                try {
                                    isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
                                } catch (IOException isParameter) {
                                    isMethod();
                                    return;
                                }
                                try {
                                    isMethod(isNameExpr);
                                } catch (final Throwable isParameter) {
                                    isNameExpr.isMethod(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                                    isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
                                }
                                isMethod();
                            }
                        });
                    } else {
                        try {
                            isNameExpr.isMethod(isNameExpr, "isStringConstant");
                            final RelativeLayout isVariable = new RelativeLayout(isNameExpr.this);
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            final DefaultDataSourceFactory isVariable = new DefaultDataSourceFactory(isNameExpr.this, isNameExpr.isMethod(isNameExpr.this), null);
                            final MediaSource isVariable;
                            final MediaSource isVariable = new ExtractorMediaSource.Factory(isNameExpr).isMethod(isNameExpr.isMethod());
                            if (isNameExpr == null) {
                                isNameExpr = isNameExpr;
                            } else {
                                isNameExpr = new MergingMediaSource(isNameExpr, new ExtractorMediaSource.Factory(isNameExpr).isMethod(isNameExpr.isMethod()));
                            }
                            isNameExpr = new ExoPlayerWrapperView(isNameExpr.this, isNameExpr, new ExoPlayerWrapperView.Listener() {

                                @Override
                                public void isMethod() {
                                    isMethod();
                                }
                            }, isNameExpr ? isIntegerConstant : isIntegerConstant);
                            isNameExpr.isMethod(isNameExpr);
                            isMethod(isNameExpr);
                            isNameExpr.isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                            isNameExpr.isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                            isNameExpr.isMethod(new RelativeLayout.LayoutParams(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            final BasicGestureHandler isVariable = new BasicGestureHandler(isNameExpr.this);
                            isNameExpr.isMethod(isNameExpr);
                            isNameExpr.isMethod(isNameExpr);
                        } catch (OutOfMemoryError isParameter) {
                            isNameExpr.isMethod(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                            isMethod();
                        } catch (Throwable isParameter) {
                            isNameExpr.isMethod(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                            isMethod();
                        }
                    }
                }
            });
        } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
            final PrefsUtility.GifViewMode isVariable = isNameExpr.isMethod(this, isNameExpr.isMethod(this));
            if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                isMethod();
                return;
            } else if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                isMethod();
                return;
            }
            if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                isNameExpr.isFieldAccessExpr.isMethod(new Runnable() {

                    @Override
                    public void isMethod() {
                        if (isNameExpr)
                            return;
                        isNameExpr = null;
                        try {
                            final GIFView isVariable = new GIFView(isNameExpr.this, isNameExpr);
                            isMethod(isNameExpr);
                            isNameExpr.isMethod(new BasicGestureHandler(isNameExpr.this));
                        } catch (OutOfMemoryError isParameter) {
                            isNameExpr.isMethod(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                            isMethod();
                        } catch (Throwable isParameter) {
                            isNameExpr.isMethod(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                            isMethod();
                        }
                    }
                });
            } else {
                isNameExpr = new GifDecoderThread(isNameExpr, new GifDecoderThread.OnGifLoadedListener() {

                    public void isMethod() {
                        isNameExpr.isFieldAccessExpr.isMethod(new Runnable() {

                            @Override
                            public void isMethod() {
                                if (isNameExpr)
                                    return;
                                isNameExpr = null;
                                isNameExpr = new ImageView(isNameExpr.this);
                                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                                isMethod(isNameExpr);
                                isNameExpr.isMethod(isNameExpr);
                                isNameExpr.isMethod(new BasicGestureHandler(isNameExpr.this));
                            }
                        });
                    }

                    public void isMethod() {
                        isNameExpr.isMethod(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                        isMethod();
                    }

                    public void isMethod() {
                        isNameExpr.isMethod(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                        isMethod();
                    }
                });
                isNameExpr.isMethod();
            }
        } else {
            final PrefsUtility.ImageViewMode isVariable = isNameExpr.isMethod(this, isNameExpr.isMethod(this));
            if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                isMethod();
                return;
            } else if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                isMethod();
                return;
            }
            final ImageTileSource isVariable;
            try {
                final long isVariable = isNameExpr.isMethod();
                final byte[] isVariable = new byte[(int) isNameExpr];
                try {
                    new DataInputStream(isNameExpr).isMethod(isNameExpr);
                } catch (IOException isParameter) {
                    throw new RuntimeException(isNameExpr);
                }
                try {
                    isNameExpr = new ImageTileSourceWholeBitmap(isNameExpr);
                } catch (Throwable isParameter) {
                    isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
                    isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isMethod();
                    return;
                }
            } catch (OutOfMemoryError isParameter) {
                isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isMethod();
                return;
            }
            isNameExpr.isFieldAccessExpr.isMethod(new Runnable() {

                @Override
                public void isMethod() {
                    if (isNameExpr)
                        return;
                    isNameExpr = null;
                    isNameExpr = new ImageViewDisplayListManager(isNameExpr.this, isNameExpr, isNameExpr.this);
                    isNameExpr = new RRGLSurfaceView(isNameExpr.this, isNameExpr);
                    isMethod(isNameExpr);
                    if (isNameExpr) {
                        isNameExpr.isMethod();
                    } else {
                        isNameExpr.isMethod();
                    }
                }
            });
        }
    }

    public void isMethod(final RedditPreparedPost isParameter) {
        isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isMethod(), true, isNameExpr.isFieldAccessExpr.isMethod());
    }

    public void isMethod(final RedditPreparedPost isParameter) {
        isNameExpr.isMethod(this, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod()).isMethod().isMethod(), true);
    }

    @Override
    public void isMethod() {
        if (isNameExpr.isMethod())
            super.isMethod();
    }

    private void isMethod() {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        final Runnable isVariable = new Runnable() {

            @Override
            public void isMethod() {
                if (!isNameExpr) {
                    isNameExpr = true;
                    isNameExpr.isMethod(isNameExpr.this, isNameExpr, true);
                    isMethod();
                }
            }
        };
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod();
        } else {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        }
    }

    private void isMethod() {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        final Runnable isVariable = new Runnable() {

            @Override
            public void isMethod() {
                isNameExpr.isMethod(isNameExpr.this, isNameExpr.isMethod(isNameExpr), true);
                isMethod();
            }
        };
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod();
        } else {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod() {
        if (isNameExpr)
            throw new RuntimeException();
        isNameExpr = true;
        super.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }

    @Override
    public void isMethod() {
        if (!isNameExpr)
            throw new RuntimeException();
        isNameExpr = true;
        super.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = true;
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod();
            isNameExpr = null;
        }
    }

    @Override
    public void isMethod() {
        if (isNameExpr.isMethod(this, isNameExpr.isMethod(this)) && isNameExpr != null) {
            isNameExpr.isMethod();
        } else {
            isMethod();
        }
    }

    @Override
    public void isMethod(final float isParameter) {
        if (isNameExpr)
            return;
        if (isNameExpr != null && isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            if (isNameExpr >= isNameExpr) {
                // isComment
                isNameExpr = true;
                if (isNameExpr != null) {
                    isNameExpr.isMethod();
                }
                if (isNameExpr > isIntegerConstant) {
                    isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isMethod(isNameExpr - isIntegerConstant).isFieldAccessExpr, true, isNameExpr, isNameExpr, isNameExpr - isIntegerConstant);
                    isMethod();
                } else {
                    isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                }
            } else if (isNameExpr <= -isNameExpr) {
                // isComment
                isNameExpr = true;
                if (isNameExpr != null) {
                    isNameExpr.isMethod();
                }
                if (isNameExpr < isNameExpr.isFieldAccessExpr.isMethod() - isIntegerConstant) {
                    isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isMethod(isNameExpr + isIntegerConstant).isFieldAccessExpr, true, isNameExpr, isNameExpr, isNameExpr + isIntegerConstant);
                    isMethod();
                } else {
                    isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                }
            }
        }
    }

    @Override
    public void isMethod() {
        isNameExpr = true;
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }

    @Override
    public void isMethod() {
        if (!isNameExpr) {
            isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isMethod();
        }
    }

    @Override
    public void isMethod(Throwable isParameter) {
        if (!isNameExpr) {
            isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isMethod();
        }
    }

    @Override
    public void isMethod(Configuration isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }

    private void isMethod(final DonutProgress isParameter, URI isParameter, @Nullable final URI isParameter) {
        if (isNameExpr.isFieldAccessExpr != null) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant");
            if (isNameExpr.isFieldAccessExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                final PrefsUtility.ImageViewMode isVariable = isNameExpr.isMethod(this, isNameExpr.isMethod(this));
                if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                    isMethod();
                    return;
                } else if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                    isMethod();
                    return;
                }
            } else if (isNameExpr.isFieldAccessExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                final PrefsUtility.GifViewMode isVariable = isNameExpr.isMethod(this, isNameExpr.isMethod(this));
                if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                    isMethod();
                    return;
                } else if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                    isMethod();
                    return;
                }
            } else if (isNameExpr.isFieldAccessExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                final PrefsUtility.VideoViewMode isVariable = isNameExpr.isMethod(this, isNameExpr.isMethod(this));
                if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                    isMethod();
                    return;
                } else if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                    isMethod();
                    return;
                }
            }
        }
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    private void isMethod(final DonutProgress isParameter, final URI isParameter, @Nullable final URI isParameter) {
        final Object isVariable = new Object();
        final AtomicBoolean isVariable = new AtomicBoolean(true);
        final AtomicReference<CacheManager.ReadableCacheFile> isVariable = new AtomicReference<>();
        final AtomicReference<CacheManager.ReadableCacheFile> isVariable = new AtomicReference<>();
        final AtomicReference<String> isVariable = new AtomicReference<>();
        isNameExpr.isMethod(this).isMethod(isNameExpr = new CacheRequest(isNameExpr, isNameExpr.isMethod(), null, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, true, true, this) {

            private boolean isVariable = true;

            @Override
            protected void isMethod(Throwable isParameter) {
                isNameExpr.isMethod(isNameExpr.isMethod(), new RRError(null, null, isNameExpr));
            }

            @Override
            protected void isMethod() {
                isNameExpr.isFieldAccessExpr.isMethod(new Runnable() {

                    @Override
                    public void isMethod() {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod(true);
                    }
                });
            }

            @Override
            protected void isMethod() {
            }

            @Override
            protected void isMethod(@RequestFailureType final int isParameter, Throwable isParameter, Integer isParameter, final String isParameter) {
                synchronized (isNameExpr) {
                    if (!isNameExpr.isMethod(true)) {
                        final RRError isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod());
                        isNameExpr.isFieldAccessExpr.isMethod(new Runnable() {

                            @Override
                            public void isMethod() {
                                // isComment
                                isNameExpr = null;
                                final LinearLayout isVariable = new LinearLayout(isNameExpr);
                                final ErrorView isVariable = new ErrorView(isNameExpr.this, isNameExpr);
                                isNameExpr.isMethod(isNameExpr);
                                isNameExpr.isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                isMethod(isNameExpr);
                            }
                        });
                    }
                }
            }

            @Override
            protected void isMethod(final boolean isParameter, final long isParameter, final long isParameter) {
                isNameExpr.isFieldAccessExpr.isMethod(new Runnable() {

                    @Override
                    public void isMethod() {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod(isNameExpr);
                        isNameExpr.isMethod(((float) ((isIntegerConstant * isNameExpr) / isNameExpr)) / isIntegerConstant);
                        if (!isNameExpr) {
                            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                            isNameExpr = true;
                        }
                    }
                });
            }

            @Override
            protected void isMethod(final CacheManager.ReadableCacheFile isParameter, long isParameter, UUID isParameter, boolean isParameter, final String isParameter) {
                synchronized (isNameExpr) {
                    if (isNameExpr.isMethod() != null || isNameExpr == null) {
                        isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr);
                    } else {
                        isNameExpr.isMethod(isNameExpr);
                        isNameExpr.isMethod(isNameExpr);
                    }
                }
            }
        });
        if (isNameExpr != null) {
            isNameExpr.isMethod(this).isMethod(isNameExpr = new CacheRequest(isNameExpr, isNameExpr.isMethod(), null, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, true, true, this) {

                @Override
                protected void isMethod(Throwable isParameter) {
                    isNameExpr.isMethod(isNameExpr.isMethod(), new RRError(null, null, isNameExpr));
                }

                @Override
                protected void isMethod() {
                }

                @Override
                protected void isMethod() {
                }

                @Override
                protected void isMethod(@RequestFailureType final int isParameter, Throwable isParameter, Integer isParameter, final String isParameter) {
                    synchronized (isNameExpr) {
                        if (!isNameExpr.isMethod(true)) {
                            final RRError isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod());
                            isNameExpr.isFieldAccessExpr.isMethod(new Runnable() {

                                @Override
                                public void isMethod() {
                                    // isComment
                                    isNameExpr = null;
                                    final LinearLayout isVariable = new LinearLayout(isNameExpr);
                                    final ErrorView isVariable = new ErrorView(isNameExpr.this, isNameExpr);
                                    isNameExpr.isMethod(isNameExpr);
                                    isNameExpr.isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                                    isMethod(isNameExpr);
                                }
                            });
                        }
                    }
                }

                @Override
                protected void isMethod(final boolean isParameter, final long isParameter, final long isParameter) {
                }

                @Override
                protected void isMethod(final CacheManager.ReadableCacheFile isParameter, long isParameter, UUID isParameter, boolean isParameter, final String isParameter) {
                    synchronized (isNameExpr) {
                        if (isNameExpr.isMethod() != null) {
                            isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr.isMethod());
                        } else {
                            isNameExpr.isMethod(isNameExpr);
                        }
                    }
                }
            });
        }
    }
}
