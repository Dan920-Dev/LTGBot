# Utiliza la imagen de Maven como base para compilar el proyecto
FROM maven:3.8.3-openjdk-20 as builder

# Copia los archivos de la aplicación al contenedor
WORKDIR /app
COPY ./LTGDiscord-Bot /app

# Compila el proyecto con Maven
RUN mvn clean package

# Cambia a una imagen más ligera de Java para la ejecución
FROM adoptopenjdk:20-jre-hotspot

# Copia los archivos compilados desde la imagen de compilación al contenedor
WORKDIR /app
COPY --from=builder /app/target/LTGBot.jar /app

# Ejecuta el JAR de la aplicación
CMD ["java", "-jar", "LTGBot.jar"]
