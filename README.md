# SpringBoot-Luckymoney
## 通过一个红包的小例子入门Spring Boot
- 项目配置
  - 单个配置@Value
  - 对象配置@ConfigurationProperties
  - 区分dev和prod环境 使用不同的配置
  
- Controller的使用
  - 方式
    - @Controller
    - @ResponseBody
    - @RestController = @Controller + @ResponseBody 使用最多的参数
  - 获取参数
    - PathVariable 从路径中获取数据
    - RequestParam 从xxx?abc=123中获取数据

- 数据库操作
  - 使用 Spring-Data-Jpa组件 自定义一个借口 并且继承 JpaRepository即可
    - save() 创建/更新
    - findById() 通过Id查找某一行数据
    - findAll() 查找所有数据
    
#### 特指数据库事务
- 事务
  - Spring Boot只需要使用Transactional注解
  - 同时 数据库要使用InnoDB引擎 不能使用MyISAM 它不支持事务
