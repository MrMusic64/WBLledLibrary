package main.java.wblleds;
/** This is a enum containing LED colors in the HSV format.
 * Colors must be pulled from this file to be compatible with the White Bear Lake LED Library.
 * 
 * If a color is not supported, 
 * please use the colorTest() mode and comment on the GitHub repository with the color recommendation (include web browser hue value)
 * Please keep in mind that these colors were tested with WS2812 light strands and may show up differently on other light strands. 
 */
public enum LedColor{
    RED,
    RED_ORANGE,
    ORANGE,
    GOLD,
    YELLOW,
    YELLOW_GREEN,
    LIME,
    GREEN,
    AQUA,
    LIGHT_BLUE,
    CORNFLOWER,
    BLUE,
    INDIGO,
    PURPLE,
    BRIGHT_PURPLE,
    PINK,
    MAGENTA,
    BROWN,
    WHITE,
    BLACK;

    public int hues() {
        switch (this) { // Values are divided by 2 because color pickers like Google are x/360, whereas
                        // WPILib is x/180
            case RED:
                return 0;
            case RED_ORANGE:
                return 6 / 2;
            case ORANGE:
                return 10 / 2;
            case GOLD:
                return 30 / 2;
            case YELLOW:
                return 50 / 2;
            case YELLOW_GREEN:
                return 76 / 2;
            case LIME:
                return 90 / 2;
            case GREEN:
                return 110 / 2;
            case AQUA:
                return 130 / 2;
            case LIGHT_BLUE:
                return 180 / 2;
            case CORNFLOWER:
                return 200 / 2;
            case BLUE:
                return 240 / 2;
            case INDIGO:
                return 260 / 2;
            case PURPLE:
                return 270 / 2;
            case BRIGHT_PURPLE:
                return 290 / 2;
            case PINK:
                return 336 / 2;
            case MAGENTA:
                return 356 / 2;
            case BROWN:
                return 20 / 2;
            case WHITE:
                return 0;
            case BLACK:
                return 0;
            default:
                return 0;
        }
    }

    public int saturation() {
        switch (this) {
            case BROWN:
                return 70;
            case WHITE:
                return 0;
            case BLACK:
                return 0;
            default:
                return 255;
        }
    }

    public int value() {
        switch (this) {
            case BROWN:
                return 60;
            case BLACK:
                return 0;
            default:
                return LedController.ledbrightness;
        }
    }

}
