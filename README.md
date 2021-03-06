设计模式：是指在软件开发中，经过验证的，用于解决在特定环境下、重复出现的、特定问题的解决方案。

从理论上来说，设计模式并不一定是最优秀的解决方案，所以说设计模式是相对优秀的，没有最优，只有更优。

1995年，由Erich Gamma、 Richard Helm、 Ralph Johnson、 John Vlissides合著的《设计模式--可复用面向对象软件的基础》一书的出版，正式掀开了软件业设计模式的序幕。

在Java领域，对于设计模式的组成按所在技术领域划分。
Java设计模式：通常指GoF的《设计模式--可复用面向对象软件的基础》一书中提到的设计模式。
JavaEE设计模式：通常指SUN《J2EE核心设计模式》一书中提到的设计模式。
其他领域的，包括但不限于：EJB设计模式、实时系统设计模式、多线程设计模式、架构模式等。

GoF将著作中提到的23个设计模式分类：
创建型模式：抽象了对象实例化的过程，用来帮助创建对象的实例。
结构型模式：描述如何组合类和对象以获得更大的结构。
行为型模式：描述算法和对象间职责的分配。

学习设计模式时要注意使设计模式的理论和实践相结合，理论指导实践，实践反过来加深对理论的理解，如此反复循环，成螺旋式上升。

事实上，到了基本掌握设计模式的水平后，最后能达到一个什么样的高度，因人而异，需要看个人的思维水平和理解水平。对于这个阶段，只有一个建议，那就
是反复地、深入地思考，别无他法。到了思想的层面，就得靠"悟"了。

创建型模式：
    简单工厂（Factory 不在GoF著作中）
    单例模式（Singleton）
    工厂方法模式（Factory Method）
    抽象工厂模式（Abstract Factory）
    生成器模式（Builder）
    原型模式（Prototype）
结构型模式：
    外观模式（Facade）
    适配器模式（Adapter）
    代理模式（Proxy）
    组合模式（Composite）
    享元模式（Flyweight）
    装饰模式（Decorator）
    桥接模式（Bridge）
行为型模式：
    中介者模式（Mediator）
    观察者模式（Observer）
    命令模式（Command）
    迭代器模式（Iterator）
    模板方法模式（Template Method）
    策略模式（Strategy）
    状态模式（State）
    备忘录模式（Memento）
    解释器模式（Interpreter）
    职责链模式（Chain of Responsibility）
    访问者模式（Visitor）
    
实验代码：
简单工厂：     dp-factory
外观模式：     dp-facade
适配器模式：    dp-adapter
单例模式：     dp-singleton 