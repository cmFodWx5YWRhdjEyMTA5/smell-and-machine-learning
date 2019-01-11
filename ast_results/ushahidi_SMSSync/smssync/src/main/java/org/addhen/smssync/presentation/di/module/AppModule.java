// isComment
package org.addhen.smssync.presentation.di.module;

import com.addhen.android.raiburari.presentation.di.module.ApplicationModule;
import org.addhen.smssync.BuildConfig;
import org.addhen.smssync.data.PrefsFactory;
import org.addhen.smssync.data.cache.FileManager;
import org.addhen.smssync.data.message.PostMessage;
import org.addhen.smssync.data.message.ProcessMessageResult;
import org.addhen.smssync.data.message.TweetMessage;
import org.addhen.smssync.data.net.AppHttpClient;
import org.addhen.smssync.data.net.MessageHttpClient;
import org.addhen.smssync.data.repository.datasource.filter.FilterDataSourceFactory;
import org.addhen.smssync.data.repository.datasource.message.MessageDataSourceFactory;
import org.addhen.smssync.data.repository.datasource.webservice.WebServiceDataSourceFactory;
import org.addhen.smssync.data.twitter.TwitterBuilder;
import org.addhen.smssync.data.twitter.TwitterClient;
import org.addhen.smssync.presentation.App;
import org.addhen.smssync.smslib.sms.ProcessSms;
import android.content.Context;
import android.content.SharedPreferences;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * isComment
 */
@Module(includes = ApplicationModule.class)
public class isClassOrIsInterface {

    private static final String isVariable = "isStringConstant";

    private App isVariable;

    public isConstructor(App isParameter) {
        isNameExpr = isNameExpr;
    }

    @Provides
    @Singleton
    FileManager isMethod(Context isParameter, PrefsFactory isParameter) {
        return new FileManager(isNameExpr, isNameExpr);
    }

    @Provides
    @Singleton
    SharedPreferences isMethod(Context isParameter) {
        return isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Provides
    @Singleton
    PrefsFactory isMethod(Context isParameter, SharedPreferences isParameter) {
        return new PrefsFactory(isNameExpr, isNameExpr);
    }

    @Provides
    @Singleton
    MessageHttpClient isMethod(Context isParameter, FileManager isParameter) {
        return new MessageHttpClient(isNameExpr, isNameExpr);
    }

    @Provides
    @Singleton
    AppHttpClient isMethod(Context isParameter) {
        return new AppHttpClient(isNameExpr);
    }

    @Provides
    @Singleton
    TwitterClient isMethod() {
        return new TwitterBuilder(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr).isMethod();
    }

    @Provides
    @Singleton
    ProcessMessageResult isMethod(Context isParameter, AppHttpClient isParameter, FileManager isParameter, WebServiceDataSourceFactory isParameter, MessageDataSourceFactory isParameter) {
        return new ProcessMessageResult(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod());
    }

    @Provides
    @Singleton
    PostMessage isMethod(Context isParameter, PrefsFactory isParameter, MessageHttpClient isParameter, MessageDataSourceFactory isParameter, WebServiceDataSourceFactory isParameter, FilterDataSourceFactory isParameter, ProcessSms isParameter, FileManager isParameter, TwitterClient isParameter, ProcessMessageResult isParameter) {
        return new PostMessage(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
    }

    @Provides
    @Singleton
    TweetMessage isMethod(Context isParameter, PrefsFactory isParameter, MessageHttpClient isParameter, MessageDataSourceFactory isParameter, WebServiceDataSourceFactory isParameter, FilterDataSourceFactory isParameter, ProcessSms isParameter, FileManager isParameter, TwitterClient isParameter, ProcessMessageResult isParameter) {
        return new TweetMessage(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr, isNameExpr);
    }
}
