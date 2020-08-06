application.yml与bootstrap.yml的区别

加载顺序
bootstrap.yml 先加载 application.yml后加载

配置区别
bootstrap.yml 可以理解成系统级别的一些参数配置
application.yml 可以用来定义应用级别的

属性覆盖问题
Bootstrap 属性有高优先级，默认情况下，它们不会被application.yml覆盖

bootstrap.yml典型的应用场景
当使用 Spring Cloud Config Server 配置中心时，这时需要在 bootstrap.yml 配置文件中指定 spring.application.name 
和 spring.cloud.config.server.git.uri，添加连接到配置中心的配置属性来加载外部配置中心的配置信息