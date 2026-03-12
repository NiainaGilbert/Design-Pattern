public class GPS 
{
    private static GPS instance;
    private String destination;

    private GPS() {}

    public static GPS getInstance() 
    {
        if (instance == null) 
        {
            instance = new GPS();
        }
        return instance;
    }

    public void setDestination(String destination) 
    {
        this.destination = destination;
        System.out.println("Destination : " + destination);
    }

    public void donnerInstruction(String instruction) {
        System.out.println("[GPS] " + instruction);
    }
}