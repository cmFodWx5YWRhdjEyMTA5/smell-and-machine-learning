// isComment
package de.azapps.mirakel.adapter;

import android.support.annotation.NonNull;
import de.azapps.mirakel.model.generic.IGenericElementInterface;

public interface isClassOrIsInterface<T extends IGenericElementInterface> {

    public abstract void isMethod(@NonNull final T isParameter);
}
