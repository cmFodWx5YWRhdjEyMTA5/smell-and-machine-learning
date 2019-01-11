// isComment
package org.ebookdroid.common.settings.definitions;

import static org.sufficientlysecure.viewer.R.string.pref_autoscanremovable_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_autoscanremovable_id;
import static org.sufficientlysecure.viewer.R.string.pref_brautoscandir_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_brautoscandir_id;
import static org.sufficientlysecure.viewer.R.string.pref_brfiletypes;
import static org.sufficientlysecure.viewer.R.string.pref_brsearchbookquery_id;
import static org.sufficientlysecure.viewer.R.string.pref_cachelocation_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_cachelocation_id;
import static org.sufficientlysecure.viewer.R.string.pref_shownotifications_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_shownotifications_id;
import static org.sufficientlysecure.viewer.R.string.pref_showremovable_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_showremovable_id;
import static org.sufficientlysecure.viewer.R.string.pref_showscanning_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_showscanning_id;
import static org.sufficientlysecure.viewer.R.string.pref_usebookcase_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_usebookcase_id;
import org.ebookdroid.common.settings.base.FileTypeFilterPreferenceDefinition;
import org.ebookdroid.common.settings.types.CacheLocation;
import org.emdev.common.settings.base.BooleanPreferenceDefinition;
import org.emdev.common.settings.base.EnumPreferenceDefinition;
import org.emdev.common.settings.base.FileListPreferenceDefinition;
import org.emdev.common.settings.base.StringPreferenceDefinition;

public interface isClassOrIsInterface {

    /*isComment*/
    BooleanPreferenceDefinition isVariable = new BooleanPreferenceDefinition(isNameExpr, isNameExpr);

    FileListPreferenceDefinition isVariable = new FileListPreferenceDefinition(isNameExpr, isNameExpr);

    StringPreferenceDefinition isVariable = new StringPreferenceDefinition(isNameExpr, isIntegerConstant);

    FileTypeFilterPreferenceDefinition isVariable = new FileTypeFilterPreferenceDefinition(isNameExpr);

    EnumPreferenceDefinition<CacheLocation> isVariable = new EnumPreferenceDefinition<CacheLocation>(CacheLocation.class, isNameExpr, isNameExpr);

    BooleanPreferenceDefinition isVariable = new BooleanPreferenceDefinition(isNameExpr, isNameExpr);

    BooleanPreferenceDefinition isVariable = new BooleanPreferenceDefinition(isNameExpr, isNameExpr);

    BooleanPreferenceDefinition isVariable = new BooleanPreferenceDefinition(isNameExpr, isNameExpr);

    BooleanPreferenceDefinition isVariable = new BooleanPreferenceDefinition(isNameExpr, isNameExpr);
}
