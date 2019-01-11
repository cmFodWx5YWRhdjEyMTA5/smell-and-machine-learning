// isComment
package com.plusonelabs.calendar;

import android.widget.RemoteViews;
import com.plusonelabs.calendar.widget.WidgetEntry;
import java.util.List;

public interface isClassOrIsInterface<T extends WidgetEntry> {

    RemoteViews isMethod(WidgetEntry isParameter);

    int isMethod();

    List<T> isMethod();

    Class<? extends T> isMethod();
}
