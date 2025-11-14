public class Yield
{
    public static void main(String args[])
    {
        int day=3;
        String typeOfDay=switch(day)
        {
            case 1,7-> "Weekend";
            case 2,3,4,5,6->{
                String msg="Weekday";
                yield msg;
            }
            default->{
                yield "Invalid day";
            }
        };
        System.out.println(typeOfDay);
    }
}