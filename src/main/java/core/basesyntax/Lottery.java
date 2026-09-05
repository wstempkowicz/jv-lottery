package core.basesyntax;

public class Lottery {
    public Ball getRandomBall () {
        Random randomNumberSupplier = new Random();
        int number = randomNumberSupplier.nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        color = colorSupplier.getRandomColor();
        Ball ball = new Ball();
        ball.number = number;
        ball.color = color;
        return ball;
    }
}
