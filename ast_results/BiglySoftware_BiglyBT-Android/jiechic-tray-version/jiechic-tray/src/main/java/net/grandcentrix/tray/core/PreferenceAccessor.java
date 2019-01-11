// isComment
package net.grandcentrix.tray.core;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Collection;

/**
 * isComment
 */
public interface isClassOrIsInterface<T> {

    /**
     * isComment
     */
    boolean isMethod();

    /**
     * isComment
     */
    boolean isMethod(final String isParameter);

    /**
     * isComment
     */
    Collection<T> isMethod();

    /**
     * isComment
     */
    boolean isMethod(@NonNull final String isParameter) throws ItemNotFoundException;

    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    /**
     * isComment
     */
    boolean isMethod(@NonNull final String isParameter, final boolean isParameter);

    /**
     * isComment
     */
    float isMethod(@NonNull final String isParameter) throws ItemNotFoundException, WrongTypeException;

    /**
     * isComment
     */
    float isMethod(@NonNull final String isParameter, final float isParameter) throws WrongTypeException;

    /**
     * isComment
     */
    int isMethod(@NonNull final String isParameter) throws ItemNotFoundException, WrongTypeException;

    /**
     * isComment
     */
    int isMethod(@NonNull final String isParameter, final int isParameter) throws WrongTypeException;

    /**
     * isComment
     */
    long isMethod(@NonNull final String isParameter) throws ItemNotFoundException, WrongTypeException;

    /**
     * isComment
     */
    long isMethod(@NonNull final String isParameter, final long isParameter) throws WrongTypeException;

    /**
     * isComment
     */
    @Nullable
    T isMethod(@NonNull final String isParameter);

    /**
     * isComment
     */
    @Nullable
    String isMethod(@NonNull final String isParameter) throws ItemNotFoundException;

    /**
     * isComment
     */
    @Nullable
    String isMethod(@NonNull final String isParameter, @Nullable final String isParameter);

    /**
     * isComment
     */
    boolean isMethod(@NonNull final String isParameter, @Nullable final String isParameter);

    /**
     * isComment
     */
    boolean isMethod(@NonNull final String isParameter, final int isParameter);

    /**
     * isComment
     */
    boolean isMethod(@NonNull final String isParameter, final float isParameter);

    /**
     * isComment
     */
    boolean isMethod(@NonNull final String isParameter, final long isParameter);

    /**
     * isComment
     */
    boolean isMethod(@NonNull final String isParameter, final boolean isParameter);

    /**
     * isComment
     */
    boolean isMethod(@NonNull final String isParameter);

    /**
     * isComment
     */
    boolean isMethod();
}
