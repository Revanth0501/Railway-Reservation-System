import java.util.*;
public class RailwayBooking
{
    Queue<Customer> waiting=new LinkedList<>();
    Queue<Customer> rac=new LinkedList<>();
    int counter=0;
    int total=0;

    public void book(Customer obj)
    {
        if(obj.Age< 5)
        System.out.println("Ticket cannot be booked for Age below for 5 years");

        else
        {
            if(total < Seats.totalSeats)
            {
                int opt=obj.BirthPrefernce;
                if(opt==1 || obj.Age > 60 || obj.Gender=="Female")
                {
                    int available=checkLower();
                    if( available !=0)
                    {
                        Seats.seatsdata.put(available,obj);
                        total++;
                        System.out.println("Your ticket has been Booked Successfully with your choosen Prefernce on Seat No:"+available);
                    }
                    else
                    {
                        Seats.seatsdata.put(Seats.generalseats[counter],obj);
                        System.out.println("Your ticket has been Booked Successfully on Seat No:"+Seats.generalseats[counter]);

                        total++;
                        counter++;
                    }
                } 
                
                else if(opt==2)
                {
                    int available=checkUpper();
                    if(available !=0)
                    {
                        Seats.seatsdata.put(available,obj);
                        total++;
                        System.out.println("Your ticket has been Booked Successfully with your choosen Prefernce on Seat No:"+available);

                    }
                    else
                    {
                        Seats.seatsdata.put(Seats.generalseats[counter],obj);
                        System.out.println("Your ticket has been Booked Successfully on Seat No:"+Seats.generalseats[counter]);
                        total++;
                        counter++;
                    }
                }

                else
                {
                    Seats.seatsdata.put(Seats.generalseats[counter],obj);
                    System.out.println("Your ticket has been Booked Successfully on Seat No:"+Seats.generalseats[counter]);
                    total++;
                    counter++;
                }
                System.out.println("Have a Happy Journey");
            }

            else if(rac.size() <=10)
            {
                rac.add(obj);
                System.out.println("Your ticket as been added to RAC Queue.Regularly check for the Status");
            }
            else if(waiting.size() <=10)
            {
                waiting.add(obj);
                System.out.println("Your ticket as been added to Waiting Queue.Regularly check for the Status");

            }
            else
            {
                System.out.println("No Tickets Available");
            }
            System.out.println("Total Counter :"+total+"Local Counter"+counter);
        }
    }

    static int checkLower()
    {
        for(int i : Seats.lowerSeats)
        {
            if(Seats.seatsdata.get(i)==null)
            return i;
        }
        return 0;
    }

    static int checkUpper()
    {
        for(int i : Seats.upperSeats)
        {
            if(Seats.seatsdata.get(i)==null)
            return i;
        }
        return 0;
    }
    
    public void cancel(int seatno)
    {
        Seats.seatsdata.put(seatno,rac.poll());
        rac.offer(waiting.poll());
    }
}
