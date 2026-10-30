Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Enrutador de Red y Validación de Direcciones IP (Encapsulamiento y Reglas de Formato en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🌐 Simulación de Enrutador de Red y Validación de IP (Encapsulamiento y Robustez en Java)

Este proyecto es una aplicación en Java que modela la configuración y el estado de un dispositivo de red de tipo enrutador, incorporando una validación estricta de formato y rangos numéricos para direcciones IPv4. Pone en práctica conceptos clave de la **Programación Orientada a Objetos (POO)** como el **encapsulamiento de atributos privados**, el control de estado defensivo mediante constructores y la aplicación de algoritmos de validación lógica en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase de dominio encapsulada y un punto de ejecución:

* **`Enrutador`**: Modela el equipo de conectividad y protege la integridad de su dirección IP, identificador y estado de enlace.
* **Atributos privados (`private`)**: `identificador`, `direccionIP` y `conectado`, impidiendo la alteración directa desde fuera de la clase.
* **Constructor**: Inicializa el enrutador asignando el identificador único, configurando de forma predeterminada la dirección IP en `"0.0.0.0"` y el estado de conexión en falso (`false`).
* **Métodos accesores (*getters*)**: Permiten consultar de forma controlada el identificador, la dirección IP actual y el estado de conectividad (`isConectado()`).
* **Métodos operativos de negocio**:
* `setDireccionIP(String nuevaIp)`: Analiza sintácticamente la cadena dividiéndola por puntos (`.`). Verifica que posea exactamente 4 octetos, que cada parte sea un número entero válido y que esté comprendido estrictamente dentro del rango de **0 a 255**. Si la validación es exitosa, actualiza la IP; de lo contrario, rechaza la operación e informa el error.
* `conectar()` / `desconectar()`: Alternan dinámicamente el estado del enlace de red del dispositivo.




* **`Main`**: Punto de entrada del programa. Instancia un objeto de tipo `Enrutador`, realiza pruebas de configuración con direcciones IPv4 válidas e inválidas (con octetos fuera de rango, formatos incompletos o texto alfanumérico), activa la conexión y muestra por consola los datos finales.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Validación Exhaustiva de Formato IPv4:** El método de configuración divide la cadena de texto y comprueba que existan exactamente cuatro segmentos numéricos separados por puntos.
2. **Control Estricto de Rangos en Octetos:** Cada bloque numérico es analizado mediante conversión a enteros, garantizando que su valor se mantenga dentro de los límites válidos de redes **(0 a 255)** y capturando excepciones ante caracteres no numéricos.
3. **Encapsulamiento de Estado Sensible:** Los datos del equipo están protegidos con modificadores privados, asegurando que ninguna entidad externa modifique la dirección IP sin pasar por los filtros de validación del sistema.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
--- Configuración de IP ---
Dirección IP configurada correctamente.
Dirección IP configurada correctamente.
Dirección IP inválida.
Formato de IP incorrecto.
Formato de IP incorrecto.

--- Estado del enrutador ---
Identificador: ROUTER-001
Dirección IP: 10.0.0.1
¿Está conectado? true

```

---

## 🚀 Conceptos de Programación Aplicados

* **Encapsulamiento y Protección de Datos:** Ocultamiento de la configuración interna del dispositivo para prevenir asignaciones de redes inválidas o corruptas.
* **Algoritmos de Validación Defensiva:** Implementación de análisis sintáctico y control de excepciones (`NumberFormatException`) para asegurar la consistencia de los datos ingresados.
* **Diseño Modular:** Clara separación entre la lógica de dominio de redes (`Enrutador`) y la ejecución de casos de prueba del usuario (`Main`).
