
package Constructors;
public class setter_getter
{
    private String hero;
    private int power; //instance variable (cannot be initialized here , ie during declaration)

    public void setHero(String hero)
    {
        this.hero=hero;
    }
    public void setPower(int power)
    {
        if(power>0)
        {
            this.power=power;
        }
        else
        {
            System.out.println("Power cannot be negative or zero");
        }
    }
    public String getHero()   //getter method (since it has return type)
    {
        return hero;
    }
    public int getPower()
    {
        return power;
    }
    public void show()
    {
        System.out.println("Hero: "+getHero());
        System.out.println("Power: "+getPower());
        System.out.println("Avengers avail");

    }
    public static void main(String[] args) 
    {
        setter_getter avenger=new setter_getter();
        avenger.setHero("Ironman");
        avenger.setPower(9000);
        avenger.show();
    }   
}