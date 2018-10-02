
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Pierre-Antoine RAMANE
 */
@Embeddable
@Table(name = "client")
public class Client {

    @Column(nullable = false, length = 8, unique = true)
    @Id
    private int _numClient;
    private String _nomClient;
    private String _prenomClient;
    private Date _dateNaissanceClient;

    public Client(int numClient, String nomClient, String prenomClient, Date dateNaissanceClient){
        this._numClient = numClient;
        this._nomClient = nomClient;
        this._prenomClient = prenomClient;
        this._dateNaissanceClient = dateNaissanceClient;    
    }
    
    public int getNumClient() {
        return this._numClient;
    }

    public String getNomClient() {
        return this._nomClient;
    }

    public String getPrenomClient() {
        return this._prenomClient;
    }

    public Date getDateNaissanceClient() {
        return this._dateNaissanceClient;
    }

    public void setNumClient(int _numClient) {
        this._numClient = _numClient;
    }

    public void setNomClient(String _nomClient) {
        this._nomClient = _nomClient;
    }

    public void setPrenomClient(String _prenomClient) {
        this._prenomClient = _prenomClient;
    }

    public void setDateNaissanceClient(Date _dateNaissanceClient) {
        this._dateNaissanceClient = _dateNaissanceClient;
    }
    
    
}
