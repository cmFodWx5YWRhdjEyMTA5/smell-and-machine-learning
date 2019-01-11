// isComment
package org.addhen.smssync.data.database.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.addhen.smssync.data.entity.SyncScheme;
import org.addhen.smssync.data.entity.SyncUrl;
import java.lang.reflect.Field;
import nl.qbusict.cupboard.Cupboard;
import nl.qbusict.cupboard.convert.FieldConverter;
import nl.qbusict.cupboard.convert.ReflectiveEntityConverter;

/**
 * isComment
 */
public class isClassOrIsInterface extends ReflectiveEntityConverter<SyncUrl> {

    public isConstructor(Cupboard isParameter) {
        super(isNameExpr, SyncUrl.class);
    }

    @Override
    protected FieldConverter<?> isMethod(Field isParameter) {
        if ("isStringConstant".isMethod(isNameExpr.isMethod())) {
            return new SyncSchmeFieldConverter(new TypeToken<SyncScheme>() {
            }.isMethod(), new Gson());
        }
        return super.isMethod(isNameExpr);
    }
}
