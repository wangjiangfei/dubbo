# dubbo
SpringBoot+Dubbo示例

# 1、数据库配置
MySQL数据库导入dubbo.sql文件，
并修改dubbo-provider项目中application.properties的数据库用户名和密码
<pre>
<code>
server.port=8080

spring.dubbo.application.name=dubbo-provider
spring.dubbo.registry.address=zookeeper://127.0.0.1:2181
spring.dubbo.protocol.name=dubbo
spring.dubbo.protocol.port=20880
spring.dubbo.scan=com.wangjiangfei.service

spring.datasource.url=jdbc:mysql://127.0.0.1:3306/dubbo?characterEncoding=utf-8&useSSL=false
spring.datasource.username=root
spring.datasource.password=12345
spring.datasource.driver-class-name=com.mysql.jdbc.Driver

mybatis.mapperLocations=classpath:mappers/*.xml
mybatis.typeAliasesPackage=com.wangjiangfei.pojo

spring.jmx.default-domain=dubbo-provider
</code>
</pre>

# 2、ZooKeeper配置
进入Zookeeper安装目录，进入conf目录，新建zoo.cfg文件，文件内容如下，
<pre>
<code>
# The number of milliseconds of each tick
tickTime=2000
# The number of ticks that the initial 
# synchronization phase can take
initLimit=10
# The number of ticks that can pass between 
# sending a request and getting an acknowledgement
syncLimit=5
# the directory where the snapshot is stored.
# do not use /tmp for storage, /tmp here is just 
# example sakes.
dataDir=/tmp/zookeeper
# the port at which the clients will connect
clientPort=2181
# the maximum number of client connections.
# increase this if you need to handle more clients
#maxClientCnxns=60
#
# Be sure to read the maintenance section of the 
# administrator guide before turning on autopurge.
#
# http://zookeeper.apache.org/doc/current/zookeeperAdmin.html#sc_maintenance
#
# The number of snapshots to retain in dataDir
#autopurge.snapRetainCount=3
# Purge task interval in hours
# Set to "0" to disable auto purge feature
#autopurge.purgeInterval=1
</code>
</pre>

# 3、启动项目时应注意的问题
- 启动项目前先启动ZooKeeper,进入ZooKeeper安装目录，进入bin文件夹，双击zkServer.cmd启动
- 注意启动项目的顺序，先启动生产者dubbo-provider，然后启动消费者dubbo-consumer
