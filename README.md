# TP-LP3-S2-2022
El proyecto consiste en realizar un sistema backend con servicios REST, esta inspirado en el trabajo https://github.com/alefq/lp3-template-tp 
### Integrantes
+ Carlos Troya
+ Daniela Cristaldo
### Herramientas utilizadas
<img align="left" alt="Visual Studio Code" width="26px" src="https://raw.githubusercontent.com/github/explore/80688e429a7d4ef2fca1e82350fe8e3517d3494d/topics/visual-studio-code/visual-studio-code.png" />
<img align="left" alt="Git" width="26px" src="https://raw.githubusercontent.com/github/explore/80688e429a7d4ef2fca1e82350fe8e3517d3494d/topics/git/git.png" />
<img align="left" alt="GitHub" width="26px" src="https://raw.githubusercontent.com/github/explore/78df643247d429f6cc873026c0622819ad797942/topics/github/github.png" />
<img align="left" alt="Terminal" width="26px" src="https://raw.githubusercontent.com/github/explore/80688e429a7d4ef2fca1e82350fe8e3517d3494d/topics/terminal/terminal.png" />
<br />
<br />

## URL principal
En la URL del insomnia se debe colocar http://localhost:8080/{nuevoRequest}.
## Funcionamiento del programa
Se puede descargar el archivo de nombre InsomniaRestClientConfig para tener un ejemplo de los request.      
Al ejecutar Application.java como Spring Boot App se crea la base de datos.     
Se recomienda agregar todos los datos primero de los respectivos CRUD.   
  
## CRUDS 
### Usuarios
#### Ver usuarios
Visualiza todos los usuarios cargados en la base de datos. 
Es un request de tipo GET, con URL: http://localhost:8080/usuario
#### Ver usuarios por Rol
Visualiza todos los usuarios del rol especificado en el link, que estan cargados en la base de datos. 
Es un request de tipo GET, con URL: http://localhost:8080/usuario/rol_usuario
##### Roles
+ ADMINISTRADOR
+ DESPACHANTE
+ AUDITOR
+ TRANSPORTISTA
#### Agregar Despachante
Es un request de tipo POST, con URL: http://localhost:8080/usuario/despachante.  Se debe introducir el siguiente formato JSON para crear el despachante.
```json
{
	"id":"Identificador del despachante.",
	"userName":"Nombre de usuario.",
	"userEmail":"Email.",
	"hash":"Contraseña.",
	"idOrganizacion":"Identificador de la organizacion a la que pertenece."
}
```
#### Agregar Auditor
Es un request de tipo POST, con URL: http://localhost:8080/usuario/auditor.  Se debe introducir el siguiente formato JSON para crear el auditor.
```json
{
	"id":"Identificador del auditor.",
	"userName":"Nombre de usuario.",
	"userEmail":"Email.",
	"hash":"Contraseña.",
	"idOrganizacion":"Identificador de la organizacion a la que pertenece."
}
```
### Agregar Transportista
Es un request de tipo POST, con URL: http://localhost:8080/usuario/transportista.  Se debe introducir el siguiente formato JSON para crear el transportista.
```json
{
	"id":"Identificador del transportista.",
	"userName":"Nombre de usuario.",
	"userEmail":"Email.",
	"hash":"Contraseña.",
	"idOrganizacion":"Identificador de la organizacion a la que pertenece.",
	"contratante":"Nombre de la persona que contrato al transportista",
	"idAlmacen": "Identificador del almacen que pertenece al transportista",
	"idTransporte":"Identificador del transporte que pertenece al transportista"
}
```
#### Agregar Administrador
Es un request de tipo POST, con URL: http://localhost:8080/usuario/administrador.  Se debe introducir el siguiente formato JSON para crear el administrador.
```json
{
	"id":"Identificador del administrador.",
	"userName":"Nombre de usuario.",
	"userEmail":"Email.",
	"hash":"Contraseña.",
	"idOrganizacion":"Identificador de la organizacion a la que pertenece."
}
```

