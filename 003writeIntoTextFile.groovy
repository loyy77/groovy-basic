//写入字符串到文本文件里
def s="";
for(i in 1..255){
  s+="192.168.1.$i\n"
}

new File("d:\\1.txt").write(s);