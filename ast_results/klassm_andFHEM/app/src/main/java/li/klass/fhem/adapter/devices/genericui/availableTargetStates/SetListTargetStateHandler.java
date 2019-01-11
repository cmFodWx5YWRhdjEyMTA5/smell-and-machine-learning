// isComment
package li.klass.fhem.adapter.devices.genericui.availableTargetStates;

import android.content.Context;
import li.klass.fhem.domain.core.FhemDevice;
import li.klass.fhem.domain.setlist.SetListEntry;

public interface isClassOrIsInterface<D extends FhemDevice> {

    boolean isMethod(SetListEntry isParameter);

    void isMethod(SetListEntry isParameter, Context isParameter, D isParameter, OnTargetStateSelectedCallback<D> isParameter);
}
