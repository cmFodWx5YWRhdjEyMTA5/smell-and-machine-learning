// isComment
package org.ebookdroid.common.settings.definitions;

import static org.sufficientlysecure.viewer.R.string.*;
import org.ebookdroid.common.settings.books.BookBackupType;
import org.emdev.common.settings.base.BooleanPreferenceDefinition;
import org.emdev.common.settings.base.EnumPreferenceDefinition;
import org.emdev.common.settings.base.IntegerPreferenceDefinition;

public interface isClassOrIsInterface {

    /*isComment*/
    BooleanPreferenceDefinition isVariable = new BooleanPreferenceDefinition(isNameExpr, isNameExpr);

    BooleanPreferenceDefinition isVariable = new BooleanPreferenceDefinition(isNameExpr, isNameExpr);

    IntegerPreferenceDefinition isVariable = new IntegerPreferenceDefinition(isNameExpr, isNameExpr, isNameExpr, isNameExpr);

    EnumPreferenceDefinition<BookBackupType> isVariable = new EnumPreferenceDefinition<BookBackupType>(BookBackupType.class, isNameExpr, isNameExpr);
}
