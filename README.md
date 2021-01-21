# springcloud-demo
springcloud微服务框架搭建demo

Ribbon用于负载均衡，默认策略是轮询

Feign集成了Ribbon，使得拥有了负载均衡的能力，默认策略是轮询(当存在服务降级时，轮询可能失效)

Hystrix用于避免雪崩问题，拥有线程隔离，服务降级和服务熔断

注：Eureka2.0非开源，Consul中国区锁定，注册中心建议Nacos
