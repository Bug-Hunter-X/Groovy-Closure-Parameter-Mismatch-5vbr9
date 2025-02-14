```groovy
def someMethod(Closure closure) {
  closure(10) // Passing parameter
}

someMethod { it -> println "Value is: "+it }
```