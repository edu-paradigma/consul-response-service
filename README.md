# consul-response-service

Provee de informacion a consul-request-service. Se registra en Consul como miembro y recupera sus propiedades de él.

## Arrancar el docker

Desde la raiz del proyecto:

./gradlew clean build

docker build -f Dockerfile .

docker run <ID_DOCKER>