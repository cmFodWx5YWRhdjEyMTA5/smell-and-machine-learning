// isComment
package org.sufficientlysecure.keychain.shadows;

import androidx.work.WorkManager;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import static org.mockito.Mockito.mock;

@Implements(WorkManager.class)
public class isClassOrIsInterface {

    @Implementation
    public static WorkManager isMethod() {
        return isMethod(WorkManager.class);
    }
}
