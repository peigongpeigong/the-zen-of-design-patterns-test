###建造者模式

定义：讲一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示

####建造者模式通常由四个角色
- Product产品类：通常是实现了模板方法模式
- Builder抽象建造者：规范产品的组建，一般由子类实现
- ConcreteBuilder具体建造者：实现抽象类定义好的方法，并且返回一个组建好的对象
- Director导演类：负责安排已有模块的顺序，然后告诉Builder开始建造

####优点：
- 封装性。可以使客户端不必知道产品内部组成的细节
- 建造者独立，容易扩展。各Builder是相互独立的，对系统的扩展非常有利
- 便于控制细节风险。由于建造这是独立的，因此可以对建造过程逐步细化，而不对其他模块产生影响

####场景
- 相同的方法，不同的执行顺序，产生不同的事件结果时
- 多个部件或零件，都可以装配到对象中，但是产生的运行结果又不相同时
- 产品类非常复杂，或者产品类中调用顺序不同产生了不同的效能
- 在对象创建过程中会使用到系统中的一些其他对象，这些对象在产品对象的创建过程中
  不易得到时