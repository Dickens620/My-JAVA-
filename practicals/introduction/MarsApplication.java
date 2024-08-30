public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot myrobot = new MarsRobot();
        myrobot.checkTemperature();
        myrobot.speed = 500;
        myrobot.status = "Death";
        myrobot.temperature = -100;
        myrobot.showAttributes();

    }
}
