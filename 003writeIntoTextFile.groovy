//д���ַ������ı��ļ���
def s="";
for(i in 1..255){
  s+="192.168.1.$i\n"
}

new File("d:\\1.txt").write(s);