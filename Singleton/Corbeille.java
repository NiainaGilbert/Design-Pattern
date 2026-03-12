import java.util.List;
import java.util.ArrayList;

public class Corbeille 
{
    private static Corbeille instance;
    private List<String> fichiers = new ArrayList<>();

    private Corbeille() {}

    public static Corbeille getInstance() 
    {
        if (instance == null) 
        {
            instance = new Corbeille();
        }
        return instance;
    }

    public void supprimer(String fichier) 
    {
        fichiers.add(fichier);
        System.out.println(fichier + " déplacé dans la corbeille.");
    }

    public void vider() 
    {
        fichiers.clear();
        System.out.println("Corbeille vidée.");
    }
}