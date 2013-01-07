interface X
{
    void f();
    void g(int n);
    void h(String s,int n);
    
}

x=[f:{println "f called"}] as X
x.f()
//x.g(32)