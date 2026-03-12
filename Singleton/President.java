public class President 
{
    private static President instance;
    private String nom;

    private President(String nom) 
    {
        this.nom = nom;
    }

    public static President getInstance() 
    {
        if (instance == null) 
        {
            instance = new President("Emmanuel Macron");
        }
        return instance;
    }

    public void QuiEstLePrez(String decision) 
    {
        System.out.println("c'est moi " + nom);
    }
}