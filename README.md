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
Es un request tipo GET, con URL: htpp://localhost:8080/usuario

#### Agregar Despachante
Es un request tipo POST, con URL: htpp://localhost:8080/usuario/despachante
Se debe introducir el siguiente formato JSON para crear el despachante.
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
Es un request tipo POST, con URL: htpp://localhost:8080/usuario/auditor
Se debe introducir el siguiente formato JSON para crear el auditor.
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
Es un request tipo POST, con URL: htpp://localhost:8080/usuario/transportista
Se debe introducir el siguiente formato JSON para crear el transportista.
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
Es un request tipo POST, con URL: htpp://localhost:8080/usuario/administrador
Se debe introducir el siguiente formato JSON para crear el administrador.
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
Es un request tipo PUT, con URL: htpp://localhost:8080/usuario/despachante
Se debe introducir el siguiente formato JSON para actualizar el despachante.
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
Es un request tipo PUT, con URL: htpp://localhost:8080/usuario/auditor
Se debe introducir el siguiente formato JSON para actualizar el auditor.
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
Es un request tipo PUT, con URL: htpp://localhost:8080/usuario/transportista
Se debe introducir el siguiente formato JSON para actualizar el transportista.
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
Es un request tipo PUT, con URL: htpp://localhost:8080/usuario/administrador
Se debe introducir el siguiente formato JSON para actualizar el administrador.
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
Es un request tipo DELETE, con URL: htpp://localhost:8080/usuario/id_usuario
