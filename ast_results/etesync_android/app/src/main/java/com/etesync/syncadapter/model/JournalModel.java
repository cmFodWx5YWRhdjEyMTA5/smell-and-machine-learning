// isComment
package com.etesync.syncadapter.model;

import java.util.LinkedList;
import java.util.List;
import io.requery.Column;
import io.requery.Convert;
import io.requery.Converter;
import io.requery.Entity;
import io.requery.ForeignKey;
import io.requery.Generated;
import io.requery.Index;
import io.requery.Key;
import io.requery.ManyToOne;
import io.requery.Persistable;
import io.requery.PostLoad;
import io.requery.ReferentialAction;
import io.requery.Table;
import io.requery.sql.EntityDataStore;

public class isClassOrIsInterface {

    @Entity
    @Table(name = "isStringConstant", uniqueIndexes = "isStringConstant")
    public abstract static class isClassOrIsInterface {

        @Key
        @Generated
        int isVariable;

        @Index(value = "isStringConstant")
        @Column(length = isIntegerConstant, nullable = true)
        String isVariable;

        @Convert(CollectionInfoConverter.class)
        CollectionInfo isVariable;

        String isVariable;

        byte[] isVariable;

        @Deprecated
        long isVariable;

        @Index(value = "isStringConstant")
        @ForeignKey(update = isNameExpr.isFieldAccessExpr)
        @ManyToOne
        Service isVariable;

        boolean isVariable;

        @Column(value = "isStringConstant")
        boolean isVariable;

        @PostLoad
        void isMethod() {
            this.isFieldAccessExpr.isFieldAccessExpr = this.isFieldAccessExpr.isFieldAccessExpr;
            this.isFieldAccessExpr.isFieldAccessExpr = isNameExpr;
        }

        public isConstructor() {
            this.isFieldAccessExpr = true;
        }

        public isConstructor(EntityDataStore<Persistable> isParameter, CollectionInfo isParameter) {
            this();
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
            this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr);
        }

        public static List<JournalEntity> isMethod(EntityDataStore<Persistable> isParameter, ServiceEntity isParameter) {
            List<JournalEntity> isVariable = isNameExpr.isMethod(JournalEntity.class).isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isMethod(true))).isMethod().isMethod();
            for (JournalEntity isVariable : isNameExpr) {
                // isComment
                isNameExpr.isMethod();
            }
            return isNameExpr;
        }

        public static JournalEntity isMethod(EntityDataStore<Persistable> isParameter, ServiceEntity isParameter, String isParameter) {
            JournalEntity isVariable = isNameExpr.isMethod(JournalEntity.class).isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr))).isMethod(isIntegerConstant).isMethod().isMethod();
            if (isNameExpr != null) {
                // isComment
                isNameExpr.isMethod();
            }
            return isNameExpr;
        }

        public static JournalEntity isMethod(EntityDataStore<Persistable> isParameter, CollectionInfo isParameter) {
            JournalEntity isVariable = isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr);
            if (isNameExpr == null) {
                isNameExpr = new JournalEntity(isNameExpr, isNameExpr);
            } else {
                isNameExpr.isMethod(isNameExpr);
            }
            return isNameExpr;
        }

        public String isMethod(EntityDataStore<Persistable> isParameter) {
            EntryEntity isVariable = isNameExpr.isMethod(EntryEntity.class).isMethod(isNameExpr.isFieldAccessExpr.isMethod(this)).isMethod(isNameExpr.isFieldAccessExpr.isMethod()).isMethod(isIntegerConstant).isMethod().isMethod();
            if (isNameExpr != null) {
                return isNameExpr.isMethod();
            }
            return null;
        }

        public boolean isMethod(String isParameter) {
            return (isNameExpr == null) || isNameExpr.isMethod(isNameExpr);
        }
    }

    @Entity
    @Table(name = "isStringConstant", uniqueIndexes = "isStringConstant")
    public abstract static class isClassOrIsInterface {

        @Key
        @Generated
        int isVariable;

        @Index("isStringConstant")
        @Column(length = isIntegerConstant, nullable = true)
        String isVariable;

        @Convert(SyncEntryConverter.class)
        SyncEntry isVariable;

        @Index("isStringConstant")
        @ForeignKey(update = isNameExpr.isFieldAccessExpr)
        @ManyToOne
        Journal isVariable;
    }

    @Entity
    @Table(name = "isStringConstant", uniqueIndexes = "isStringConstant")
    public abstract static class isClassOrIsInterface {

        @Key
        @Generated
        int isVariable;

        @Index(value = "isStringConstant")
        @Column(nullable = true)
        String isVariable;

        @Index(value = "isStringConstant")
        CollectionInfo.Type isVariable;

        public static ServiceEntity isMethod(EntityDataStore<Persistable> isParameter, String isParameter, CollectionInfo.Type isParameter) {
            return isNameExpr.isMethod(ServiceEntity.class).isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr))).isMethod(isIntegerConstant).isMethod().isMethod();
        }
    }

    static class isClassOrIsInterface implements Converter<CollectionInfo, String> {

        @Override
        public Class<CollectionInfo> isMethod() {
            return CollectionInfo.class;
        }

        @Override
        public Class<String> isMethod() {
            return String.class;
        }

        @Override
        public Integer isMethod() {
            return null;
        }

        @Override
        public String isMethod(CollectionInfo isParameter) {
            return isNameExpr == null ? null : isNameExpr.isMethod();
        }

        @Override
        public CollectionInfo isMethod(Class<? extends CollectionInfo> isParameter, String isParameter) {
            return isNameExpr == null ? null : isNameExpr.isMethod(isNameExpr);
        }
    }

    static class isClassOrIsInterface implements Converter<SyncEntry, String> {

        @Override
        public Class<SyncEntry> isMethod() {
            return SyncEntry.class;
        }

        @Override
        public Class<String> isMethod() {
            return String.class;
        }

        @Override
        public Integer isMethod() {
            return null;
        }

        @Override
        public String isMethod(SyncEntry isParameter) {
            return isNameExpr == null ? null : isNameExpr.isMethod();
        }

        @Override
        public SyncEntry isMethod(Class<? extends SyncEntry> isParameter, String isParameter) {
            return isNameExpr == null ? null : isNameExpr.isMethod(isNameExpr);
        }
    }
}
