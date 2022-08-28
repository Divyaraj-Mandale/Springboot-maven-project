From openjdk:11

COPY target/locationweb1-0.0.1-SNAPSHOT.war /
WORKDIR /
CMD ["java", "-jar", "locationweb1-0.0.1-SNAPSHOT.war"]
