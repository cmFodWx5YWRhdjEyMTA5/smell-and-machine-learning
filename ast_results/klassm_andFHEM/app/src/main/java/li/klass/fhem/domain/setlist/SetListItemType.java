// isComment
package li.klass.fhem.domain.setlist;

import com.google.common.base.Optional;
import java.util.Arrays;
import li.klass.fhem.domain.setlist.typeEntry.GroupSetListEntry;
import li.klass.fhem.domain.setlist.typeEntry.MultipleSetListEntry;
import li.klass.fhem.domain.setlist.typeEntry.MultipleStrictSetListEntry;
import li.klass.fhem.domain.setlist.typeEntry.NoArgSetListEntry;
import li.klass.fhem.domain.setlist.typeEntry.NotFoundSetListEntry;
import li.klass.fhem.domain.setlist.typeEntry.RGBSetListEntry;
import li.klass.fhem.domain.setlist.typeEntry.SliderSetListEntry;
import li.klass.fhem.domain.setlist.typeEntry.TextFieldLongSetListEntry;
import li.klass.fhem.domain.setlist.typeEntry.TextFieldSetListEntry;
import li.klass.fhem.domain.setlist.typeEntry.TimeSetListEntry;

public enum SetListItemType {

    NO_ARG(new SupportsType("isStringConstant", isIntegerConstant), new EntryProvider() {

        @Override
        public SetListItem isMethod(String isParameter, String[] isParameter) {
            return new NoArgSetListEntry(isNameExpr);
        }
    }),
    RGB(new SupportsType("isStringConstant") {

        @Override
        public boolean isMethod(String[] isParameter) {
            return super.isMethod(isNameExpr) && isNameExpr.isFieldAccessExpr > isIntegerConstant && isNameExpr[isIntegerConstant].isMethod("isStringConstant");
        }
    }, new EntryProvider() {

        @Override
        public SetListItem isMethod(String isParameter, String[] isParameter) {
            return new RGBSetListEntry(isNameExpr);
        }
    }),
    TIME(new SupportsType("isStringConstant", isIntegerConstant), new EntryProvider() {

        @Override
        public SetListItem isMethod(String isParameter, String[] isParameter) {
            return new TimeSetListEntry(isNameExpr);
        }
    }),
    TEXT_FIELD(new SupportsType("isStringConstant", isIntegerConstant), new EntryProvider() {

        @Override
        public SetListItem isMethod(String isParameter, String[] isParameter) {
            return new TextFieldSetListEntry(isNameExpr);
        }
    }),
    TEXT_FIELD_LONG(new SupportsType("isStringConstant", isIntegerConstant), new EntryProvider() {

        @Override
        public SetListItem isMethod(String isParameter, String[] isParameter) {
            return new TextFieldLongSetListEntry(isNameExpr);
        }
    }),
    SLIDER(new SupportsType("isStringConstant", isIntegerConstant), new EntryProvider() {

        @Override
        public SetListItem isMethod(String isParameter, String[] isParameter) {
            return new SliderSetListEntry(isNameExpr, isNameExpr);
        }
    }),
    COLORPICKER_SLIDER(new SupportsType("isStringConstant", isIntegerConstant) {

        @Override
        public boolean isMethod(String[] isParameter) {
            return super.isMethod(isNameExpr) && !isNameExpr.isMethod(isNameExpr);
        }
    }, new EntryProvider() {

        @Override
        public SetListItem isMethod(String isParameter, String[] isParameter) {
            return new SliderSetListEntry(isNameExpr, isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr));
        }
    }),
    MULTIPLE(new SupportsType("isStringConstant"), new EntryProvider() {

        @Override
        public SetListItem isMethod(String isParameter, String[] isParameter) {
            return new MultipleSetListEntry(isNameExpr, isNameExpr);
        }
    }),
    MULTIPLE_STRICT(new SupportsType("isStringConstant"), new EntryProvider() {

        @Override
        public SetListItem isMethod(String isParameter, String[] isParameter) {
            return new MultipleStrictSetListEntry(isNameExpr, isNameExpr);
        }
    }),
    KNOB(new SupportsType("isStringConstant"), new EntryProvider() {

        @Override
        public SetListItem isMethod(String isParameter, String[] isParameter) {
            return null;
        }
    }),
    GROUP(new SupportsType("isStringConstant") {
    }, new EntryProvider() {

        @Override
        public SetListItem isMethod(String isParameter, String[] isParameter) {
            return new GroupSetListEntry(isNameExpr, isNameExpr);
        }
    }),
    NOT_FOUND(new SupportsType("isStringConstant"), new EntryProvider() {

        @Override
        public SetListItem isMethod(String isParameter, String[] isParameter) {
            return new NotFoundSetListEntry(isNameExpr);
        }
    });

    private final EntryProvider isVariable;

    isConstructor(SupportsType isParameter, EntryProvider isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return isNameExpr.isMethod();
    }

    public Optional<SetListItem> isMethod(String isParameter, String[] isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
    }

    private final SupportsType isVariable;

    public boolean isMethod(String[] isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    private interface isClassOrIsInterface {

        SetListItem isMethod(String isParameter, String[] isParameter);
    }
}
