# Calculador de Impuestos

## Descripción del proyecto
Este fue un proyecto desarrollado para un curso de POO (Programación Orientada
a Objetos) en el que se buscaba demostrar las habilidades y conceptos aprendidos
durante el curso, tales como:
- Manejo de clases
- Objetos
- Herencia
- Polimorfismo
- Encapsulamiento
- Abstracción
- Sobrecarga de métodos
- Patrón de diseño Modelo Vista Controlador (MVC)
- Uso de bases de datos (MySQL)

### Commit 1
- En el primer commit se implementó la herramienta XAMPP para el manejo de la
base de datos. Se creó la tabla con el componente gráfico que ofrece el paquete,
junto con un servicio activo para poder conectarse a un servidor local.
- Aquí no funciona el método que modifica el carro en la BBDD.
- No hay manejo de errores en esta versión.

### Commit 2
- Se usó una base de datos relacional, en este caso MySQL, cuyo script está
incluido en el proyecto.
- En esta versión los bugs presentes en el primer commit están corregidos.
- El CRUD funciona en su totalidad.
- Se implmentó manejo de excepciones.
- Se aplicaron buenas prácticas de programación como la limpieza de código y
optimización de métodos, así como la organización de clases en paquetes y
creación de flujo de los datos.
- El código está documentado en su totalidad.

## Caso de estudio
Existe la necesidad de que una persona conozca el valor de la liquidación de los
impuestos de su automóvil antes de realizar el pago respectivo. De igual manera,
las empresas que recaudan estos impuestos deben saber cuáles son los valores de
pago, y así poder realizar sus actividades de manera efectiva.
Un calculador de impuestos debe tener la capacidad de calcular el total de los
impuestos de un carro determinado, dependiendo del valor de este y de los
descuentos a los que aplica, dependiendo de la situación.

Para este caso, existen tres tipos de descuentos que puede aplicarse:

- Descuento por pronto pago, que consiste en un porcentaje determinado del valor
del vehículo.
- Descuento por ser de servicio público, que es un valor fijo que se descuenta a
todos los automóviles que prestan este tipo de servicios.
- Descuento por traslado de cuenta que también es un porcentaje sobre los
impuestos.

Durante la liquidación de impuestos se debe tener en cuenta que: el porcentaje
de descuento por traslado de cuenta debe ser mayor que el porcentaje de
descuento por pronto pago. Los descuentos se aplican en secuencia utilizando el
último valor calculado. Por ejemplo, si se tiene una liquidación a la que
aplican todos los descuentos, primero se descuenta el porcentaje por pronto
pago, luego, a este valor, se le aplica el descuento por servicio público, y
luego, al resultado se le aplica el descuento por traslado de cuenta.

> Caso de estudio tomado de:
> <cupi2.virtual.uniandes.edu.co/apo-2/nivel-9/61-apo1/n5/casos-de-estudio>
