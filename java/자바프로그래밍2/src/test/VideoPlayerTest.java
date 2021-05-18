package src.test;

public class VideoPlayerTest {
    public static void main(String[] args){
        VideoPlayer videoPlayer = new VideoPlayer();
        Icontroll icontroll = videoPlayer;
        icontroll.play();
        icontroll.stop();
    }
}
