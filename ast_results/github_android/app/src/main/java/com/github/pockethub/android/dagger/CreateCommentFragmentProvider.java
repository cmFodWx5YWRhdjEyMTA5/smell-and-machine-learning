// isComment
package com.github.pockethub.android.dagger;

import com.github.pockethub.android.ui.comment.RawCommentFragment;
import com.github.pockethub.android.ui.comment.RenderedCommentFragment;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
interface isClassOrIsInterface {

    @ContributesAndroidInjector
    RawCommentFragment isMethod();

    @ContributesAndroidInjector
    RenderedCommentFragment isMethod();
}
