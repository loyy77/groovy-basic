Book gina = new Book('Groovy in Action') 
assert gina.getTitle() == 'Groovy in Action' 
println gina.getTitle()


assert fun1(gina) == 'noitcA ni yvoorG'

String  fun1(Book) { 
title = book.getTitle() 
return title.reverse() 
} 