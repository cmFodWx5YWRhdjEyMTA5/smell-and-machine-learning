// isComment
package privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.dagger.context.config.product;

import dagger.Module;
import dagger.Provides;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.dagger.context.config.shoppingList.ShoppingListModule;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.framework.context.AppModule;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.product.business.ProductService;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.product.business.impl.ProductServiceImpl;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.product.business.impl.converter.ProductConverterService;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.product.business.impl.converter.impl.ProductConverterServiceImpl;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.product.persistence.ProductItemDao;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.product.persistence.impl.ProductItemDaoImpl;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.shoppingList.business.ShoppingListService;
import javax.inject.Singleton;

/**
 * isComment
 */
@Module(includes = { ShoppingListModule.class }, injects = { ProductService.class, ProductItemDao.class, ProductConverterService.class })
public class isClassOrIsInterface implements AppModule {

    @Provides
    @Singleton
    ProductItemDao isMethod() {
        return new ProductItemDaoImpl();
    }

    @Provides
    @Singleton
    ProductConverterService isMethod() {
        return new ProductConverterServiceImpl();
    }

    @Provides
    @Singleton
    ProductService isMethod(ProductItemDao isParameter, ProductConverterService isParameter, ShoppingListService isParameter) {
        return new ProductServiceImpl(isNameExpr, isNameExpr, isNameExpr);
    }
}
