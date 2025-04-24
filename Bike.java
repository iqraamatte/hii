class Bike
{
    void run()
    {
        System.out.println("run");
    }
}
class Bullet extends Bike
{
    void run()
    {
        System.out.println("run 50km");
    }
}
class Splendor extends Bike
{
    void run()
    {
        System.out.println("run safely");
    }
public static void main(String[] args)
{
    Bike b=new Splendor();
    b.run();
    Bike m=new Bullet();
    m.run();
}
}