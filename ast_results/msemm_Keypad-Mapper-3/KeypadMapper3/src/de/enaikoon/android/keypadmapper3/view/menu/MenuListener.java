// isComment
package de.enaikoon.android.keypadmapper3.view.menu;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    enum OptionType {

        CAMERA,
        ADDRESS_EDITOR,
        GPS_INFO,
        SETTINGS,
        UNDO,
        SHARE,
        FREEZE_GPS,
        START_STOP_GPS,
        KEYPAD,
        AUDIO
    }

    void isMethod(OptionType isParameter);
}
