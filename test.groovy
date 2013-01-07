@Grab('com.googlecode.gbench:gbench:0.3.0-groovy-2.0')
import gbench.BenchmarkBuilder
import groovy.transform.CompileStatic
  
int fib(int n) {
    if (n < 2) return n
    return fib(n - 1) + fib(n - 2) 
}
  
@CompileStatic
int fib2(int n) {
    if (n < 2) return n
    return fib2(n - 1) + fib2(n - 2) 
}
  
new BenchmarkBuilder().run {
    int n = 20 
    "Normal Version" { fib n }
    "@CompileStatic Version" { fib2 n }
}.prettyPrint()