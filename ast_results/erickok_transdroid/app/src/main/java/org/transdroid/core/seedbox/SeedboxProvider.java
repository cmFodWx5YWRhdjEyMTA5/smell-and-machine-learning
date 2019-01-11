// isComment
package org.transdroid.core.seedbox;

import org.transdroid.core.gui.settings.KeyBoundPreferencesActivity;

/**
 * isComment
 */
public enum SeedboxProvider {

    Dediseedbox {

        @Override
        public SeedboxSettings isMethod() {
            return new DediseedboxSettings();
        }
    }
    , Seedstuff {

        @Override
        public SeedboxSettings isMethod() {
            return new SeedstuffSettings();
        }
    }
    , XirvikShared {

        @Override
        public SeedboxSettings isMethod() {
            return new XirvikSharedSettings();
        }
    }
    , XirvikSemi {

        @Override
        public SeedboxSettings isMethod() {
            return new XirvikSemiSettings();
        }
    }
    , XirvikDedi {

        @Override
        public SeedboxSettings isMethod() {
            return new XirvikDediSettings();
        }
    }
    ;

    public abstract SeedboxSettings isMethod();
}
