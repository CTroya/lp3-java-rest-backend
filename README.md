# TP-LP3-S2-2022
El proyecto consiste en realziar un sistema backend con servicios REST.
### Integrantes
+ Carlos Troya
+ Daniela Cristaldo

## URL principal
En la URL del insomnia se debe colocar htpp://localhost:8080/{nuevo request}.
## Funcionamiento del programa
## CRUDS 
### Usuarios
#### Ver usuarios
Visualiza todos los usuarios cargados en la base de datos. 
Es un request de tipo GET, con URL: htpp://localhost:8080/usuario
#### Ver usuarios por Rol
Visualiza todos los usuarios del rol especificado en el link, que estan cargados en la base de datos. 
Es un request de tipo GET, con URL: htpp://localhost:8080/usuario/rol_usuario
##### Roles
+ ADMINISTRADOR
+ DESPACHANTE
+ AUDITOR
+ TRANSPORTISTA
#### Agregar Despachante
Es un request de tipo POST, con URL: htpp://localhost:8080/usuario/despachante.  Se debe introducir el siguiente formato JSON para crear el despachante.
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
Es un request de tipo POST, con URL: htpp://localhost:8080/usuario/auditor.  Se debe introducir el siguiente formato JSON para crear el auditor.
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
Es un request de tipo POST, con URL: htpp://localhost:8080/usuario/transportista.  Se debe introducir el siguiente formato JSON para crear el transportista.
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
Es un request de tipo POST, con URL: htpp://localhost:8080/usuario/administrador.  Se debe introducir el siguiente formato JSON para crear el administrador.
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
Es un request de tipo PUT, con URL: htpp://localhost:8080/usuario/despachante.  Se debe introducir el siguiente formato JSON para actualizar el despachante.
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
Es un request de tipo PUT, con URL: htpp://localhost:8080/usuario/transportista.  Se debe introducir el siguiente formato JSON para actualizar el transportista.
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
#### Actualiar Administrador
Es un request de tipo PUT, con URL: htpp://localhost:8080/usuario/administrador.  Se debe introducir el siguiente formato JSON para actualizar el administrador.
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
Es un request de tipo DELETE, con URL: htpp://localhost:8080/usuario/id_usuario
### Organizaciones
#### Ver organizaciones
Visualiza todos las organizaciones cargados en la base de datos.
Es un request de tipo GET, con URL: htpp://localhost:8080/organizacion
#### Ver organizaciones por tipo
Visualiza todos las organizaciones por tipo cargados en la base de datos.
Es un request de tipo GET, con URL: htpp://localhost:8080/organizacion/tipo_organizacion
#### Agregar organizaciones
Es un request de tipo POST, con URL: htpp://localhost:8080/organizacion. Se debe introducir el siguiente formato JSON para agregar la organizacion.
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
Es un request de tipo PUT, con URL: htpp://localhost:8080/organizacion. Se debe introducir el siguiente formato JSON para actualizar la organizacion.
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
Es un request de tipo DELETE, con URL: htpp://localhost:8080/organizacion/id_organizacion
### Impuesto
#### Ver impuestos
Visualiza todos los impuesto cargados en la base de datos.
Es un request de tipo de GET, con URL: htpp://localhost:8080/impuesto
#### Agregar impuesto
Es un request de tipo de POST, con URL: htpp://localhost:8080/impuesto. Se debe introducir el siguiente formato JSON para agregar el impuesto.
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
Es un request de tipo DELETE, con URL: htpp://localhost:8080/impuesto
### Pedido Transporte
#### Ver pedidos de transporte
Visualiza todos los pedidos de transporte cargados en la base de datos.
Es un request tipo de GET, con URL: htpp://localhost:8080/pedidoTransporte
#### Agregar pedido de transporte
Es un request tipo de POST, con URL: htpp://localhost:8080/pedidoTransporte. Se debe introducir el siguiente formato JSON para agregar el pedido de transporte .
```json
{
    "id": "Identificador del pedido de Transporte"
	"transportistaId":"Identificador del transportista",
	"almadenamientoId":"Identificador del almacenamiento
	"origen":"Pais de origen que se desea transportar los productos",
	"destino":"Pais destino que se desea transportar los productos",
	"estado":"Estado del pedido"
}
```
#### Actualizar pedido de transporte
Es un request tipo de PUT, con URL: htpp://localhost:8080/pedidoTransporte. Se debe introducir el siguiente formato JSON para actualizar el pedido de transporte.
```json
{
    "id": "Identificador del pedido de Transporte a actualizar",
	"transportistaId":"Identificador del transportista",
	"almadenamientoId":"Identificador del almacenamiento
	"origen":"Pais de origen que se desea transportar los productos",
	"destino":"Pais destino que se desea transportar los productos",
	"estado":"Estado del pedido"
}
```
#### Eliminar pedido de transporte por id
Es un request de tipo DELETE, con URL: htpp://localhost:8080/pedidoTransporte
