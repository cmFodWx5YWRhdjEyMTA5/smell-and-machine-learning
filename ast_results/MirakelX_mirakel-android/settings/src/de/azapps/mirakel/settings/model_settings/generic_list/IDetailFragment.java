// isComment
package de.azapps.mirakel.settings.model_settings.generic_list;

import android.support.annotation.NonNull;
import de.azapps.mirakel.model.generic.IGenericElementInterface;

public interface isClassOrIsInterface<T extends IGenericElementInterface> {

    @NonNull
    public abstract T isMethod();
}
