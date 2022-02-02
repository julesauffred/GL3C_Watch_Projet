public class Montre {

    /*
        montre(heure minute)
        montre(Montre montre)
        Addminute()
        creait une montre 9H25 / clone de la premiere
     */
    // attributs de la classe
    private int Heur;
    private  int minute;
    private boolean IsBusy;
    //methodes de la classe

    public Montre(int heur,int minute){

        if (heur>24 || minute>60)
        {
            System.out.println("impossible de créer une heure superieur à 24 ");
        }else{
            this.Heur=heur;
            this.minute=minute;
        }
    }

    public Montre(Montre montre){
        this.Heur=montre.Heur;
        this.minute=montre.minute;
    }

    public void AddMinute(Montre montre){
        if((montre.minute+1)>60){
            if ((montre.Heur+1)>24){
                montre.Heur=1;
                montre.minute=00;
            }
            else {
                montre.Heur=montre.Heur+1;
                montre.minute=00;
            }

        }
        else{
            montre.minute=this.minute+1;
        }

    }


    public static void main(String[] args){
        Montre MaMontre= new Montre(24,60);
        Montre Copy = new Montre(MaMontre);
        Personne jules = new Personne("jules");
        jules.PorterMontrer(MaMontre);
        System.out.println("***********Verifie si l'utilisateur a une montre ************ ");
        jules.IsPersonHaveWatch();
        System.out.println("***********demande l'heure à quelqu'un  **************** ");
        System.out.println("il est : "+jules.AskTime());
        // on lui retire sa montrer
        System.out.println("***************ajout d'une minute à la montre **************** ");
        MaMontre.AddMinute(jules.getMontre());
        System.out.println("***********demande l'heure à quelqu'un  **************** ");
        System.out.println("il est : "+jules.AskTime());
        jules.RemoveWatch();
        System.out.println("***********Verifie si l'utilisateur a encore une montre ************ ");
        jules.IsPersonHaveWatch();

    }


    //quelques acceseur


    public String getTime(){
        return this.Heur+"H"+this.minute;
    }
    public void setBusy(){
        this.IsBusy=true;
    }

    public Boolean getIsBussy(){
        return  this.IsBusy;
    }
}
