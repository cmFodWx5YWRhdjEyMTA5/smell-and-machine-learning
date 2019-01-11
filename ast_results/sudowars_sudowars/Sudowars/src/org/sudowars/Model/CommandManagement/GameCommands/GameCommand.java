// isComment
package org.sudowars.Model.CommandManagement.GameCommands;

import org.sudowars.Model.CommandManagement.Command;
import org.sudowars.Model.Game.Player;
import org.sudowars.Model.Game.Game;

/**
 * isComment
 */
public interface isClassOrIsInterface extends Command {

    /**
     * isComment
     */
    boolean isMethod(Game isParameter, Player isParameter) throws IllegalArgumentException;

    /**
     * isComment
     */
    GameCommand isMethod(Game isParameter);
}
