public class CompteurElectrique 
{
    private static CompteurElectrique instance;
    private double consommationTotale = 0;

    private CompteurElectrique() {}

    public static CompteurElectrique getInstance() 
    {
        if (instance == null) 
        {
            instance = new CompteurElectrique();
        }
        return instance;
    }

    public void ajouterConsommation(String appareil, double kwh) 
    {
        consommationTotale += kwh;
        System.out.println(appareil + " consomme " + kwh + " kWh. Total : " + consommationTotale + " kWh");
    }
}