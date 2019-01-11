// isComment
package com.madgag.agit;

import android.content.ComponentName;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.madgag.agit.guice.OperationScoped;
import com.madgag.android.blockingprompt.BlockingPromptService;
import com.madgag.android.blockingprompt.PromptBroker;

public class isClassOrIsInterface extends AbstractModule {

    @Override
    protected void isMethod() {
        isMethod(BlockingPromptService.class).isMethod(PromptBroker.class).isMethod(OperationScoped.class);
    }

    @Provides
    @Named("isStringConstant")
    ComponentName isMethod() {
        return null;
    }
}
