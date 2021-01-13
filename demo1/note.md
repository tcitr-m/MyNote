## java8
### lambda
| 函数式接口 | 参数类型 | 返回值类型 | 用 途 |
| ---                     | :---: | :---: | :--- |
|consumer(消费型)          |  无 | void |  |
|supplier(供给型接口)        |无|T| |
|function()函数型接口        |T|R|对类型为T的对象应用操作， 并返回结果结果是R类型，包含方法|
|Predicate<T>断定型接口      |T|boolean|确定类型T的对象是否满足约束， 返回boolean值|

### 方法引用

### Stream
#### 中间操作
|方法|描述|
|---|:---:|

### LocalDateTime LocalDate LocalTime
```text
它们是不变类，默认按ISO 8601标准格式化和解析
```
**月份加减会自动调整日期**
```java

```

#### with

+ 调整年：withYear()
+ 调整月：withMonth()
+ 调整日：withDayOfMonth()
+ 调整时：withHour()
+ 调整分：withMinute()
+ 调整秒：withSecond()

### ZonedDateTime
