package sistema_de_vendas;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectionMongo {
    
    private DB db;
    private DBCollection tabelaClientes;
    private DBCollection tabelaProdutos;
    
    public void startMongo(){
        try {

                Mongo mongo = new Mongo("LocalHost", 27017);
                db = mongo.getDB("bancodedados");
                tabelaClientes = db.getCollection("clientes");
                tabelaProdutos = db.getCollection("produtos");

            } catch (UnknownHostException ex) {
                Logger.getLogger(ConectionMongo.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public DBCollection returnTableClientes(){
        return tabelaClientes;
    }
    
    public DBCollection returnTableProdutos(){
        return tabelaProdutos;
    }
    
}
