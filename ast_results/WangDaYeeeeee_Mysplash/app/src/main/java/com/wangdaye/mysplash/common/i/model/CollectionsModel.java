// isComment
package com.wangdaye.mysplash.common.i.model;

import com.wangdaye.mysplash.Mysplash;
import com.wangdaye.mysplash.common.data.service.network.CollectionService;
import com.wangdaye.mysplash.common.ui.adapter.CollectionAdapter;

public interface isClassOrIsInterface {

    CollectionAdapter isMethod();

    CollectionService isMethod();

    // isComment
    Object isMethod();

    void isMethod(Object isParameter);

    @Mysplash.CollectionTypeRule
    int isMethod();

    void isMethod(int isParameter);

    @Mysplash.PageRule
    int isMethod();

    void isMethod(@Mysplash.PageRule int isParameter);

    // isComment
    boolean isMethod();

    void isMethod(boolean isParameter);

    boolean isMethod();

    void isMethod(boolean isParameter);

    /**
     * isComment
     */
    boolean isMethod();

    void isMethod(boolean isParameter);
}
