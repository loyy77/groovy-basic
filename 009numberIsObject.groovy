//����Ҳ�Ƕ������������������ϵ��÷�����java�ǲ�������������
def x=1
def y=2
assert x+y==3
assert x.plus(y)==3
assert x instanceof Integer

//��list�򵥲���
def arr=['123',123,'234']
assert arr[0]=='123'
assert arr[1]==123
assert arr[5]==null

//��for�ļ򵥲���
for(i in "123")
println i

//closure
"asdfasd".each{
    println it
}