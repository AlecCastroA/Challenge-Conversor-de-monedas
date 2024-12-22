# Challenge-Conversor-de-monedas

Un proyecto en Java que permite convertir entre diferentes monedas utilizando datos en tiempo real de una API de tasas de cambio como parte del curso de ORACLE ONE de Alura Latam.

## Características

- Conversión entre monedas:
  - Dólar (USD) ↔ Peso Argentino (ARS)
  - Dólar (USD) ↔ Real Brasileño (BRL)
  - Dólar (USD) ↔ Peso Colombiano (COP)
- Validación de entradas del usuario para opciones del menú.
- Manejo robusto de errores en:
  - Entrada no válida en el menú.
  - Valores de entrada no numéricos o negativos en la conversión.
  - Conexión con la API de tasas de cambio.
  - Respuestas no válidas de la API.
- Formato amigable para los valores convertidos.

## Requisitos

- Java 11 o superior.
- Biblioteca Gson (para el manejo de JSON).
- Acceso a internet para conectar con la API de Exchange Rate.

## Configuración e Instalación

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu_usuario/conversor-moneda.git
   cd conversor-moneda

2. Asegúrate de tener configurado tu entorno de Java.

3.Agrega la biblioteca Gson a tu proyecto. Por ejemplo:

- Si usas un IDE, como IntelliJ IDEA o Eclipse, agrega el archivo .jar de Gson a las dependencias.
- Con Maven, agrega en el pom.xml:
  <dependency>
      <groupId>com.google.code.gson</groupId>
      <artifactId>gson</artifactId>
      <version>2.10</version>
  </dependency>
4. Agrega tu clave API en la clase ConsultarCambio:
  String apiKey = "tu_clave_api";

## Uso

1. Ejecuta el archivo Principal.java para iniciar el programa.
2. Sigue las instrucciones del menú para seleccionar las conversiones.
3. Ingresa el valor que deseas convertir y observa el resultado.

## Autor

Este proyecto fue realizado por [Alec Castro](https://github.com/AlecCastroA).
