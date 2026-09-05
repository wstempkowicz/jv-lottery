package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        Random randomValueSupplier = new Random();
        int value = randomValueSupplier.nextInt(8);
        Colors color = Colors.value(value);
    }
}