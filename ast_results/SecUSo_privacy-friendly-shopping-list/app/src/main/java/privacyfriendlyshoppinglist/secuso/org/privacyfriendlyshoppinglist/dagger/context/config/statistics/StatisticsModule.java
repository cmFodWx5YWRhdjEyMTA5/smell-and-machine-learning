// isComment
package privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.dagger.context.config.statistics;

import dagger.Module;
import dagger.Provides;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.statistics.business.StatisticsService;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.statistics.business.impl.StatisticsServiceImpl;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.statistics.business.impl.converter.StatisticsConverterService;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.statistics.business.impl.converter.impl.StatisticsConverterServiceImpl;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.statistics.persistence.StatisticsDao;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.statistics.persistence.impl.StatisticsDaoImpl;
import javax.inject.Singleton;

/**
 * isComment
 */
@Module(injects = { StatisticsDao.class, StatisticsService.class, StatisticsConverterService.class })
public class isClassOrIsInterface {

    @Singleton
    @Provides
    StatisticsDao isMethod() {
        return new StatisticsDaoImpl();
    }

    @Singleton
    @Provides
    StatisticsConverterService isMethod() {
        return new StatisticsConverterServiceImpl();
    }

    @Singleton
    @Provides
    StatisticsService isMethod(StatisticsDao isParameter, StatisticsConverterService isParameter) {
        return new StatisticsServiceImpl(isNameExpr, isNameExpr);
    }
}
