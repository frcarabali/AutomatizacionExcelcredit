package Acciones;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import CommonFuntions.BaseTest;
import Pages.MystorePages;


public class MyStoreAccion extends BaseTest {
	
	WebDriver driver;	
	MystorePages  mystorepages;	

	public MyStoreAccion(WebDriver driver) {
		super(driver);
		 mystorepages = new MystorePages(driver);
	}

	
	public void ingresosingin() {	
		esperaExplicita( mystorepages.Signin);
		hacerClick( mystorepages.Signin);
		esperaExplicita( mystorepages.CrearCuenta);
	}
 	
	public void IngresaCorreo(String correo) throws InterruptedException {
        EscribirElemento( mystorepages.EmailAddress, correo);
        hacerClick( mystorepages.CrearCuenta);  
	}
    
    public void LlenaFormulario(String correo,String nombre,String apellido,String password,String dia,String mes,String ano,String empresa,String company,String direccion,String city,String state,String postalcode,String mobilephone,String alias) throws InterruptedException {
    	esperaExplicita( mystorepages.Title);
    	hacerClick( mystorepages.Title);
    	EscribirElemento( mystorepages.FirstName,nombre);
    	EscribirElemento( mystorepages.LastName,apellido);
    	Clear( mystorepages.Email);
    	EscribirElemento( mystorepages.Email,correo);
    	EscribirElemento( mystorepages.Password,password);
    	EscribirElemento( mystorepages.Empresa,empresa);
    	EscribirElemento( mystorepages.Direccion,direccion);
    	EscribirElemento( mystorepages.Ciudad,city);
    	hacerClick( mystorepages.Estado);
    	selectByVisibleText( mystorepages.Estado,state);
    	EscribirElemento( mystorepages.CodigoPostal,postalcode);
    	EscribirElemento( mystorepages.TelefonoMovil,mobilephone);
    	Clear( mystorepages.alias);
    	EscribirElemento( mystorepages.alias,alias);
    }
    
    public void RegistroUsuario(String nombre) throws InterruptedException {
    	 hacerClick( mystorepages.Register);
    	 esperaExplicita( mystorepages.LogOut);
    	 BuscarTextoPage(nombre);
    }
    
    public void BusquedaElemento(String elemento,String producto) {
    	 EscribirElemento( mystorepages.Busqueda, elemento);
         hacerClick( mystorepages.Buscar);
         hacerClick(By.xpath("//a[contains(text(),'"+producto+"') and contains(@title,'"+producto+"')]"));
    }
    
    public void AdicionaCarrito() throws InterruptedException {
    	 Hacer_scroll( mystorepages.addCart);
    	 hacerClick( mystorepages.addCart);
    	 esperaExplicita( mystorepages.procedcheckout);
    	
    }
    
    
    public void adicionarproductos(int cantidad) throws InterruptedException {
   	    while(cantidad>0) {
   	    	cantidad--;
   	    	hacerClick( mystorepages.mas);
   	    }
   }
    
    public void hacerproceedcheckout() throws InterruptedException {
     	 hacerClick( mystorepages.procedcheckout);
   }
    
    public void EliminarProducto() throws InterruptedException {
    	esperaExplicita( mystorepages.Remover);
    	Hacer_scroll( mystorepages.Remover);
    	hacerClick( mystorepages.Remover);
    	esperaExplicita( mystorepages.AlertaProducto);
    	assertEstaPresenteElemento( mystorepages.AlertaProducto);
    }
}
