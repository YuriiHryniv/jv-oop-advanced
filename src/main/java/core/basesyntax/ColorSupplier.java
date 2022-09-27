package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int COLOR_COUNT = 5;
    private final Random random = new Random();

    public String getRandomColor() {
        int colorNumber = random.nextInt(COLOR_COUNT);

        switch (colorNumber) {
            case 0:
                return Colors.RED.name();
            case 1:
                return Colors.YELLOW.name();
            case 2:
                return Colors.PINK.name();
            case 3:
                return Colors.BLUE.name();
            case 4:
                return Colors.BLACK.name();
            case 5:
                return Colors.GREEN.name();
            default: return Colors.WHITE.name();
        }
    }
}
