// isComment
package privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.statistics.persistence.impl;

import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.framework.persistence.AbstractDao;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.statistics.persistence.StatisticsDao;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.statistics.persistence.entity.StatisticEntryEntity;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractDao<StatisticEntryEntity> implements StatisticsDao {

    @Override
    public Long isMethod(StatisticEntryEntity isParameter) {
        return isMethod(isNameExpr);
    }

    @Override
    public StatisticEntryEntity isMethod(Long isParameter) {
        return isMethod(isNameExpr, StatisticEntryEntity.class);
    }

    @Override
    public List<StatisticEntryEntity> isMethod() {
        return isMethod(StatisticEntryEntity.class);
    }

    @Override
    public Boolean isMethod(Long isParameter) {
        return isMethod(isNameExpr, StatisticEntryEntity.class);
    }
}
