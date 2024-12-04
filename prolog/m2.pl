dog(fido).
dog(jane).
dog(tom).
dog(fred).
dog(fred).
dog(henry).
cat(harry).
cat(bill).
cat(steve).
small(henry).
medium(harry).
medium(fred).
large(fido).
large(mary).
large(steve).
large(jim).
large(mike).
large(tom).
large(fred).
size(fido,large).
size(fred,large).
size(steve,large).
size(harry,medium).
size(henry,small).
dogs(Dog):-
    dog(Dog).
cats(Cat):-
    cat(Cat).
size(Dog,Size):-
    size(Dog,Size).






