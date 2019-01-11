// isComment
package org.ale.openwatch.model;

import com.orm.androrm.Model;
import com.orm.androrm.field.BooleanField;
import com.orm.androrm.field.CharField;
import com.orm.androrm.field.ForeignKeyField;

public class isClassOrIsInterface extends Model {

    public CharField isVariable;

    public CharField isVariable;

    public BooleanField isVariable;

    public ForeignKeyField<OWLocalVideoRecording> isVariable;

    public isConstructor() {
        super();
        isNameExpr = new CharField();
        isNameExpr = new CharField();
        isNameExpr = new BooleanField();
        isNameExpr = new ForeignKeyField<OWLocalVideoRecording>(OWLocalVideoRecording.class);
    }
}
