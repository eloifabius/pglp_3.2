package fr.uvsq.pglp;

public class Vendeur extends AllEmploye{
    final private int salaire=1500;

    private int commission;
    public Vendeur(int commission){
        this.commission=commission;
    }

    public double salaire(){
        //TODO Auto-generated method stub
        return salaire+commission;
    }
}
