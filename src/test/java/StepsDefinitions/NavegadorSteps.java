package StepsDefinitions;

import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import Acciones.DriverAccion;
import CommonFuntions.BaseTest;
import CommonFuntions.Navegador;

import cucumber.api.java.es.Dado;
;

public class NavegadorSteps {
	
	WebDriver driver;
	Logger log = Logger.getLogger(NavegadorSteps.class);	
	MyStoreSteps retanqueoasesorsteps;
	DriverAccion loginaccion;
	BaseTest baseTest;
	private List<String> Variables;
	static int a=0;
	
	public NavegadorSteps() {						
		this.driver=Navegador.driver;		
		loginaccion=new DriverAccion(driver);
	}
	
	@Dado("^Un usuario ingresa a la pagina automation pratice$")
	public void Unusuarioingresaalapaginaautomationpratice(List<String> Valores) throws Exception {

		this.Variables=Valores;		
		String Url=null;
		String Navegador=null;
		
	   	for(int i=1;i!=a;i++) {					
			Url=Variables.get(a);
			Navegador=Variables.get(a+1);
			a=(a+1)+1;	
			i=a-1;
		}
		
		try {			
			driver = loginaccion.iniciarSesion(Url,Navegador);  //*********************************************************
			
		} catch (Exception e) {
			log.error("#ERROR###"+e);
			throw new Exception();
		}
	}

	

}
