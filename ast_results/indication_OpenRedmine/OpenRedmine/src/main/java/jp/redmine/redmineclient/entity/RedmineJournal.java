// isComment
package jp.redmine.redmineclient.entity;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@DatabaseTable
public class isClassOrIsInterface implements IConnectionRecord, IPostingRecord, IUserRecord {

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = isNameExpr.isFieldAccessExpr;

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    @DatabaseField(generatedId = true)
    private Long isVariable;

    @DatabaseField(uniqueIndexName = "isStringConstant", columnName = isNameExpr.isFieldAccessExpr)
    private Integer isVariable;

    @DatabaseField()
    private Long isVariable;

    @DatabaseField(uniqueIndexName = "isStringConstant")
    private int isVariable;

    @DatabaseField(foreign = true, foreignColumnName = "isStringConstant", columnName = "isStringConstant", foreignAutoRefresh = true)
    private RedmineUser isVariable;

    @DatabaseField
    private String isVariable;

    @DatabaseField(dataType = isNameExpr.isFieldAccessExpr)
    private byte[] isVariable;

    @DatabaseField
    private Date isVariable;

    @DatabaseField
    private Date isVariable;

    public List<RedmineJournalChanges> isVariable;

    /**
     * isComment
     */
    public void isMethod(Long isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public Long isMethod() {
        return isNameExpr;
    }

    // isComment
    @Override
    public void isMethod(RedmineConnection isParameter) {
        this.isMethod(isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public byte[] isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(byte[] isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(List<RedmineJournalChanges> isParameter) throws IOException {
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        ObjectOutputStream isVariable = new ObjectOutputStream(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        this.isFieldAccessExpr = isNameExpr.isMethod();
    }

    @SuppressWarnings("isStringConstant")
    public List<RedmineJournalChanges> isMethod() throws IOException, ClassNotFoundException {
        if (this.isFieldAccessExpr == null) {
            return new ArrayList<RedmineJournalChanges>();
        }
        ByteArrayInputStream isVariable = new ByteArrayInputStream(this.isFieldAccessExpr);
        ObjectInputStream isVariable = new ObjectInputStream(isNameExpr);
        return (List<RedmineJournalChanges>) isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public String isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(Date isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public Date isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(Date isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public Date isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(Integer isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public Integer isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public Long isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(Long isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public RedmineUser isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(RedmineUser isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public Element isMethod(Document isParameter) {
        Element isVariable = isNameExpr.isMethod("isStringConstant");
        if (isMethod() != null) {
            Element isVariable = isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isNameExpr.isMethod(this.isMethod()));
            isNameExpr.isMethod(isNameExpr);
        } else {
            throw new IllegalArgumentException("isStringConstant");
        }
        return isNameExpr;
    }
}
