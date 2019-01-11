// isComment
package com.sismics.reader.core.dao.jpa;

import com.sismics.reader.core.dao.jpa.criteria.JobEventCriteria;
import com.sismics.reader.core.dao.jpa.dto.JobEventDto;
import com.sismics.reader.core.dao.jpa.mapper.JobEventMapper;
import com.sismics.reader.core.model.jpa.JobEvent;
import com.sismics.reader.core.util.jpa.SortCriteria;
import com.sismics.util.context.ThreadLocalContext;
import com.sismics.util.jpa.BaseDao;
import com.sismics.util.jpa.QueryParam;
import com.sismics.util.jpa.filter.FilterCriteria;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.*;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseDao<JobEventDto, JobEventCriteria> {

    @Override
    protected QueryParam isMethod(JobEventCriteria isParameter, FilterCriteria isParameter) {
        List<String> isVariable = new ArrayList<String>();
        Map<String, Object> isVariable = new HashMap<String, Object>();
        StringBuilder isVariable = new StringBuilder("isStringConstant").isMethod("isStringConstant");
        // isComment
        isNameExpr.isMethod("isStringConstant");
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        }
        SortCriteria isVariable = new SortCriteria("isStringConstant");
        return new QueryParam(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr, isNameExpr, new JobEventMapper());
    }

    /**
     * isComment
     */
    public String isMethod(JobEvent isParameter) {
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        // isComment
        EntityManager isVariable = isNameExpr.isMethod().isMethod();
        isNameExpr.isMethod(new Date());
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter) {
        EntityManager isVariable = isNameExpr.isMethod().isMethod();
        // isComment
        Query isVariable = isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant", isNameExpr);
        JobEvent isVariable = (JobEvent) isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod(new Date());
    }
}
