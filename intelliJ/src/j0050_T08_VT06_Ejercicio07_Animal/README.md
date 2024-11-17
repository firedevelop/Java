
¿Por qué la clase Animal es abstracta?

La clase `Animal` es abstracta porque sirve como una clase base genérica que
define características comunes para otras clases más específicas (como `Perro` y `Gato`),
pero no tiene sentido instanciarla directamente. En otras palabras, `Animal` es un
concepto general que actúa como una plantilla para las clases derivadas.

Puntos clave:
1. **Propiedades comunes**:
   - `color`
   - `nombre`
   - `edad`
   Estas propiedades son relevantes para cualquier tipo de animal, pero no son
   específicas como para justificar la creación de una instancia de `Animal`.

2. **Método concreto común**:
   - `dormir()`: Todos los animales comparten la capacidad de dormir, por lo que este
     comportamiento está implementado directamente en la clase `Animal`.

3. **Clase abstracta en lugar de concreta**:
   - Aunque `Animal` no contiene métodos abstractos (métodos que deben implementar las subclases),
     se declara como `abstract` para evitar que pueda ser instanciada directamente. 
   - Cualquier intento de crear una instancia de `Animal` (por ejemplo, `new Animal(...)`)
     generará un error de compilación. Esto asegura que los desarrolladores utilicen las 
  clases derivadas específicas como `Perro` o `Gato` para crear objetos.

Este diseño combina la herencia para compartir características generales (`Animal`) con
la flexibilidad de definir comportamientos específicos en las subclases a través de la interfaz
`ComportamientoAnimal` y las implementaciones respectivas en cada subclase.

