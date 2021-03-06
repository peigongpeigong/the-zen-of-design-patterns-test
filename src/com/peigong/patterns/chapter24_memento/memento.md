### 备忘录模式

定义：在不破坏封装的前提下，补货一个对象内部的状态，并在该对象之外
保存这个状态。这样以后就可将该状态恢复到原先保存的状态

#### 场景
- 需要保存和恢复数据的相关状态场景
- 提供一个可回滚的操作
- 需要监控的副本场景中。例如要监控一个对象的属性，但是监控又不应该作为
  系统的主业务来调用，及时出现监控不准等问题也影响不大，因此一般的做法是
  备份一个主线程中的对象，然后由分析程序来处理

#### 注意事项
- 备忘录的生命周期
- 备忘录的性能

#### 扩展
- 可以用克隆的方式实现
- 多状态的对象可以使用反射，获取状态名和状态存到map中
- 多份备忘录：Caretaker使用map保存Memento，然后恢复的时候使用指定key获取
- 可以使用接口定义Memento，然后使用Originator的内部类来实现具体的Memento