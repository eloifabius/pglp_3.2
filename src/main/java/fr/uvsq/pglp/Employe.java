package fr.uvsq.pglp;

public class Employe extends AllEmploye{
    final private int salaire=1500;
    private int startYear;
    public Employe(int startYear){
        this.startYear=startYear;
    }

    public double salaire(){
//TOOO Auto-generated method stub
        return salaire+(2020-this.startYear)*20;
    }
}