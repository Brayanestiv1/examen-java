EXAMEN DE JAVA

se debia realizar una aplicación en java que permita organizar y operar actividades de manera eficiente, tenia que incluir manejo de archivos de texto, conexiòn a una base de datos MySQL mediante JDBC, seguir principios y patrones de diseño, y utilizar expresiones lambda y Stream API para operaciones especificas. La interfaz de usuario era implementada en consola.

Lo primero que se realizaron son el SQL con la creacion de las tablas








aca cree la base de datos y arriba puse el “drop database if exists” para poder borrar la base de datos entera llegado el caso tuviera que cambiar algun dato de una tabla.




Aquí cree la tabla de Clientes, con su id, nombre que puse que no podia quedar vacio para evitar que esten clientes sin nombre registrados, agrege representantes, el correo, telefono con bigint ya que si queria guardar un cliente ya me habia sucedido que al usar int a la hora de guardar el dato desde una vista java mandaba error, luego agrege la direccion y sector con sus opciones.












A continuacion realice lo mismo con las demas tablas




















































lo siguiente fue comprobar si se podian realizar correctamente inserciones a las tablas

ya con eso comprobado, lo siguiente a realizar es el diagrama entidad relacion.









Con eso listo, pase a realizar la conexión que me permitiria unir la base de datos al proyecto java con jdbc.

Agrege host con la direccion de la base de datos, el db, el url con el host y el db, luego puse el usuario y el password correspondiente al usuario, luego en el connection puse un try, para que me digera por terminal si la base de datos fue conectada correctamente o hubo un error.



Teniendo esto, empece a realizar el modelo de cliente.














Empece realizando la clase cliente, con todos los datos necesarios para guardarlos, lo siguiente fue crear los constructores.



Cree uno vacio y luego uno iniciando cada dato del constructor. Y luego puse los get and set de cada uno de los datos.



Al final coloque un Override para definir como quiero que se muestren los datos en el terminal.

Con clientes listo, pase a realizar el DAO de clientes


