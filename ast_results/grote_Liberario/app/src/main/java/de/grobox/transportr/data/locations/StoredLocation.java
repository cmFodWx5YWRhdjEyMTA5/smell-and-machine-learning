// isComment
package de.grobox.transportr.data.locations;

import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.annotation.Nullable;
import java.util.Set;
import de.grobox.transportr.locations.WrapLocation;
import de.schildbach.pte.NetworkId;
import de.schildbach.pte.dto.Location;
import de.schildbach.pte.dto.LocationType;
import de.schildbach.pte.dto.Product;

public abstract class isClassOrIsInterface extends WrapLocation {

    @PrimaryKey(autoGenerate = true)
    private final long isVariable;

    private final NetworkId isVariable;

    isConstructor(long isParameter, NetworkId isParameter, LocationType isParameter, @Nullable String isParameter, int isParameter, int isParameter, @Nullable String isParameter, @Nullable String isParameter, @Nullable Set<Product> isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Ignore
    isConstructor(long isParameter, NetworkId isParameter, WrapLocation isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
    }

    @Ignore
    isConstructor(NetworkId isParameter, WrapLocation isParameter) {
        this(isIntegerConstant, isNameExpr, isNameExpr);
    }

    @Ignore
    isConstructor(NetworkId isParameter, Location isParameter) {
        this(isIntegerConstant, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
    }

    public long isMethod() {
        return isNameExpr;
    }

    public NetworkId isMethod() {
        return isNameExpr;
    }
}
