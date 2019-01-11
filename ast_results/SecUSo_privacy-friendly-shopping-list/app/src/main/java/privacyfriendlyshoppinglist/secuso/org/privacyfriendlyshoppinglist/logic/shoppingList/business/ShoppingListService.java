// isComment
package privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.shoppingList.business;

import org.joda.time.DateTime;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.framework.context.ContextSetter;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.product.business.domain.ProductItem;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.shoppingList.business.domain.ListItem;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.shoppingList.persistence.entity.ShoppingListEntity;
import rx.Observable;
import java.util.List;

/**
 * isComment
 */
public interface isClassOrIsInterface extends ContextSetter {

    Observable<Void> isMethod(ListItem isParameter);

    Void isMethod(ListItem isParameter);

    Observable<ListItem> isMethod(String isParameter);

    DateTime isMethod(ListItem isParameter);

    DateTime isMethod(ListItem isParameter);

    int isMethod(ListItem isParameter, List<ProductItem> isParameter);

    ShoppingListEntity isMethod(String isParameter);

    Observable<Void> isMethod(String isParameter);

    Observable<ListItem> isMethod();

    Observable<String> isMethod(List<ListItem> isParameter);

    List<ListItem> isMethod(List<ListItem> isParameter);

    void isMethod(List<ListItem> isParameter, String isParameter, boolean isParameter);

    String isMethod(ListItem isParameter, List<ProductItem> isParameter);
}
