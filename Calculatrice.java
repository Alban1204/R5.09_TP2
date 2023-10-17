public class Calculatrice 
{
    private string calcul;
    private int i = 0;

    public string entreeClavier(string chaine)
    {
        this.calcul = chaine;
    }

    public boolean estUnchiffre()
    {
        if (calcul.charAt(i) >= 0 && <=9)
        {
            return true;
        }
        return false;
    }

    public boolean addition()
    {
        if (calcul.charAt(i) == '+')
        {
            return true;
        }
        return false;
    }

    public boolean multiplication
    {
        if (calcul.charAt(i) == '*')
        {
            return true;
        }
        return false;
    }
}
