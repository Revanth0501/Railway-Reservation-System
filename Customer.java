
class Customer
{
    String Name;
    int Age;
    String Gender;
    int BirthPrefernce;
    Customer(String Name,int Age,String Gender,int BirthPrefernce)
    {
        this.Name=Name;
        this.Age=Age;
        this.Gender=Gender;
        this.BirthPrefernce=BirthPrefernce;
    }
    public String toString()
    {
        return "The ticket has been on name "+ Name;
    }
}