#### Actualizar Despachante
Es un request de tipo PUT, con URL: http://localhost:8080/usuario/despachante.  Se debe introducir el siguiente formato JSON para actualizar el despachante.
```json
{
	"id":"Identificador del despachante que se desea modificar.",
	"userName":"Nombre de usuario.",
	"userEmail":"Email.",
	"hash":"Contraseña.",
	"idOrganizacion":"Identificador de la organizacion a la que pertenece."
}
```
#### Actualizar Auditor
Es un request de tipo PUT, con URL: htpp://localhost:8080/usuario/auditor.  Se debe introducir el siguiente formato JSON para actualizar el auditor.
```json
{
	"id":"Identificador del auditor que se desea modificar.",
	"userName":"Nombre de usuario.",
	"userEmail":"Email.",
	"hash":"Contraseña.",
	"idOrganizacion":"Identificador de la organizacion a la que pertenece."
}
```
### Actualizar Transportista
Es un request de tipo PUT, con URL: http://localhost:8080/usuario/transportista.  Se debe introducir el siguiente formato JSON para actualizar el transportista.
```json
{
	"id":"Identificador del transportista que se desea modificar.",
	"userName":"Nombre de usuario.",
	"userEmail":"Email.",
	"hash":"Contraseña.",
	"idOrganizacion":"Identificador de la organizacion a la que pertenece.",
	"contratante":"Nombre de la persona que contrato al transportista",
	"idAlmacen": "Identificador del almacen que pertenece al transportista",
	"idTransporte":"Identificador del transporte que pertenece al transportista"
}
```
#### Actualizar Administrador
Es un request de tipo PUT, con URL: http://localhost:8080/usuario/administrador.  Se debe introducir el siguiente formato JSON para actualizar el administrador.
```json
{
	"id":"Identificador del administrador que se desea modificar.",
	"userName":"Nombre de usuario.",
	"userEmail":"Email.",
	"hash":"Contraseña.",
	"idOrganizacion":"Identificador de la organizacion a la que pertenece."
}
```
#### Eliminar usuario por id
Es un request de tipo DELETE, con URL: http://localhost:8080/usuario/id_usuario
### Organizaciones
#### Ver organizaciones
Visualiza todos las organizaciones cargados en la base de datos.
Es un request de tipo GET, con URL: http://localhost:8080/organizacion
#### Ver organizaciones por tipo
Visualiza todos las organizaciones por tipo cargados en la base de datos.
Es un request de tipo GET, con URL: http://localhost:8080/organizacion/tipo_organizacion
#### Agregar organizaciones
Es un request de tipo POST, con URL: http://localhost:8080/organizacion. Se debe introducir el siguiente formato JSON para agregar la organizacion.
```json
{
	"id":"Identificador de la organizacion",
	"nombre": "Nombre de la organizacion",
	"tipo": "Tipo de organizacion",
	"ubicacion": "Ubicacion de la organizacion",
	"telefono": "Telefono de la organizacion"
}
```
#### Actualizar organizaciones
Es un request de tipo PUT, con URL: http://localhost:8080/organizacion. Se debe introducir el siguiente formato JSON para actualizar la organizacion.
```json
{
	"id":"Identificador de la organizacion que se desea actualizar",
	"nombre": "Nombre de la organizacion",
	"tipo": "Tipo de organizacion",
	"ubicacion": "Ubicacion de la organizacion",
	"telefono": "Telefono de la organizacion"
}
```
#### Eliminar organizaciones por id
Es un request de tipo DELETE, con URL: http://localhost:8080/organizacion/id_organizacion
### Impuesto
#### Ver impuestos
Visualiza todos los impuesto cargados en la base de datos.
Es un request de tipo de GET, con URL: htpp://localhost:8080/impuesto
#### Agregar impuesto
Es un request de tipo de POST, con URL: http://localhost:8080/impuesto. Se debe introducir el siguiente formato JSON para agregar el impuesto.
```json
{
	"id":"Identificador del impuesto",
	"tipo":"Tipo de impuesto",
	"porcentaje":"Porcentaje del impuesto"
}
```
#### Actualizar impuesto
Es un request de tipo PUT, con URL: htpp://localhost:8080/impuesto. Se debe introducir el siguiente formato JSON para actualizar el impuesto.
```json
{
	"id":"Identificador del impuesto que se desea actualizar",
	"tipo":"Tipo de impuesto",
	"porcentaje":"Porcentaje del impuesto"
}
```
#### Eliminar impuesto por id
Es un request de tipo DELETE, con URL: http://localhost:8080/impuesto
### Pedido Transporte
#### Ver pedidos de transporte
Visualiza todos los pedidos de transporte cargados en la base de datos.
Es un request tipo de GET, con URL: htpp://localhost:8080/pedidoTransporte
#### Agregar pedido de transporte
Es un request tipo de POST, con URL: http://localhost:8080/pedidoTransporte. Se debe introducir el siguiente formato JSON para agregar el pedido de transporte .
```json
{
   	"id":"Identificador del pedido de Transporte"
	"transportistaId":"Identificador del transportista",
	"almadenamientoId":"Identificador del almacenamiento",
	"origen":"Pais de origen que se desea transportar los productos",
	"destino":"Pais destino que se desea transportar los productos",
	"estado":"Estado del pedido"
}
```
#### Actualizar pedido de transporte
Es un request tipo de PUT, con URL: http://localhost:8080/pedidoTransporte. Se debe introducir el siguiente formato JSON para actualizar el pedido de transporte.
```json
{
   	"id":"Identificador del pedido de Transporte a actualizar",
	"transportistaId":"Identificador del transportista",
	"almadenamientoId":"Identificador del almacenamiento",
	"origen":"Pais de origen que se desea transportar los productos",
	"destino":"Pais destino que se desea transportar los productos",
	"estado":"Estado del pedido"
}
```
#### Eliminar pedido de transporte por id
Es un request de tipo DELETE, con URL: http://localhost:8080/pedidoTransporte
### Producto
#### Ver productos
Visualiza todos los productos cargados en la base de datos.
Es un request tipo de GET, con URL: htpp://localhost:8080/producto
#### Ver productos por Almacenamiento
Visualiza todos los productos que estan en un determinado almacenamiento, cargados en la base de datos.
Es un request tipo de GET, con URL: htpp://localhost:8080/producto/id_almacenamiento
#### Agregar producto
Es un request tipo de POST, con URL: htpp://localhost:8080/producto. Se debe introducir el siguiente formato JSON para agregar el producto.
```json
{
	"id":"Identificador del producto",
	"nombre":"Nombre del producto",
	"tipo":"Tipo de producto",
	"descripcion":"Descripcion de producto",
	"precio":"Precio del producto",
	"cantidad": "Cantidad de productos",
	"procedencia":"Pais de procedencia del producto",
	"peso":"Peso del producto",
	"flete":"Costo flete del producto",
	"almacenamientoId":"Identificador del almacenamiento",
	"idImpuestos":"Identificadores de impuesto"
}
```
#### Actualizar producto
Es un request tipo de PUT, con URL: http://localhost:8080/producto. Se debe introducir el siguiente formato JSON para actualizar el producto.
```json
{
	"id":"Identificador del producto que se desea actualizar",
	"nombre":"Nombre del producto",
	"tipo":"Tipo de producto",
	"descripcion":"Descripcion de producto",
	"precio":"Precio del producto",
	"cantidad": "Cantidad de productos",
	"procedencia":"Pais de procedencia del producto",
	"peso":"Peso del producto",
	"flete":"Costo flete del producto",
	"almacenamientoId":"Identificador del almacenamiento",
	"idImpuestos":"Identificadores de impuesto"
}
```
#### Eliminar producto
Es un request de tipo DELETE, con URL: http://localhost:8080/producto
##Generar Presupuesto
Es un request del tipo GET, CON URL :http://localhost:8080/producto/generarPresupuesto/{almacenamientoId}.
Siendo almacenamientoId el id del almacenamiento que contiene la lista de productos del presupuesto que deseemos calcular.
El request nos retorna los siguiente:
```json
{
	"total": "El costo total del presupuesto",
	"totalImpuesto": "Suma del costo de los impuestos",
	"totalCosto": "Suma del precio de todos los items",
	"totalFlete": "La suma del flete de todos los items",
	"listItems": ["En esta lista se encuentran los productos del presupuesto"
	]
}
```
