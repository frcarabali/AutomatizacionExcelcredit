#language: es
Característica: Registro login y compra de arituclos automation pratice

  Antecedentes: 
    Dado Un usuario ingresa a la pagina automation pratice
      | http://automationpractice.com/index.php | Chrome  |
      | http://automationpractice.com/index.php | Firefox |

  @Registro
  Esquema del escenario: Crear un usuario
    Cuando El usuario ingresa a la opcion Sign in
    Y Crea el usuario con el <correo>
    Y llena el formulario de registro <correo><nombre><apellido><password><dia><mes><ano><empresa><company><direccion><city><state><postalcode><mobilephone><alias>
    Y se registra el nuevo usuario y se valida que se realiza el login <nombre>

    Ejemplos: 
      | correo                   | nombre  | apellido   | password        | dia  | mes | ano    | empresa       | company       | direccion      | city     | state    | postalcode | mobilephone  | alias    |
      | "fcarabli@asxccredt.co"  | "fredi" | "carabali" | "Colombia.2022" | "22" | "5" | "2006" | "Excelcredit" | "Excelcredit" | "Box company " | "Bogota" | "Kansas" | "96412"    | "3115672420" | "junior" |
      | "fcarabli@asxcacredt.co" | "fredi" | "carabali" | "Colombia.2022" | "22" | "5" | "2006" | "Excelcredit" | "Excelcredit" | "Box company " | "Bogota" | "Kansas" | "96412"    | "3115472420" | "juniol" |

  @BusquedaProducto
  Esquema del escenario: Realizar una busqueda y anadir al carrito
    Cuando El usuario ingresa la busqueda elemento <Elemento><Producto>
    Y adicciona el producto al carrito
    Y hace clic en proceed checkout

    Ejemplos: 
      | Elemento | Producto                |
      | "summer" | "Printed Chiffon Dress" |
      | "summer" | "Printed Chiffon Dress" |

  @BusquedaProductoGeneral
  Esquema del escenario: Realizar una busqueda y anadir al carrito mas de un elemento
    Cuando El usuario ingresa la busqueda elemento <Elemento><Producto>
    Y agrega la cantidad de productos requeridos <Productos>
    Y adicciona el producto al carrito
    Y hace clic en proceed checkout

    Ejemplos: 
      | Elemento | Producto                      | Productos |
      | "short"  | "Faded Short Sleeve T-shirts" |         3 |
      | "short"  | "Faded Short Sleeve T-shirts" |         3 |

  @Eliminarproducto
  Esquema del escenario: Anadir un producto al carrito y eliminarlo
    Cuando El usuario ingresa la busqueda elemento <Elemento><Producto>
    Y adicciona el producto al carrito
    Y hace clic en proceed checkout
    Y elimina el producto

    Ejemplos: 
      | Elemento | Producto                      |
      | "short"  | "Faded Short Sleeve T-shirts" |
      | "short"  | "Faded Short Sleeve T-shirts" |
