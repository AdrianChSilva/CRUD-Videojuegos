# CRUD-Videojuegos

El trabajo CRUD intentará emular una base de datos de una tienda de videojuegos (obviamente con limitaciones).~~Donde se almacenará únicamente los videojuegos exclusivos, de las consolas de vigente generación, de cada plataforma: Xbox, PlayStation y Nintendo. Vamos a obviar, de momento, la plataforma del PC ya que se extendería hasta (casi) el infinito.~~.Almacenaremos todos los videojuegos, sin importar plataforma.

También se almacenará en una tabla la información de los socios de la tienda, el cual podrá realizar compras.

*Como podemos observar, faltan opciones como la reserva de videojuegos que están por salir, alquiler de videojuegos, tabla de videojuegos disponibles de segunda mano y para alquilar,etc. Como ya dije desde el principio, hay limitaciones ya que no es la intencion emular a la perfeccion la BBDD de una tienda de videojuegos.*


## Ejemplo de las tablas:

### Videojuegos:
+ CodVideojuego (PK)
+ Titulo
+ Plataforma
+ Stock
+ Desarrolladora
+ Publisher
    
    
### Socios:
+ CodSocio (PK)
+ DNI
+ Nombre
+ Apellidos
+ Teléfono
+ Email
+ Dirección
+ Asociado (persona proporcionada por el socio al cual permite recoger sus compras en su nombre)
    
### Factura:
+ CodFactura (PK)
+ Fecha-de-Compra
+ CodSocio (PK)
+ CodVideojuego (FK)
+ Cantidad

### DeT_Factura:
+ CodDetFact (PK)
+ CodVideojuegos(FK)
+ Cantidad
+ Precio
+ Factura_idFactura

## Imágenes de la aplicación
### Index
<img src="Imagenes/index.png">

### Facturas
<img src="Imagenes/PagFacturas.png">

### Socios
<img src="Imagenes/PagSocios.png">

### Videojuegos
<img src="Imagenes/PagVideojuegos.png">
