# 🚀 Proyecto Calculadora con Pruebas Unitarias (JUnit 5)

## 📋 Descripción del Proyecto

Este repositorio contiene el código fuente de una simple **Clase Calculadora** y un conjunto robusto de **Pruebas Unitarias** desarrolladas para verificar la correcta funcionalidad de sus operaciones aritméticas básicas (Suma, Resta, Multiplicación y División).

El objetivo principal es demostrar la implementación de **Pruebas Unitarias** utilizando el framework **JUnit 5 (Jupiter)** en un proyecto Java, asegurando la calidad y el comportamiento esperado de la clase `Calculadora`.

---

## 🛠️ Tecnologías y Herramientas

* **Lenguaje de Programación:** Java
* **Framework de Pruebas:** **JUnit 5 (JUnit Jupiter)**

---

## 🚦 Pruebas Unitarias (Clase: `CalculadoraTest`)

La clase de prueba verifica el correcto funcionamiento de las operaciones utilizando los números fijos **A = 9** y **B = 5**. La inicialización de la calculadora se realiza una sola vez antes de la ejecución de todas las pruebas (`@BeforeAll`).

### Resultados Esperados de las Pruebas

| Método de Prueba | Operación | Expresión | Resultado Esperado |
| :--- | :--- | :--- | :--- |
| `testSuma()` | Suma | $9 + 5$ | $14$ |
| `testResta()` | Resta | $9 - 5$ | $4$ |
| `testMultiplicacion()` | Multiplicación | $9 \times 5$ | $45$ |
| `testDivision()` | División | $9 / 5$ | $1.8$ |

