package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        /* se connecter a la bd */
        System.out.println("version BD");

        double temp=Math.random()*40;
        return temp;
    }
}
