import java.util.Scanner;

/**
 * Created by Happy on 3/18/2016.
 */
public class PetManager
{
    public static void main(String args[])throws Exception{

        Scanner in = new Scanner(System.in);
        Pet[] p=new Pet[1];
        String name,type,addr;
        String[] weekday = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int[] visits=new int[7];
        for(int i=0;i<p.length;i++)
        {
            System.out.println("enter pet name");
            name=in.nextLine();
            System.out.println("enter pet type");
            type=in.nextLine();
            System.out.println("enter pet owner Address");
            addr=in.nextLine();
            for(int j=0;j<7;j++)
            {
                System.out.println("enter number of visits for this pet on "+weekday[j]);
                visits[j]=in.nextInt();
            }
            p[i]=new Pet(name,type,addr,visits);
        }
        System.out.println("week schedule is ");
        for(int i=0;i<7;i++)
        {
            int res=0;
            System.out.println(weekday[i]);
            for(int j=0;j<p.length;j++)
            {
                res+=p[j].getVisits(i);
                if(p[j].getVisits(i)!=0)
                {
                    System.out.println(p[j].printScheduleofDay(i));// displays visiting day schedule
                }
            }
            if(res>6)
                System.out.println("Waring! more than 6 visits this day");//prints warning message
        }
    }
}



