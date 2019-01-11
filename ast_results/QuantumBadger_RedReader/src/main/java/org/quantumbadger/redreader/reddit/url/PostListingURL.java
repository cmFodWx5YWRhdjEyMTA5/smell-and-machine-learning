// isComment
package org.quantumbadger.redreader.reddit.url;

import org.quantumbadger.redreader.reddit.PostSort;

public abstract class isClassOrIsInterface extends RedditURLParser.RedditURL {

    public abstract PostListingURL isMethod(String isParameter);

    public abstract PostListingURL isMethod(Integer isParameter);

    public PostSort isMethod() {
        return null;
    }
}
