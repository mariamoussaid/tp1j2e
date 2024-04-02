package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args){
        /* injection de dependances par instanciation statique */
        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("resultat:"+metier.calcul());
    }
}
