
package org.all.tarjetadigital;

import javax.jws.WebService;

@WebService(endpointInterface = "org.all.tarjetadigital.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }

	@Override
	public String Saybye(String nombre) {
		return "Adios: " + nombre;
	}
}

