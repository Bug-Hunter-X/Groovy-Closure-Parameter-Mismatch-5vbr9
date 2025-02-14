```groovy
def someMethod(Closure closure) {
  closure() // Missing parameter
}

someMethod { it -> println it }
```