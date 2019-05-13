# simple-IOC
实现简单的IOC容器

对IOC容器的理解：
注册的bean都是只有一个实例，或者说都是业务实现接口，对所有的功能共享，例如数据库连接对象。
在spring中我们的service接口实现类和controller都用了注解，这些注解的一种功能是告诉容器这个类需要注册，
然后我们的Autowired注解的主要功能也是注册bean（控制反转，由IOC容器来生成具体的对象），然后依赖注入到对象中。

IOC利用map存储

自定义MyService注解，接收一个value参数，为注册的service名字，为了实例注入的时候注入的是实现类而不是借口

自定义MyController注解，也是简单的注册功能

自定义注解MyAutowired，用来实现依赖注入

利用反射生成注册对象，并通过注解注入到指定的对象中。
