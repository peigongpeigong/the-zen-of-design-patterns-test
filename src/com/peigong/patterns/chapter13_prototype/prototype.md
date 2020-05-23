### 原型模式

定义：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象

#### 优点
- 性能优良。原型模式是在内存二进制流的靠背，要比直接new一个对象性能好很多，
  特别是要在一个循环体内产生大量个对象时，原型模式可以更好地体现其优点
- 避免构造函数的约束。既是优点也是缺点，在内存中拷贝，构造函数是不会执行的，
  优点是减少了约束，缺点也是减少了约束
  
#### 场景
- 资源优化场景。类初始化需要消耗非常多的资源，这个资源包括数据、硬件资源等
- 性能和安全要求的场景。通过new一个对象需要非常繁琐的数据准备或访问权限
- 一个对象多个修改者的场景

#### 注意事项
- 构造函数不会被执行
- 浅拷贝和深拷贝
  ```java
  //浅拷贝
  //Object提供的clone方法只拷贝对象本身，其对象内部的数组、引用对象等都不拷贝
  //还是指向原生对象的内部元素地址
  //基础对象类型则不会出现这种问题
  public class Thing implements Cloneable{
      private ArrayList<String> list = new ArrayList<>();
  
      @Override
      public Thing clone(){
          Thing thing = null;
          try{
            thing = (Thing)super.clone();
          }catch (Exception e){
              e.printStackTrace();
          }
          return thing;
      }
  }  
  ```
  ```java
      //深拷贝
      public class Thing implements Cloneable{
            private ArrayList<String> list = new ArrayList<>();
        
            @Override
            public Thing clone(){
                Thing thing = null;
                try{
                    thing = (Thing)super.clone();
                    thing.list = (ArrayList<String>)this.list.clone();  
                }catch (Exception e){
                    e.printStackTrace();
                }
                return thing;
            }
        }  
  ```
- clone对final不兼容。原型对象内有final标识的属性，则clone的时候会异常