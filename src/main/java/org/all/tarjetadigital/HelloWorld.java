package org.all.tarjetadigital;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
    
    String Saybye(String nombre);
}

