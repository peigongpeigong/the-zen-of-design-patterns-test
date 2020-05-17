###单例模式

定义：确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例

####优点
- 由于打你模式在内存中只有一个实例，减少内存开支，特别是一个对象需要频繁地
  创建、销毁时，而且创建或销毁时性能又无法优化，单例模式的优势就非常明显
- 由于单例模式只产生一个实例，所以减少了系统的性能开销，当一个对象的产生
  需要比较多的资源时，如读取配置、产生其它依赖对象时，则可以通过在应用中
  直接产生一个单例对象，然后用永久驻留内存的方式解决（需注意GC）
- 单例模式可以避免对资源的多重占用，例如一个写入文件的动作，由于只有一个
  实例存在于内存中，避免对同一个资源文件同时写入
- 单例模式可以在系统设置全局访问点，优化和共享资源访问，例如可以设计一个单例类，
  负责所有数据表的映射处理
  
####缺点
- 单例模式一般没有借口，扩展很困难，若要扩展，除了修改代码基本上没有第二种途径，
- 单例模式对测试是不利的。在并行开发环境中，如果单例模式没有完成，是不能进行测试的，
  没有接口也不能使用mock的方式虚拟一个对象
- 单例模式与单一职责原则有冲突。


####应用场景
- 要求生成唯一序列号的环境
- 在整个项目中需要一个共享访问点或共享数据
- 创建一个对象需要消耗过多的资源，如访问IO或数据库等
- 需要定义大量的静态常量和静态方法，可以使用单例（或直接使用static）