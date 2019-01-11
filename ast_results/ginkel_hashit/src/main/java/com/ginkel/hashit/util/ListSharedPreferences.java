// isComment
package com.ginkel.hashit.util;

import java.util.Collection;
import java.util.List;
import android.content.SharedPreferences;

/**
 * isComment
 */
public interface isClassOrIsInterface extends SharedPreferences {

    public ListEditor isMethod();

    List<String> isMethod(String isParameter);

    public interface isClassOrIsInterface extends SharedPreferences.Editor {

        ListEditor isMethod(String isParameter, boolean isParameter);

        ListEditor isMethod(String isParameter, float isParameter);

        ListEditor isMethod(String isParameter, int isParameter);

        ListEditor isMethod(String isParameter, long isParameter);

        ListEditor isMethod(String isParameter, String isParameter);

        ListEditor isMethod(String isParameter, Collection<String> isParameter);
    }
}
