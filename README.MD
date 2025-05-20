#  Refactorización Básica en Java

Este proyecto tiene como objetivo demostrar la aplicación de **cinco patrones de refactorización básicos** en el lenguaje de programación Java. Cada ejemplo es **original** y ha sido implementado con el propósito de mejorar la **legibilidad**, **mantenibilidad** y **calidad del código**.

---

##  Estructura del proyecto

El proyecto está compuesto por cinco archivos `.java`, cada uno dedicado a un patrón distinto. Todos los archivos se encuentran en el directorio raíz del proyecto.

---

## 🔧 Patrones de refactorización aplicados

### 1.  – Extraer Método  
**Archivo:** `MetodoExtraido.java`  
Se identificó un fragmento de código repetitivo dentro de un bucle y se encapsuló en un nuevo método llamado `mostrarSaludo()`. Esto permite una mejor organización del código y una clara separación de responsabilidades, facilitando futuras modificaciones.

---

### 2. – Renombrar Variable  
**Archivo:** `RenombrarVariable.java`  
La variable `s`, cuyo propósito era almacenar un código postal, fue renombrada a `codigoPostal`. Este cambio mejora la semántica del código y facilita su lectura y comprensión por parte de otros desarrolladores.

---

### 3.  – Reemplazar Número Mágico por Constante Simbólica  
**Archivo:** `ReemplazarNumeroMagico.java`  
El número mágico `3`, que indicaba el número máximo de intentos permitidos, fue reemplazado por una constante `MAXIMO_INTENTOS`. Esto proporciona mayor claridad al propósito del número y permite modificar su valor centralizado en un solo lugar.

---

### 4.  – Introducir Variable Explicativa  
**Archivo:** `IntroducirVariableExplicativa.java`  
Se introdujo la variable `impuestosCalculados` para dar nombre a una subexpresión de un cálculo complejo. Esta refactorización hace que la operación final sea más comprensible, especialmente al leer el código por primera vez.

---

### 5. – Eliminar Variable Temporal Innecesaria  
**Archivo:** `EliminarVariableInnecesaria.java`  
Se eliminó una variable intermedia que solo almacenaba el resultado de una función para ser usada inmediatamente en un `System.out.println()`. En su lugar, se insertó directamente la llamada al método, reduciendo la complejidad innecesaria.


