public class SessionUtilisateur 
{
    private static SessionUtilisateur instance;
    private String utilisateur;
    private boolean connecte = false;

    private SessionUtilisateur() {}

    public static SessionUtilisateur getInstance() 
    {
        if (instance == null) 
        {
            instance = new SessionUtilisateur();
        }
        return instance;
    }

    public void connecter(String utilisateur) 
    {
        this.utilisateur = utilisateur;
        this.connecte = true;
        System.out.println(utilisateur + " connecté.");
    }

    public void deconnecter() 
    {
        System.out.println(utilisateur + " déconnecté.");
        this.utilisateur = null;
        this.connecte = false;
    }
}