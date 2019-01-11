// isComment
package privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.statistics.business;

import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.framework.context.ContextSetter;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.product.business.domain.ProductItem;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.statistics.business.domain.StatisticEntryItem;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.statistics.business.domain.StatisticsChartData;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.statistics.business.domain.StatisticsQuery;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.statistics.business.domain.StatsRangeItem;
import rx.Observable;

/**
 * isComment
 */
public interface isClassOrIsInterface extends ContextSetter {

    Observable<Void> isMethod(ProductItem isParameter);

    Observable<StatisticEntryItem> isMethod();

    Observable<Boolean> isMethod();

    Observable<StatsRangeItem> isMethod();

    Observable<StatisticsChartData> isMethod(StatisticsQuery isParameter);

    Observable<Boolean> isMethod(String isParameter);
}
