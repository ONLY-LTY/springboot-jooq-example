# SpringBoot-Jooq-example

######SpringBoot 结合Jooq的一个实例。里面用了HikariDataSource高性能的链接池。实例里面还加入的mybatis的集成。我们只需要将MyBatisConfig这个类的的注释去掉。然后注释掉JooqSpringBootConfiguration这个类 就可以切换到mybatis

######里面的jooq的类是自动生成的。如果运行得要配置自己的数据库。可先将data包中的类删除，然后在pom文件中配置好自己的数据库 然后执行mvn clean complie就会自动生成数据库对应的类。然后可在controller中 测试。
