println "helloworld"
println 123+456*5


x=new java.util.Date()
println x

x=-12323.23
println x

x=false
println x

x="hi"
println x

//List and Maps
myList=[1564,4684,123,-21,0,1234123421345]
println myList[0]
println myList.size()
//Map��ʹ��
scores=["brett":100,"Pete":"did not finish","Andrew":86.596654]
println scores["Pete"]
println scores.Pete
scores.Pete=3
println scores.Pete

//�����յļ��ϻ���Map
emptyMap=[:]
emptyList=[]
println emptyMap.size() //0
println emptyList.size() //0

//����ִ�� IF ELSE
amPm=Calendar.getInstance().get(Calendar.AM_PM)
if(amPm==Calendar.AM){
    println "good morning"
}else{
    println "good evening"
}

//�������ʽ
a=4564
b=123
if(a>b){
    println "true"    
}

