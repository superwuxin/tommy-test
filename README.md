## TomEE JavaEE服务器测试工程
> 工程命名需要注意不要包含tomee

### [Bean Validation](https://github.com/superwuxin/tommy-test/tree/master/src/main/java/com/harmony/tommy/bval)

Bean Validation standardizes constraint definition, declaration and validation for the Java platform. For more information on Bean Validation and how to participate, check out http://beanvalidation.org. 

### [Contexts and Dependency Injection for JavaEE](https://github.com/superwuxin/tommy-test/tree/master/src/main/java/com/harmony/tommy/cdi)

The purpose of this specification is to unify the JSF managed bean component model with the EJB component model, resulting in a significantly simplified programming model for web-based applications

### [Java Service Message](https://github.com/superwuxin/tommy-test/tree/master/src/main/java/com/harmony/tommy/jms)

The Java Message Service (JMS) API is a messaging standard that allows Java EE application components to create, send, receive, and read messages. It enables distributed communication that is loosely coupled, reliable, and asynchronous.

### [Java Persistence API](https://github.com/superwuxin/tommy-test/tree/master/src/main/java/com/harmony/tommy/jpa)

The Java Persistence API (JPA) is a Java standards-based solution for persistence. Persistence uses an object/relational mapping approach to bridge the gap between an object-oriented model and a relational database. The Java Persistence API can also be used in Java SE applications, outside of the Java EE environment. Java Persistence consists of the following areas:

* The Java Persistence API
* The query language
* Object/relational mapping metadata

### [Java Transaction API](https://github.com/superwuxin/tommy-test/tree/master/src/main/java/com/harmony/tommy/jta)

The Java Transaction API (JTA) provides a standard interface for demarcating transactions. The Java EE architecture provides a default auto commit to handle transaction commits and rollbacks. An auto commit means that any other applications that are viewing data will see the updated data after each database read or write operation. However, if your application performs two separate database access operations that depend on each other, you will want to use the JTA API to demarcate where the entire transaction, including both operations, begins, rolls back, and commits.

### [JavaMail API](https://github.com/superwuxin/tommy-test/tree/master/src/main/java/com/harmony/tommy/mail)

Java EE applications use the JavaMail API to send email notifications. The JavaMail API has two parts:

* An application-level interface used by the application components to send mail
* A service provider interface

### [Java WebService](https://github.com/superwuxin/tommy-test/tree/master/src/main/java/com/harmony/tommy/ws)
