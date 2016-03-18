/**
 * Created by Happy on 3/18/2016.
 */
public class Pet
{
    private String name;
    private String type;
    private int[] visits;
    private String address;
    public  Pet(String s, String t, String addr, int[]a) {
        visits = new int[7];
        name = s;
        type = t;
        address = addr;
        for (int i = 0; i < 7; i++)
            visits[i] = a[i];
    }
    public String printScheduleofDay(int i){
        return "visit:" + name +"\ttype: The "+type+"\tvisit: "+visits[i]+"times\tAddress: "+address;}
    public int getVisits(int i)
    {return  visits[i];}
}
