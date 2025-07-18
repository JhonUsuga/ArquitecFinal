# Usar una imagen base de Java 17
FROM eclipse-temurin:17-jdk

# Directorio dentro del contenedor
WORKDIR /app

# Copiar el .jar compilado
COPY target/parcialFinal-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto donde corre Spring Boot
EXPOSE 8080

# Ejecutar la app
ENTRYPOINT ["java", "-jar", "app.jar"]