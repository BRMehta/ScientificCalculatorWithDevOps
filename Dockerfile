FROM openjdk:11
COPY ./target/ScientificCalculatorWithDevOps-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "ScientificCalculatorWithDevOps-1.0-SNAPSHOT.jar"]
