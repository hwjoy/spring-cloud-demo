# spring-cloud-demo

Spring Cloud demo project

## Service Discovery - 服务发现

### Euraka

#### eureka-server - 注册中心

默认端口：8761

#### eureka-client - 服务提供

#### eureka-consumer - 服务消费

`RestTemplate` 服务间调用

`@LoadBalanced`

Ribbon(eureka-client依赖自带) 提供负载均衡

### Consul

默认端口：8500

#### consul-client - 服务提供

#### consul-consumer - 服务消费

### Zookeeper

## Service-to-service calls - 服务调用

### RestTemplate

### Feign

Feign 使用了 Ribbon

#### feign-consumer - 服务消费

使用 OpenFeign

## Circuit Breakers - 服务熔断

### Hystrix

#### feign-hystrix-consumer - 服务消费 + 服务熔断/降级

使用 OpenFeign + Hystrix

#### hystrix-dashboard - 服务监控

使用 Hystrix Dashboard

### Turbine

默认端口 9101

## Routing - 服务网关

### Zuul

netflix-zuul 包含 web + actuator + hystrix

默认端口 5555

#### Routes Endpoint

<http://localhost:5555/actuator/routes>

<http://localhost:5555/actuator/routes/details>

#### Filters Endpoint

<http://localhost:5555/actuator/filters>

### Gateway

Spring Cloud Gateway requires the Netty runtime provided by Spring Boot and Spring Webflux. It does not work in a traditional Servlet Container or when built as a WAR.

<http://localhost:5556/actuator/gateway/routes>

<http://localhost:5556/actuator/gateway/globalfilters>

<http://localhost:5556/actuator/gateway/routefilters>

## Configuration Management - 配置管理

### Config

默认端口 8888

### Zookeeper

## Distributed Tracing - 服务追踪

### Sleuth

### Zipkin

Sleuth + Zipkin

1. via HTTP
2. over RabbitMQ or Kafka

#### zipkin-server

jar包 或者 docker安装 openzipkin/zipkin

默认端口 9411

#### zipkin-client

## Control Bus - 消息总线
