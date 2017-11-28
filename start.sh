./consul agent -data-dir=/tmp/consul -join=172.17.0.2 -bind=172.17.0.3 -client=172.17.0.3 &
java -jar ./app.jar && fg