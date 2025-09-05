# Agea

# 📽️ Sistema de Préstamo de Equipo Audiovisual

Aplicación web desarrollada en **Java con Spring Framework** para la gestión de préstamos de equipo audiovisual en la universidad.  
El sistema sigue una arquitectura **REST** y utiliza los principales componentes de Spring para garantizar escalabilidad, mantenibilidad y facilidad de uso.

---

## 🚀 Características principales

- 📦 **Gestión de equipos**: registrar, consultar, actualizar y eliminar equipos audiovisuales.
- 👤 **Gestión de usuarios**: administración de estudiantes, profesores y personal autorizado.
- 🔄 **Gestión de préstamos**: solicitudes, aprobaciones, devoluciones y control de disponibilidad.
- 🛡️ **Autenticación y seguridad** con Spring Security.
- 🗂️ **Persistencia de datos** con Spring Data JPA y base de datos relacional.
- 🌐 **API RESTful** para integraciones externas y uso flexible del sistema.

---

## 🛠️ Tecnologías utilizadas

- **Java 17+**
- **Spring Boot** (REST, Security, Data JPA, Validation)
- **Hibernate** como ORM
- **Base de datos**: (MySQL/PostgreSQL/SQLite según configuración)
- **Maven/Gradle** para gestión de dependencias
- **JUnit + Mockito** para pruebas unitarias

---

## 📐 Arquitectura

El proyecto sigue una arquitectura en capas:

- **Controller** → Expone los endpoints REST y maneja las solicitudes HTTP.  
- **Service** → Contiene la lógica de negocio.  
- **Repository** → Se encarga de la comunicación con la base de datos mediante JPA/Hibernate.  
- **Model/Entity** → Define las entidades del dominio (Equipo, Usuario, Préstamo).  

---
