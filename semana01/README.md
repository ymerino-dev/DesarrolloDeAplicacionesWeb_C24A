# 🚀 Laboratorio 01: Aplicación Web "Información Personal"

Este repositorio contiene la práctica de la **Semana 01**, donde se aplicaron conceptos fundamentales de Spring Boot, incluyendo controladores, vistas HTML con Thymeleaf y estructuración del proyecto.

---

##  Preguntas de Reflexión

### ¿Qué diferencia existe entre `@Controller` y `@RestController`?
La anotación `@Controller` se utiliza para devolver una vista, como una página HTML procesada con un motor de plantillas como Thymeleaf. Por otro lado, `@RestController` se utiliza para devolver directamente texto o datos en formato JSON, y no busca archivos HTML.

### ¿Para qué sirve el objeto `Model`?
El objeto `Model` sirve para pasar datos desde el controlador hacia la vista HTML. Permite agregar atributos y valores en el código Java que luego pueden ser mostrados dinámicamente en la página web.

### ¿Qué función cumple Spring Initializr?
Spring Initializr cumple la función de crear y generar la estructura base de un proyecto de Spring Boot. Permite configurar rápidamente el proyecto, definiendo el lenguaje y añadiendo las dependencias necesarias (como *Spring Web*, *Spring Boot DevTools* o *Thymeleaf*) antes de descargarlo.

### ¿Qué carpeta contiene las páginas HTML en Spring Boot?
Las páginas HTML se guardan dentro de la carpeta `templates`. La ruta completa de esta carpeta dentro del proyecto es:
`src/main/resources/templates`

### ¿Qué archivo permite cambiar el puerto de la aplicación?
El archivo que permite cambiar el puerto por donde se ejecuta la aplicación es `application.properties`. Se utiliza agregando la siguiente instrucción, seguida del número de puerto deseado:
`server.port=8081`