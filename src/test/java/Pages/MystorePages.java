package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MystorePages {
	WebDriver driver;
	
	//Componentes iniciales
		public By Signin;
		public By EmailAddress;
		public By CrearCuenta;
		public By Title;
		public By FirstName;
		public By LastName;
		public By Email;
		public By Password;
		public By Dia;
		public By Mes;
		public By Ano;
		public By Nombre;
		public By Apellido;
		public By Empresa;
		public By Direccion;
		public By Ciudad;
		public By Estado;
		public By CodigoPostal;
		public By Pais;
		public By TelefonoMovil;
		public By Direcciones;
		public By alias;
		public By Busqueda;
		public By Buscar;
		public By addCart;
		public By Register;
		public By LogOut;
		public By Elemento;
		public By procedcheckout;
		public By mas;
		public By Carrito;
		public By Remover;
		public By AlertaProducto;
				
		public MystorePages(WebDriver driver) {
			this.driver = driver;		
			Signin = By.xpath("//a[@class='login']");
			EmailAddress = By.id("email_create");		
			CrearCuenta= By.id("SubmitCreate");
			Title = By.xpath("//input[@id='id_gender1']");
			FirstName= By.id("customer_firstname");;
			LastName= By.id("customer_lastname");;
			Email= By.id("email");;
			Password= By.id("passwd");;
			Dia= By.id("days");;
			Mes= By.id("months");;
			Ano= By.id("years");;
			Nombre= By.id("firstname");;
			Apellido= By.id("lastname");;
			Empresa= By.id("company");;
			Direccion= By.id("address1");;
			Ciudad= By.id("city");
			Estado= By.id("id_state");;
			CodigoPostal= By.id("postcode");;
		    Pais= By.id("id_country");;
			TelefonoMovil= By.id("phone_mobile");;
			alias= By.id("alias");
			Register= By.xpath("//*[text()='Register']");
			LogOut= By.xpath("//a[@title='Log me out']");
			Busqueda=By.id("search_query_top");
			Buscar=By.xpath("//button[@type='submit' and @name='submit_search']");
			addCart=By.xpath("//span[text()='Add to cart']");
			procedcheckout=By.xpath("//span[contains(text(),'Proceed to checkout')]");
			mas=By.xpath("//*[@id=\"quantity_wanted_p\"]");
			Carrito=By.xpath("//a[@title='View my shopping cart']");
			Remover=By.xpath("//*[@id=\"1_1_0_0\"]");			
			AlertaProducto=By.xpath("//p[text()='Your shopping cart is empty.']");
					
		}	
}
