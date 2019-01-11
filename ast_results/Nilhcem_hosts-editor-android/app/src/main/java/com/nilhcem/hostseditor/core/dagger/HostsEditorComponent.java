// isComment
package com.nilhcem.hostseditor.core.dagger;

import com.nilhcem.hostseditor.task.GenericTaskAsync;
import com.nilhcem.hostseditor.task.ListHostsAsync;
import com.nilhcem.hostseditor.ui.BaseActivity;
import com.nilhcem.hostseditor.ui.addedit.AddEditHostFragment;
import com.nilhcem.hostseditor.ui.list.ListHostsFragment;
import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = { HostsEditorModule.class })
public interface isClassOrIsInterface {

    void isMethod(BaseActivity isParameter);

    void isMethod(GenericTaskAsync isParameter);

    void isMethod(AddEditHostFragment isParameter);

    void isMethod(ListHostsAsync isParameter);

    void isMethod(ListHostsFragment isParameter);
}
