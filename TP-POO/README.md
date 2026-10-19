# TP – Desarrollo de Sistemas Orientada a Objetos

**Alumno:** [Tu nombre y apellido]

Resolución de la guía de ejercicios (7 ejercicios) en Java. Cada ejercicio está en su propio paquete dentro de `src/` y tiene su clase `Main` para probarlo.

## Estructura

```
src/
├── ejercicio1/   Persona
├── ejercicio2/   CuentaBancaria
├── ejercicio3/   Animal, Perro, Gato
├── ejercicio4/   Figura (abstracta), Circulo, Rectangulo
├── ejercicio5/   Vehiculo, Auto, Moto
├── ejercicio6/   Producto, ProductoAlimenticio, ProductoElectronico
└── ejercicio7/   Empleado, Gerente, Vendedor
```

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
javac -d out src/ejercicio*/*.java
java -cp out ejercicio1.Main
```

Cambiando `ejercicio1` por el número que corresponda. También se puede abrir la carpeta en IntelliJ, Eclipse, NetBeans o VS Code y ejecutar el `Main` de cada paquete.

---

## Ejercicio 1 – La Clase Persona

```mermaid
classDiagram
    class Persona {
        -String nombre
        -int edad
        -long dni
        +Persona(nombre, edad, dni)
        +getNombre() String
        +setNombre(nombre) void
        +getEdad() int
        +setEdad(edad) void
        +getDni() long
        +setDni(dni) void
        +mostrarDatos() void
        +toString() String
        +equals(Object o) boolean
    }
```

## Ejercicio 2 – Cuenta Bancaria Simple

```mermaid
classDiagram
    class CuentaBancaria {
        -String titular
        -String numeroCuenta
        -double saldo
        +CuentaBancaria(titular, numeroCuenta, saldo)
        +getTitular() String
        +getNumeroCuenta() String
        +getSaldo() double
        +depositar(double monto) void
        +retirar(double monto) void
        +mostrarInfo() void
        +toString() String
        +equals(Object o) boolean
    }
```

## Ejercicio 3 – El Reino Animal

```mermaid
classDiagram
    class Animal {
        -String nombre
        -String sonido
        +Animal(nombre, sonido)
        +getNombre() String
        +getSonido() String
        +hacerSonido() void
        +toString() String
        +equals(Object o) boolean
    }
    class Perro {
        -String raza
        +Perro(nombre, sonido, raza)
        +getRaza() String
        +buscarHueso() void
    }
    class Gato {
        -String colorPelaje
        +Gato(nombre, sonido, colorPelaje)
        +getColorPelaje() String
        +ronronear() void
    }
    Animal <|-- Perro
    Animal <|-- Gato
```

## Ejercicio 4 – Figuras Geométricas

```mermaid
classDiagram
    class Figura {
        <<abstract>>
        -String color
        +Figura(color)
        +getColor() String
        +calcularArea()* double
        +calcularPerimetro()* double
        +mostrarInfo() void
    }
    class Circulo {
        -double radio
        +Circulo(color, radio)
        +getRadio() double
        +calcularArea() double
        +calcularPerimetro() double
        +toString() String
        +equals(Object o) boolean
    }
    class Rectangulo {
        -double base
        -double altura
        +Rectangulo(color, base, altura)
        +getBase() double
        +getAltura() double
        +calcularArea() double
        +calcularPerimetro() double
        +toString() String
        +equals(Object o) boolean
    }
    Figura <|-- Circulo
    Figura <|-- Rectangulo
```

## Ejercicio 5 – Sistema de Vehículos

```mermaid
classDiagram
    class Vehiculo {
        -String marca
        -String modelo
        -int velocidadMaxima
        +Vehiculo(marca, modelo, velocidadMaxima)
        +getMarca() String
        +getModelo() String
        +getVelocidadMaxima() int
        +describir() void
        +toString() String
        +equals(Object o) boolean
    }
    class Auto {
        -int nroPuertas
        +Auto(marca, modelo, velocidadMaxima, nroPuertas)
        +getNroPuertas() int
        +describir() void
        +toString() String
        +equals(Object o) boolean
    }
    class Moto {
        -String tipo
        +Moto(marca, modelo, velocidadMaxima, tipo)
        +getTipo() String
        +describir() void
        +toString() String
        +equals(Object o) boolean
    }
    Vehiculo <|-- Auto
    Vehiculo <|-- Moto
```

## Ejercicio 6 – Sistema de Productos

```mermaid
classDiagram
    class Producto {
        -int id
        -String nombre
        -double precio
        +Producto(id, nombre, precio)
        +mostrarInfo() void
        +toString() String
        +equals(Object o) boolean
    }
    class ProductoAlimenticio {
        -String fechaVencimiento
        -int calorias
        +ProductoAlimenticio(id, nombre, precio, fechaVencimiento, calorias)
        +mostrarInfo() void
    }
    class ProductoElectronico {
        -String marca
        -int mesesGarantia
        +ProductoElectronico(id, nombre, precio, marca, mesesGarantia)
        +mostrarInfo() void
    }
    Producto <|-- ProductoAlimenticio
    Producto <|-- ProductoElectronico
```

## Ejercicio 7 – Sistema de Empleados

```mermaid
classDiagram
    class Empleado {
        -String nombre
        -int legajo
        -double salarioBase
        +Empleado(nombre, legajo, salarioBase)
        +getNombre() String
        +getLegajo() int
        +getSalarioBase() double
        +calcularSalario() double
        +mostrarDatos() void
        +toString() String
        +equals(Object o) boolean
    }
    class Gerente {
        -double bono
        +Gerente(nombre, legajo, salarioBase, bono)
        +getBono() double
        +calcularSalario() double
        +mostrarDatos() void
        +toString() String
        +equals(Object o) boolean
    }
    class Vendedor {
        -double comision
        +Vendedor(nombre, legajo, salarioBase, comision)
        +getComision() double
        +calcularSalario() double
        +mostrarDatos() void
        +toString() String
        +equals(Object o) boolean
    }
    Empleado <|-- Gerente
    Empleado <|-- Vendedor
```
