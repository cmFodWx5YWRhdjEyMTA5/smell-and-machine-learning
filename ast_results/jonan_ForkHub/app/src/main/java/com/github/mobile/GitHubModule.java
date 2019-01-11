// isComment
package com.github.mobile;

import android.content.Context;
import com.github.mobile.accounts.AccountClient;
import com.github.mobile.accounts.AccountScope;
import com.github.mobile.accounts.GitHubAccount;
import com.github.mobile.api.DateAdapter;
import com.github.mobile.api.RequestConfiguration;
import com.github.mobile.core.commit.CommitStore;
import com.github.mobile.core.gist.GistStore;
import com.github.mobile.core.issue.IssueStore;
import com.github.mobile.persistence.OrganizationRepositories;
import com.github.mobile.sync.SyncCampaign;
import com.google.inject.AbstractModule;
import com.google.inject.Provider;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import com.google.inject.name.Named;
import com.squareup.moshi.Moshi;
import java.io.File;
import java.lang.ref.WeakReference;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.CommitService;
import org.eclipse.egit.github.core.service.GistService;
import org.eclipse.egit.github.core.service.IssueService;
import org.eclipse.egit.github.core.service.PullRequestService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractModule {

    private WeakReference<IssueStore> isVariable;

    private WeakReference<GistStore> isVariable;

    private WeakReference<CommitStore> isVariable;

    @Override
    protected void isMethod() {
        isMethod(new ServicesModule());
        isMethod(new FactoryModuleBuilder().isMethod(SyncCampaign.Factory.class));
        isMethod(new FactoryModuleBuilder().isMethod(OrganizationRepositories.Factory.class));
        isMethod(isNameExpr.isMethod());
    }

    @Provides
    GitHubClient isMethod(Provider<GitHubAccount> isParameter) {
        return new AccountClient(isNameExpr);
    }

    @Provides
    @Singleton
    Retrofit isMethod(Provider<GitHubAccount> isParameter) {
        OkHttpClient isVariable = new OkHttpClient.Builder().isMethod(new RequestConfiguration(isNameExpr)).isMethod();
        Moshi isVariable = new Moshi.Builder().isMethod(new DateAdapter()).isMethod();
        return new Retrofit.Builder().isMethod("isStringConstant").isMethod(isNameExpr).isMethod(isNameExpr.isMethod(isNameExpr)).isMethod();
    }

    @Provides
    @Named("isStringConstant")
    File isMethod(Context isParameter) {
        return new File(isNameExpr.isMethod(), "isStringConstant");
    }

    @Provides
    IssueStore isMethod(IssueService isParameter, PullRequestService isParameter) {
        IssueStore isVariable = isNameExpr != null ? isNameExpr.isMethod() : null;
        if (isNameExpr == null) {
            isNameExpr = new IssueStore(isNameExpr, isNameExpr);
            isNameExpr = new WeakReference<IssueStore>(isNameExpr);
        }
        return isNameExpr;
    }

    @Provides
    GistStore isMethod(GistService isParameter) {
        GistStore isVariable = isNameExpr != null ? isNameExpr.isMethod() : null;
        if (isNameExpr == null) {
            isNameExpr = new GistStore(isNameExpr);
            isNameExpr = new WeakReference<GistStore>(isNameExpr);
        }
        return isNameExpr;
    }

    @Provides
    CommitStore isMethod(CommitService isParameter) {
        CommitStore isVariable = isNameExpr != null ? isNameExpr.isMethod() : null;
        if (isNameExpr == null) {
            isNameExpr = new CommitStore(isNameExpr);
            isNameExpr = new WeakReference<CommitStore>(isNameExpr);
        }
        return isNameExpr;
    }
}
