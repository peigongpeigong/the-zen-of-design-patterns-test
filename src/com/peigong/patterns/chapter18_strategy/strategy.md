### 策略模式

定义：定义一组算法，将每个算法都封装起来，并使他们之间可以互换

#### 优点
- 算法可以自由切换。这时策略模式本身的定义，只要实现抽象策略，他就成为策略家族的一员，
  通过封装角色对其进行封装，保证对台提供"可自由切换"的策略
- 避免使用多重条件判断。
- 扩展性良好

#### 缺点
- 策略类数量多
- 所有的策略类都需要对外暴露。上层模块必须知道有哪些策略，然后才能决定使用哪一个，
  违背迪米特法则，但是可以配合其他模式来修正这个缺点，如工厂方法模式、代理模式等
  
#### 场景
- 多个类只在算法或行为上稍有不同的场景
- 算法需要自由切换的场景
- 需要屏蔽算法规则的场景


#### 扩展：策略枚举
```java
public enum Calculator {
    ADD("+"){
        @Override
        public int exec(int a, int b) {
            return a+b;
        }
    },
    SUB("-"){
        @Override
        public int exec(int a, int b) {
            return a-b;
        }
    }
    ;

    public static Calculator get(String symbol) {
        for (Calculator value : Calculator.values()) {
            if (value.value.equals(symbol)) {
                return value;
            }
        }
        return null;
    }

    private String value;

    private Calculator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public abstract int exec(int a, int b);

}

```