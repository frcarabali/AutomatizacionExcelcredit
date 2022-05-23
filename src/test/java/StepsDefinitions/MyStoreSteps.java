package StepsDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import Acciones.MyStoreAccion;
import CommonFuntions.BaseTest;
import CommonFuntions.Navegador;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class MyStoreSteps {
	
	WebDriver driver;
	Logger log = Logger.getLogger(NavegadorSteps.class);	
	MyStoreAccion  mystorepages;	
	BaseTest baseTest;
	
	public MyStoreSteps() {		
		//super(driver);
		this.driver = Navegador.driver;				
		 mystorepages = new MyStoreAccion(driver);		
	}
	
	@Cuando("El usuario ingresa a la opcion Sign in")
	public void  ElusuarioingresaalaopcionSignin() {
		 mystorepages.ingresosingin();
	}
	
	@Y("Crea el usuario con el {string}")
	public void Creaelusuarioconel (String correo) throws InterruptedException {
		 mystorepages.IngresaCorreo(correo);
	}

	@Y("llena el formulario de registro {string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}{string}")
	public void llenaelformularioderegistro(String correo,String nombre,String apellido,String password,String dia,String mes,String ano,String empresa,String company,String direccion,String city,String state,String postalcode,String mobilephone,String alias) throws InterruptedException {
		 mystorepages.LlenaFormulario(correo,nombre,apellido,password,dia,mes,ano,empresa,company,direccion,city,state,postalcode,mobilephone,alias);
	}
	
	@Y("se registra el nuevo usuario y se valida que se realiza el login {string}")
	public void seregistraelnuevousuarioysevalidaqueserealizaellogin(String nombre) throws InterruptedException {
		 mystorepages.RegistroUsuario(nombre);
	}
	
	@Y("El usuario ingresa la busqueda elemento {string}{string}")
	public void Elusuarioingresalabusquedaelemento(String elemento,String Producto){
		 mystorepages.BusquedaElemento(elemento,Producto);
	}
	
	@Y("adicciona el producto al carrito")
	public void adiccionelproductoalcarrito() throws InterruptedException {
		 mystorepages.AdicionaCarrito();
	}
	
	@Y("agrega la cantidad de productos requeridos {int}")
	public void agregalacantidaddeproductosrequeridos(int cantidad) throws InterruptedException {
		 mystorepages.adicionarproductos(cantidad);
	}
	
	@Y("hace clic en proceed checkout")
	public void haceclicenproceedcheckout() throws InterruptedException {
		 mystorepages.hacerproceedcheckout();
	}
	
	@Y("elimina el producto")
	public void eliminaelproducto() throws InterruptedException {
		 mystorepages.EliminarProducto();
	}
	
	
	
	
}
