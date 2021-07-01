package src.test;

public class VideoPlayer implements Icontroll{
    @Override
    public void play() {
        System.out.println("play 입니다.");
    }

    @Override
    public void stop() {
        System.out.println("stop 입니다.");
    }
}
