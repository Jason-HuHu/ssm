#Maven搭建ssm基础框架
##环境说明
* OS:Win10
* IDE：Intellij IDEA 2016.2.5
* Spring版本：4.1.6
* MyBatis版本：3.4.1
#新建maven web项目
如果没有学过Maven，建议先学习一下Maven
File-New-Project-Maven 勾选Create from archetype ,选择webapp 然后一路Next
#配置依赖jar包
搭建SSM项目框架就必须要配置Spring+SpringMVC+MyBatis的相关jar包
1. Spring
2. SpringMVC
3. MyBatis
4. 其他
#Spring整合MyBatis
#Spring整合SpringMVC
#测试
#遇到的问题
1、版本不一致导致的问题
    错误提示：<p><code>java.lang.AbstractMethodError: org.mybatis.spring.transaction.SpringManagedTransactionFactory.newTransaction(Ljava/sql/Connection;)Lorg/apache/ibatis/transaction/Transaction</code></p>
    mybatis-spring版本和pring的版本必须相对应
2、spring xml的dtd引入问题
3、无法使用<code>@Autowired</code>注解向Service中注入Dao接口
    首先要在Dao接口上加上<code>@Repository</code>注解
    
#配置第三方缓存
Redis - memcache -ehcache等