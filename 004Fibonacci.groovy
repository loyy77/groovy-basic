//求前10个斐波那契数列

current = 1
next = 1
10.times{
    print current + ' '
    newCurrent=next
    next=next+current
    current=newCurrent
}

println ""