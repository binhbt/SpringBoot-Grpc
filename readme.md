# Build  
./mvnw clean install  
# Run grpc server  default on 9090 port  
java -jar target/grpc-server-0.0.1-SNAPSHOT.jar  
# Test with grpcurl  
grpcurl --plaintext localhost:9090 list  
grpcurl --plaintext localhost:9090 list com.example.grpc.server.grpcserver.HelloService  
grpcurl --plaintext localhost:9090  com.example.grpc.server.grpcserver.HelloService/hello "firstName: 'Tome', lastName:'Holland'"  
# Test with grpc_cli  
./grpc_cli ls localhost:9090  
./grpc_cli call localhost:9090  com.example.grpc.server.grpcserver.HelloService/hello "firstName: 'Tome', lastName:'Holland'"  
# Install grpc_cli  
https://blog.mattchung.me/2020/11/11/testing-your-grpc-services-using-grpc_cli/  


# Rest api run parallel with grpc on port 8080(Tomcat server)
curl http://localhost:8080/
