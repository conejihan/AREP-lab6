package edu.escuelaing.arep.app;
import static spark.Spark.*;

public class App
{

    public static void main( String[] args )
    {
        port(getPort());
        secure("keystores/ecikeystore.p12","123456","keystores/myTrustStore","nicolas123");
        get("/information", (req, res) -> "Acceso Autorizado");
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5001;
    }}
