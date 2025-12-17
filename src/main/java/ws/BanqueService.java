package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {
    @WebMethod
    public double counvertir(@WebParam double montant) {
        return montant * 10;
    }

    @WebMethod
    public Compte consulterCompte(@WebParam int code) {
        return (new Compte(code, new Date(), (1000 + Math.random() * 900)));
    }

    @WebMethod
    public List<Compte> listeCompte() {
        return List.of(
                new Compte(1, new Date(), Math.random() * 900),
                new Compte(2, new Date(), Math.random() * 900),
                new Compte(3, new Date(), Math.random() * 900)
        );
    }

}
