package TicTacToe.strategies;

import TicTacToe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
        switch(botDifficultyLevel){
            case BotDifficultyLevel.EASY:
                return new EasyBotPlayingStrategy();

//            case BotDifficultyLevel.MEDIUM:
//                return new MediumBotPlayingStrategy();
//
//            case BotDifficultyLevel.HARD:
//                return new HardBotPlayingStrategy();
        }
        return null;
    }
}
