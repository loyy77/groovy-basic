//��Map��ʵ�ֽӿ�
impl=[i:10,hasNext:{impl.i>0},next:{impl.i--}]
iter=impl as Iterator
println impl.next().getClass()
while(iter.hasNext()){
    println iter.next()
}