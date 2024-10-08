# codeintelligence-ejercicios

1.Crea una jerarquía de clases que represente diferentes tipos de animales. La clase base será Animal, con un método hacerSonido(). Hereda de ella clases como Perro y Gato, sobrescribiendo el método hacerSonido() para que cada subclase produzca su sonido característico.
Clases Finales:

2.Implementa una clase Vehiculo que sea final y contenga un método arrancar(). Intenta crear una subclase que herede de Vehiculo y observa el error que se genera. Explica por qué no se puede heredar de una clase final.
Clases Abstractas y Métodos Abstractos:

3.Define una clase abstracta Figura con un método abstracto calcularArea(). Luego, crea subclases como Circulo y Rectangulo que implementen este método para calcular el área según su tipo. Finalmente, crea un programa que permita crear figuras y calcular sus áreas.
Uso de Interfaces:

4.Crea una interfaz Vehiculo con los métodos acelerar() y frenar(). Implementa esta interfaz en una clase Coche. Luego, crea una instancia de Coche y llama a los métodos acelerar() y frenar().
Manejo de Enums:

5.Crea un enum que represente los días de la semana (LUNES, MARTES, etc.). Implementa un programa que permita al usuario ingresar un día y responda si es un día laboral o un fin de semana utilizando una estructura switch.
Polimorfismo:

6.Implementa una clase abstracta Empleado que tenga un método abstracto calcularSalario(). Luego, crea las clases EmpleadoTiempoCompleto y EmpleadoTiempoParcial que hereden de Empleado y sobrescriban el método calcularSalario() según las horas trabajadas o el salario mensual. Crea instancias de ambos tipos de empleados y calcula sus salarios.
Repositorio de Datos en Memoria:

7.Implementa una clase RepositorioDePersonas que permita agregar, eliminar y listar objetos de tipo Persona. El repositorio debe almacenar las personas en una lista interna y proveer métodos para agregar y eliminar personas por su id.


# Ejercicios Streams
1.Filtrado de elementos pares: Crea una lista de números enteros y utiliza un Stream para filtrar solo los números pares. Luego, imprime esos números en pantalla.

2.Cálculo del promedio: A partir de una lista de números, utiliza un Stream para calcular el promedio de los valores.

3.Transformación de cadenas: Dada una lista de palabras, utiliza un Stream para convertir todas las palabras a mayúsculas y luego imprímelas.

4.Filtrado por longitud: A partir de una lista de cadenas, utiliza un Stream para filtrar las cadenas que tienen más de 5 caracteres y muestra el resultado.

5.Concatenación de cadenas: Dada una lista de nombres, utiliza un Stream para concatenar todos los nombres en una sola cadena, separados por comas.

6.Conteo de elementos: Crea una lista de números enteros y utiliza un Stream para contar cuántos números son mayores que 10.

7.Búsqueda de un elemento: Dada una lista de personas (con nombre y edad), utiliza un Stream para encontrar la primera persona que tenga más de 30 años y muestra su nombre.

8.Agrupación de datos: A partir de una lista de personas (con nombre y edad), utiliza un Stream para agrupar las personas en dos listas: las menores y mayores de 18 años.

9.Conversión de una lista a un Set: A partir de una lista de números con valores duplicados, utiliza un Stream para eliminar los duplicados y convertir la lista en un Set.

10.Filtrado de fechas: Dada una lista de fechas, utiliza un Stream para filtrar solo las fechas posteriores al 1 de enero de 2020 y muestra el resultado.