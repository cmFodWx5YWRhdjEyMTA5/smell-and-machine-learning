// isComment
package com.sismics.reader.core.dao.jpa;

import com.sismics.reader.core.dao.jpa.criteria.JobCriteria;
import com.sismics.reader.core.dao.jpa.dto.JobDto;
import com.sismics.reader.core.dao.jpa.mapper.JobMapper;
import com.sismics.reader.core.model.jpa.Job;
import com.sismics.reader.core.util.jpa.SortCriteria;
import com.sismics.util.context.ThreadLocalContext;
import com.sismics.util.jpa.BaseDao;
import com.sismics.util.jpa.QueryParam;
import com.sismics.util.jpa.filter.FilterCriteria;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.*;

/**
 * isComment
 */
public class isClassOrIsInterface extends BaseDao<JobDto, JobCriteria> {

    @Override
    protected QueryParam isMethod(JobCriteria isParameter, FilterCriteria isParameter) {
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
        return new QueryParam(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr, isNameExpr, new JobMapper());
    }

    /**
     * isComment
     */
    public String isMethod(Job isParameter) {
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
    public Job isMethod(String isParameter) {
        EntityManager isVariable = isNameExpr.isMethod().isMethod();
        Query isVariable = isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant", isNameExpr);
        try {
            return (Job) isNameExpr.isMethod();
        } catch (NoResultException isParameter) {
            return null;
        }
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter) {
        EntityManager isVariable = isNameExpr.isMethod().isMethod();
        // isComment
        Query isVariable = isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant", isNameExpr);
        Job isVariable = (Job) isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod(new Date());
    }

    /**
     * isComment
     */
    public Job isMethod(Job isParameter) {
        EntityManager isVariable = isNameExpr.isMethod().isMethod();
        // isComment
        Query isVariable = isNameExpr.isMethod("isStringConstant").isMethod("isStringConstant", isNameExpr.isMethod());
        Job isVariable = (Job) isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        return isNameExpr;
    }
}
