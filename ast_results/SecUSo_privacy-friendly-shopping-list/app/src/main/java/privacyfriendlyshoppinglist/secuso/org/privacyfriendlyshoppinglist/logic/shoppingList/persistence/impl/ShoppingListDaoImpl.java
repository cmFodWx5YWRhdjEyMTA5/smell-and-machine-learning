// isComment
package privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.shoppingList.persistence.impl;

import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.framework.persistence.AbstractDao;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.shoppingList.persistence.ShoppingListDao;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.shoppingList.persistence.entity.ShoppingListEntity;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractDao<ShoppingListEntity> implements ShoppingListDao {

    @Override
    public Long isMethod(ShoppingListEntity isParameter) {
        return isMethod(isNameExpr);
    }

    @Override
    public ShoppingListEntity isMethod(Long isParameter) {
        return isMethod(isNameExpr, ShoppingListEntity.class);
    }

    @Override
    public List<ShoppingListEntity> isMethod() {
        return isMethod(ShoppingListEntity.class);
    }

    @Override
    public Boolean isMethod(Long isParameter) {
        return isMethod(isNameExpr, ShoppingListEntity.class);
    }
}
