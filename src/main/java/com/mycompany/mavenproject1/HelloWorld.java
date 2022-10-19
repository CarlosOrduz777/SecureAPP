
package com.mycompany.mavenproject1;

import static spark.Spark.*; 

/**
 *
 * @author carlos.orduz
 */
public class HelloWorld {
    public static void main(String[] args) {

        secure("keystores/ecikeystore.p12", "123456", null, null);
        port(5000);
        get("/hello", (req, res) -> "Hello World");
 }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
