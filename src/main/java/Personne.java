public class Personne {

    //les attributs de la classe
    private String nom;
    private Boolean IsHaveWach;
    private Montre montre;

    //methodes de la classe
    public Personne(String nom){
        this.nom=nom;
        IsHaveWach=false;
        montre=null;
    }
    public Boolean getIsHaveWatch(){
        return this.IsHaveWach;
    }
    public Montre getMontre(){
        return  this.montre;
    }
     public void PorterMontrer(Montre montre){
         if(IsHaveWach){
             System.out.println("vous avez déjà une montrer");
         }
         else if(montre.getIsBussy()){
             System.out.println("la montrer appartient déjà à quelqu'un ");
         }
         else{
             this.montre = new Montre(montre);
             montre.setBusy();
             this.IsHaveWach=true;
         }

     }
     public void RemoveWatch(){
            if (!this.IsHaveWach){
                System.out.println(this.nom+" n'as pas de montre 😢");
            }
            else {
                this.IsHaveWach=false;
                this.montre=null;

            }

     }

     public String AskTime(){
            if (IsHaveWach){
                return this.montre.getTime();
            }
            else{
                return  "";
            }
     }

     public void IsPersonHaveWatch(){
        if (this.IsHaveWach){
            System.out.println(this.nom+" as déjà une montre 😒");
        }
        else {
            System.out.println(this.nom+" n'as pas de montre 😢");
        }
     }
}
