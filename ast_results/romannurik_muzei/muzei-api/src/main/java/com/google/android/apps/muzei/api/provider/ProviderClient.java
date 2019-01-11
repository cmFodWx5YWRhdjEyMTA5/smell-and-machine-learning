// isComment
package com.google.android.apps.muzei.api.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    /**
     * isComment
     */
    @NonNull
    Uri isMethod();

    /**
     * isComment
     */
    @Nullable
    Artwork isMethod();

    /**
     * isComment
     */
    @Nullable
    Uri isMethod(@NonNull Artwork isParameter);

    /**
     * isComment
     */
    @NonNull
    List<Uri> isMethod(@NonNull Iterable<Artwork> isParameter);

    /**
     * isComment
     */
    @Nullable
    Uri isMethod(@NonNull Artwork isParameter);

    /**
     * isComment
     */
    @NonNull
    List<Uri> isMethod(@NonNull Iterable<Artwork> isParameter);
}
