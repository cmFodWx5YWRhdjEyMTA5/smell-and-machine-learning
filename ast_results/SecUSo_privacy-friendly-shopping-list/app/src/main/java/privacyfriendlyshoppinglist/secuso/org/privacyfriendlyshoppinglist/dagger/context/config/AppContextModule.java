// isComment
package privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.dagger.context.config;

import dagger.Module;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.dagger.context.config.product.ProductModule;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.dagger.context.config.shoppingList.ShoppingListModule;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.dagger.context.config.statistics.StatisticsModule;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.framework.context.AppModule;

/**
 * isComment
 */
@Module(includes = { // isComment
ProductModule.class, ShoppingListModule.class, StatisticsModule.class })
public class isClassOrIsInterface implements AppModule {
}
