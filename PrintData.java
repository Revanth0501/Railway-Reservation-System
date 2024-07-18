public class PrintData
{   
   
    public void printAvailableSeats()
    {   
        int count=0;
        System.out.print("The available Seats are :");
        for(int i=1;i<Seats.totalSeats+1;i++)
        {
            if(Seats.seatsdata.get(i)==null)
            {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\n The Total No of Available Seats are:"+count);
    }

    public void printBookedSeats()
    {
        int count=0;
        System.out.print("The Booked  Seats are :\n");
        for(int i=1;i<Seats.totalSeats+1;i++)
        {
            if(Seats.seatsdata.get(i) != null)
            {
                System.out.println("Seat No: "+i+" "+Seats.seatsdata.get(i) );
                count++;
            }
        }
        System.out.println("\n The Total No of Booked Seats are:"+count);
    }
}