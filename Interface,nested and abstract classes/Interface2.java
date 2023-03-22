interface Camera
{
    void click();

    void record();
}

interface Player extends Camera
{
    void play();

    void pause();

    void stop();
}


class Demo implements Camera,Player
{
    public void click()
    {
        System.out.println("clicking");
    }

    public void record()
    {
        System.out.println("recording");
    }

    public void play()
    {
        System.out.println("playing");
    }

    public void pause()
    {
        System.out.println("pausing");
    }

    public void stop()
    {
        System.out.println("stopping");
    }


}


public class Interface2
{
    public static void main(String args[])
    {
        Demo d = new Demo();
        d.click();
        d.record();
        d.play();
        d.pause();
        d.stop();

    }
}
