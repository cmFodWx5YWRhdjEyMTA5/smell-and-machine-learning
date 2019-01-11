// isComment
package github.daneren2005.dsub.fragments;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.List;
import github.daneren2005.dsub.R;
import github.daneren2005.dsub.adapter.EntryGridAdapter;
import github.daneren2005.dsub.adapter.SectionAdapter;
import github.daneren2005.dsub.domain.MusicDirectory;
import github.daneren2005.dsub.service.MusicService;
import github.daneren2005.dsub.util.ProgressListener;
import github.daneren2005.dsub.view.UpdateView;

public class isClassOrIsInterface extends SelectRecyclerFragment<MusicDirectory.Entry> {

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public SectionAdapter isMethod(List<MusicDirectory.Entry> isParameter) {
        SectionAdapter isVariable = new EntryGridAdapter(isNameExpr, isNameExpr, null, true);
        isNameExpr.isMethod(this);
        return isNameExpr;
    }

    @Override
    public List<MusicDirectory.Entry> isMethod(MusicService isParameter, boolean isParameter, ProgressListener isParameter) throws Exception {
        MusicDirectory isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        return isNameExpr.isMethod();
    }

    @Override
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(UpdateView<MusicDirectory.Entry> isParameter, MusicDirectory.Entry isParameter) {
        isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Menu isParameter, MenuInflater isParameter, UpdateView<MusicDirectory.Entry> isParameter, MusicDirectory.Entry isParameter) {
        isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(MenuItem isParameter, UpdateView<MusicDirectory.Entry> isParameter, MusicDirectory.Entry isParameter) {
        return isMethod(isNameExpr, isNameExpr);
    }
}
