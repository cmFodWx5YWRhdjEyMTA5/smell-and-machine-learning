// isComment
package privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.shoppingList.business.impl.converter;

import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.framework.context.ContextSetter;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.shoppingList.business.domain.ListItem;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.shoppingList.persistence.entity.ShoppingListEntity;

/**
 * isComment
 */
public interface isClassOrIsInterface extends ContextSetter {

    void isMethod(ListItem isParameter, ShoppingListEntity isParameter);

    void isMethod(ShoppingListEntity isParameter, ListItem isParameter);
}
