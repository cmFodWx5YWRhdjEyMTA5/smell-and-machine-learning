// isComment
package com.github.pockethub.android.ui.gist;

import com.meisolsson.githubsdk.core.ServiceGenerator;
import com.meisolsson.githubsdk.model.Gist;
import com.meisolsson.githubsdk.model.Page;
import com.meisolsson.githubsdk.service.gists.GistService;
import io.reactivex.Single;
import retrofit2.Response;

/**
 * isComment
 */
public class isClassOrIsInterface extends GistsFragment {

    GistService isVariable = isNameExpr.isMethod(isMethod(), GistService.class);

    @Override
    protected Single<Response<Page<Gist>>> isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }
}
