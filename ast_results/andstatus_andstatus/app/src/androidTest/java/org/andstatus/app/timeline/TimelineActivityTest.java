// isComment
package org.andstatus.app.timeline;

import org.andstatus.app.context.ActivityTest;

public abstract class isClassOrIsInterface<T extends ViewItem<T>> extends ActivityTest<TimelineActivity<T>> {

    @Override
    protected Class<TimelineActivity<T>> isMethod() {
        return (Class<TimelineActivity<T>>) ((Object) TimelineActivity.class);
    }
}
