// isComment
package privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.product.persistence.impl;

import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.framework.persistence.AbstractDao;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.product.persistence.ProductItemDao;
import privacyfriendlyshoppinglist.secuso.org.privacyfriendlyshoppinglist.logic.product.persistence.entity.ProductItemEntity;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractDao<ProductItemEntity> implements ProductItemDao {

    @Override
    public Long isMethod(ProductItemEntity isParameter) {
        return isMethod(isNameExpr);
    }

    @Override
    public ProductItemEntity isMethod(Long isParameter) {
        return isMethod(isNameExpr, ProductItemEntity.class);
    }

    @Override
    public List<ProductItemEntity> isMethod() {
        return isMethod(ProductItemEntity.class);
    }

    @Override
    public Boolean isMethod(Long isParameter) {
        return isMethod(isNameExpr, ProductItemEntity.class);
    }
}
