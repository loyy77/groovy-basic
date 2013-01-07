//数字也是对象，允许在数字类型上调用方法，java是不允许这样做的
def x=1
def y=2
assert x+y==3
assert x.plus(y)==3
assert x instanceof Integer

//对list简单测试
def arr=['123',123,'234']
assert arr[0]=='123'
assert arr[1]==123
assert arr[5]==null

//对for的简单测试
for(i in "123")
println i

//closure
"asdfasd".each{
    println it
}