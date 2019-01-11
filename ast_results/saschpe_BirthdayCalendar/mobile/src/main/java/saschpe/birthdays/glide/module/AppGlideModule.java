// isComment
package saschpe.birthdays.glide.module;

import com.bumptech.glide.annotation.GlideModule;

@SuppressWarnings("isStringConstant")
@GlideModule
public class isClassOrIsInterface extends com.bumptech.glide.module.AppGlideModule {

    @Override
    public boolean isMethod() {
        return true;
    }
}
