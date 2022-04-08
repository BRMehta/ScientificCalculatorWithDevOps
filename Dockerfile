FROM openjdk:11
COPY ./target/ScientificCalculatorWithDevOps-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "calculatorDevOps-1.0-SNAPSHOT-jar-with-dependencies.jar"]