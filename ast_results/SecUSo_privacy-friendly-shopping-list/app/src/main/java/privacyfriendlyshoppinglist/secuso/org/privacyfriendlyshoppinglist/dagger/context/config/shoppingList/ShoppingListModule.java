// isComment
package privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.dagger.context.config.shoppingList;

import dagger.Module;
import dagger.Provides;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.framework.context.AppModule;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.shoppingList.business.ShoppingListService;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.shoppingList.business.impl.ShoppingListServiceImpl;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.shoppingList.business.impl.converter.ShoppingListConverter;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.shoppingList.business.impl.converter.impl.ShoppingListConverterImpl;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.shoppingList.persistence.ShoppingListDao;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.shoppingList.persistence.impl.ShoppingListDaoImpl;
import javax.inject.Singleton;

/**
 * isComment
 */
@Module(injects = { ShoppingListDao.class, ShoppingListService.class, ShoppingListConverter.class })
public class isClassOrIsInterface implements AppModule {

    @Provides
    @Singleton
    ShoppingListDao isMethod() {
        return new ShoppingListDaoImpl();
    }

    @Provides
    @Singleton
    ShoppingListConverter isMethod() {
        return new ShoppingListConverterImpl();
    }

    @Provides
    @Singleton
    ShoppingListService isMethod(ShoppingListDao isParameter, ShoppingListConverter isParameter) {
        return new ShoppingListServiceImpl(isNameExpr, isNameExpr);
    }
}
