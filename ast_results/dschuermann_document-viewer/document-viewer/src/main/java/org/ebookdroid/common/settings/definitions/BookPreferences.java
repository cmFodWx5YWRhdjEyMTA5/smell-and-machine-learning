// isComment
package org.ebookdroid.common.settings.definitions;

import static org.sufficientlysecure.viewer.R.string.pref_align_by_width;
import static org.sufficientlysecure.viewer.R.string.pref_animation_type_none;
import static org.sufficientlysecure.viewer.R.string.pref_autolevels_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_book_align_id;
import static org.sufficientlysecure.viewer.R.string.pref_book_animation_type_id;
import static org.sufficientlysecure.viewer.R.string.pref_book_autolevels_id;
import static org.sufficientlysecure.viewer.R.string.pref_book_contrast_id;
import static org.sufficientlysecure.viewer.R.string.pref_book_gamma_id;
import static org.sufficientlysecure.viewer.R.string.pref_book_croppages_id;
import static org.sufficientlysecure.viewer.R.string.pref_book_exposure_id;
import static org.sufficientlysecure.viewer.R.string.pref_book_firstpageoffset_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_book_firstpageoffset_id;
import static org.sufficientlysecure.viewer.R.string.pref_book_firstpageoffset_maxvalue;
import static org.sufficientlysecure.viewer.R.string.pref_book_firstpageoffset_minvalue;
import static org.sufficientlysecure.viewer.R.string.pref_book_id;
import static org.sufficientlysecure.viewer.R.string.pref_book_nightmode_id;
import static org.sufficientlysecure.viewer.R.string.pref_book_posimages_in_nightmode_id;
import static org.sufficientlysecure.viewer.R.string.pref_book_rotation_id;
import static org.sufficientlysecure.viewer.R.string.pref_book_rtl_id;
import static org.sufficientlysecure.viewer.R.string.pref_book_splitpages_id;
import static org.sufficientlysecure.viewer.R.string.pref_book_splitpages_rtl_id;
import static org.sufficientlysecure.viewer.R.string.pref_book_viewmode_id;
import static org.sufficientlysecure.viewer.R.string.pref_contrast_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_contrast_maxvalue;
import static org.sufficientlysecure.viewer.R.string.pref_contrast_minvalue;
import static org.sufficientlysecure.viewer.R.string.pref_gamma_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_gamma_maxvalue;
import static org.sufficientlysecure.viewer.R.string.pref_gamma_minvalue;
import static org.sufficientlysecure.viewer.R.string.pref_croppages_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_exposure_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_exposure_maxvalue;
import static org.sufficientlysecure.viewer.R.string.pref_exposure_minvalue;
import static org.sufficientlysecure.viewer.R.string.pref_nightmode_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_posimages_in_nightmode_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_rotation_unspecified;
import static org.sufficientlysecure.viewer.R.string.pref_rtl_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_splitpages_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_splitpages_rtl_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_tint_color_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_book_tint_color_id;
import static org.sufficientlysecure.viewer.R.string.pref_tint_defvalue;
import static org.sufficientlysecure.viewer.R.string.pref_book_tint_id;
import static org.sufficientlysecure.viewer.R.string.pref_viewmode_vertical_scroll;
import org.ebookdroid.common.settings.types.DocumentViewMode;
import org.ebookdroid.common.settings.types.PageAlign;
import org.ebookdroid.common.settings.types.RotationType;
import org.ebookdroid.core.curl.PageAnimationType;
import org.emdev.common.settings.base.BooleanPreferenceDefinition;
import org.emdev.common.settings.base.EnumPreferenceDefinition;
import org.emdev.common.settings.base.IntegerPreferenceDefinition;
import org.emdev.common.settings.base.StringPreferenceDefinition;

public interface isClassOrIsInterface {

    /*isComment*/
    StringPreferenceDefinition isVariable = new StringPreferenceDefinition(isNameExpr, isIntegerConstant);

    IntegerPreferenceDefinition isVariable = new IntegerPreferenceDefinition(isNameExpr, isNameExpr, isNameExpr, isNameExpr);

    BooleanPreferenceDefinition isVariable = new BooleanPreferenceDefinition(isNameExpr, isNameExpr);

    BooleanPreferenceDefinition isVariable = new BooleanPreferenceDefinition(isNameExpr, isNameExpr);

    BooleanPreferenceDefinition isVariable = new BooleanPreferenceDefinition(isNameExpr, isNameExpr);

    IntegerPreferenceDefinition isVariable = new IntegerPreferenceDefinition(isNameExpr, isNameExpr);

    IntegerPreferenceDefinition isVariable = new IntegerPreferenceDefinition(isNameExpr, isNameExpr, isNameExpr, isNameExpr);

    IntegerPreferenceDefinition isVariable = new IntegerPreferenceDefinition(isNameExpr, isNameExpr, isNameExpr, isNameExpr);

    IntegerPreferenceDefinition isVariable = new IntegerPreferenceDefinition(isNameExpr, isNameExpr, isNameExpr, isNameExpr);

    BooleanPreferenceDefinition isVariable = new BooleanPreferenceDefinition(isNameExpr, isNameExpr);

    BooleanPreferenceDefinition isVariable = new BooleanPreferenceDefinition(isNameExpr, isNameExpr);

    BooleanPreferenceDefinition isVariable = new BooleanPreferenceDefinition(isNameExpr, isNameExpr);

    BooleanPreferenceDefinition isVariable = new BooleanPreferenceDefinition(isNameExpr, isNameExpr);

    EnumPreferenceDefinition<RotationType> isVariable = new EnumPreferenceDefinition<RotationType>(RotationType.class, isNameExpr, isNameExpr);

    EnumPreferenceDefinition<DocumentViewMode> isVariable = new EnumPreferenceDefinition<DocumentViewMode>(DocumentViewMode.class, isNameExpr, isNameExpr);

    EnumPreferenceDefinition<PageAlign> isVariable = new EnumPreferenceDefinition<PageAlign>(PageAlign.class, isNameExpr, isNameExpr);

    EnumPreferenceDefinition<PageAnimationType> isVariable = new EnumPreferenceDefinition<PageAnimationType>(PageAnimationType.class, isNameExpr, isNameExpr);

    BooleanPreferenceDefinition isVariable = new BooleanPreferenceDefinition(isNameExpr, isNameExpr);
}
