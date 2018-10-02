
import javax.persistence.*;

/**
 *
 * @author Pierre-Antoine RAMANE
 */
@Entity
@Table(name = "bankbranch")
public class BankBranch {

    @Column(nullable = false, length = 27, unique = true)
    @Id
    private int codeAgence;
    private String adresseAgence;
    private int codePostalAgence;
    private String villeAgence;

    public BankBranch(int codeAgence, String adresseAgence, int codePostalAgence, String villeAgence) {
        this.codeAgence = codeAgence;
        this.adresseAgence = adresseAgence;
        this.codePostalAgence = codePostalAgence;
        this.villeAgence = villeAgence;
    }

    public int getCodeAgence() {
        return codeAgence;
    }

    public void setCodeAgence(int codeAgence) {
        this.codeAgence = codeAgence;
    }

    public String getAdresseAgence() {
        return adresseAgence;
    }

    public void setAdresseAgence(String adresseAgence) {
        this.adresseAgence = adresseAgence;
    }

    public int getCodePostalAgence() {
        return codePostalAgence;
    }

    public void setCodePostalAgence(int codePostalAgence) {
        this.codePostalAgence = codePostalAgence;
    }

    public String getVilleAgence() {
        return villeAgence;
    }

    public void setVilleAgence(String villeAgence) {
        this.villeAgence = villeAgence;
    }
    
    

}
