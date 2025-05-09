EXAMEN DE JAVA

se debia realizar una aplicación en java que permita organizar y operar actividades de manera eficiente, tenia que incluir manejo de archivos de texto, conexiòn a una base de datos MySQL mediante JDBC, seguir principios y patrones de diseño, y utilizar expresiones lambda y Stream API para operaciones especificas. La interfaz de usuario era implementada en consola.

Lo primero que se realizaron son el SQL con la creacion de las tablas

![image](https://github.com/user-attachments/assets/f15b78ee-95a4-4104-ad9b-fc2f7f66d5d0)





aca cree la base de datos y arriba puse el “drop database if exists” para poder borrar la base de datos entera llegado el caso tuviera que cambiar algun dato de una tabla.


![image](https://github.com/user-attachments/assets/ed112cf2-15e9-4e71-ad4d-b7df9f6a827a)


Aquí cree la tabla de Clientes, con su id, nombre que puse que no podia quedar vacio para evitar que esten clientes sin nombre registrados, agrege representantes, el correo, telefono con bigint ya que si queria guardar un cliente ya me habia sucedido que al usar int a la hora de guardar el dato desde una vista java mandaba error, luego agrege la direccion y sector con sus opciones.

A continuacion realice lo mismo con las demas tablas


![image](https://github.com/user-attachments/assets/c2e3d91d-8872-4e05-8a14-43b51d5c340f)

![image](https://github.com/user-attachments/assets/caa0110b-c11d-468a-8a7c-19a720a8937b)

![image](https://github.com/user-attachments/assets/a9a0a9c9-cc92-449b-bc69-4313725fd203)

![image](https://github.com/user-attachments/assets/27b77975-d598-42fc-ba24-fdb50f35ce7d)

![image](https://github.com/user-attachments/assets/7c0b0f36-b11c-448e-afc5-11d8830a59d4)


lo siguiente fue comprobar si se podian realizar correctamente inserciones a las tablas


![image](https://github.com/user-attachments/assets/62bc4f79-ef91-42cb-a841-8a10e3f3123c)




ya con eso comprobado, lo siguiente a realizar es el diagrama entidad relacion.


![image](https://github.com/user-attachments/assets/811d8079-4d59-4488-9e49-13aefd3f7292)







Con eso listo, pase a realizar la conexión que me permitiria unir la base de datos al proyecto java con jdbc.

![image](https://github.com/user-attachments/assets/c123b535-d6de-42a6-bb92-d45b2f7c4b7d)




Agrege host con la direccion de la base de datos, el db, el url con el host y el db, luego puse el usuario y el password correspondiente al usuario, luego en el connection puse un try, para que me digera por terminal si la base de datos fue conectada correctamente o hubo un error.



Teniendo esto, empece a realizar el modelo de cliente.

![image](https://github.com/user-attachments/assets/46e4141f-cf0a-419b-9ffc-384a14fc22e4)





Empece realizando la clase cliente, con todos los datos necesarios para guardarlos, lo siguiente fue crear los constructores.

![image](https://github.com/user-attachments/assets/9f4c263e-0cdf-45f6-99f7-2b636092e320)




Cree uno vacio y luego uno iniciando cada dato del constructor. Y luego puse los get and set de cada uno de los datos.



![image](https://github.com/user-attachments/assets/d3b8056a-d4e5-4af8-aa02-0e4895bacbfe)





Al final coloque un Override para definir como quiero que se muestren los datos en el terminal.

Con clientes listo, pase a realizar el DAO de clientes


![image](https://github.com/user-attachments/assets/ba0f1b20-f0dc-4b84-96c4-d353e6e7c545)







