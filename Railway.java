import java.util.*;
public class Railway
{
    public static void main(String args[])
    {
        for(int i=1;i<Seats.totalSeats+1;i++)
        {
            Seats.seatsdata.put(i,null);
        }
        RailwayBooking rb=new RailwayBooking();
        System.out.println("**********************************************************\n Welcome to Railway Reservation System\n *********************************************************");
        while(true)
        {
            System.out.println("Choose the options below: \n 1.To book a ticket \n 2.To cancel a Ticket \n 3.To Get the Booked Seats \n 4.To get the available seats \n 5.To exit");
            Scanner sc=new Scanner(System.in);
            int opt=sc.nextInt();
            switch(opt)
            {
                case 1:
                {
                    System.out.println("Enter your name");
                    String name=sc.next();
                    System.out.println("Enter your age");
                    int age=sc.nextInt();
                    System.out.println("Enter your gender");
                    String gender=sc.next();
                    System.out.println("Enter your BirthPreference \n 1.Lower Seat 2.Upper Seat");
                    int birthprefernce=sc.nextInt();

                    Customer co=new Customer(name,age,gender,birthprefernce);
                    rb.book(co);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter Your Seat No");
                    rb.cancel(sc.nextInt());
                    break;
                }
                case 3:
                {
                    PrintData pb=new PrintData();
                    pb.printBookedSeats();
                    break;
                }
                case 4:
                {
                    PrintData pa=new PrintData();
                    pa.printAvailableSeats();
                    break;
                }
                case 5:
                System.exit(0);
            }
        }
        
    }
}