# ServiciosWeb
**Realización de Servicio Web de Usuarios, Servicio Web Cuentas Bancarias, Utilizando Microservicios, Cliente Feign, Discovery Service**


                                        -------> Uso de MICORSERVICIOS <----------

Sevicio de Usuarios creando un CRUD donde puede:
  Listar clientes --> GET usuario/listar
  Insertar usuario por medio del (id) --> POST  /Usuario/insertar/{id}
  Actualizar usuario recibiendo (body) y encontrarlo por el (id) --> PUT /Usuario/actualizar/{id}
  Mostrar datos del usuario por medio del (id) --> GET /Usuario/buscar/{id}
  Eliminar usaurio por medio del id --> DELETE /usuario/eliminar/{id}
  Mostrar datos del usuario por medio de un elemeno --> GET /Usuario/nombre/{elemento}
  ******  ******  ******  ******* ***** ******* ******  ******  ******  ********
  Mostrar cuentas del usuario utilizando Feign Client ---> GET  /Usaurio/cuentas/{id}
  Busqueda del id del cliente por medio de su correo para consumir por medio del feign client de Banco --> GET /Usuario/{correo}
  
  *********** ********************** ************** ************* ********** ************ ********* ******* ********** ********* ******** ******* ****** ****
  
Servicio de Banco creando un CRUD donde se puede:
  Listar cuentas del cliente por medio del (id) --> GET /banco/cliente/{id}
  Insertar nueva cuenta 'si existe id cliente' utilizando Feign Client para verificar al cliente --> POST banco/insertar/{id}
  Actualizar cuenta recibiendo (body) y encontrarlo por el (id) --> PUT /banco/actualizar/{id}
  Mostrar datos de la cuenta por medio del (id) --> GET /banco/buscar/{id}
  Eliminar cuenta por medio del id --> DELETE /banco/eliminar/{id}
  Listar cuentas del usuario por medio de su {id} --> GET /banco/buscarCuentas/{id}
  
  **********************************************************************************************************************************************
  
  Discovery Sarvice utilizando Eureka Server
  
  **********************************************************************************************************************************************
  
  Falta implementar API GATEWAY
 
