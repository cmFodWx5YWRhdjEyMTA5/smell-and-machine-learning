// isComment
package de.grobox.transportr.data.locations;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;
import de.grobox.transportr.R;
import de.grobox.transportr.locations.WrapLocation;
import de.schildbach.pte.NetworkId;
import de.schildbach.pte.dto.Location;
import de.schildbach.pte.dto.LocationType;
import de.schildbach.pte.dto.Product;

@Entity(tableName = "isStringConstant", indices = { @Index(value = { "isStringConstant" }, unique = true) })
public class isClassOrIsInterface extends StoredLocation {

    public isConstructor(long isParameter, @Nullable NetworkId isParameter, LocationType isParameter, @Nullable String isParameter, int isParameter, int isParameter, @Nullable String isParameter, @Nullable String isParameter, @Nullable Set<Product> isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Ignore
    public isConstructor(@NonNull NetworkId isParameter, WrapLocation isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Ignore
    public isConstructor(@NonNull NetworkId isParameter, Location isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    @DrawableRes
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }
}
