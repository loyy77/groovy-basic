//用Map来实现接口
impl=[i:10,hasNext:{impl.i>0},next:{impl.i--}]
iter=impl as Iterator
println impl.next().getClass()
while(iter.hasNext()){
    println iter.next()
}